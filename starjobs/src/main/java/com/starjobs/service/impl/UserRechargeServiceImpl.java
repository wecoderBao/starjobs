package com.starjobs.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starjobs.dto.UserRechargeRecordDto;
import com.starjobs.mapper.TUserRechargeMapper;
import com.starjobs.pojo.TUserRecharge;
import com.starjobs.pojo.TUserRechargeExample;
import com.starjobs.service.UserRechargeService;

@Service
public class UserRechargeServiceImpl implements UserRechargeService {
	@Autowired
	private TUserRechargeMapper tUserRechargeMapper;

	@Override
	public List<UserRechargeRecordDto> getUserRechargeRecord(int userId) {
		List<UserRechargeRecordDto> dtoList = new ArrayList<UserRechargeRecordDto>();
		TUserRechargeExample example = new TUserRechargeExample();
		example.or().andUserIdEqualTo(userId);
		example.setOrderByClause("create_time Desc");
		List<TUserRecharge> rechargeList = tUserRechargeMapper.selectByExample(example);
		if(null != rechargeList) {
			for(TUserRecharge recharge : rechargeList) {
				UserRechargeRecordDto dto = new UserRechargeRecordDto();
				dto.setBalance(recharge.getBalance().toString());
				dto.setCreateTime(recharge.getCreateTime().getTime());
				dto.setRechargeMoney(recharge.getRechargeMoney().toString());
				dtoList.add(dto);
			}
		}
		return dtoList;
	}

}
