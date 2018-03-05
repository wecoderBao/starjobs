package com.starjobs.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starjobs.mapper.ChargeActivityMapper;
import com.starjobs.pojo.ChargeActivity;
import com.starjobs.pojo.ChargeActivityExample;
import com.starjobs.service.ChargeActivityService;

@Service
public class ChargeActivityServiceImpl implements ChargeActivityService {
	@Autowired
	private ChargeActivityMapper chargeActivityMapper;

	@Override
	public Map<String, Object> getChargeActivityList() {
		Map<String,Object> resultMap = new HashMap<String,Object>(2);
		ChargeActivityExample example = new ChargeActivityExample();
		example.createCriteria();
		List<ChargeActivity>activityList = chargeActivityMapper.selectByExample(example);
		resultMap.put("activityList", activityList);
		return resultMap;
	}

}
