package com.starjobs.service;

import java.util.Map;

public interface BalanceService {

	// 获取用户余额
	Map<String, Object> getUserBalance(String phone,String userFlag);
	//获取招聘余额
	Map<String,Object> getExtraBalance(String phone);
}
