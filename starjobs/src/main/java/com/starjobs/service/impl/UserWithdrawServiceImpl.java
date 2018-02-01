package com.starjobs.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.starjobs.dto.UserWithdrawDto;
import com.starjobs.mapper.TUserWithdrawMapper;
import com.starjobs.pojo.TUserWithdraw;
import com.starjobs.pojo.TUserWithdrawExample;
import com.starjobs.service.UserWithdrawService;

public class UserWithdrawServiceImpl implements UserWithdrawService {
	@Autowired
	private TUserWithdrawMapper tUserWithdrawMapper;

	@Override
	public List<UserWithdrawDto> getUserWithdrawRecord(Integer userId) {
		List<UserWithdrawDto> dtoList = new ArrayList<UserWithdrawDto>();
		TUserWithdrawExample example = new TUserWithdrawExample();
		example.or().andUserIdEqualTo(userId);
		example.setOrderByClause("create_time Desc");
		List<TUserWithdraw> withdrawList = tUserWithdrawMapper.selectByExample(example);
		if(null != withdrawList) {
			for(TUserWithdraw withdraw : withdrawList) {
				UserWithdrawDto dto = new UserWithdrawDto();
				dto.setBalance(withdraw.getBalance().toString());
				dto.setCreateTime(withdraw.getCreateTime().getTime());
				dto.setWithdrawMoney(withdraw.getWithdrawMoney().toString());
				dtoList.add(dto);
			}
		}
		return dtoList;
	}

}
