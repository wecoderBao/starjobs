/**
 * 
 */
package com.starjobs.service;

import java.util.Map;

/**
 * <p>Title:TypAndChoiceService</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年4月16日下午7:59:11
 */
public interface TypeAndChoiceService {
	//获取兼职信息类型
	public Map<String,Object> getJobType();
	//获取筛选条件信息
	public Map<String,Object> getJobChoice();

}
