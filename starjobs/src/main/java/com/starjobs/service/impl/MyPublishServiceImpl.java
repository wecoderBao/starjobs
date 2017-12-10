/**
 * 
 */
package com.starjobs.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starjobs.common.StarConstants;
import com.starjobs.mapper.TCompanyInfoMapper;
import com.starjobs.mapper.TJobInfoMapper;
import com.starjobs.mapper.TLocationMapper;
import com.starjobs.pojo.TCompanyInfo;
import com.starjobs.pojo.TJobInfo;
import com.starjobs.pojo.TLocation;
import com.starjobs.service.MyPublishService;

/**
 * <p>Title:MyPublishServiceImpl</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年12月10日上午9:20:29
 */
@Service
public class MyPublishServiceImpl implements MyPublishService {

	@Autowired
	private TJobInfoMapper tJobInfoMapper;
	@Autowired
	private TLocationMapper tLocationMapper;
	@Autowired
	private TCompanyInfoMapper tCompanyInfoMapper;
	
	/* (non-Javadoc)
	 * @see com.starjobs.service.MyPublishService#recommendJob(int)
	 */
	public Map<String, Object> recommendJob(int jobId) {
		Map<String,Object> resultMap = new HashMap<String,Object>(16);
		TJobInfo jobInfo = tJobInfoMapper.selectByPrimaryKey(jobId);
		TCompanyInfo comInfo = tCompanyInfoMapper.selectByPrimaryKey(jobInfo.getcComId());
		int balance = Integer.parseInt(comInfo.getcComBalance());
		
		if(balance < 10){
			resultMap.put("code", "701");
			resultMap.put("info", "余额不足");
			return resultMap;
		}
		balance -=10;
		comInfo.setcComBalance(String.valueOf(balance));
		tCompanyInfoMapper.updateByPrimaryKey(comInfo);
		jobInfo.setcJobState(StarConstants.JOB_KEEPING);
		return resultMap;
	}

	/* (non-Javadoc)
	 * @see com.starjobs.service.MyPublishService#deleteJob(int)
	 */
	public Map<String, Object> deleteJob(int jobId) {
		Map<String,Object> resultMap = new HashMap<String,Object>(16);
		tJobInfoMapper.deleteByPrimaryKey(jobId);
		return resultMap;
	}

	/* (non-Javadoc)
	 * @see com.starjobs.service.MyPublishService#refreshJob(int)
	 */
	public Map<String, Object> refreshJob(int jobId) {
		Map<String,Object> resultMap = new HashMap<String,Object>(16);
		TJobInfo jobInfo = tJobInfoMapper.selectByPrimaryKey(jobId);
		TCompanyInfo comInfo = tCompanyInfoMapper.selectByPrimaryKey(jobInfo.getcComId());
		int balance = Integer.parseInt(comInfo.getcComBalance());
		
		if(balance < 10){
			resultMap.put("code", "701");
			resultMap.put("info", "余额不足");
			return resultMap;
		}
		balance -=10;
		comInfo.setcComBalance(String.valueOf(balance));
		tCompanyInfoMapper.updateByPrimaryKey(comInfo);
		Date now = new Date();
		jobInfo.setcJobPublishDate(now);
		tJobInfoMapper.updateByPrimaryKey(jobInfo);
		return resultMap;
	}

	/* (non-Javadoc)
	 * @see com.starjobs.service.MyPublishService#stopJob(int)
	 */
	public Map<String, Object> stopJob(int jobId) {
		Map<String,Object> resultMap = new HashMap<String,Object>(16);
		TJobInfo jobInfo = tJobInfoMapper.selectByPrimaryKey(jobId);
		jobInfo.setcJobState(StarConstants.JOB_STOP);
		tJobInfoMapper.updateByPrimaryKey(jobInfo);
		return resultMap;
	}

	/* (non-Javadoc)
	 * @see com.starjobs.service.MyPublishService#modifyJob(com.starjobs.pojo.TJobInfo)
	 */
	public Map<String, Object> modifyJob(Map<String,String> params) {
		Map<String,Object> resultMap = new HashMap<String,Object>(16);
		if(params.get("jobId") == null||"".equals(params.get("jobId"))){
			return null;
		}
		TJobInfo jobInfo = tJobInfoMapper.selectByPrimaryKey(Integer.parseInt(params.get("jobId")));
		if(null == jobInfo){
			return null;
		}
		// 兼职地址信息
		TLocation location = tLocationMapper.selectByPrimaryKey(jobInfo.getcJobLocationId());
		if(null == location){
			location = new TLocation();
		}
		// 维度
		String latitude = params.get("locationX");
		location.setcLocationLatitude(latitude);
		// 经度
		String longitude = params.get("locationY");
		location.setcLocationLongitude(longitude);
		// 位置名字
		location.setcLocationName(params.get("locationName"));

		int locId = 0;
		if(location.getcLocationId() == null){
			tLocationMapper.insertSelectiveReId(location);
		}else{
			tLocationMapper.updateByPrimaryKey(location);
		}
		
		// 获取插入后的主键
		locId = location.getcLocationId();
		jobInfo.setcJobLocationId(locId);
		jobInfo.setcComId(Integer.parseInt(params.get("comId")));
		jobInfo.setcJobTitle(params.get("jobName"));
		jobInfo.setcJobDesc(params.get("jobDesc"));
		jobInfo.setcJobPayMethod(params.get("payMethod"));
		jobInfo.setcJobPersonGender(params.get("gender"));
		jobInfo.setcJobTotalPerson(Integer.parseInt(params.get("totalPerson")));
		jobInfo.setcJobChoiceOpId(Integer.parseInt(params.get("jobChoice")));
		jobInfo.setcJobTypeId(Integer.parseInt(params.get("jobType")));
		jobInfo.setcJobCity(params.get("city"));
		jobInfo.setcJobArea(params.get("area"));
		jobInfo.setcJobPosition(params.get("address"));
		
		jobInfo.setcJobWorkDate(params.get("workDate"));
		jobInfo.setcJobWorkTime(params.get("workTime"));
		jobInfo.setcJobSalary(params.get("salary"));
		tJobInfoMapper.updateByPrimaryKey(jobInfo);
		return resultMap;
	}

}
