package com.starjobs.service;

import java.util.List;

import com.starjobs.dto.UserRechargeRecordDto;

public interface UserRechargeService {

	/**
	 * 获取充值记录
	 * @param userId
	 * @return
	 */
	List<UserRechargeRecordDto> getUserRechargeRecord(int userId);
}
