/**
 * 
 */
package com.starjobs.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starjobs.mapper.TFeedbackMapper;
import com.starjobs.pojo.TFeedback;
import com.starjobs.service.FeedbackService;

/**
 * <p>Title:FeedbackServiceImpl</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2018年6月20日下午3:05:08
 */
@Service
public class FeedbackServiceImpl implements FeedbackService {
	@Autowired
	private TFeedbackMapper tFeedbackMapper;

	/* (non-Javadoc)
	 * @see com.starjobs.service.FeedbackService#feedback(com.starjobs.pojo.TFeedback)
	 */
	@Override
	public Map<String, Object> feedback(TFeedback feedback) {
		feedback.setCreateTime(new Date());
		tFeedbackMapper.insert(feedback);
		return new HashMap<String,Object>();
	}

}
