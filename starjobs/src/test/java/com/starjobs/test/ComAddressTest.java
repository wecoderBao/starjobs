/**
 * 
 */
package com.starjobs.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.starjobs.mapper.TComAddressMapper;
import com.starjobs.pojo.TComAddress;

/**
 * <p>Title:ComAddressTest</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年6月3日上午9:44:43
 */
public class ComAddressTest {
	private ApplicationContext applicationContext;

	// 在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis/spring-mybatis.xml");
	}

	@Test
	public void testSelectByLevel() throws Exception {
		TComAddressMapper mapper = (TComAddressMapper) applicationContext.getBean(TComAddressMapper.class);
		TComAddress record = new TComAddress();
		record.setcAddressDetail("wuhan");
		int re = mapper.insertSelectiveReId(record);
		System.out.println(record.getcComAddressId());
	}
}
