/**
 * 
 */
package com.starjobs.common;

/**
 * <p>Title:StarConstants</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年11月4日上午9:36:00
 */
public class StarConstants {

	//申请兼职状态码
	public static final String APPLY_STATE_PASS = "0";
	public static final String APPLY_STATE_NOT_CHECK = "1";//申请状态
	
	//图片路径前缀
	public static final String USER_IMG_URL="http://starjobs.duapp.com/photo/user/";
	public static final String COM_IMG_URL="http://starjobs.duapp.com/photo/com/";
	
	//兼职信息状态
	//发布中
	public static final String JOB_KEEPING = "0";
	//停止
	public static final String JOB_STOP = "1";
	//审核
	public static final String JOB_VERIFY = "2";
	
	/**
	 * 用户申请最大上限
	 */
	public static final int USER_APPLY_JOB_MAX_TIMES = 2;
	
	/**
	 * token失效时间
	 */
	public static final long TOKEN_EXPIRE_TIME = 3600L;
}
