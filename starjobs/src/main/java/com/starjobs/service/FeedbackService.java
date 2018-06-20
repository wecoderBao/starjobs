/**
 * 
 */
package com.starjobs.service;

import java.util.Map;

import com.starjobs.pojo.TFeedback;

/**
 * <p>Title:FeedbackService</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2018年6月20日下午3:03:44
 */
public interface FeedbackService {
	public Map<String, Object> feedback(TFeedback feedback);
}
