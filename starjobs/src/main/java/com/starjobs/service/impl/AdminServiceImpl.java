/**
 * 
 */
package com.starjobs.service.impl;

import java.util.List;

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
	
	public TAdmin findUserByName(String cAdminName) {
		return tadminMapper.findUserByName(cAdminName);
	}
 
	//用于登录的方法
	public boolean loginAdmin(String cAdminName,String cAdminPassword ){
		TAdmin tamin=findUserByName(cAdminName);
		String cAdminPasswordreverse=MD5.getInstance().getMD5ofStr(cAdminPassword);
		if((cAdminName.equals(tamin.getcAdminName()))&&(cAdminPasswordreverse.equals(tamin.getcAdminPassword()))){
			return true;
		}else
			return false;
	}

	public List<TAdmin> selectAllAdmin() {
		// TODO Auto-generated method stub
		return tadminMapper.selectAll();
	}
}
