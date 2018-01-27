package com.starjobs.common;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;

public class AliPayUtildemo {
	private static final String ALIPAY_SERVER_URL = "http://openapi.alipaydev.com/gateway.do";
	private static final String ALIPAY_APPID = "2013082200024933";
	/**
	 * 应用私钥
	 */
	private static final String APP_PRIVATE_KEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAMiAec6fsssguUoRN3oEVEnQaqBLZjeafXAxCbKH3MTJaXPmnXOtqFFqFtcB8J9KqyFI1+o6YBDNIdFWMKqOwDDWPKqtdo90oGav3QMikjGYjIpe/gYYCQ/In/oVMVj326GmKrSpp0P+5LNCx59ajRpO8//rnOLd6h/tNxnfahanAgMBAAECgYEAusouMFfJGsIWvLEDbPIhkE7RNxpnVP/hQqb8sM0v2EkHrAk5wG4VNBvQwWe2QsAuY6jYNgdCPgTNL5fLaOnqkyy8IobrddtT/t3vDX96NNjHP4xfhnMbpGjkKZuljWKduK2FAh83eegrSH48TuWS87LjeZNHhr5x4C0KHeBTYekCQQD5cyrFuKua6GNG0dTj5gA67R9jcmtcDWgSsuIXS0lzUeGxZC4y/y/76l6S7jBYuGkz/x2mJaZ/b3MxxcGQ01YNAkEAzcRGLTXgTMg33UOR13oqXiV9cQbraHR/aPmS8kZxkJNYows3K3umNVjLhFGusstmLIY2pIpPNUOho1YYatPGgwJBANq8vnj64p/Hv6ZOQZxGB1WksK2Hm9TwfJ5I9jDu982Ds6DV9B0L4IvKjHvTGdnye234+4rB4SpGFIFEo+PXLdECQBiOPMW2cT8YgboxDx2E4bt8g9zSM5Oym2Xeqs+o4nKbcu96LipNRkeFgjwXN1708QuNNMYsD0nO+WIxqxZMkZsCQHtS+Jj/LCnQZgLKxXZAllxqSTlBln2YnBgk6HqHLp8Eknx2rUXhoxE1vD9tNmom6PiaZlQyukrQkp5GOMWDMkU=";
	private static final String ALIPAY_FORMAT = "json";
	private static final String ALIPAY_CHARSET = "UTF-8";
	/**
	 * 支付宝公钥
	 */
	private static final String ALIPAY_PUBLIC_KEY = "public key";
	private static final String ALIPAY_SIGN_TYPE = "RSA2";
	
	/**
	 * 异步通知接口
	 */
    private static final String NOTIFY_URL="换成自己的";

	private static AlipayClient alipayClient;

	public static AlipayClient getAlipayClient() {
		if (null == alipayClient) {
			alipayClient = new DefaultAlipayClient(ALIPAY_SERVER_URL, ALIPAY_APPID, APP_PRIVATE_KEY, ALIPAY_FORMAT,
					ALIPAY_CHARSET, ALIPAY_PUBLIC_KEY, ALIPAY_SIGN_TYPE);
		}
		return alipayClient;
	}

}
