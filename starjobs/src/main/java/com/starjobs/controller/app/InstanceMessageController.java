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
				|| StringUtils.isEmpty(toUserId) || StringUtils.isEmpty(content) || StringUtils.isEmpty(pushContent)) {
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
				|| StringUtils.isEmpty(toUserId)) {
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

	// 查找好友请求
	@RequestMapping(value = "/cloud/look/friend", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> lookFriend(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// phoneNum
		String phoneNum = request.getParameter("phoneNum");
		// userPhone
		String userPhone = request.getParameter("userPhone");
		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(phoneNum)
				|| StringUtils.isEmpty(userPhone)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			return modelMap;
		}
		// 验证输入的验证码
		Map<String, Object> resultMap = rongCloudService.lookFriend(userPhone,phoneNum);
		if (resultMap == null) {
			modelMap.put("error_code", SystemUtil.FRIEND_NOT_FOUND);
			modelMap.put("message", "user not found");
			return modelMap;
		}
		resultMap.put("token", token);
		resultMap.put("userFlag", userFlag);
		modelMap.put("error_code", SystemUtil.CODE_SUCC);
		modelMap.put("message", "success");
		modelMap.put("data", resultMap);

		return modelMap;
	}

	// 查找好友请求
	@RequestMapping(value = "/cloud/read/friends", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> readFriends(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// phoneNum
		String phoneNum = request.getParameter("phoneNum");

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
		Map<String, Object> resultMap = rongCloudService.readFriends(phoneNum);
		if (resultMap == null) {
			modelMap.put("error_code", SystemUtil.FRIEND_NOT_FOUND);
			modelMap.put("message", "friend not found");
			return modelMap;
		}
		resultMap.put("token", token);
		resultMap.put("userFlag", userFlag);
		modelMap.put("error_code", SystemUtil.CODE_SUCC);
		modelMap.put("message", "success");
		modelMap.put("data", resultMap);

		return modelMap;
	}

	// 删除好友请求
	@RequestMapping(value = "/cloud/delete/friend", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> deleteFriend(HttpServletRequest request) {
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
				|| StringUtils.isEmpty(toUserId)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			return modelMap;
		}
		// 验证输入的验证码
		Map<String, Object> resultMap = rongCloudService.deleteFriend(fromUserId, toUserId);
		if (resultMap == null) {
			modelMap.put("error_code", SystemUtil.FRIEND_NOT_FOUND);
			modelMap.put("message", "user not found");
			return modelMap;
		}
		resultMap.put("token", token);
		resultMap.put("userFlag", userFlag);
		modelMap.put("error_code", SystemUtil.CODE_SUCC);
		modelMap.put("message", "success");
		modelMap.put("data", resultMap);

		return modelMap;
	}

	// 创建群组请求
	@RequestMapping(value = "/cloud/create/group", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> createGroup(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// userId
		String userId = request.getParameter("userId");
		// userId
		String groupName = request.getParameter("groupName");

		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(userId)
				|| StringUtils.isEmpty(groupName)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			return modelMap;
		}
		// 验证输入的验证码
		Map<String, Object> resultMap = rongCloudService.createGroup(userId, groupName);
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

	// 加入群组请求
	@RequestMapping(value = "/cloud/join/group", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> joinGroup(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// userId
		String userId = request.getParameter("userId");
		// groupName
		String groupName = request.getParameter("groupName");
		// groupId
		String groupId = request.getParameter("groupId");

		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(userId)
				|| StringUtils.isEmpty(groupName) || StringUtils.isEmpty(groupId)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			return modelMap;
		}
		// 验证输入的验证码
		Map<String, Object> resultMap = rongCloudService.joinGroup(userId, groupId, groupName);
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

	// 解散群组
	@RequestMapping(value = "/cloud/dismiss/group", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dismissGroup(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// userId
		String userId = request.getParameter("userId");
		// groupId
		String groupId = request.getParameter("groupId");

		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(userId)
				|| StringUtils.isEmpty(groupId)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			return modelMap;
		}
		// 验证输入的验证码
		Map<String, Object> resultMap = rongCloudService.dismissGroup(userId, groupId);
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

	// 获取群组列表
	@RequestMapping(value = "/cloud/group/list", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> groupList(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// phoneNum
		String phoneNum = request.getParameter("phoneNum");

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
		Map<String, Object> resultMap = rongCloudService.groupList(phoneNum);
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

	// 获取群组列表
	@RequestMapping(value = "/cloud/group/members", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> groupMembers(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// groupId
		String groupId = request.getParameter("groupId");

		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(groupId)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			return modelMap;
		}
		// 验证输入的验证码
		Map<String, Object> resultMap = rongCloudService.groupMembers(groupId);
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
