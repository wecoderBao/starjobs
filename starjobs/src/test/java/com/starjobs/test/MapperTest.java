/**
 * 
 */
package com.starjobs.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.starjobs.mapper.TCompanyInfoMapper;
import com.starjobs.pojo.TCompanyInfo;

/**
 * <p>Title:MapperTest</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年4月8日下午9:48:39
 */
public class MapperTest {
	private ApplicationContext applicationContext;

	//在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis/spring-mybatis.xml");
	}

	@Test
	public void testInsertCom() throws Exception {
		TCompanyInfoMapper tComapanyInfoMapper = (TCompanyInfoMapper) applicationContext.getBean(TCompanyInfoMapper.class);
		TCompanyInfo tciRecord = new TCompanyInfo();
		tciRecord.setcComPhone("18827090366");
		tciRecord.setcComPassword("123");
		tciRecord.setcComName("18827090366");
		tciRecord.setcComBalance(50);//账户余额默认为50元
		int re = tComapanyInfoMapper.insert(tciRecord);
		System.out.println(re);
	}
}
