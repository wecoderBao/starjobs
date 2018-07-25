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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.starjobs.common.StarConstants;
import com.starjobs.service.JobApplyService;
import com.starjobs.service.TokenService;
import com.starjobs.sys.SystemUtil;

/**
 * <p>
 * Title:JobApplyController
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 * @date:2017年11月4日上午9:40:10
 */
@Controller
public class JobApplyController {
	@Autowired
	private TokenService tokenService;
	@Autowired
	private JobApplyService jobApplyService;

	// 用户申请兼职
	@RequestMapping(value = "/user/apply/job", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> applyJob(@RequestParam String userPhone, @RequestParam Integer jobId,
			HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// 申请描述信息
		String applyDesc = request.getParameter("applyDesc");

		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(userPhone)
				|| jobId == null) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			modelMap.put("error_code", SystemUtil.CODE_TOKEN_EXPIRE);
			return modelMap;
		}

		// 申请兼职
		Map<String, Object> result = jobApplyService.applyJob(userPhone, jobId, applyDesc);
		// 发布成功
		if (result != null) {
			if(result.get("code")!=null){
				modelMap.put("error_code", SystemUtil.USER_APPLY_JOB_REACH_MAX);
				modelMap.put("message", "申请次数已达上限");
			}else{
				modelMap.put("error_code", SystemUtil.CODE_SUCC);
				modelMap.put("message", "success");
				result.put("token", token);
				result.put("userFlag", SystemUtil.USER_COM);
				modelMap.put("data", result);
			}
		}

		return modelMap;
	}

	// 用户申请兼职
	@RequestMapping(value = "/user/applyJob/joinGroup", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> applyJobAndJoinGroup(@RequestParam String userPhone, @RequestParam Integer jobId,
			HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");
		// 申请描述信息
		String applyDesc = request.getParameter("applyDesc");

		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || StringUtils.isEmpty(userPhone)
				|| jobId == null) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			modelMap.put("error_code", SystemUtil.CODE_TOKEN_EXPIRE);
			return modelMap;
		}

		// 申请兼职,加入群组
		Map<String, Object> result = jobApplyService.applyJobAndJoinGroup(userPhone, jobId, applyDesc);
		// 发布成功
		if (result != null) {
			if(SystemUtil.USER_APPLY_JOB_REACH_MAX.equals(result.get("code"))){
				modelMap.put("error_code", SystemUtil.USER_APPLY_JOB_REACH_MAX);
				modelMap.put("message", "申请次数已达上限");
			}else if(SystemUtil.USER_APPLied_JOB.equals(result.get("code"))){
				modelMap.put("error_code", SystemUtil.USER_APPLY_JOB_REACH_MAX);
				modelMap.put("message", "用户已经申请该职位");
			}else{
				modelMap.put("error_code", SystemUtil.CODE_SUCC);
				modelMap.put("message", "success");
				result.put("token", token);
				result.put("userFlag", SystemUtil.USER_COM);
				modelMap.put("data", result);
			}
		}

		return modelMap;
	}

	// 公司查看申请兼职列表
	@RequestMapping(value = "/com/check/job/apply", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> checkJobApply(@RequestParam Integer jobId, HttpServletRequest request) {
		// 获取token
		String token = request.getParameter("token");
		// 用户类别标记
		String userFlag = request.getParameter("userFlag");

		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag) || jobId == null) {
			return modelMap;
		}
		// 验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if (!isPermitted) {
			modelMap.put("error_code", SystemUtil.CODE_TOKEN_EXPIRE);
			return modelMap;
		}

		// 申请兼职
		Map<String, Object> result = jobApplyService.checkJobApply(jobId);
		// 发布成功
		if (result != null) {
			modelMap.put("error_code", SystemUtil.CODE_SUCC);
			modelMap.put("message", "success");
			result.put("token", token);
			result.put("userFlag", SystemUtil.USER_COM);
			modelMap.put("data", result);
		}

		return modelMap;
	}

}
