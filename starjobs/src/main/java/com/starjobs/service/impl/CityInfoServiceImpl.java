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

import com.starjobs.mapper.CityMapper;
import com.starjobs.pojo.City;
import com.starjobs.service.CityInfoService;

/**
 * <p>
 * Title:CityInfoServiceImpl
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 * @date:2017年4月16日上午11:13:22
 */
@Service
public class CityInfoServiceImpl implements CityInfoService {
	@Autowired
	CityMapper cityMapper;
	//根据行政级别获取对应城市
	public Map<String, Object> getProvinceInfo(int level) {
		Map<String, Object> cityMap = new HashMap<String, Object>();
		List<City> cities = cityMapper.selectByLevel(level);
		if (cities == null) {
			cityMap.put("cityList", new ArrayList<City>());
			return cityMap;
		}
		ArrayList<Map<String, Object>> cityList = new ArrayList<Map<String, Object>>();
		for (City city : cities) {
			Map<String, Object> aCity = new HashMap<String, Object>(2);
			aCity.put("code", city.getCode());
			aCity.put("name", city.getName());
			cityList.add(aCity);
		}
		cityMap.put("cityList", cityList);
		return cityMap;
	}
	//根据父级代码获取下属一级城市
	public Map<String, Object> getCityInfo(String parentCode) {
		Map<String, Object> cityMap = new HashMap<String, Object>();
		// 根据父级城市代码获取对应主键
		int parentId = -1;
		parentId = cityMapper.selectIdByCode(parentCode);
		if (parentId == -1) {
			cityMap.put("cityList", new ArrayList<City>());
			return cityMap;
		}
		List<City> cities = cityMapper.selectByParentId(parentId);
		if (cities == null) {
			cityMap.put("cityList", new ArrayList<City>());
			return cityMap;
		}
		ArrayList<Map<String, Object>> cityList = new ArrayList<Map<String, Object>>();
		for (City city : cities) {
			Map<String, Object> aCity = new HashMap<String, Object>(2);
			aCity.put("code", city.getCode());
			aCity.put("name", city.getName());
			cityList.add(aCity);
		}
		cityMap.put("cityList", cityList);
		return cityMap;
	}
}
