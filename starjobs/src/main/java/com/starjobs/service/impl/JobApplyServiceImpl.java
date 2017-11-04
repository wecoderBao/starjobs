/**
 * 
 */
package com.starjobs.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starjobs.common.StarConstants;
import com.starjobs.mapper.TUserInfoMapper;
import com.starjobs.mapper.TUserJobApplyMapper;
import com.starjobs.pojo.TUserInfo;
import com.starjobs.pojo.TUserJobApply;
import com.starjobs.pojo.TUserJobApplyExample;
import com.starjobs.service.JobApplyService;

/**
 * <p>Title:JobApplyImpl</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年11月4日上午9:51:44
 */
@Service("jobApplyService")
public class JobApplyServiceImpl implements JobApplyService {

	@Autowired
	TUserInfoMapper tUserInfoMapper;
	@Autowired
	TUserJobApplyMapper tUserJobApplyMapper;
	/* (non-Javadoc)
	 * @see com.starjobs.service.JobApplyInterface#applyJob(java.lang.String, java.lang.Integer)
	 */
	public Map<String, Object> applyJob(String userPhone, Integer jobId,String applyDesc) {
		//根据手机查找用户id
		TUserInfo userInfo = tUserInfoMapper.selectByPhone(userPhone);
		if(userInfo == null){
			return null;
		}
		TUserJobApply jobApply = new TUserJobApply();
		jobApply.setcApplyState(StarConstants.APPLY_STATE_NOT_CHECK);
		jobApply.setcJobId(jobId);
		jobApply.setcApplyTime(new Date());
		jobApply.setcUserId(userInfo.getcUserId());
		jobApply.setcApplyDesc(applyDesc);
		tUserJobApplyMapper.insertSelective(jobApply);
		Map<String,Object> resultMap = new HashMap<String,Object>();
		
		return resultMap;
	}
	/* (non-Javadoc)
	 * @see com.starjobs.service.JobApplyService#checkJobApply(java.lang.Integer)
	 */
	public Map<String, Object> checkJobApply(Integer jobId) {
		TUserJobApplyExample example = new TUserJobApplyExample();
		TUserJobApplyExample.Criteria criteria = example.createCriteria();
		criteria.andCApplyIdEqualTo(jobId);
		example.setOrderByClause("(c_apply_state+0) asc");
		List<TUserJobApply> applyList = tUserJobApplyMapper.selectByExample(example);
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("applyList", applyList==null?new ArrayList():applyList);
		return resultMap;
	}
	
	

}
