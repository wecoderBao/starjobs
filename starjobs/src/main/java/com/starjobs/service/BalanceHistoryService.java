package com.starjobs.service;

import java.util.List;

import com.starjobs.dto.BalanceHistoryDto;

public interface BalanceHistoryService {

	/**
	 * 余额历史记录
	 * @param phone
	 * @return
	 */
	List<BalanceHistoryDto> getBalanceHistoryList(String phone);
}
