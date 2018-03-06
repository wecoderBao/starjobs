package com.starjobs.controller.app;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayFundTransToaccountTransferRequest;
import com.alipay.api.response.AlipayFundTransToaccountTransferResponse;
import com.starjobs.common.AliPayConfig;

/**
 * 转账相关
 * 
 * @author sunbao
 *
 */
@Controller
public class AlipayTransferController {

	@RequestMapping(value = "/app/user/withdraw")
	@ResponseBody
	public Map<String, Object> transferToUser(HttpServletRequest request) {
		// AlipayClient alipayClient = new
		// DefaultAlipayClient("https://openapi.alipay.com/gateway.do","app_id","your
		// private_key","json","GBK","alipay_public_key","RSA2");
		AlipayClient alipayClient = AliPayConfig.getAlipayClient();
		AlipayFundTransToaccountTransferRequest payRequest = new AlipayFundTransToaccountTransferRequest();
		payRequest.setBizContent("{" +
				"\"out_biz_no\":\"3142321423432\"," +
				"\"payee_type\":\"ALIPAY_LOGONID\"," +
				"\"payee_account\":\"18827090361\"," +
				"\"amount\":\"0.01\"," +
				"\"payer_show_name\":\"star转账\"," +
				//payee_real_name不为空则检测名字是否与账号中的实名一致
//				"\"payee_real_name\":\"张三\"," +
				"\"remark\":\"转账备注\"" +
				"}");
		AlipayFundTransToaccountTransferResponse response = new AlipayFundTransToaccountTransferResponse();
		try {
			response = alipayClient.execute(payRequest);
			if (response.isSuccess()) {
				System.out.println("调用成功");
			} else {
				System.out.println("调用失败");
			}
		} catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String,Object> resultMap = new HashMap<String,Object>(2);
		resultMap.put("data", response);
		return resultMap;
	}
}
