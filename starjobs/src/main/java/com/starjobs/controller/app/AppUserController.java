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

import com.starjobs.service.JobService;
import com.starjobs.service.TokenService;
import com.starjobs.service.UserService;
import com.starjobs.sys.SystemUtil;

/**
 * <p>
 * Title:AppUserController
 * </p>
 * <p>
 * Description:手机端用户请求控制类
 * </p>
 * 
 * @author:bao
 * @date:2017年4月16日上午8:20:28
 */
@Controller
public class AppUserController {
	@Autowired
	TokenService tokenService;
	@Autowired
	UserService userService;
	@Autowired
	JobService jobService;

	// 用户获取兼职信息列表
	@RequestMapping(value = "/user/get/job_info", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getJobInfo(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// city
		String city = request.getParameter("city");
		// area
		String area = request.getParameter("area");
		// type
		String typeId = request.getParameter("typeId");
		// choice
		String choiceId = request.getParameter("choiceId");
		// page
		String page = request.getParameter("page");
		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(page)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			return modelMap;
		}
		// 返回兼职信息
		Map<String, Object> jobMap = userService.userGetJobInfo(city, area, typeId, choiceId, page);
		if (jobMap == null) {
			return modelMap;
		}
		jobMap.put("token", token);
		jobMap.put("userFlag", userFlag);
		// 查询结果为空
		if (null == jobMap.get("jobList")) {
			modelMap.put("error_code", SystemUtil.CODE_EMPTY);
			modelMap.put("message", "jobList empty");
		} else {
			modelMap.put("error_code", SystemUtil.CODE_SUCC);
			modelMap.put("message", "success");
		}
		modelMap.put("data", jobMap);

		return modelMap;
	}

	// 用户获取单个兼职信息信息
	@RequestMapping(value = "/user/get/job_detail", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getJobDetail(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// job id
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
			return modelMap;
		}
		// 返回兼职信息
		Map<String, Object> jobMap = userService.userGetJobDetail(jobId);
		if (jobMap == null) {
			return modelMap;
		}
		jobMap.put("token", token);
		jobMap.put("userFlag", userFlag);
		// 查询结果为空
		if (null == jobMap.get("jobDetail")) {
			modelMap.put("error_code", SystemUtil.CODE_EMPTY);
			modelMap.put("message", "jobDetail empty");
		} else {
			modelMap.put("error_code", SystemUtil.CODE_SUCC);
			modelMap.put("message", "success");
		}
		modelMap.put("data", jobMap);

		return modelMap;
	}

	// 用户获取单个兼职信息信息
	@RequestMapping(value = "/user/publish/job_info", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> publishJobInfo(HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// 公司ID
		String comId = request.getParameter("comId");
		Map<String, String> params = new HashMap<String, String>();
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
		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(comId)) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			return modelMap;
		}
		// 验证用户是否有发布权限,userFlag必须为0
		boolean auFlag = jobService.verifyUserAuth(token, userFlag);
		if(!auFlag){
			modelMap.put("error_code", SystemUtil.NO_PUBLISH);
			modelMap.put("message", "forbiden");
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("token", token);
			data.put("userFlag", SystemUtil.USER_COM);
			modelMap.put("data", data);
			return modelMap;
		}
		// 返回兼职信息
		boolean result = userService.publishJobInfo(params);
		// 发布成功
		if (result) {
			modelMap.put("error_code", SystemUtil.CODE_SUCC);
			modelMap.put("message", "success");
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("token", token);
			data.put("userFlag", SystemUtil.USER_COM);
			modelMap.put("data", data);
		}
		
		return modelMap;
	}
}
