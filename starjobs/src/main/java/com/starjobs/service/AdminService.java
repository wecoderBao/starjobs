/**
 * 
 */
package com.starjobs.service;

import java.util.List;

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
	
	//管理员查询	
	public List<TAdmin> selectAllAdmin();
}
