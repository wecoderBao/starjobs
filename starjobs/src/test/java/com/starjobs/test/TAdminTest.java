/**
 * 
 */
package com.starjobs.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.starjobs.mapper.TAdminMapper;
import com.starjobs.pojo.TAdmin;

/**
 * 
 * @author taojian
 * @time  2017年5月8日下午9:05:01
 * @ClassName TAdminTest.java
 * @description
 */
public class TAdminTest {
	private ApplicationContext applicationContext;

	// 在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis/spring-mybatis.xml");
	}

	@Test
	public void selectall(){
		TAdminMapper tamapper=(TAdminMapper) applicationContext.getBean(TAdminMapper.class);
		List<TAdmin> list=tamapper.selectAll();
		System.out.println(list);
	}
}
