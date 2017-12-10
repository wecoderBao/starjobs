/**
 * 
 */
package com.starjobs.service;

import java.util.Map;

/**
 * <p>Title:JobApplyInterface</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年11月4日上午9:49:54
 */
public interface JobApplyService {

	//申请兼职
	Map<String,Object> applyJob(String userPhone,Integer jobId, String applyDesc);
	//公司查看兼职申请情况
	Map<String,Object> checkJobApply(Integer jobId);
	//申请兼职，加入群组
	Map<String,Object> applyJobAndJoinGroup(String userPhone,Integer jobId, String applyDesc);
	
}
