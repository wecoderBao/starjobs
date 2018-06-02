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
import com.starjobs.mapper.JobApplyRestrictMapper;
import com.starjobs.mapper.TGroupMapper;
import com.starjobs.mapper.TUserInfoMapper;
import com.starjobs.mapper.TUserJobApplyMapper;
import com.starjobs.pojo.JobApplyRestrict;
import com.starjobs.pojo.TGroup;
import com.starjobs.pojo.TUserInfo;
import com.starjobs.pojo.TUserJobApply;
import com.starjobs.pojo.TUserJobApplyExample;
import com.starjobs.service.JobApplyService;
import com.starjobs.sys.SystemUtil;

import io.rong.service.RongCloudService;

/**
 * <p>
 * Title:JobApplyImpl
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 * @date:2017年11月4日上午9:51:44
 */
@Service("jobApplyService")
public class JobApplyServiceImpl implements JobApplyService {

	@Autowired
	private TUserInfoMapper tUserInfoMapper;
	@Autowired
	private TUserJobApplyMapper tUserJobApplyMapper;
	@Autowired
	private RongCloudService rongCloudService;
	@Autowired
	private TGroupMapper tGroupMapper;
	@Autowired
	private JobApplyRestrictMapper jobApplyRestrictMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.starjobs.service.JobApplyInterface#applyJob(java.lang.String,
	 * java.lang.Integer)
	 */
	public Map<String, Object> applyJob(String userPhone, Integer jobId, String applyDesc) {
		// 根据手机查找用户id
		TUserInfo userInfo = tUserInfoMapper.selectByPhone(userPhone);
		if (userInfo == null) {
			return null;
		}
		/**
		 * 判断用户一天内是否有两次申请记录
		 */
		int total = jobApplyRestrictMapper.queryUserRecordTotalByDay(userInfo.getcUserId());
		if(total >= StarConstants.USER_APPLY_JOB_MAX_TIMES) {
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("code", SystemUtil.USER_APPLY_JOB_REACH_MAX);
			return result;
		}
		
		TUserJobApply jobApply = new TUserJobApply();
		jobApply.setcApplyState(StarConstants.APPLY_STATE_NOT_CHECK);
		jobApply.setcJobId(jobId);
		jobApply.setcApplyTime(new Date());
		jobApply.setcUserId(userInfo.getcUserId());
		jobApply.setcApplyDesc(applyDesc);
		tUserJobApplyMapper.insertSelective(jobApply);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		/**
		 * 添加申请记录
		 */
		JobApplyRestrict applyRestrict = new JobApplyRestrict();
		applyRestrict.setCreateTime(new Date());
		applyRestrict.setJobId(jobId);
		applyRestrict.setUserId(userInfo.getcUserId());
		jobApplyRestrictMapper.insertSelective(applyRestrict);

		return resultMap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.starjobs.service.JobApplyService#checkJobApply(java.lang.Integer)
	 */
	public Map<String, Object> checkJobApply(Integer jobId) {
		TUserJobApplyExample example = new TUserJobApplyExample();
		TUserJobApplyExample.Criteria criteria = example.createCriteria();
		criteria.andCApplyIdEqualTo(jobId);
		example.setOrderByClause("(c_apply_state+0) asc");
		List<TUserJobApply> applyList = tUserJobApplyMapper.selectByExample(example);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("applyList", applyList == null ? new ArrayList<TUserJobApply>() : applyList);
		return resultMap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.starjobs.service.JobApplyService#applyJobAndJoinGroup(java.lang.
	 * String, java.lang.Integer, java.lang.String)
	 */
	public Map<String, Object> applyJobAndJoinGroup(String userPhone, Integer jobId, String applyDesc) {
		// 根据手机查找用户id
		TUserInfo userInfo = tUserInfoMapper.selectByPhone(userPhone);
		if (userInfo == null) {
			return null;
		}
		/**
		 * 判断用户一天内是否有两次申请记录
		 */
		int total = jobApplyRestrictMapper.queryUserRecordTotalByDay(userInfo.getcUserId());
		if(total >= StarConstants.USER_APPLY_JOB_MAX_TIMES) {
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("code", SystemUtil.USER_APPLY_JOB_REACH_MAX);
			return result;
		}
		TUserJobApply jobApply = new TUserJobApply();
		jobApply.setcApplyState(StarConstants.APPLY_STATE_NOT_CHECK);
		jobApply.setcJobId(jobId);
		jobApply.setcApplyTime(new Date());
		jobApply.setcUserId(userInfo.getcUserId());
		jobApply.setcApplyDesc(applyDesc);
		tUserJobApplyMapper.insertSelective(jobApply);
		
		//加入群组
		TGroup group = tGroupMapper.selectByJobId(String.valueOf(jobId));
		String groupId = String.valueOf(group.getcGroupId());
		String groupName = group.getcGroupName();
		Map<String, Object> result2Map = rongCloudService.joinGroup(userPhone, groupId, groupName);
		
		return result2Map;
	}

}
