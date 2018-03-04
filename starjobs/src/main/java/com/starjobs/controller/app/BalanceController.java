package com.starjobs.controller.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.starjobs.dto.BalanceHistoryDto;
import com.starjobs.service.BalanceHistoryService;
import com.starjobs.service.BalanceService;
import com.starjobs.service.TokenService;
import com.starjobs.sys.SystemUtil;

@Controller
public class BalanceController {

	@Autowired
	private BalanceHistoryService balanceHistoryService;
	@Autowired
	private TokenService tokenService;
	@Autowired
	private BalanceService balanceService;
	
	@RequestMapping(value="/user/cost/history", method =  RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getCostHistory(@RequestParam String phone, HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(4);
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
		List<BalanceHistoryDto> dtoList = balanceHistoryService.getBalanceHistoryList(phone);
		Map<String,Object> resultMap = new HashMap<String,Object>(4);
		modelMap.put("error_code", SystemUtil.CODE_SUCC);
		modelMap.put("message", "success");
		resultMap.put("token", token);
		resultMap.put("userFlag", userFlag);
		resultMap.put("recordList", dtoList);
		modelMap.put("data", resultMap);
		return modelMap;
	}
	@RequestMapping(value="/user/get/balance", method =  RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getUserBalance(@RequestParam String phone, HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(4);
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
		
		Map<String,Object> resultMap = balanceService.getUserBalance(phone,userFlag);
		if(null == resultMap) {
			return modelMap;
		}
		modelMap.put("error_code", SystemUtil.CODE_SUCC);
		modelMap.put("message", "success");
		resultMap.put("token", token);
		resultMap.put("userFlag", userFlag);
		modelMap.put("data", resultMap);
		return modelMap;
	}
}
