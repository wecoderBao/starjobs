/**
 * 
 */
package com.starjobs.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starjobs.mapper.TSystemMapper;
import com.starjobs.pojo.TSystem;
import com.starjobs.pojo.TSystemExample;
import com.starjobs.service.SystemConfigService;

/**
 * <p>Title:SystemConfigServiceImpl</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2018年5月6日下午7:21:54
 */
@Service
public class SystemConfigServiceImpl implements SystemConfigService{
	@Autowired
	private TSystemMapper tSystemMapper;
	/* (non-Javadoc)
	 * @see com.starjobs.service.SystemConfigService#getConfigs()
	 */
	@Override
	public Map<String, Object> getConfigs(String platform) {
		TSystemExample example = new TSystemExample();
		example.or().andNameEqualTo(platform);
		List<TSystem> configs = tSystemMapper.selectByExample(example);
		Map<String, Object> result = new HashMap<String,Object>(16);
		for(TSystem item : configs){
			result.put("version", item.getValue());
			result.put("download_url", item.getExtraDesc());
		}
		return result;
	}
	

}
