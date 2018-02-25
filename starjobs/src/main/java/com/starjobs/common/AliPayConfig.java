package com.starjobs.common;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;

public class AliPayConfig {
	private static final String ALIPAY_SERVER_URL = "http://openapi.alipaydev.com/gateway.do";
	private static final String ALIPAY_APPID = "2018021302192188";
	/**
	 * 应用私钥
	 */
	private static final String APP_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCXnEOX7gGrzJFxbzUcBUPdetQn3Ac05etK+JnWaRw1gnzeKp6gWwuN6SGtiMwBNemWaPriQlwdKOhYK3xthGet75JkcD71LEXDJ+H2g8CIK9gdK3aORJwGWIgmpghwXmQ6xScz1NrI/6bMxyY8gX7ZQWTubbYXv7rAlE4saRF/IpcttwRmugLf7jOOKpFfyEua9JBZMsY90KX/vgsQig4VJbkvofjj5ILqkNAITSMaAstBM6LsEm6hFAl3Z+16pxIQmDgFKEnjSMz1sRM2AWqNAIBJuqNpSdSqDKv8QsAPrLZfgSfBKf13g8EIccawk2+mJcOqya7XvaYuxD731HmRAgMBAAECggEAD5lVXxFu/JUstcYiacKk6+nSYFOELk4lum3/rg7chyjo3hb2gTs84hoFjAxSKSG56e7dOWBoh9uIpGG9CKuh20SWBF2ELMekWeMFnc6Khbg1ITMynIq0nvaG86sLnTwpBd75HJ0e8aVULSekaH9OZN4Um2+QV7szZNMdg/Y/hZwJ8wIrnW5fgCvIMa1hDgyY65DHsm8y/hRzFm4Marq0VG5MH8JVx0EQEG6uebIxEMuA9KtMFLsOwfoay43jQp4EyDlgNQAgGs9iHODkLcdQF8zuaX928EZFkeiSxbmYxLHwl0e0JlmetZR6Cmsnv8dE5YTtZvYkNt4lUkbbLqz6AQKBgQDJgBycc7ErGD45VFiIoeEaubrUkz3ZpNZrdIFugEfVUS8KlAhctihpVZpW6vb3T1KY6eaNowjCFkKDMYWUxds+MhK47GbzIe12uaoZ837gHBe6k+FvDWJtZSyt59+rfdcN//WIjtTNcFMPAu/LOy4vtX34pu2FIVOuXAGddegMoQKBgQDAncRfO4LAhkzpgPIWR3btwD68JRBRpo1gNcWO54lKYFGgN4GOwSj46bYC88b5miWh/YqiZris66xTwQ49zsD+ChmBvW+iMd4N5pE0ATDh3u6I8xdWT1RU7MpAIL/su6U9uGk1f8psFON9BqOmr0EBV+PH+2k8PUDEvnEtipLW8QKBgQChaFcC2AW2QJAveioFIK7hqp9HAr9LpSgBIW1Ap89ix8pHzfa41U2fuuuL7mFwD4FZbhu5nzw3xH74+mVHnAoYUyH+MZfx8F54eRcR/KPIP5ieYzD0tSMAAEh+8buQcpge5ca34boC6pQN9UtCX6CKpPZIhObEesK+a4L7r+P2oQKBgQCCl/UWZHDoO6ZWAvkgJd/6nodqZO7FjVj5TDvgAhfRd7CgIkITGd+/tCWVptbXUK4HQLIIHgFELJ2wQ4p2WYH8O7jDgD76Bzl4z0TPr6cG3XF5JOhDupGA6vLNu+akiS0lxax/e18xHJCIqkG2t8gpMv/bDRhyoU0Sl9SAfh3E4QKBgGIP3nnrnkvenn6U7MvJfMmsq9iMSvESEBGaAFDqeyj2eBryehcFoTfdqKaYQB9pFhO6/P5qch2NFPgD1eWaOBk2K1ZMl+ND7LqZj0WuVgvGYfst80orOrV9+qhpsoP+UPXrWqsNNdl9rXiJOBaJiSqqrpnRHy7mfVvbuzmwEl+a";
	private static final String ALIPAY_FORMAT = "json";
	public static final String ALIPAY_CHARSET = "UTF-8";
	/**
	 * 支付宝公钥
	 */
	public static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAl5xDl+4Bq8yRcW81HAVD3XrUJ9wHNOXrSviZ1mkcNYJ83iqeoFsLjekhrYjMATXplmj64kJcHSjoWCt8bYRnre+SZHA+9SxFwyfh9oPAiCvYHSt2jkScBliIJqYIcF5kOsUnM9TayP+mzMcmPIF+2UFk7m22F7+6wJROLGkRfyKXLbcEZroC3+4zjiqRX8hLmvSQWTLGPdCl/74LEIoOFSW5L6H44+SC6pDQCE0jGgLLQTOi7BJuoRQJd2fteqcSEJg4BShJ40jM9bETNgFqjQCASbqjaUnUqgyr/ELAD6y2X4EnwSn9d4PBCHHGsJNvpiXDqsmu172mLsQ+99R5kQIDAQAB";
	private static final String ALIPAY_SIGN_TYPE = "RSA2";
	
	/**
	 * 异步通知接口
	 */
    public static final String NOTIFY_URL="http://starjobs.duapp.com/app/pay/notify";

	private static AlipayClient alipayClient;

	public static AlipayClient getAlipayClient() {
		if (null == alipayClient) {
			alipayClient = new DefaultAlipayClient(ALIPAY_SERVER_URL, ALIPAY_APPID, APP_PRIVATE_KEY, ALIPAY_FORMAT,
					ALIPAY_CHARSET, ALIPAY_PUBLIC_KEY, ALIPAY_SIGN_TYPE);
		}
		return alipayClient;
	}

}
