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

import com.starjobs.service.SystemConfigService;
import com.starjobs.service.TokenService;
import com.starjobs.sys.SystemUtil;

/**
 * <p>
 * Title:SystemConfigController
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 * @date:2018年5月6日下午7:14:35
 */
@Controller
public class SystemConfigController {
	@Autowired
	private TokenService tokenService;
	@Autowired
	private SystemConfigService systemConfigService;

	// 获取配置信息
	@RequestMapping(value = "/user/get/config", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getConfigs(HttpServletRequest request) {
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
		// 返回配置信息
		Map<String, Object> resultMap = systemConfigService.getConfigs();
		if (resultMap == null) {
			return modelMap;
		}
		resultMap.put("token", token);
		resultMap.put("userFlag", userFlag);
		modelMap.put("data", resultMap);
		modelMap.put("message", "success");
		modelMap.put("error_code", SystemUtil.CODE_SUCC);

		return modelMap;
	}

}
