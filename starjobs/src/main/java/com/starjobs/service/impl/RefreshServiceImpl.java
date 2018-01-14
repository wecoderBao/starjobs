package com.starjobs.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starjobs.common.Result;
import com.starjobs.mapper.RefreshJobMapper;
import com.starjobs.pojo.RefreshJob;
import com.starjobs.service.RefreshService;
@Service
public class RefreshServiceImpl implements RefreshService {
	@Autowired
	private RefreshJobMapper refreshJobMapper;
	

	@Override
	public Result queryRefreshListForPage(int page, int limit) {
		
		int start = (page-1)<=0?0:(page-1)*limit;
		HashMap<String, Object> queryMap = new HashMap<String,Object>(16);
		int total = refreshJobMapper.queryRefreshTotal(queryMap);
		queryMap.put("offset", start);
		queryMap.put("limit", limit <= 0 ? 10 : limit);
		queryMap.put("orderBy", "create_time DESC");
		List<RefreshJob> refreshList = refreshJobMapper.queryRefreshList(queryMap);
		
		return null;
	}
	
	@Override
	public List<RefreshJob> queryList(Map<String,Object> map){
		return refreshJobMapper.queryRefreshList(map);
	}

}
