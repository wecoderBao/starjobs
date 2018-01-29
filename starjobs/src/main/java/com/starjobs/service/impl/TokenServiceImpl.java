/**
 * 
 */
package com.starjobs.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.starjobs.common.StarConstants;
import com.starjobs.mapper.TUserTokenMapper;
import com.starjobs.pojo.TUserToken;
import com.starjobs.service.TokenService;

/**
 * <p>
 * Title:TokenServiceImpl
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 * @date:2017年4月12日下午2:29:19
 */
@Service
public class TokenServiceImpl implements TokenService {
	@Autowired
	TUserTokenMapper tUserTokenMapper;

	// 保存token
	public int save(String token, String phone) {
		int re = 0;
		TUserToken record = new TUserToken();
		record.setcPhoneNum(phone);
		record.setcTokenValue(token);
		record.setcCreateTime(new Date());
		re = tUserTokenMapper.insert(record);
		return re;
	}

	// 校验token
	public boolean checkToken(String token) {
		// 更据token值查询token
		TUserToken record = tUserTokenMapper.selectByTokenValue(token);
		if (record == null) {
			return false;
		}
		//token失效
		if(record.getcCreateTime() == null) {
			return false;
		}
		boolean expireFlag = (new Date()).getTime() - record.getcCreateTime().getTime() > StarConstants.TOKEN_EXPIRE_TIME;
		if(expireFlag) {
			return false;
		}
		//更新token时间
		record.setcCreateTime(new Date());
		tUserTokenMapper.updateByPrimaryKeySelective(record);
		return true;
	}

	// 获取用户手机号
	public String getPhoneNum(String token) {
		TUserToken record = tUserTokenMapper.selectByTokenValue(token);
		if (null == record) {
			return "";
		} else if (StringUtils.isEmpty(record.getcPhoneNum())) {
			return "";
		} else {
			return record.getcPhoneNum();
		}
	}
}
