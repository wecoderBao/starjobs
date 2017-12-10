/**
 * 
 */
package com.starjobs.service;

import java.util.Map;

/**
 * <p>Title:MyPublishService</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年12月10日上午9:07:47
 */
public interface MyPublishService {
	//推广
	Map<String,Object> recommendJob(int jobId);
	//删除兼职信息
	Map<String,Object> deleteJob(int jobId);
	//刷新
	Map<String,Object> refreshJob(int jobId);
	//停止招聘
	Map<String,Object> stopJob(int jobId);
	//修改招聘信息
	Map<String,Object> modifyJob(Map<String,String> jobInfoMap);
	

}
