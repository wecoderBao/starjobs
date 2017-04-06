/**
 * 
 */
package com.starjobs.sms.spi;

import com.starjobs.sms.util.MobClient;

/**
 * <p>
 * Title:SmsVerifyKit
 * </p>
 * <p>
 * Description:验证码校验
 * </p>
 * 
 * @author:bao
 */
public class SmsVerifyKit {
	private static final String MOB_ADDRESS = "https://webapi.sms.mob.com/sms/verify";

	/**
	 * 服务端发起验证请求验证移动端(手机)发送的短信
	 * 
	 * @return
	 * @throws Exception
	 */
	public static String sendMsg(String appkey, String phone, String zone, String code) throws Exception {

		String address = MOB_ADDRESS;
		MobClient client = null;
		try {
			client = new MobClient(address);
			client.addParam("appkey", appkey).addParam("phone", phone).addParam("zone", zone).addParam("code", code);
			client.addRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
			client.addRequestProperty("Accept", "application/json");
			String result = client.post();
			return result;
		} finally {
			client.release();
		}
	}
}
