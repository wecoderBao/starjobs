/**
 * 
 */
package com.starjobs.controller.app;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.starjobs.pojo.TFeedback;
import com.starjobs.service.FeedbackService;
import com.starjobs.service.TokenService;
import com.starjobs.sys.SystemUtil;

/**
 * <p>
 * Title:FeedbackController
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 * @date:2018年6月20日下午2:57:50
 */
@Controller
public class FeedbackController {
	@Autowired
	private TokenService tokenService;
	@Autowired
	private FeedbackService feedbackService;

	// 普通用户获取个人信息
	@RequestMapping(value = "/user/feedback", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> feedback(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// 手机号
		String phone = request.getParameter("phone");
		String picOne = request.getParameter("picOne");
		String picTwo = request.getParameter("picTwo");
		String picThree = request.getParameter("picThree");
		String content = request.getParameter("content");

		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			modelMap.put("error_code", SystemUtil.CODE_TOKEN_EXPIRE);
			return modelMap;
		}
		TFeedback feedback = new TFeedback();
		feedback.setContent(content);
		feedback.setPhone(phone);
		feedback.setPicOne(picOne);
		feedback.setPicTow(picTwo);
		feedback.setPicThree(picThree);
		Map<String, Object> data = feedbackService.feedback(feedback);
		if (data != null) {
			modelMap.put("error_code", SystemUtil.CODE_SUCC);
			modelMap.put("message", "success");
		}
		return modelMap;
	}

}
