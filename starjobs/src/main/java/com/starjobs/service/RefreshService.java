package com.starjobs.service;

import java.util.List;
import java.util.Map;

import com.starjobs.common.Result;
import com.starjobs.pojo.RefreshJob;

public interface RefreshService {

	Result queryRefreshListForPage(int page, int limit);
	
	List<RefreshJob> queryList(Map<String,Object> map);
}
