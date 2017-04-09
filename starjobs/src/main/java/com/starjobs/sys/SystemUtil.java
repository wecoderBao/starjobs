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
	public static final String APP_KEY = "1cb77bc1822c9";
	public static final String ZONE = "86";
	//验证成功状态码 200
	public static final String CODE_SUCC = "200";
	//验证失败状态码 400
	public static final String CODE_FAIL = "400";
	// 用户类别标识
	// 公司用户
	public static final String USER_COM = "0";
	// 个人用户
	public static final String USER_STU = "1";

	public static String generateToken(String phone) {
		Key key = MacProvider.generateKey();

		String compactJws = Jwts.builder().setSubject(phone).signWith(SignatureAlgorithm.HS512, key).compact();
		return compactJws;
	}
}
