/**
 * 
 */
package com.starjobs.common;

import java.io.ByteArrayOutputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;

/**
 * <p>
 * Title:RSAUtils
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 * @date:2018年5月30日上午9:04:11
 */
public class RSAUtil {
	public static final String CHARSET = "UTF-8";
	public static final String RSA_ALGORITHM = "RSA";
	/**
	 * 通信中的RSA公钥私钥
	 */
	private static final String PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDiYZmtU4vNGXc0pR7rTQexwL8F"
			+ "Mm+MJtT75hW6AyNQ/5Hode3WNCCqK/Qb9lVd6uJNbB+XvXJPvk2o4WFAWXn6q0ky"
			+ "dymqCIc/5bgojvHCw/QybZkxTI/yUkUBTj7PpMQ8L0hadgMtTmXKAE3aXfuXHUAR" + "sal0sutgwwfibMw5UwIDAQAB";
	private static final String PRIVATE_KEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAOJhma1Ti80ZdzSl"
			+ "HutNB7HAvwUyb4wm1PvmFboDI1D/keh17dY0IKor9Bv2VV3q4k1sH5e9ck++Tajh"
			+ "YUBZefqrSTJ3KaoIhz/luCiO8cLD9DJtmTFMj/JSRQFOPs+kxDwvSFp2Ay1OZcoA"
			+ "Tdpd+5cdQBGxqXSy62DDB+JszDlTAgMBAAECgYEAw/TKCq+r7vChMA/SUMnP5Dy8"
			+ "3OnIht/CMv36Rpaaxm1DRp52LpnWwJblaiLzyCUemPgD7NxPC9nl7U6SWRpaq1DN"
			+ "v9ac+7+EfhOPtFokIf0sCe8Gbaa1T6x0fJjBjXl9Dkp40aoSEIHUHj4Xj2f82a1a"
			+ "dwwcusFf8TZi08BPCNkCQQD8DeAJUchYMS/T1actQKNiq3sKJXgJwNJittPJWYXY"
			+ "pcp0uDQwD/xsMz1/ZtcV6xQVZJeROHNj3uHyAA978j/XAkEA5ezWyfhz1+StzlJm"
			+ "+60NMnE4wyagPfZu2aCl4oPeD7UehYLwtUwQzavDgfa5Rom9+E0tQ5waEcSXlvTn"
			+ "/MQS5QJADZ5eTYKatZEqyWJQ3xQP/+POCRVPMA+4DldciBOLNNJ4ZugRAcvLUrlO"
			+ "CFUxJ+EEu8csnU8UhP/k62Nvcr37DwJAcQ5I+xzY0WKXd+kazEvmPlRf5c17Y5xm"
			+ "G0qb5sqSiUS00k91TqAtbwQzaRdJOP8H0y0XwbPjObNiGo8n9yjuZQJBAN612K+d"
			+ "Rysb5FuBJWwosfz86dkrdfI7cQoaSu0f3SSHBPl+SZ7s3cjwsrXEMLnAdLoLkdOH" + "qRfE4vHmaFelNrQ=";
//	private static final String PRIVATE_KEY = "MIICxjBABgkqhkiG9w0BBQ0wMzAbBgkqhkiG9w0BBQwwDgQICqHoXm4gUHwCAggA"
//				+"MBQGCCqGSIb3DQMHBAi249W4RVw15gSCAoC0mMEtS0/PWw2T5qaDKX3C6PHCkw/q"
//+"A1iY1zfsequdRzq9SPsI4+Vg2WuX0D/ugCnW0SCAKm02rUwQPtuXIExPVtvIBhsJ"
//+"MTBgMNsm6fTEOFehyvU6EmZ0m3NuAesNqIfrP+lqi71rNMJacxz7q4sfBctnVKNa"
//+"kZtwzeGQUFKn4KU/QfE0RxBwtgjPczSSbU6iJoHSEHv6r/dsudsrbTKSvkwYuZPU"
//+"HXghQ1BrarwSqughXmf5Bgbn3QHso/aigUn3jePvR7LQmWhbGGLPpVbp2gDRXLFu"
//+"42Iyh+WIoJ2/k9Y4GGLC5s6WaYZAhrog/OjzInhgMxygmpuzBj9CloU9b+CxC4vd"
//+"jGlZGDkR3xW7zH3a0H78oSoU/MWaEuoka1kcBCTuMlMkBLVsbJT7KzWHHuy/qpMW"
//+"OMDNo2TEOEzcRgewuleb4ZmlmwwRVbsQOk8uu6QlwffqJKT/075kZHrRDuQeH8j8"
//+"NE76/ZGaA7QheVFkk1TKisrHmXFx+4BC373ci5q1CDGocj6M8VPDKAWhtdDTV5Pi"
//+"wnXEp3pChV0YY8RiHKUXy4XATmqtnN5EuZ5scpP3QohVxUMRpAnXtmyEoiB2dDPd"
//+"y58lczDLeJtBnWKXba4AQ+DwBNkFN2uQT6Knvzxz7XUE40hKgb8wex7EkW7SZznq"
//+"pkbOmavIcrCwau4n/5zSG7tlGkkwuMxcFwxUoYBMa11DmQjwt4XPjvKiTFTNEI8S"
//+"76JqxZEIJU3WimKUsMNQWFD5IhLB49viooJGbl47UGZWWcpXN/cXGm0q0HezZpr3"
//+"Q4d/UKV467ZZEgvbRYr6XzH4r7ViwjdAtpRYMxWrDLk2HFUxmUpMsHsO";

	public static Map<String, String> createKeys(int keySize) {
		KeyPairGenerator kpg;
		try {
			kpg = KeyPairGenerator.getInstance(RSA_ALGORITHM);
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalArgumentException("no such algorith: " + RSA_ALGORITHM);
		}
		kpg.initialize(keySize);
		KeyPair keyPair = kpg.generateKeyPair();
		Key publicKey = keyPair.getPublic();
		String publicKeyStr = Base64.encodeBase64URLSafeString(publicKey.getEncoded());
		// 私钥
		Key privateKey = keyPair.getPrivate();
		String privateKeyStr = Base64.encodeBase64URLSafeString(privateKey.getEncoded());
		Map<String, String> keyPairMap = new HashMap<String, String>();
		keyPairMap.put("publicKey", publicKeyStr);
		keyPairMap.put("privateKey", privateKeyStr);

		return keyPairMap;
	}

	/**
	 * 得到公钥
	 * 
	 * @param publicKey
	 *            密钥字符串（经过base64编码）
	 * @throws Exception
	 */
	public static RSAPublicKey getPublicKey(String publicKey) throws NoSuchAlgorithmException, InvalidKeySpecException {
		// 通过X509编码的Key指令获得公钥对象
		KeyFactory keyFactory = KeyFactory.getInstance(RSA_ALGORITHM);
		X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(Base64.decodeBase64(publicKey));
		RSAPublicKey key = (RSAPublicKey) keyFactory.generatePublic(x509KeySpec);
		return key;
	}

	/**
	 * 得到私钥
	 * 
	 * @param privateKey
	 *            密钥字符串（经过base64编码）
	 * @throws Exception
	 */
	public static RSAPrivateKey getPrivateKey(String privateKey)
			throws NoSuchAlgorithmException, InvalidKeySpecException {
		// 通过PKCS#8编码的Key指令获得私钥对象
		KeyFactory keyFactory = KeyFactory.getInstance(RSA_ALGORITHM);
		PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(Base64.decodeBase64(privateKey));
		RSAPrivateKey key = (RSAPrivateKey) keyFactory.generatePrivate(pkcs8KeySpec);
		return key;
	}

	/**
	 * 公钥加密
	 * 
	 * @param data
	 * @param publicKey
	 * @return
	 */
	public static String publicEncrypt(String data, RSAPublicKey publicKey) {
		try {
			Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);
			return Base64.encodeBase64URLSafeString(rsaSplitCodec(cipher, Cipher.ENCRYPT_MODE, data.getBytes(CHARSET),
					publicKey.getModulus().bitLength()));
		} catch (Exception e) {
			throw new RuntimeException("加密字符串[" + data + "]时遇到异常", e);
		}
	}

	/**
	 * 私钥解密
	 * 
	 * @param data
	 * @param privateKey
	 * @return
	 */

	public static String privateDecrypt(String data, RSAPrivateKey privateKey) {
		try {
			Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
			cipher.init(Cipher.DECRYPT_MODE, privateKey);
			return new String(rsaSplitCodec(cipher, Cipher.DECRYPT_MODE, Base64.decodeBase64(data),
					privateKey.getModulus().bitLength()), CHARSET);
		} catch (Exception e) {
			throw new RuntimeException("解密字符串[" + data + "]时遇到异常", e);
		}
	}

	/**
	 * 私钥加密
	 * 
	 * @param data
	 * @param privateKey
	 * @return
	 */

	public static String privateEncrypt(String data, RSAPrivateKey privateKey) {
		try {
			Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, privateKey);
			return Base64.encodeBase64URLSafeString(rsaSplitCodec(cipher, Cipher.ENCRYPT_MODE, data.getBytes(CHARSET),
					privateKey.getModulus().bitLength()));
		} catch (Exception e) {
			throw new RuntimeException("加密字符串[" + data + "]时遇到异常", e);
		}
	}

	/**
	 * 公钥解密
	 * 
	 * @param data
	 * @param publicKey
	 * @return
	 */

	public static String publicDecrypt(String data, RSAPublicKey publicKey) {
		try {
			Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
			cipher.init(Cipher.DECRYPT_MODE, publicKey);
			return new String(rsaSplitCodec(cipher, Cipher.DECRYPT_MODE, Base64.decodeBase64(data),
					publicKey.getModulus().bitLength()), CHARSET);
		} catch (Exception e) {
			throw new RuntimeException("解密字符串[" + data + "]时遇到异常", e);
		}
	}

	private static byte[] rsaSplitCodec(Cipher cipher, int opmode, byte[] datas, int keySize) {
		int maxBlock = 0;
		if (opmode == Cipher.DECRYPT_MODE) {
			maxBlock = keySize / 8;
		} else {
			maxBlock = keySize / 8 - 11;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		int offSet = 0;
		byte[] buff;
		int i = 0;
		try {
			while (datas.length > offSet) {
				if (datas.length - offSet > maxBlock) {
					buff = cipher.doFinal(datas, offSet, maxBlock);
				} else {
					buff = cipher.doFinal(datas, offSet, datas.length - offSet);
				}
				out.write(buff, 0, buff.length);
				i++;
				offSet = i * maxBlock;
			}
		} catch (Exception e) {
			throw new RuntimeException("加解密阀值为[" + maxBlock + "]的数据时发生异常", e);
		}
		byte[] resultDatas = out.toByteArray();
		IOUtils.closeQuietly(out);
		return resultDatas;
	}

	
	
	/**
	 * 公钥加密
	 */
	public static String publicEncrypt(String data) {
		try {
			RSAPublicKey publicKey = RSAUtil.getPublicKey(PUBLIC_KEY);
			Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);
			byte[] result = cipher.doFinal(data.getBytes(CHARSET));
//			return Base64.encodeBase64URLSafeString(rsaSplitCodec(cipher, Cipher.ENCRYPT_MODE, data.getBytes(CHARSET),
//					publicKey.getModulus().bitLength()));
			Base64 b64 = new Base64();
			return  b64.encodeToString(result);
		} catch (Exception e) {
			throw new RuntimeException("加密字符串[" + data + "]时遇到异常", e);
		}
	}

	/**
	 * 私钥解密
	 */

	public static String privateDecrypt(String data) {
		try {
			RSAPrivateKey privateKey = RSAUtil.getPrivateKey(PRIVATE_KEY);
			Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
			cipher.init(Cipher.DECRYPT_MODE, privateKey);
			return new String(rsaSplitCodec(cipher, Cipher.DECRYPT_MODE, Base64.decodeBase64(data),
					privateKey.getModulus().bitLength()), CHARSET);
		} catch (Exception e) {
			throw new RuntimeException("解密字符串[" + data + "]时遇到异常", e);
		}
	}

	/**
	 * 私钥加密
	 */

	public static String privateEncrypt(String data) {
		try {
			RSAPrivateKey privateKey = RSAUtil.getPrivateKey(PRIVATE_KEY);
			Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, privateKey);
			return Base64.encodeBase64URLSafeString(rsaSplitCodec(cipher, Cipher.ENCRYPT_MODE, data.getBytes(CHARSET),
					privateKey.getModulus().bitLength()));
		} catch (Exception e) {
			throw new RuntimeException("加密字符串[" + data + "]时遇到异常", e);
		}
	}

	/**
	 * 公钥解密
	 */

	public static String publicDecrypt(String data) {
		try {
			RSAPublicKey publicKey = RSAUtil.getPublicKey(PUBLIC_KEY);
			Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
			cipher.init(Cipher.DECRYPT_MODE, publicKey);
			return new String(rsaSplitCodec(cipher, Cipher.DECRYPT_MODE, Base64.decodeBase64(data),
					publicKey.getModulus().bitLength()), CHARSET);
		} catch (Exception e) {
			throw new RuntimeException("解密字符串[" + data + "]时遇到异常", e);
		}
	}
	
	public static void main(String[] args) throws Exception {

		System.out.println("公钥加密——私钥解密");
		String str = "123456";
		System.out.println("\r明文：\r\n" + str);
		
		String encodedData = RSAUtil.publicEncrypt(str);
		System.out.println("密文：\r\n" + encodedData);
//		encodedData = "ZnXXRS2FTbsJyd15HkggO+tOlNMwQez12U4iIbm17zdapAEElu0E44AWqNQ8wmM/fsI0v+xYgEO3Ps93L+EGXCYUseHBcgVwkGA/7/devVbCUsRbjGzQGBH6ca6sXs3idN0Mpi8JIepxqxtM8hXZHa8F180ktQ8qvo1ATXsQs/k=";
		encodedData = "LaxMelPqMUngpZ1WiFPb59TO9gvarsr_-njr0SEo74LgJ24T98QYHYoRPYwN9lRVjIREfTOYKZeYRI1N21-3dlGBUGvxPZx53ryaflvD0hFC64SWPgi_FVBcyeGfaPWomBtlwJffa6THa_jEqkUYMymtMYBWOcBAFsQ9AD6OLQ0";
		String decodedData = RSAUtil.privateDecrypt(encodedData);
		System.out.println("解密后文字: \r\n" + decodedData);

	}
}
