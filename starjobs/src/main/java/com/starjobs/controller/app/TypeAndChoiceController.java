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

import com.starjobs.service.TokenService;
import com.starjobs.service.TypeAndChoiceService;
import com.starjobs.sys.SystemUtil;

/**
 * <p>
 * Title:TypeAndChoiceController
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 * @date:2017年4月16日下午7:57:18
 */
@Controller
public class TypeAndChoiceController {

	@Autowired
	TokenService tokenService;
	@Autowired
	TypeAndChoiceService typeAndChoiceService;

	// 获取兼职类型信息
	@RequestMapping(value = "/user/get/job_type", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getJobType(HttpServletRequest request) {
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
			return modelMap;
		}
		// 验证输入的验证码
		Map<String, Object> typeMap = typeAndChoiceService.getJobType();
		if (typeMap == null) {
			return modelMap;
		}
		typeMap.put("token", token);
		typeMap.put("userFlag", userFlag);
		modelMap.put("error_code", SystemUtil.CODE_SUCC);
		modelMap.put("message", "success");
		modelMap.put("data", typeMap);

		return modelMap;
	}

	// 获取筛选条件信息
	@RequestMapping(value = "/user/get/choice_info", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getChoiceInfo(HttpServletRequest request) {
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
			return modelMap;
		}
		// 验证输入的验证码
		Map<String, Object> typeMap = typeAndChoiceService.getJobChoice();
		if (typeMap == null) {
			return modelMap;
		}
		typeMap.put("token", token);
		typeMap.put("userFlag", userFlag);
		modelMap.put("error_code", SystemUtil.CODE_SUCC);
		modelMap.put("message", "success");
		modelMap.put("data", typeMap);

		return modelMap;
	}
}
