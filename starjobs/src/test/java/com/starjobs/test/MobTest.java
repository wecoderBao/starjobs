/**
 * 
 */
package com.starjobs.test;

import org.junit.Test;

import com.starjobs.sms.util.MobClient;
import com.starjobs.sys.SystemUtil;

/**
 * <p>Title:MobTest</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年4月9日上午9:55:11
 */
public class MobTest {
	@Test
	public void testVerify(){
		MobClient client = null;
		try {
			client = new MobClient();
			client.addRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
			client.addRequestProperty("Accept", "application/json");
			client.addParam("appkey", SystemUtil.APP_KEY_IOS);
			client.addParam("phone", "18827090366");
			client.addParam("zone", SystemUtil.ZONE);
			client.addParam("code", "1234");
			String result = client.post();
			System.out.println("--"+result);
		} catch (Exception e) {

		} finally {
			client.release();
		}
	}
}
