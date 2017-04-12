/**
 * 
 */
package com.starjobs.common;

import java.security.MessageDigest;

import sun.misc.BASE64Encoder;

/**
 * <p>
 * Title:MD5Util
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 * @date:2017年4月12日下午3:14:40
 */
public class MD5Util {
	//对密码进行MD5加密
	public static String encode(String password) {
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
			BASE64Encoder base64en = new BASE64Encoder();
			password = base64en.encode(md5.digest(password.getBytes("utf-8")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return password;
	}
}
