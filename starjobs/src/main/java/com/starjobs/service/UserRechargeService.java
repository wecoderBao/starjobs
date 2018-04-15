package com.starjobs.service;

import java.util.List;
import java.util.Map;

import com.starjobs.dto.UserRechargeRecordDto;

public interface UserRechargeService {

	/**
	 * 获取充值记录
	 * @param phone
	 * @return
	 */
	List<UserRechargeRecordDto> getUserRechargeRecord(String phone);
	
	/**
	 * 公司用户充值招聘余额
	 * @param activityId
	 * @param phone
	 * @param token
	 * @param userFlag
	 * @return
	 */
	Map<String,Object> chargeExtraBalance(int activityId,String phone,String token,String userFlag);
}
