/**
 * 
 */
package com.starjobs.service;

import java.util.Map;

/**
 * <p>
 * Title:SignInService
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 */
public interface UserService {
	// 注册时验证验证码
	public Map<String, Object> verifyCode(String phone, String code, String password, String userFlag, String appFlag);

	// 用户登录
	public Map<String, Object> userLogin(String phone, String password, String userFlag);

	// 用户找回密码
	public Map<String, Object> userRetrievePwd(String phone, String code, String password, String userFlag,
			String appFlag);

	// 用户查询兼职信息
	public Map<String, Object> userGetJobInfo(String city, String area, String type, String choice, String page);

	// 用户查询兼职信息
	public Map<String, Object> userGetJobDetail(String jobId);
	
	//发布兼职信息
	public Map<String,Object> publishJobInfo(Map<String,String> params);
}
