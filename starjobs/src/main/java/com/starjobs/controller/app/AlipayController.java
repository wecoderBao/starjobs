package com.starjobs.controller.app;

import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayConstants;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradeQueryResponse;
import com.starjobs.common.pay.util.AlipayUtil;
import com.starjobs.common.pay.util.DatetimeUtil;
import com.starjobs.common.pay.util.PayUtil;
import com.starjobs.common.pay.util.SerializerFeatureUtil;
import com.starjobs.common.pay.util.StringUtil;
import com.starjobs.common.pay.util.WebUtil;
import com.starjobs.model.pay.JsonResult;
import com.starjobs.model.pay.ResponseData;

@Controller
@RequestMapping("/order")
public class AlipayController {

	private static final Logger logger = LoggerFactory.getLogger(AlipayController.class);

	/**
	 * 支付下订单
	 * 
	 * @param request
	 * @param response
	 * @param cashnum
	 *            支付金额
	 * @param mercid
	 *            商品id
	 * @param callback
	 */
	@RequestMapping(value = "/pay", method = RequestMethod.POST)
	public void orderPay(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(required = false, defaultValue = "0") Double cashnum, String mercid, String callback) {
		logger.info("[/order/pay]" + "mercid:" + mercid + "cashnum:" + cashnum);
		if (!"charge001".equalsIgnoreCase(mercid)) {
			WebUtil.response(response, WebUtil.packJsonp(callback,
					JSON.toJSONString(new JsonResult(-1, "充值错误", new ResponseData()), SerializerFeatureUtil.FEATURES)));
		}
		Map<String, String> param = new HashMap<String, String>();
		// 公共请求参数
		param.put("app_id", AlipayUtil.ALIPAY_APPID);
		param.put("method", "alipay.trade.app.pay");
		param.put("format", AlipayConstants.FORMAT_JSON);
		param.put("charset", AlipayConstants.CHARSET_UTF8);
		param.put("timestamp", DatetimeUtil.formatDateTime(new Date()));
		param.put("version", "1.0");
		param.put("notify_url", "http://www.starjobs/order/pay/notify");
		param.put("sign_type", AlipayConstants.SIGN_TYPE_RSA);

		Map<String, Object> pcont = new HashMap<String, Object>();
		// 支付业务请求参数
		pcont.put("out_trade_no", PayUtil.getTradeNo());// 商户订单编号
		pcont.put("total_amount", String.valueOf(cashnum));// 交易金额
		pcont.put("subject", "测试支付");// 订单标题
		pcont.put("body", "test");// 对交易或商品的描述
		pcont.put("product_code", "QUICK_MSECURITY_PAY");// 销售产品码

		param.put("biz_content", JSON.toJSONString(pcont));// 业务请求参数，不需要对json字符串转义
		Map<String, String> payMap = new HashMap<String, String>();
		try {
			param.put("sign", PayUtil.getSign(param, AlipayUtil.APP_PRIVATE_KEY));
			payMap.put("orderStr", PayUtil.getSignEncodeUrl(param, true));
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		WebUtil.response(response, WebUtil.packJsonp(callback, JSON.toJSONString(
				new JsonResult(1, "订单获取成功", new ResponseData(null, payMap)), SerializerFeatureUtil.FEATURES)));
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @param tradeno
	 *            支付宝订单交易编号
	 * @param orderno
	 *            商家交易编号
	 * @param callback
	 */
	@RequestMapping(value = "/pay/query", method = RequestMethod.POST)
	public void orderPayQuery(HttpServletRequest request, HttpServletResponse response, String tradeno, String orderno,
			String callback) {
		logger.info("[/order/pay/query]");
		if (StringUtil.isEmpty(tradeno) && StringUtil.isEmpty(orderno)) {
			WebUtil.response(response, WebUtil.packJsonp(callback, JSON
					.toJSONString(new JsonResult(-1, "订单号不能为空", new ResponseData()), SerializerFeatureUtil.FEATURES)));
		}

		AlipayTradeQueryRequest alipayRequest = new AlipayTradeQueryRequest(); // 统一收单线下交易查询
		// 只需要传入业务参数
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("out_trade_no", orderno); // 商户订单号
		param.put("trade_no", tradeno);// 支付宝订单交易编号
		alipayRequest.setBizContent(JSON.toJSONString(param)); // 不需要对json字符串转义

		Map<String, String> restmap = new HashMap<String, String>();// 返回提交支付宝订单交易查询信息
		boolean flag = false; // 查询状态
		try {
			AlipayTradeQueryResponse alipayResponse = AlipayUtil.getAlipayClient().execute(alipayRequest);
			if (alipayResponse.isSuccess()) {
				// 调用成功，则处理业务逻辑
				if ("10000".equals(alipayResponse.getCode())) {
					// 订单创建成功
					flag = true;
					restmap.put("order_no", alipayResponse.getOutTradeNo());
					restmap.put("trade_no", alipayResponse.getTradeNo());
					restmap.put("buyer_logon_id", alipayResponse.getBuyerLogonId());
					restmap.put("trade_status", alipayResponse.getTradeStatus());
					logger.info("订单查询结果：" + alipayResponse.getTradeStatus());
				} else {
					logger.info("订单查询失败：" + alipayResponse.getMsg() + ":" + alipayResponse.getSubMsg());
				}
			}
		} catch (AlipayApiException e) {
			e.printStackTrace();
		}

		if (flag) {
			// 订单查询成功
			WebUtil.response(response, WebUtil.packJsonp(callback, JSON.toJSONString(
					new JsonResult(1, "订单查询成功", new ResponseData(null, restmap)), SerializerFeatureUtil.FEATURES)));
		} else { // 订单查询失败
			WebUtil.response(response, WebUtil.packJsonp(callback, JSON
					.toJSONString(new JsonResult(-1, "订单查询失败", new ResponseData()), SerializerFeatureUtil.FEATURES)));
		}
	}

	/**
	 * 订单支付微信服务器异步通知
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "/pay/notify", method = RequestMethod.POST)
	public void orderPayNotify(HttpServletRequest request, HttpServletResponse response) {
		logger.info("[/order/pay/notify]");
		// 获取到返回的所有参数 先判断是否交易成功trade_status 再做签名校验
		// 1、商户需要验证该通知数据中的out_trade_no是否为商户系统中创建的订单号，
		// 2、判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额），
		// 3、校验通知中的seller_id（或者seller_email)
		// 是否为out_trade_no这笔单据的对应的操作方（有的时候，一个商户可能有多个seller_id/seller_email），
		// 4、验证app_id是否为该商户本身。上述1、2、3、4有任何一个验证不通过，则表明本次通知是异常通知，务必忽略。
		//在上述验证通过后商户必须根据支付宝不同类型的业务通知，正确的进行不同的业务处理，并且过滤重复的通知结果数据。
		//在支付宝的业务通知中，只有交易通知状态为TRADE_SUCCESS或TRADE_FINISHED时，支付宝才会认定为买家付款成功。
		if ("TRADE_SUCCESS".equals(request.getParameter("trade_status")) || "TRADE_FINISHED".equals(request.getParameter("trade_status"))) {
			Enumeration<?> pNames = request.getParameterNames();
			Map<String, String> param = new HashMap<String, String>();
			try {
				while (pNames.hasMoreElements()) {
					String pName = (String) pNames.nextElement();
					param.put(pName, request.getParameter(pName));
				}

				boolean signVerified = AlipaySignature.rsaCheckV1(param, AlipayUtil.ALIPAY_PUBLIC_KEY,
						AlipayConstants.CHARSET_UTF8); // 校验签名是否正确
				if (signVerified) {
					// TODO 验签成功后
					// 按照支付结果异步通知中的描述，对支付结果中的业务内容进行1\2\3\4二次校验，校验成功后在response中返回success，校验失败返回failure
					logger.info("订单支付成功：" + JSON.toJSONString(param));
					/**
					 * 验证out_trade_no
					 */
					String out_trade_no = request.getParameter("out_trade_no");
					String app_id = request.getParameter("app_id");
					
					double total_amount = Double.valueOf(request.getParameter("total_amount"));
					
					/**
					 * 用户账户金额增加
					 */
					/**
					 * star公司账户金额增加
					 */
				} else {
					// TODO 验签失败则记录异常日志，并在response中返回failure.
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
