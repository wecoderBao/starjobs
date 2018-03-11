package com.starjobs.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.starjobs.mapper.TCompanyInfoMapper;
import com.starjobs.mapper.TUserInfoMapper;
import com.starjobs.pojo.TCompanyInfo;
import com.starjobs.pojo.TUserInfo;
import com.starjobs.service.BalanceService;
import com.starjobs.sys.SystemUtil;

@Service
public class BalanceServiceImpl implements BalanceService {
	@Autowired
	private TUserInfoMapper tUserInfoMapper;
	@Autowired
	private TCompanyInfoMapper tCompanyInfoMapper;

	@Override
	public Map<String, Object> getUserBalance(String phone, String userFlag) {
		// TODO Auto-generated method stub
		Map<String,Object> resultMap = new HashMap<String,Object>(2);
		if(SystemUtil.USER_STU.equals(userFlag)) {
			//学生用户
			TUserInfo userInfo = tUserInfoMapper.selectByPhone(phone);
			if(null == userInfo) {
				return null;
			}else {
				resultMap.put("balance", StringUtils.isEmpty(userInfo.getcUserBalance())?"0":userInfo.getcUserBalance());
			}
		}else if(SystemUtil.USER_COM.equals(userFlag)) {
			TCompanyInfo comInfo = tCompanyInfoMapper.selectByPhone(phone);
			if(null == comInfo) {
				return null;
			}else {
				resultMap.put("balance", StringUtils.isEmpty(comInfo.getcComBalance())?"0":comInfo.getcComBalance());
			}
		}
		return null;
	}
	@Override
	public Map<String, Object> getExtraBalance(String phone) {
		// TODO Auto-generated method stub
		TCompanyInfo comInfo = tCompanyInfoMapper.selectByPhone(phone);
		if(null == comInfo) {
			return null;
		}else {
			Map<String, Object> resultMap = new HashMap<String, Object>(4);
			resultMap.put("extraBalance", StringUtils.isEmpty(comInfo.getcComBalance())?"0":comInfo.getcExtraBalance());
			return resultMap;
		}
	}
}
