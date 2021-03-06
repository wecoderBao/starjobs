/**
 * 
 */
package com.starjobs.sys;

import java.util.UUID;

/**
 * <p>
 * Title:SystemUtil
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 * @date:2017年4月8日下午10:36:31
 */
public class SystemUtil {
	// Android在mob中的appkey
	public static final String APP_KEY_ANDROID = "1cb77bc1822c9";
	// ios在mob中的appkey
	public static final String APP_KEY_IOS = "1cb775f2eb560";
	// 区号
	public static final String ZONE = "86";
	// 验证成功状态码 200
	public static final String CODE_SUCC = "200";
	// 验证失败状态码 400
	public static final String CODE_FAIL = "400";
	//token失效
	public static final String CODE_TOKEN_EXPIRE = "401";
	//余额不足
	public static final String CODE_NOT_ENOUGH_BALANCE = "402";
	//查询信息为空状态码
	public static final String CODE_EMPTY = "900";
	// 用户登录时没有注册
	public static final String NOT_REGISTER = "300";
	//手机号已经注册
	public static final String PHONE_REGISTERED = "305";
	// 用户类别标识
	// 公司用户
	public static final String USER_COM = "0";
	// 个人用户
	public static final String USER_STU = "1";
	// android机标识
	public static final String ANDROID = "android";
	// ios机标识
	public static final String IOS = "ios";
	//默认城市代码，武汉
	public static final String DEFAULT_CITY_CODE = "420100";
	//首页分页显示数据个数
	public static final int PAGE_OFFSET = 10;
	//用户权限
	public static final String COM_STATE_ZERO = "0";//待审核
	public static final String COM_STATE_ONE = "1";//有发布权限
	public static final String COM_STATE_TOW = "2";//取消发布权限
	//响应码700，用户没有发布权限
	public static final String NO_PUBLISH = "700";
	//项目url
	public static final String APP_SERVER_URL = "http://starjobs.bceapp.com";
	
	//好友未找到
	public static final String FRIEND_NOT_FOUND = "600";
	//用户申请兼职次数已满
	public static final String USER_APPLY_JOB_REACH_MAX = "800";
	/**
	 * 用户已经申请该职位
	 */
	public static final String USER_APPLied_JOB = "801";

	// 生成token
	public static String generateToken(String phone) {
		UUID uuid = UUID.randomUUID();
        // 得到对象产生的ID
        String token = uuid.toString();
        // 转换为大写
        token = token.toUpperCase();
        // 替换 “-”变成空格
        token = token.replaceAll("-", "");
		return token;
	}
	/**
	 * 生成订单号
	 * @return
	 */
	public static String generateTradeNO() {
		int r1=(int)(Math.random()*(10));//产生2个0-9的随机数
		int r2=(int)(Math.random()*(10));
		long now = System.currentTimeMillis();//一个13位的时间戳
		String paymentID =String.valueOf(r1)+String.valueOf(r2)+String.valueOf(now);// 订单ID
		return paymentID;
	}
}
