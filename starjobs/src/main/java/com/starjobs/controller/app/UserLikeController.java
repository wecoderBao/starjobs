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
import com.starjobs.service.UserLikeService;
import com.starjobs.sys.SystemUtil;

/**
 * <p>
 * Title:UserLikeController
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 * @date:2017年7月15日上午10:29:33
 */
@Controller
public class UserLikeController {
	@Autowired
	TokenService tokenService;
	@Autowired
	UserLikeService userLikeService;

	// 用户关注公司
	@RequestMapping(value = "/user/like/company", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> likeCompany(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// userPhone
		String userPhone = request.getParameter("userPhone");
		// comPhone
		String comPhone = request.getParameter("comPhone");

		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(comPhone)
				|| StringUtils.isEmpty(userPhone)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			return modelMap;
		}
		// 验证输入的验证码
		Map<String, Object> resultMap = userLikeService.likeCompany(userPhone, comPhone);
		if (resultMap == null) {
			return modelMap;
		}
		resultMap.put("token", token);
		resultMap.put("userFlag", userFlag);
		modelMap.put("error_code", SystemUtil.CODE_SUCC);
		modelMap.put("message", "success");
		modelMap.put("data", resultMap);

		return modelMap;
	}

	// 用户获取所有关注公司
	@RequestMapping(value = "/user/get/allLike", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getAllLikeCompany(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// userPhone
		String userPhone = request.getParameter("userPhone");

		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(userPhone)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			return modelMap;
		}
		// 验证输入的验证码
		Map<String, Object> resultMap = userLikeService.getAllLikeCompany(userPhone);
		if (resultMap == null) {
			return modelMap;
		}
		resultMap.put("token", token);
		resultMap.put("userFlag", userFlag);
		modelMap.put("error_code", SystemUtil.CODE_SUCC);
		modelMap.put("message", "success");
		modelMap.put("data", resultMap);

		return modelMap;
	}

	// 用户给公司打分
	@RequestMapping(value = "/user/give/score2com", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getScore2Com(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// userPhone
		String userPhone = request.getParameter("userPhone");
		String score = request.getParameter("score");
		String comId = request.getParameter("comId");
		String jobId = request.getParameter("jobId");

		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(userPhone)
				|| StringUtils.isEmpty(score)|| StringUtils.isEmpty(comId)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			return modelMap;
		}
		// 验证输入的验证码
		Map<String, Object> resultMap = userLikeService.giveScore2Com(userPhone,jobId,comId,score);
		if (resultMap == null) {
			return modelMap;
		}
		resultMap.put("token", token);
		resultMap.put("userFlag", userFlag);
		modelMap.put("error_code", SystemUtil.CODE_SUCC);
		modelMap.put("message", "success");
		modelMap.put("data", resultMap);

		return modelMap;
	}
}
