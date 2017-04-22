/**
 * 
 */
package com.starjobs.service;

/**
 * <p>Title:JobPuslishService</p>
 * <p>Description:发布兼职信息</p>
 * @author:bao
 * @date:2017年4月22日上午10:50:15
 */
public interface JobService {
	public boolean verifyUserAuth(String token,String userFlag);
}
