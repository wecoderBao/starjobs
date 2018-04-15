package com.starjobs.controller.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.starjobs.dto.UserRechargeRecordDto;
import com.starjobs.service.TokenService;
import com.starjobs.service.UserRechargeService;
import com.starjobs.sys.SystemUtil;

@Controller
public class UserRechargeController {

	@Autowired
	private UserRechargeService userRechargeService;
	@Autowired
	private TokenService tokenService;
	
	@RequestMapping(value="/user/recharge/record")
	@ResponseBody
	public Map<String, Object> getUserRechargeRecord(@RequestParam String phone, HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(4);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || !SystemUtil.USER_STU.equals(userFlag)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			modelMap.put("error_code", SystemUtil.CODE_TOKEN_EXPIRE);
			return modelMap;
		}
		List<UserRechargeRecordDto> dtoList = userRechargeService.getUserRechargeRecord(phone);
		Map<String,Object> resultMap = new HashMap<String,Object>(4);
		modelMap.put("error_code", SystemUtil.CODE_SUCC);
		modelMap.put("message", "success");
		resultMap.put("token", token);
		resultMap.put("userFlag", userFlag);
		resultMap.put("recordList", dtoList);
		modelMap.put("data", resultMap);
		return modelMap;
	}
	/**
	 * 充值招聘余额
	 */
	@RequestMapping(value="/company/charge/extraBalance")
	@ResponseBody
	public Map<String, Object> chargeExtraBalance(@RequestParam Integer activityId, HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		String phone = request.getParameter("phone");
		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(4);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || !SystemUtil.USER_COM.equals(userFlag)
				|| StringUtils.isEmpty(phone)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			modelMap.put("error_code", SystemUtil.CODE_TOKEN_EXPIRE);
			return modelMap;
		}
		String loginPhone = tokenService.getPhoneNum(token);
		if(!phone.equals(loginPhone)) {
			return modelMap;
		}
		
		Map<String,Object> resultMap = userRechargeService.chargeExtraBalance(activityId, phone,token,userFlag);
	
		return resultMap;
	}
}
