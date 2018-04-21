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

import com.starjobs.service.MyPublishService;
import com.starjobs.service.TokenService;
import com.starjobs.sys.SystemUtil;

/**
 * <p>
 * Title:MyPublishController
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 * @date:2017年12月10日上午9:05:39
 */
@Controller
public class MyPublishController {

	@Autowired
	private TokenService tokenService;
	@Autowired
	private MyPublishService myPublishService;

	// 点击停止按钮，jobState为0
	@RequestMapping(value = "/com/stop/job", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> recommendJob(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// jobId
		String jobId = request.getParameter("jobId");

		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(jobId)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			modelMap.put("error_code", SystemUtil.CODE_TOKEN_EXPIRE);
			return modelMap;
		}
		// 
		Map<String, Object> resultMap = myPublishService.recommendJob(Integer.parseInt(jobId));
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

	// 删除
	@RequestMapping(value = "/com/delete/job", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> deleteJob(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// jobId
		String jobId = request.getParameter("jobId");

		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(jobId)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			modelMap.put("error_code", SystemUtil.CODE_TOKEN_EXPIRE);
			return modelMap;
		}
		// 
		Map<String, Object> resultMap = myPublishService.deleteJob(Integer.parseInt(jobId));
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

	// 刷新
	@RequestMapping(value = "/com/refresh/job", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> refreshJob(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// jobId
		String jobId = request.getParameter("jobId");

		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(jobId)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			modelMap.put("error_code", SystemUtil.CODE_TOKEN_EXPIRE);
			return modelMap;
		}
		// 
		Map<String, Object> resultMap = myPublishService.refreshJob(Integer.parseInt(jobId));
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

	// 点击推广，状态为1
	@RequestMapping(value = "/com/recommend/job", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> stopJob(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// jobId
		String jobId = request.getParameter("jobId");

		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(jobId)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			modelMap.put("error_code", SystemUtil.CODE_TOKEN_EXPIRE);
			return modelMap;
		}
		// 
		Map<String, Object> resultMap = myPublishService.stopJob(Integer.parseInt(jobId));
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

	// 修改兼职信息
	@RequestMapping(value = "/com/modify/job", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> modifyJob(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// jobId
		String jobId = request.getParameter("jobId");

		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(jobId)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			modelMap.put("error_code", SystemUtil.CODE_TOKEN_EXPIRE);
			return modelMap;
		}
		Map<String, String> params = new HashMap<String, String>();
		params.put("jobId", jobId);
		params.put("comId", request.getParameter("comId"));
		params.put("jobName", request.getParameter("jobName"));
		params.put("jobDesc", request.getParameter("jobDesc"));
		params.put("payMethod", request.getParameter("payMethod"));
		params.put("gender", request.getParameter("gender"));
		params.put("totalPerson", request.getParameter("totalPerson"));
		params.put("jobChoice", request.getParameter("jobChoice"));
		params.put("jobType", request.getParameter("jobType"));
		params.put("city", request.getParameter("city"));
		params.put("area", request.getParameter("area"));
		params.put("address", request.getParameter("address"));
		params.put("locationX", request.getParameter("locationX"));
		params.put("locationY", request.getParameter("locationY"));
		params.put("locationName", request.getParameter("locationName"));
		params.put("workDate", request.getParameter("workDate"));
		params.put("workTime", request.getParameter("workTime"));
		params.put("salary", request.getParameter("salary"));
		//
		Map<String, Object> resultMap = myPublishService.modifyJob(params);
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
