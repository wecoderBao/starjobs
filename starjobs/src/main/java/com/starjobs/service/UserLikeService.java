/**
 * 
 */
package com.starjobs.service;

import java.util.Map;

/**
 * <p>
 * Title:UserLikeService
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 * @date:2017年7月15日上午10:46:01
 */
public interface UserLikeService {
	// 用户关注公司
	public Map<String, Object> likeCompany(String userPhone, String comPhone);
	
	public Map<String,Object> getAllLikeCompany(String userPhone);
	
	public Map<String,Object> giveScore2Com(String userPhone,String jobId,String comId,String score);
}
