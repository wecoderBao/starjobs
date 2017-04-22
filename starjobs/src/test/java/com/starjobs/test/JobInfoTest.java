/**
 * 
 */
package com.starjobs.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.starjobs.mapper.TJobInfoMapper;
import com.starjobs.pojo.TJobInfo;

/**
 * <p>
 * Title:JobInfoTest
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 * @date:2017年4月19日下午9:58:38
 */
public class JobInfoTest {
	private ApplicationContext applicationContext;

	// 在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis/spring-mybatis.xml");
	}

	@Test
	public void testSelectJobInfo() throws Exception {
		TJobInfoMapper tJobInfoMapper = (TJobInfoMapper) applicationContext.getBean(TJobInfoMapper.class);
		String city = "420100";
		List<String> area = new ArrayList<String>();
		area.add("420115");
		List<Integer> typeId = null;
		List<Integer> choiceId = null;
		int start = 0;
		int offset = 10;
		List<TJobInfo> jobList = tJobInfoMapper.selectByUser(city, area, typeId, choiceId, start, offset);
		
		System.out.println(jobList.size());
		for (TJobInfo jobInfo : jobList) {
			System.out.println(jobInfo.getcJobCity());

		}
	}
	@Test
	public void testJobDetail() throws Exception {
		TJobInfoMapper tJobInfoMapper = (TJobInfoMapper) applicationContext.getBean(TJobInfoMapper.class);
		
		TJobInfo job = tJobInfoMapper.selectByPrimaryKey(1);
		
		System.out.println(job.getcComId());
	}
}
