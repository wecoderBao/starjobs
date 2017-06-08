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
import com.starjobs.sys.SystemUtil;

import io.rong.service.RongCloudService;

/**
 * <p>
 * Title:InstanceMessageController
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 * @date:2017年6月7日下午10:52:35
 */
@Controller
public class InstanceMessageController {
	@Autowired
	TokenService tokenService;
	@Autowired
	RongCloudService rongCloudService;

	// 获取融云端token
	@RequestMapping(value = "/cloud/get/token", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getToken(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// phoneNum
		String phoneNum = request.getParameter("phoneNum");
		// name
		String name = request.getParameter("name");
		// portraitUri
		String portraitUri = request.getParameter("portraitUri");
		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(phoneNum)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			return modelMap;
		}
		// 验证输入的验证码
		Map<String, Object> resultMap = rongCloudService.getToken(phoneNum, name, portraitUri);
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

	// 添加好友请求
	@RequestMapping(value = "/cloud/add/friend", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addFriend(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// fromUserId
		String fromUserId = request.getParameter("fromUserId");
		// toUserId
		String toUserId = request.getParameter("toUserId");
		// content
		String content = request.getParameter("content");
		// pushContent
		String pushContent = request.getParameter("pushContent");
		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(fromUserId)
				|| StringUtils.isEmpty(toUserId) || StringUtils.isEmpty(content)|| StringUtils.isEmpty(pushContent)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			return modelMap;
		}
		// 验证输入的验证码
		Map<String, Object> resultMap = rongCloudService.addFriend(fromUserId, toUserId, content, pushContent);
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
	// 同意添加好友请求
		@RequestMapping(value = "/cloud/confirm/friend_added", method = RequestMethod.POST)
		@ResponseBody
		public Map<String, Object> confirmFriendAdded(HttpServletRequest request) {
			// 获取token
			String token = request.getParameter("token");
			// 用户类别标记
			String userFlag = request.getParameter("userFlag");
			// fromUserId
			String fromUserId = request.getParameter("fromUserId");
			// toUserId
			String toUserId = request.getParameter("toUserId");
			
			// 返回json容器
			Map<String, Object> modelMap = new HashMap<String, Object>(3);
			modelMap.put("error_code", SystemUtil.CODE_FAIL);
			modelMap.put("message", "fail");
			if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(fromUserId)
					|| StringUtils.isEmpty(toUserId) ) {
				return modelMap;
			}
			// 验证token是否有效
			boolean isPermitted = tokenService.checkToken(token);
			if (!isPermitted) {
				return modelMap;
			}
			// 验证输入的验证码
			Map<String, Object> resultMap = rongCloudService.confirmFriendAdded(fromUserId, toUserId);
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
