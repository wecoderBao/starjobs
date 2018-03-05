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

import com.starjobs.service.ChargeActivityService;
import com.starjobs.service.TokenService;
import com.starjobs.sys.SystemUtil;

@Controller
public class ChargeActivityController {
	@Autowired
	private TokenService tokenService;
	@Autowired
	private ChargeActivityService chargeActivityService;

	@RequestMapping(value="/user/get/charge/activity",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getChargeActivityList(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		
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
		// 验证输入的验证码
		Map<String, Object> resultMap = chargeActivityService.getChargeActivityList();
		
		resultMap.put("token", token);
		resultMap.put("userFlag", userFlag);
		modelMap.put("error_code", SystemUtil.CODE_SUCC);
		modelMap.put("message", "success");
		modelMap.put("data", resultMap);

		return modelMap;
	}
}
