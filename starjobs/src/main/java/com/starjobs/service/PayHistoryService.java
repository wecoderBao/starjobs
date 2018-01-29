package com.starjobs.service;

import java.util.List;

import com.starjobs.dto.RefreshJobDto;

public interface PayHistoryService {

	List<RefreshJobDto> getRefreshListByUserId(Integer userId);
}
