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
	// 用户注册
	@RequestMapping(value = "/user/get/job_info", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> verifyCode(HttpServletRequest request) {
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
		//page
		String page = request.getParameter("page");
		// 返回json容器
		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		if (StringUtils.isEmpty(token) || StringUtils.isEmpty(userFlag)||StringUtils.isEmpty(page)) {
			return modelMap;
		}
		//验证token是否有效
		boolean isPermitted = tokenService.checkToken(token);
		if(!isPermitted){
			return modelMap;
		}
		// 返回兼职信息
		Map<String, Object> jobMap = userService.userGetJobInfo(city, area, typeId, choiceId,page);
		if(jobMap == null){
			return modelMap;
		}
		jobMap.put("token", token);
		jobMap.put("userFlag",userFlag);
		//查询结果为空
		if(null == jobMap.get("jobList")){
			modelMap.put("error_code", SystemUtil.CODE_EMPTY);
			modelMap.put("message", "jobList empty");
		}else{
			modelMap.put("error_code", SystemUtil.CODE_SUCC);
			modelMap.put("message", "success");
		}
		modelMap.put("data", jobMap);
		
		return modelMap;
	}
}
