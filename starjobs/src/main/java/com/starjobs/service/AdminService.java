/**
 * 
 */
package com.starjobs.service;

import org.apache.ibatis.annotations.Param;

import com.starjobs.pojo.TAdmin;

/**
 * <p>Title:SignInService</p>
 * <p>Description:</p>
 * @author:bao
 */
public interface AdminService {

	//根据用户名查找用户
	public TAdmin findUserByName(String cAdminName);
	//后台登录，md5加密
	public boolean loginAdmin(String cAdminName,String cAdminPassword );
}
