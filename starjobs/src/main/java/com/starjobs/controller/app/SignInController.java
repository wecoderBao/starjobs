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

import com.starjobs.service.UserService;
import com.starjobs.sys.SystemUtil;

/**
 * <p>
 * Title:SignIn
 * </p>
 * <p>
 * Description:app端用户登录、注册、找回密码等控制类
 * </p>
 * 
 * @author:bao
 */
@Controller
public class SignInController {
	@Autowired
	UserService userService;

	// 用户注册
	@RequestMapping(value = "/user/register/sign_in", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> verifyCode(HttpServletRequest request) {
		// 获取参数
		String phone = request.getParameter("phone");
		// 验证码
		String code = request.getParameter("code");
		// 密码
		String password = request.getParameter("password");
		// 手机标识
		String appFlag = request.getParameter("appFlag");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		if (StringUtils.isEmpty(phone) || StringUtils.isEmpty(code) || StringUtils.isEmpty(password)
				|| StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(appFlag)) {
			modelMap.put("error_code", SystemUtil.CODE_FAIL);
			modelMap.put("message", "fail");
			return modelMap;

		}
		// 验证输入的验证码
		modelMap = userService.verifyCode(phone, code, password, userFlag, appFlag);

		return modelMap;
	}

	// 用户登录
	@RequestMapping(value = "/user/login/login_in", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> userLogin(HttpServletRequest request) {
		// 获取参数
		String phone = request.getParameter("phone");
		// 密码
		String password = request.getParameter("password");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		if (StringUtils.isEmpty(phone) || StringUtils.isEmpty(password) || StringUtils.isEmpty(userFlag)) {
			modelMap.put("error_code", SystemUtil.CODE_FAIL);
			modelMap.put("message", "fail");
			return modelMap;

		}
		// 验证输入的验证码
		modelMap = userService.userLogin(phone, password, userFlag);
		return modelMap;
	}

	// 找回密码
	@RequestMapping(value = "/user/forgot/retrieve_pwd", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> retrievePwd(HttpServletRequest request) {
		// 获取参数
		String phone = request.getParameter("phone");
		// 验证码
		String code = request.getParameter("code");
		// 密码
		String password = request.getParameter("password");
		// 手机标识
		String appFlag = request.getParameter("appFlag");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		if (StringUtils.isEmpty(phone) || StringUtils.isEmpty(code) || StringUtils.isEmpty(password)
				|| StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(appFlag)) {
			modelMap.put("error_code", SystemUtil.CODE_FAIL);
			modelMap.put("message", "fail");
			return modelMap;

		}
		// 验证输入的验证码
		modelMap = userService.userRetrievePwd(phone, code, password, userFlag, appFlag);
		return modelMap;
	}
}
