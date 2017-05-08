/**
 * 
 */
package com.starjobs.test;

import java.util.UUID;

import org.junit.Test;

/**
 * <p>Title:JWTTest</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年4月6日下午3:03:02
 */

public class JWTTest {
	@Test
	public void testJWTT(){
		UUID uuid = UUID.randomUUID();
        // 得到对象产生的ID
        String token = uuid.toString();
        // 转换为大写
        token = token.toUpperCase();
        // 替换 “-”变成空格
        token = token.replaceAll("-", "");
        System.out.println(token);

	}
}
