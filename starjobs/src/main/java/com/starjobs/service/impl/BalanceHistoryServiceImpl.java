package com.starjobs.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starjobs.dto.BalanceHistoryDto;
import com.starjobs.mapper.BalanceHistoryMapper;
import com.starjobs.pojo.BalanceHistory;
import com.starjobs.pojo.BalanceHistoryExample;
import com.starjobs.service.BalanceHistoryService;

@Service
public class BalanceHistoryServiceImpl implements BalanceHistoryService {
	@Autowired
	private BalanceHistoryMapper balanceHistoryMapper;

	@Override
	public List<BalanceHistoryDto> getBalanceHistoryList(String phone) {
		List<BalanceHistoryDto> dtoList = new ArrayList<BalanceHistoryDto>();
		BalanceHistoryExample example = new BalanceHistoryExample();
		example.createCriteria().andPhoneEqualTo(phone);
		example.setOrderByClause("create_time Desc");
		List<BalanceHistory> balanceHistoryList = balanceHistoryMapper.selectByExample(example);
		if(null != balanceHistoryList) {
			for(BalanceHistory his : balanceHistoryList) {
				BalanceHistoryDto dto = new BalanceHistoryDto();
				dto.setCost(his.getCost());
				dto.setCostType(his.getCostType());
				dto.setCreateTime(his.getCreateTime().getTime());
				dto.setTradeNo(his.getTradeNo()==null?"":his.getTradeNo());
				dtoList.add(dto);
			}
		}
		return dtoList;
	}

}
