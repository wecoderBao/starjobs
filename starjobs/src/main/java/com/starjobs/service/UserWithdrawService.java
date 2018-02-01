package com.starjobs.service;

import java.util.List;

import com.starjobs.dto.UserWithdrawDto;

public interface UserWithdrawService {

	/**
	 * 提现记录
	 * @param userId
	 * @return
	 */
	List<UserWithdrawDto> getUserWithdrawRecord(Integer userId);
}
