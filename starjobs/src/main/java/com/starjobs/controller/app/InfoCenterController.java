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

import com.starjobs.service.InfoCenterService;
import com.starjobs.service.TokenService;
import com.starjobs.sys.SystemUtil;

/**
 * <p>
 * Title:InfoCenterController
 * </p>
 * <p>
 * Description:个人信息中心
 * </p>
 * 
 * @author:bao
 * @date:2017年4月25日下午9:05:46
 */
@Controller
public class InfoCenterController {
	@Autowired
	TokenService tokenService;
	@Autowired
	InfoCenterService infoCenterService;

	// 普通用户获取个人信息
	@RequestMapping(value = "/user/get/user_info", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getUserInfo(HttpServletRequest request) {
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
			return modelMap;
		}
		Map<String, Object> data = infoCenterService.getUserInfo(token, userFlag);
		if (data != null) {
			modelMap.put("data", data);
		}
		return modelMap;
	}

	// 普通用户修改个人信息
	@RequestMapping(value = "/user/update/user_info", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updateUserInfo(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		String realPath = request.getSession().getServletContext().getRealPath("/photo/user");
		System.out.println("realPath:" + realPath);
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
			return modelMap;
		}
		Map<String, String> params = new HashMap<String, String>();
		params.put("headImg", request.getParameter("headImg"));
		params.put("imgFormat", request.getParameter("imgFormat"));
		params.put("nickName", request.getParameter("nickName"));
		params.put("username", request.getParameter("username"));
		params.put("gender", request.getParameter("gender"));
		params.put("birthday", request.getParameter("birthday"));
		params.put("height", request.getParameter("height"));
		params.put("eduState", request.getParameter("eduState"));
		params.put("school", request.getParameter("school"));
		params.put("phoneNum", request.getParameter("phoneNum"));

		Map<String, Object> data = infoCenterService.updateUserInfo(token, params, realPath);
		if (data != null) {
			modelMap.put("error_code", SystemUtil.CODE_SUCC);
			modelMap.put("message", "success");
			data.put("token", token);
			data.put("userFlag", userFlag);
			modelMap.put("data", data);
		}
		return modelMap;
	}

	// 公司用户获取个人信息
	@RequestMapping(value = "/com/get/com_info", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getComInfo(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");

		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || !SystemUtil.USER_COM.equals(userFlag)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			return modelMap;
		}
		Map<String, Object> data = infoCenterService.getComInfo(token, userFlag);
		if (data != null) {
			modelMap.put("error_code", SystemUtil.CODE_SUCC);
			modelMap.put("message", "success");
			data.put("token", token);
			data.put("userFlag", userFlag);
			modelMap.put("data", data);
		}
		return modelMap;
	}

	// 公司用户修改个人信息
	@RequestMapping(value = "/com/update/com_info", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updateComInfo(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		String realPath = request.getSession().getServletContext().getRealPath("/photo/com");
		System.out.println("realPath:" + realPath);
		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || !SystemUtil.USER_COM.equals(userFlag)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			return modelMap;
		}
		Map<String, String> params = new HashMap<String, String>();
		params.put("headImg", request.getParameter("headImg"));
		params.put("imgFormat", request.getParameter("imgFormat"));
		params.put("comName", request.getParameter("comName"));
		params.put("address", request.getParameter("address"));
		params.put("comDesc", request.getParameter("comDesc"));
		params.put("phoneNum", request.getParameter("phoneNum"));

		Map<String, Object> data = infoCenterService.updateComInfo(token, params, realPath);
		if (data != null) {
			modelMap.put("error_code", SystemUtil.CODE_SUCC);
			modelMap.put("message", "success");
			data.put("token", token);
			data.put("userFlag", userFlag);
			modelMap.put("data", data);
		}
		return modelMap;
	}
}
