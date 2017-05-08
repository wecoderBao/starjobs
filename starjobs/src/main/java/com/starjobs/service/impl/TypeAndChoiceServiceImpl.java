/**
 * 
 */
package com.starjobs.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starjobs.mapper.TJobChoiceMapper;
import com.starjobs.mapper.TJobTypeMapper;
import com.starjobs.pojo.City;
import com.starjobs.pojo.TJobChoice;
import com.starjobs.pojo.TJobType;
import com.starjobs.service.TypeAndChoiceService;

/**
 * <p>Title:TypeAndChoiceServiceImpl</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年4月16日下午8:06:24
 */
@Service
public class TypeAndChoiceServiceImpl implements TypeAndChoiceService {

	@Autowired
	TJobTypeMapper tJobTypeMapper;
	@Autowired
	TJobChoiceMapper tJobChoiceMapper;
	/* (non-Javadoc)
	 * @see com.starjobs.service.TypeAndChoiceService#getJobType()
	 */
	public Map<String, Object> getJobType() {
		Map<String, Object> typeMap = new HashMap<String, Object>();
		List<TJobType> types = tJobTypeMapper.selectAllType();
		if (types == null) {
			typeMap.put("cityList", new ArrayList<City>());
			return typeMap;
		}
		ArrayList<Map<String, Object>> TypeList = new ArrayList<Map<String, Object>>();
		for (TJobType type : types) {
			Map<String, Object> aCity = new HashMap<String, Object>(2);
			aCity.put("code", type.getCode());
			aCity.put("name", type.getName());
			TypeList.add(aCity);
		}
		typeMap.put("typeList", TypeList);
		return typeMap;
	}

	/* (non-Javadoc)
	 * @see com.starjobs.service.TypeAndChoiceService#getJobChoice()
	 */
	public Map<String, Object> getJobChoice() {
		Map<String, Object> choiceMap = new HashMap<String, Object>();
		List<TJobChoice> choices = tJobChoiceMapper.selectAllChoice();
		if (choices == null) {
			choiceMap.put("choiceList", new ArrayList<City>());
			return choiceMap;
		}
		ArrayList<Map<String, Object>> choiceList = new ArrayList<Map<String, Object>>();
		for (TJobChoice choice : choices) {
			Map<String, Object> aChoice = new HashMap<String, Object>(2);
			aChoice.put("code", choice.getCode());
			aChoice.put("name", choice.getName());
			choiceList.add(aChoice);
		}
		choiceMap.put("choiceList", choiceList);
		return choiceMap;
	}

}
