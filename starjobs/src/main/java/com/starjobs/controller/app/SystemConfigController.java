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
		
		String platform = request.getParameter("platform");

		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(platform)) {
			return modelMap;
		}
		// 返回配置信息
		Map<String, Object> resultMap = systemConfigService.getConfigs(platform);
		if (resultMap == null) {
			return modelMap;
		}
		modelMap.put("data", resultMap);
		modelMap.put("message", "success");
		modelMap.put("error_code", SystemUtil.CODE_SUCC);

		return modelMap;
	}

}
