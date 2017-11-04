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
//		if((cAdminName.equals(tamin.getcAdminName()))&&(cAdminPasswordreverse.equals(tamin.getcAdminPassword()))){
//			return true;
//		}else
//			return false;
		return true;
	}

	public List<TAdmin> selectAllAdmin() {
		// TODO Auto-generated method stub
		return tadminMapper.selectAll();
	}

	/**
	 * 修改个人信息
	 */
	public int updateByPrimaryKey(TAdmin record) {
		//获取当前用户的密码
	 String password=record.getcAdminPassword();
	 //用md5进行加密
		String passwordToMD5=MD5.getInstance().getMD5ofStr(password);
		record.setcAdminPassword(passwordToMD5);		
		return tadminMapper.updateByPrimaryKey(record);
	}
}
