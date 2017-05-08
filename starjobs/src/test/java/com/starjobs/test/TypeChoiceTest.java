/**
 * 
 */
package com.starjobs.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.starjobs.mapper.TJobChoiceMapper;
import com.starjobs.mapper.TJobTypeMapper;
import com.starjobs.pojo.TJobChoice;
import com.starjobs.pojo.TJobType;

/**
 * <p>Title:TypeChoiceTest</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年4月16日下午8:26:37
 */
public class TypeChoiceTest {

	private ApplicationContext applicationContext;

	// 在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis/spring-mybatis.xml");
	}

	@Test
	public void testSelectChoice() throws Exception {
		TJobChoiceMapper tJobChoiceMapper = (TJobChoiceMapper) applicationContext.getBean(TJobChoiceMapper.class);
	
		List<TJobChoice> choices = tJobChoiceMapper.selectAllChoice();
		System.out.println(choices.size());
		for (TJobChoice choice : choices) {
			System.out.println(choice.getName());
		}
	}
	@Test
	public void testSelectTyppe() throws Exception {
		TJobTypeMapper tJobTypeMapper = (TJobTypeMapper) applicationContext.getBean(TJobTypeMapper.class);
	
		List<TJobType> types = tJobTypeMapper.selectAllType();
		System.out.println(types.size());
		for (TJobType type : types) {
			System.out.println(type.getName());
		}
	}
}
