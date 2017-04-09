/**
 * 
 */
package com.starjobs.test;

import java.security.Key;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;

/**
 * <p>Title:JWTTest</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年4月6日下午3:03:02
 */
public class JWTTest {
	
	public static void main(String[] args) {
		Key key = MacProvider.generateKey();

		String compactJws = Jwts.builder()
		  .setSubject("18827090361")
		  .signWith(SignatureAlgorithm.HS512, key)
		  .compact();
		System.out.println(compactJws);
		boolean re = Jwts.parser().setSigningKey(key).parseClaimsJws(compactJws).getBody().getSubject().equals("18827090361");
		System.out.println(re);
		Integer a=100,b=100;
		System.out.println(a==b);
	}
}
