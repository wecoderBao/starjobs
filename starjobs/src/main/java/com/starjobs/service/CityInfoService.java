/**
 * 
 */
package com.starjobs.service;

import java.util.Map;

/**
 * <p>
 * Title:CityInfoService
 * </p>
 * <p>
 * Description:城市信息服务类
 * </p>
 * 
 * @author:bao
 * @date:2017年4月16日上午11:08:34
 */
public interface CityInfoService {
	// 根据行政级别获取对应城市
	public Map<String, Object> getProvinceInfo(int level);

	// 根据父级代码获取下属一级城市
	public Map<String, Object> getCityInfo(String parentCode);

}
