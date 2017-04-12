/**
 * 
 */
package com.starjobs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starjobs.mapper.TUserTokenMapper;
import com.starjobs.pojo.TUserToken;
import com.starjobs.service.TokenService;

/**
 * <p>Title:TokenServiceImpl</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年4月12日下午2:29:19
 */
@Service
public class TokenServiceImpl implements TokenService {
	@Autowired
	TUserTokenMapper tUserTokenMapper;
	
	public int save(String token,String phone){
		int re =0;
		TUserToken record = new TUserToken();
		record.setcPhoneNum(phone);
		record.setcTokenValue(token);
		re = tUserTokenMapper.insert(record);
		return re;
	}
}
