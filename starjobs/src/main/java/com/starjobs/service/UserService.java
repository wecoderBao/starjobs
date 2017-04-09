/**
 * 
 */
package com.starjobs.service;

import java.util.Map;

/**
 * <p>Title:SignInService</p>
 * <p>Description:</p>
 * @author:bao
 */
public interface UserService {
	//注册时验证验证码
	public Map<String,Object> verifyCode(String phone,String code,String password,String userFlag);
}
