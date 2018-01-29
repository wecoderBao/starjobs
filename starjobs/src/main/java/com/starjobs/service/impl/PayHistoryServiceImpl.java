package com.starjobs.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starjobs.dto.RefreshJobDto;
import com.starjobs.mapper.RefreshJobMapper;
import com.starjobs.mapper.TJobInfoMapper;
import com.starjobs.pojo.RefreshJob;
import com.starjobs.pojo.TJobInfo;
import com.starjobs.service.PayHistoryService;

@Service
public class PayHistoryServiceImpl implements PayHistoryService {
	@Autowired
	private RefreshJobMapper refreshJobMapper;
	@Autowired
	private TJobInfoMapper tJobInfoMapper;

	@Override
	public List<RefreshJobDto> getRefreshListByUserId(Integer userId) {
		Map<String,Object> queryMap = new HashMap<String,Object>(2);
		queryMap.put("comId", userId);
		List<RefreshJob> refreshJobList = refreshJobMapper.queryRefreshList(queryMap);
		List<RefreshJobDto> dtoList = new ArrayList<RefreshJobDto>();
		if(null != refreshJobList) {
			for(RefreshJob job : refreshJobList) {
				RefreshJobDto dto = new RefreshJobDto();
				TJobInfo jobInfo = tJobInfoMapper.selectByPrimaryKey(job.getJobId());
				if(null != jobInfo) {
					dto.setJobName(jobInfo.getcJobTitle());
					dto.setCost(String.valueOf(job.getRefreshCost()));
					dto.setCreateTime(job.getCreateTime().getTime());
					dto.setRefreshType(job.getRefreshType());
					dtoList.add(dto);
				}
			}
		}
		return dtoList;
	}

}
