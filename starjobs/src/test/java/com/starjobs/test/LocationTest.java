/**
 * 
 */
package com.starjobs.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.starjobs.mapper.TLocationMapper;
import com.starjobs.pojo.TLocation;

/**
 * <p>Title:LocationTest</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年4月22日上午10:05:40
 */
public class LocationTest {
	private ApplicationContext applicationContext;

	// 在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis/spring-mybatis.xml");
	}

	@Test
	public void testSelect() throws Exception {
		TLocationMapper tLocationMapper = (TLocationMapper) applicationContext.getBean(TLocationMapper.class);
		TLocation location = new TLocation();
		location.setcLocationLatitude(22f);
		location.setcLocationLongitude(33f);
		int id = tLocationMapper.insertSelectiveReId(location);
		System.out.println(id+""+location.getcLocationId());
	}
}
