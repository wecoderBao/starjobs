/**
 * 
 */
package com.starjobs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.starjobs.mapper.TCompanyInfoMapper;
import com.starjobs.pojo.TCompanyInfo;
import com.starjobs.service.JobService;
import com.starjobs.service.TokenService;
import com.starjobs.sys.SystemUtil;

/**
 * <p>Title:JobPublishServiceImpl</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年4月22日上午10:51:48
 */
@Service
public class JobServiceImpl  implements JobService{

	@Autowired
	TokenService tokenService;
	@Autowired
	TCompanyInfoMapper tCompanyInfoMapper;
	/* (non-Javadoc)
	 * @see com.starjobs.service.JobPuslishService#verifyUserAuth(java.lang.String, java.lang.String)
	 */
	public boolean verifyUserAuth(String token, String userFlag) {
		//非公司用户
		if(!SystemUtil.USER_COM.equals(userFlag.trim())){
			return false;
		}
		//根据token获取手机号
		String phoneNum = tokenService.getPhoneNum(token);
		if(StringUtils.isEmpty(phoneNum)){
			return false;
		}
		//根据手机号获取用户
		TCompanyInfo comInfo =  tCompanyInfoMapper.selectByPhone(phoneNum);
		if(null == comInfo){
			return false;
		}
		if(StringUtils.isEmpty(comInfo.getcUserState())){
			return false;
		}
		if(comInfo.getcUserState().equals(SystemUtil.COM_STATE_ONE)){
			return true;
		}
		return false;
	}

}
