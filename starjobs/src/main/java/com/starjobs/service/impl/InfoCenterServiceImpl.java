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
import org.springframework.util.StringUtils;

import com.starjobs.common.ImageUtil;
import com.starjobs.mapper.TComAddressMapper;
import com.starjobs.mapper.TCompanyInfoMapper;
import com.starjobs.mapper.TJobInfoMapper;
import com.starjobs.mapper.TLocationMapper;
import com.starjobs.mapper.TUserInfoMapper;
import com.starjobs.mapper.TUserTokenMapper;
import com.starjobs.pojo.TComAddress;
import com.starjobs.pojo.TCompanyInfo;
import com.starjobs.pojo.TJobInfo;
import com.starjobs.pojo.TLocation;
import com.starjobs.pojo.TUserInfo;
import com.starjobs.pojo.TUserToken;
import com.starjobs.service.InfoCenterService;
import com.starjobs.service.TokenService;
import com.starjobs.sys.SystemUtil;

/**
 * <p>
 * Title:InfoCenterServiceImpl
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 * @date:2017年4月25日下午9:11:50
 */
@Service
public class InfoCenterServiceImpl implements InfoCenterService {

	@Autowired
	TokenService tokenService;
	@Autowired
	TUserInfoMapper tUserInfoMapper;
	@Autowired
	TUserTokenMapper tUserTokenMapper;
	@Autowired
	TCompanyInfoMapper tCompanyInfoMapper;
	@Autowired
	TComAddressMapper tComAddressMapper;
	@Autowired
	TJobInfoMapper tJobInfoMapper;
	@Autowired
	TLocationMapper tLocationMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.starjobs.service.InfoCenterService#getUserInfo(java.lang.String,
	 * java.lang.String)
	 */
	public Map<String, Object> getUserInfo(String token, String userFlag) {
		// 获取手机号
		String phoneNum = tokenService.getPhoneNum(token);
		// 根据手机号获取个人信息
		TUserInfo tUserInfo = tUserInfoMapper.selectByPhone(phoneNum);
		if (tUserInfo == null) {
			return null;
		}
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("token", token);
		data.put("userFlag", userFlag);
		data.put("headImgUrl", SystemUtil.APP_SERVER_URL + "/photo/user/" + tUserInfo.getcUserImg());// 图片url
		data.put("nickName", tUserInfo.getcUserNickname());
		data.put("username", tUserInfo.getcUsername());
		data.put("gender", tUserInfo.getcUserGender());
		data.put("birthday", tUserInfo.getcUserBirthDate());// 出生日期
		data.put("height", tUserInfo.getcUserHeight());
		data.put("eduState", tUserInfo.getcUserEduState());
		data.put("school", tUserInfo.getcUserSchoolName());
		data.put("phoneNum", tUserInfo.getcUserPhone());
		data.put("balance", tUserInfo.getcUserBalance());
		data.put("doneTimes", tUserInfo.getcUserDonetimes());// 兼职次数
		data.put("score", tUserInfo.getcUserScore());// 个人评分
		data.put("introduction", tUserInfo.getcUserDesc());// 个人简介
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.starjobs.service.InfoCenterService#updateUserInfo(java.util.Map)
	 */
	public Map<String, Object> updateUserInfo(String token, Map<String, String> params, String path) {
		// 获取手机号
		String phoneNum = tokenService.getPhoneNum(token);
		// 根据手机号获取个人信息
		TUserInfo tUserInfo = tUserInfoMapper.selectByPhone(phoneNum);
		if (tUserInfo == null) {
			return null;
		}
		// 若修改手机号
		String newPhone = params.get("phoneNum");
		if (!StringUtils.isEmpty(newPhone)) {
			// 根据token修改手机号
			TUserToken tokenRecord = tUserTokenMapper.selectByTokenValue(token);
			if (tokenRecord == null) {
				return null;
			}
			tokenRecord.setcPhoneNum(newPhone);
			int re = tUserTokenMapper.updateByPrimaryKeySelective(tokenRecord);
			if (re != 1) {
				return null;
			}
			tUserInfo.setcUserPhone(newPhone);// 修改手机号
		}
		// 修改头像
		String headImg = params.get("headImg");
		String imgFormat = params.get("imgFormat");

		if (!StringUtils.isEmpty(headImg) && !StringUtils.isEmpty(ImageUtil.photoFormat(imgFormat))) {
			headImg = headImg.replaceAll(" ", "+");// base64字符串中加号被替换成空格，这里替换回来
			String resp = ImageUtil.saveStr2Photo(path, headImg, imgFormat);
			if (!StringUtils.isEmpty(resp)) {
				tUserInfo.setcUserImg(resp);
			}
		}
		if (!StringUtils.isEmpty(params.get("nickName"))) {// 修改昵称
			tUserInfo.setcUserNickname(params.get("nickName"));
		}
		if (!StringUtils.isEmpty(params.get("username"))) {// 修改姓名
			tUserInfo.setcUsername(params.get("username"));
		}
		if (!StringUtils.isEmpty(params.get("gender"))) {// 修改性别
			tUserInfo.setcUserGender(params.get("gender"));
		}
		if (!StringUtils.isEmpty(params.get("birthday"))) {// 修改生日
			tUserInfo.setcUserBirthDate(params.get("birthday"));
		}
		if (!StringUtils.isEmpty(params.get("height"))) {// 修改身高
			tUserInfo.setcUserHeight(params.get("height"));
		}
		if (!StringUtils.isEmpty(params.get("eduState"))) {// 修改教育情况
			tUserInfo.setcUserEduState(params.get("eduState"));
		}
		if (!StringUtils.isEmpty(params.get("school"))) {// 修改学校名字
			tUserInfo.setcUserSchoolName(params.get("school"));
		}
		if (!StringUtils.isEmpty(params.get("introduction"))) {// 修改学校名字
			tUserInfo.setcUserDesc(params.get("introduction"));
		}

		int re = tUserInfoMapper.updateByPrimaryKeySelective(tUserInfo);
		if (re == 1) {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("token", token);
			return data;
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.starjobs.service.InfoCenterService#getComInfo(java.lang.String,
	 * java.lang.String)
	 */
	public Map<String, Object> getComInfo(String token, String userFlag) {

		// 获取手机号
		String phoneNum = tokenService.getPhoneNum(token);
		// 根据手机号获取个人信息
		TCompanyInfo tComInfo = tCompanyInfoMapper.selectByPhone(phoneNum);
		if (tComInfo == null) {
			return null;
		}
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("token", token);
		data.put("userFlag", userFlag);
		data.put("headImgUrl", SystemUtil.APP_SERVER_URL + "/photo/com/" + tComInfo.getcComHeadImg());// 图片url
		data.put("comName", tComInfo.getcComName());
		if (null != tComInfo.getcComAddressId()) {
			TComAddress addr = tComAddressMapper.selectByPrimaryKey(tComInfo.getcComAddressId());
			if (null != addr) {
				data.put("address", addr.getcAddressDetail());// 公司地址
			} else {
				data.put("address", "地址不详，请和客服确认。");
			}
		}
		data.put("hasLicense", tComInfo.getcComHaslicense());
		data.put("comDesc", tComInfo.getcComDesc());// 公司简介
		data.put("score", tComInfo.getcComScore());
		data.put("phoneNum", tComInfo.getcComPhone());
		data.put("balance", tComInfo.getcComBalance());
		data.put("extraBalance", tComInfo.getcExtraBalance());// 招聘余额
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.starjobs.service.InfoCenterService#updateComInfo(java.lang.String,
	 * java.util.Map, java.lang.String)
	 */
	public Map<String, Object> updateComInfo(String token, Map<String, String> params, String path) {
		// 获取手机号
		String phoneNum = tokenService.getPhoneNum(token);
		// 根据手机号获取个人信息
		TCompanyInfo tComInfo = tCompanyInfoMapper.selectByPhone(phoneNum);
		if (tComInfo == null) {
			return null;
		}
		// 若修改手机号
		String newPhone = params.get("phoneNum");
		if (!StringUtils.isEmpty(newPhone)) {
			// 根据token修改手机号
			TUserToken tokenRecord = tUserTokenMapper.selectByTokenValue(token);
			if (tokenRecord == null) {
				return null;
			}
			tokenRecord.setcPhoneNum(newPhone);
			int re = tUserTokenMapper.updateByPrimaryKeySelective(tokenRecord);
			if (re != 1) {
				return null;
			}
			tComInfo.setcComPhone(newPhone);// 修改手机号
		}
		// 修改头像
		String headImg = params.get("headImg");
		String imgFormat = params.get("imgFormat");

		if (!StringUtils.isEmpty(headImg) && !StringUtils.isEmpty(ImageUtil.photoFormat(imgFormat))) {
			System.out.println("----------------write pic----------------------");
			headImg = headImg.replaceAll(" ", "+");// base64字符串中加号被替换成空格，这里替换回来
			String resp = ImageUtil.saveStr2Photo(path, headImg, imgFormat);
			if (!StringUtils.isEmpty(resp)) {
				System.out.println("----------------write pic name----------------------");
				tComInfo.setcComHeadImg(resp);
			}
		}
		if (!StringUtils.isEmpty(params.get("comName"))) {// 修改公司名称
			tComInfo.setcComName(params.get("comName"));
		}
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
		if (re == 1) {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("token", token);
			return data;
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.starjobs.service.InfoCenterService#uploadComCertificate(java.lang.
	 * String, java.util.Map, java.lang.String)
	 */
	public Map<String, Object> uploadComCertificate(String token, Map<String, String> params, String path) {
		// 获取手机号
		String phoneNum = tokenService.getPhoneNum(token);
		// 根据手机号获取个人信息
		TCompanyInfo tComInfo = tCompanyInfoMapper.selectByPhone(phoneNum);
		if (tComInfo == null) {
			return null;
		}

		// 修改头像
		String certificateImg = params.get("certificateImg");
		String imgFormat = params.get("imgFormat");

		if (!StringUtils.isEmpty(certificateImg) && !StringUtils.isEmpty(ImageUtil.photoFormat(imgFormat))) {
			certificateImg = certificateImg.replaceAll(" ", "+");// base64字符串中加号被替换成空格，这里替换回来
			String resp = ImageUtil.saveStr2Photo(path, certificateImg, imgFormat);
			if (!StringUtils.isEmpty(resp)) {
				tComInfo.setcComLicenseImg(resp);
			}
		}

		int re = tCompanyInfoMapper.updateByPrimaryKeySelective(tComInfo);
		if (re == 1) {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("token", token);
			data.put("certificateImgUrl",
					SystemUtil.APP_SERVER_URL + "/photo/certificate/" + tComInfo.getcComLicenseImg());
			return data;
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.starjobs.service.InfoCenterService#getJobListByComId(java.lang.
	 * String)
	 */
	public Map<String, Object> getJobListAndComInfoByComId(String comId) {
		int com_id = Integer.parseInt(comId);

		// 获取公司信息
		TCompanyInfo tComInfo = tCompanyInfoMapper.selectByPrimaryKey(com_id);
		Map<String, Object> data = new HashMap<String, Object>();
		if (tComInfo != null) {
			data.put("headImgUrl", SystemUtil.APP_SERVER_URL + "/photo/com/" + tComInfo.getcComHeadImg());// 图片url
			data.put("comName", tComInfo.getcComName());
			if (null != tComInfo.getcComAddressId()) {
				TComAddress addr = tComAddressMapper.selectByPrimaryKey(tComInfo.getcComAddressId());
				if (null != addr) {
					data.put("address", addr.getcAddressDetail());// 公司地址
				} else {
					data.put("address", "地址不详，请和客服确认。");
				}
			}
			data.put("hasLicense", tComInfo.getcComHaslicense());
			data.put("comDesc", tComInfo.getcComDesc());// 公司简介
			data.put("score", tComInfo.getcComScore());
			data.put("phoneNum", tComInfo.getcComPhone());
			data.put("balance", tComInfo.getcComBalance());
			data.put("extraBalance", tComInfo.getcExtraBalance());// 招聘余额
		}

		///
		List<TJobInfo> jobs = tJobInfoMapper.selectByComId(com_id);
		Map<String, Object> dataMap = new HashMap<String, Object>();
		List<Map<String, String>> jobList = new ArrayList<Map<String, String>>();

		if (null != jobs) {
			for (TJobInfo job : jobs) {
				Map<String, String> jobMap = new HashMap<String, String>();
				jobMap.put("comId", String.valueOf(job.getcJobId()));
				jobMap.put("jobName", job.getcJobTitle());
				jobMap.put("jobId", String.valueOf(job.getcJobId()));
				jobMap.put("jobDesc", job.getcJobDesc());
				jobMap.put("payMethod", job.getcJobPayMethod());
				jobMap.put("gender", job.getcJobPersonGender());
				jobMap.put("totalPerson", String.valueOf(job.getcJobTotalPerson()));
				jobMap.put("jobChoice", String.valueOf(job.getcJobChoiceOpId()));
				jobMap.put("jobType", String.valueOf(job.getcJobTypeId()));
				jobMap.put("city", job.getcJobCity());
				jobMap.put("area", job.getcJobArea());
				jobMap.put("address", job.getcJobPosition());
				TLocation loc = tLocationMapper.selectByPrimaryKey(job.getcJobLocationId());
				jobMap.put("locationX", loc.getcLocationLatitude());
				jobMap.put("locationY", loc.getcLocationLongitude());
				jobMap.put("locationName", loc.getcLocationName());
				jobMap.put("workDate", job.getcJobWorkDate());
				jobMap.put("workTime", job.getcJobWorkTime());
				jobMap.put("salary", job.getcJobSalary());
				jobList.add(jobMap);
			}
		}
		dataMap.put("jobList", jobList);
		dataMap.put("comInfo", data);
		return dataMap;
	}

	public Map<String, Object> getJobListByComId(String comId) {
		int com_id = Integer.parseInt(comId);
		// 获取公司信息
		TCompanyInfo tComInfo = tCompanyInfoMapper.selectByPrimaryKey(com_id);
		String imgPath = "";
		if (tComInfo != null) {
			imgPath = SystemUtil.APP_SERVER_URL + "/photo/com/" + tComInfo.getcComHeadImg();
		}
		///
		List<TJobInfo> jobs = tJobInfoMapper.selectByComId(com_id);
		Map<String, Object> dataMap = new HashMap<String, Object>();
		List<Map<String, String>> jobList = new ArrayList<Map<String, String>>();

		if (null != jobs) {
			for (TJobInfo job : jobs) {
				Map<String, String> jobMap = new HashMap<String, String>();
				jobMap.put("comId", String.valueOf(job.getcComId()));
				jobMap.put("jobName", job.getcJobTitle());
				jobMap.put("jobId", String.valueOf(job.getcJobId()));
				jobMap.put("comImg", imgPath);
				jobMap.put("area", job.getcJobArea());
				jobMap.put("publishTime", job.getcJobPublishDate().toString());
				TLocation loc = tLocationMapper.selectByPrimaryKey(job.getcJobLocationId());
				jobMap.put("locationX", loc.getcLocationLatitude());
				jobMap.put("locationY", loc.getcLocationLongitude());
				jobMap.put("locationName", loc.getcLocationName());
				jobMap.put("workDate", job.getcJobWorkDate());
				jobMap.put("workTime", job.getcJobWorkTime());
				jobMap.put("salary", job.getcJobSalary());
				jobList.add(jobMap);
			}
		}
		dataMap.put("jobList", jobList);
		// dataMap.put("comInfo", data);
		return dataMap;
	}
}
