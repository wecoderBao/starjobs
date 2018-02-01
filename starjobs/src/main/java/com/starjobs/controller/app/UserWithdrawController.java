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

import com.starjobs.dto.UserWithdrawDto;
import com.starjobs.service.TokenService;
import com.starjobs.service.UserWithdrawService;
import com.starjobs.sys.SystemUtil;

@Controller
public class UserWithdrawController {
	
	@Autowired
	private UserWithdrawService userWithdrawService;
	@Autowired
	private TokenService tokenService;
	
	@RequestMapping(value="/user/withdraw/record")
	public Map<String, Object> getUserRechargeRecord(@RequestParam Integer userId, HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
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
		List<UserWithdrawDto> dtoList = userWithdrawService.getUserWithdrawRecord(userId);
		Map<String,Object> resultMap = new HashMap<String,Object>(4);
		resultMap.put("token", token);
		resultMap.put("userFlag", userFlag);
		resultMap.put("recordList", dtoList);
		modelMap.put("data", resultMap);
		return modelMap;
	}
}
