/**
 * 
 */
package com.starjobs.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

import com.starjobs.mapper.TComAddressMapper;
import com.starjobs.mapper.TCompanyInfoMapper;
import com.starjobs.pojo.TComAddress;
import com.starjobs.pojo.TCompanyInfo;
import com.starjobs.service.impl.InfoCenterServiceImpl;

/**
 * <p>Title:InfoCenterServiceTest</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年6月3日上午9:51:58
 */
public class InfoCenterServiceTest {
	private ApplicationContext applicationContext;

	// 在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis/spring-mybatis.xml");
	}

	@Test
	public void testUpdateComInfo() throws Exception {
		InfoCenterServiceImpl ics = new InfoCenterServiceImpl();
		String token = "1234";
		Map<String,String> params = new HashMap<String,String>();
		String path = "";
//		params.put("headImg", request.getParameter("headImg"));
//		params.put("imgFormat", request.getParameter("imgFormat"));
		params.put("comName", "comName");
		params.put("address", "address");
		params.put("comDesc", "comDesc");
		
		TComAddressMapper tComAddressMapper = (TComAddressMapper) applicationContext.getBean(TComAddressMapper.class);
		TCompanyInfoMapper tCompanyInfoMapper = (TCompanyInfoMapper) applicationContext.getBean(TCompanyInfoMapper.class);
		TCompanyInfo tComInfo = tCompanyInfoMapper.selectByPhone("18827090361");
		
		if (!StringUtils.isEmpty(params.get("address"))) {// 修改公司地址
			// 插入公司地址
			TComAddress addr = new TComAddress();
			addr.setcAddressDetail(params.get("address"));
			tComAddressMapper.insertSelectiveReId(addr);
			tComInfo.setcComAddressId(addr.getcComAddressId());
		}
		if (!StringUtils.isEmpty(params.get("comDesc"))) {// 修改性别
			tComInfo.setcComDesc(params.get("comDesc"));
		}

		int re = tCompanyInfoMapper.updateByPrimaryKeySelective(tComInfo);
		System.out.println(re);
	}
}
