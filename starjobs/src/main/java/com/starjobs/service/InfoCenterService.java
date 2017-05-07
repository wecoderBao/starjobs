/**
 * 
 */
package com.starjobs.service;

import java.util.Map;

/**
 * <p>
 * Title:InfoCenterService
 * </p>
 * <p>
 * Description:个人中心信息服务类
 * </p>
 * 
 * @author:bao
 * @date:2017年4月25日下午9:10:19
 */
public interface InfoCenterService {

	// 获取普通用户个人信息
	public Map<String, Object> getUserInfo(String token, String userFlag);

	// 更新普通用户信息
	public Map<String, Object> updateUserInfo(String token, Map<String, String> params, String path);

	// 获取公司用户个人信息
	public Map<String, Object> getComInfo(String token, String userFlag);

	// 更新公司用户信息
	public Map<String, Object> updateComInfo(String token, Map<String, String> params, String path);

	// 公司用户上传营业证图片
	public Map<String, Object> uploadComCertificate(String token, Map<String, String> params, String path);
}
