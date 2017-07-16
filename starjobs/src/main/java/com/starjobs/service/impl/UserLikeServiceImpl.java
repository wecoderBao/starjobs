/**
 * 
 */
package com.starjobs.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starjobs.mapper.TCompanyInfoMapper;
import com.starjobs.mapper.TUserLikeComMapper;
import com.starjobs.pojo.TCompanyInfo;
import com.starjobs.pojo.TCompanyInfoExample;
import com.starjobs.pojo.TUserLikeCom;
import com.starjobs.pojo.TUserLikeComExample;
import com.starjobs.service.UserLikeService;

/**
 * <p>Title:UserLikeServiceImpl</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年7月15日下午2:37:18
 */
@Service
public class UserLikeServiceImpl implements UserLikeService {

	@Autowired
	TUserLikeComMapper tUserLikeComMapper;
	@Autowired
	TCompanyInfoMapper tCompanyInfoMapper;
	
	/* (non-Javadoc)
	 * @see com.starjobs.service.UserLikeService#likeCompany(java.lang.String, java.lang.String)
	 */
	public Map<String, Object> likeCompany(String userPhone, String comPhone) {
		TUserLikeCom record = new TUserLikeCom();
		record.setComPhone(comPhone);
		record.setUserPhone(userPhone);
		tUserLikeComMapper.insertSelective(record);
		
		Map<String,Object> dataMap= new HashMap<String,Object>();
		List<Map<String,String>> userLikeList = new ArrayList<Map<String,String>>();
		//返回关注列表
		TUserLikeComExample lcExample = new TUserLikeComExample();
		TUserLikeComExample.Criteria criteria = lcExample.createCriteria();
		criteria.andUserPhoneEqualTo(userPhone);
		List<TUserLikeCom> comList = tUserLikeComMapper.selectByExample(lcExample);
		for(TUserLikeCom lc : comList){
			String phone = lc.getComPhone();
			TCompanyInfoExample example = new TCompanyInfoExample();
			TCompanyInfoExample.Criteria icriteria = example.createCriteria();
			icriteria.andCComPhoneEqualTo(phone);
			List<TCompanyInfo> infoList = tCompanyInfoMapper.selectByExample(example);
			if(null!=infoList&& infoList.size()>0){
				TCompanyInfo aInfo = infoList.get(0);
				Map<String,String> aCom = new HashMap<String,String>();
				aCom.put("comName", aInfo.getcComName());
				aCom.put("comPhone", aInfo.getcComPhone());
				aCom.put("comId", String.valueOf(aInfo.getcComId()));
				aCom.put("comHeadImg", aInfo.getcComHeadImg());
				userLikeList.add(aCom);
			}
		}
		dataMap.put("likeList", userLikeList);
		
		return dataMap;
	}

	/* (non-Javadoc)
	 * @see com.starjobs.service.UserLikeService#getAllLikeCompany(java.lang.String)
	 */
	public Map<String, Object> getAllLikeCompany(String userPhone) {
		Map<String,Object> dataMap= new HashMap<String,Object>();
		List<Map<String,String>> userLikeList = new ArrayList<Map<String,String>>();
		//返回关注列表
		TUserLikeComExample lcExample = new TUserLikeComExample();
		TUserLikeComExample.Criteria criteria = lcExample.createCriteria();
		criteria.andUserPhoneEqualTo(userPhone);
		List<TUserLikeCom> comList = tUserLikeComMapper.selectByExample(lcExample);
		for(TUserLikeCom lc : comList){
			String phone = lc.getComPhone();
			TCompanyInfoExample example = new TCompanyInfoExample();
			TCompanyInfoExample.Criteria icriteria = example.createCriteria();
			icriteria.andCComPhoneEqualTo(phone);
			List<TCompanyInfo> infoList = tCompanyInfoMapper.selectByExample(example);
			if(null!=infoList&& infoList.size()>0){
				TCompanyInfo aInfo = infoList.get(0);
				Map<String,String> aCom = new HashMap<String,String>();
				aCom.put("comName", aInfo.getcComName());
				aCom.put("comPhone", aInfo.getcComPhone());
				aCom.put("comId", String.valueOf(aInfo.getcComId()));
				aCom.put("comHeadImg", aInfo.getcComHeadImg());
				userLikeList.add(aCom);
			}
		}
		dataMap.put("likeList", userLikeList);
		
		return dataMap;
	}

}
