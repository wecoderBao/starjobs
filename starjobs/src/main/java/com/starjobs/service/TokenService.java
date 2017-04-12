/**
 * 
 */
package com.starjobs.service;

/**
 * <p>Title:TokenService</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年4月12日下午2:29:00
 */
public interface TokenService {
	//保存token
	public int save(String token,String phone);
}
