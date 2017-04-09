/**
 * 
 */
package com.starjobs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starjobs.common.MD5;
import com.starjobs.mapper.TAdminMapper;
import com.starjobs.pojo.TAdmin;
import com.starjobs.service.AdminService;

/**
 * <p>Title:SignInServiceImpl</p>
 * <p>Description:</p>
 * @author:bao
 */
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	TAdminMapper tadminMapper;
	@Override
	public TAdmin findUserByName(String cAdminName) {
		return tadminMapper.findUserByName(cAdminName);
	}
 
	//用于登录的方法
	public boolean loginAdmin(String cAdminName,String cAdminPassword ){
		TAdmin tamin=findUserByName(cAdminName);
		MD5 md5=new MD5();
		String cAdminPasswordreverse=md5.getMD5ofStr(cAdminPassword);
		if((cAdminName.equals(tamin.getcAdminName()))&&(cAdminPasswordreverse.equals(tamin.getcAdminPassword()))){
			return true;
		}else
			return false;
	}
}
