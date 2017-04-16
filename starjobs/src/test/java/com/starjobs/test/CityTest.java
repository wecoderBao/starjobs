/**
 * 
 */
package com.starjobs.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.starjobs.mapper.CityMapper;
import com.starjobs.pojo.City;

/**
 * <p>
 * Title:CityTest
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 * @date:2017年4月16日下午3:16:50
 */
public class CityTest {
	private ApplicationContext applicationContext;

	// 在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis/spring-mybatis.xml");
	}

	@Test
	public void testSelectByLevel() throws Exception {
		CityMapper cityMapper = (CityMapper) applicationContext.getBean(CityMapper.class);
		int level = 0;
		List<City> cities = cityMapper.selectByLevel(level);
		System.out.println(cities.size());
		for (City city : cities) {
			System.out.println(city.getName());
		}
	}
	@Test
	public void testSelectIdByCode() throws Exception {
		CityMapper cityMapper = (CityMapper) applicationContext.getBean(CityMapper.class);
		String code = "120100";
		int re = cityMapper.selectIdByCode(code);
		System.out.println(re);
		
	}
	@Test
	public void testSelectByParentId() throws Exception {
		CityMapper cityMapper = (CityMapper) applicationContext.getBean(CityMapper.class);
		int parentId = 39;
		List<City> cities = cityMapper.selectByParentId(parentId);
		System.out.println(cities.size());
		for (City city : cities) {
			System.out.println(city.getName());
		}
	}
}
