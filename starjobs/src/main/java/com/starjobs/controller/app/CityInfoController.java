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

import com.starjobs.service.CityInfoService;
import com.starjobs.service.TokenService;
import com.starjobs.sys.SystemUtil;

/**
 * <p>
 * Title:CityInfoController
 * </p>
 * <p>
 * Description:用户获取城市信息控制类
 * </p>
 * 
 * @author:bao
 * @date:2017年4月16日上午11:06:08
 */
@Controller
public class CityInfoController {
	@Autowired
	TokenService tokenService;
	@Autowired
	CityInfoService cityInfoService;

	// 获取省级信息
	@RequestMapping(value = "/user/get/province_info", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getProvinceInfo(HttpServletRequest request) {
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
		Map<String, Object> cityMap = cityInfoService.getProvinceInfo(0);
		if (cityMap == null) {
			return modelMap;
		}
		cityMap.put("token", token);
		cityMap.put("userFlag", userFlag);
		modelMap.put("error_code", SystemUtil.CODE_SUCC);
		modelMap.put("message", "success");
		modelMap.put("data", cityMap);

		return modelMap;
	}

	// 获取市级信息
	@RequestMapping(value = "/user/get/city_info", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getCityInfo(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// 用省级代码
		String provinceCode = request.getParameter("provinceCode");
		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(provinceCode)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			return modelMap;
		}
		// 验证输入的验证码
		Map<String, Object> cityMap = cityInfoService.getCityInfo(provinceCode);
		if (cityMap == null) {
			return modelMap;
		}
		cityMap.put("token", token);
		cityMap.put("userFlag", userFlag);
		modelMap.put("error_code", SystemUtil.CODE_SUCC);
		modelMap.put("message", "success");
		modelMap.put("data", cityMap);

		return modelMap;
	}

	// 获取区县级信息
	@RequestMapping(value = "/user/get/area_info", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getAreaInfo(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// 用市级代码
		String cityCode = request.getParameter("cityCode");
		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(cityCode)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			return modelMap;
		}
		// 验证输入的验证码
		Map<String, Object> cityMap = cityInfoService.getCityInfo(cityCode);
		if (cityMap == null) {
			return modelMap;
		}
		cityMap.put("token", token);
		cityMap.put("userFlag", userFlag);
		modelMap.put("error_code", SystemUtil.CODE_SUCC);
		modelMap.put("message", "success");
		modelMap.put("data", cityMap);

		return modelMap;
	}
}
