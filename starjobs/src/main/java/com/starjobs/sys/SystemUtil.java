/**
 * 
 */
package com.starjobs.sys;

import java.security.Key;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;

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
	//Android在mob中的appkey
	public static final String APP_KEY_ANDROID = "1cb77bc1822c9";
	//ios在mob中的appkey
	public static final String APP_KEY_IOS = "1cb775f2eb560";
	//区号
	public static final String ZONE = "86";
	//验证成功状态码 200
	public static final String CODE_SUCC = "200";
	//验证失败状态码 400
	public static final String CODE_FAIL = "400";
	//用户登录时没有注册
	public static final String NOT_REGISTER = "300";
	// 用户类别标识
	// 公司用户
	public static final String USER_COM = "0";
	// 个人用户
	public static final String USER_STU = "1";
	//android机标识
	public static final String ANDROID = "android";
	//ios机标识
	public static final String IOS = "ios";
	//生成token
	public static String generateToken(String phone) {
		Key key = MacProvider.generateKey();

		String compactJws = Jwts.builder().setSubject(phone).signWith(SignatureAlgorithm.HS512, key).compact();
		return compactJws;
	}
}
