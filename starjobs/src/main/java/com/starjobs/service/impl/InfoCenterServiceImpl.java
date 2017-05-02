/**
 * 
 */
package com.starjobs.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.starjobs.common.ImageUtil;
import com.starjobs.mapper.TCompanyInfoMapper;
import com.starjobs.mapper.TUserInfoMapper;
import com.starjobs.mapper.TUserTokenMapper;
import com.starjobs.pojo.TCompanyInfo;
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
		data.put("headImgUrl", SystemUtil.APP_SERVER_URL+"/photo/user/"+tUserInfo.getcUserImg());// 图片url
		data.put("nickName", tUserInfo.getcUserNickname());
		data.put("username", tUserInfo.getcUsername());
		data.put("gender", tUserInfo.getcUserGender());
		data.put("birthday", tUserInfo.getcUserBirthDate());// 出生日期
		data.put("height", tUserInfo.getcUserHeight());
		data.put("eduState", tUserInfo.getcUserEduState());
		data.put("school", tUserInfo.getcUserSchoolName());
		data.put("phoneNum", tUserInfo.getcUserPhone());
		data.put("balance", tUserInfo.getcUserBalance());
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
		headImg = headImg.replaceAll(" ", "+");// base64字符串中加号被替换成空格，这里替换回来

		String imgFormat = params.get("imgFormat");

		if (!StringUtils.isEmpty(headImg) && !StringUtils.isEmpty(ImageUtil.photoFormat(imgFormat))) {
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
			tUserInfo.setcUserBirthDate(new Date());
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
		data.put("headImgUrl", SystemUtil.APP_SERVER_URL+"/photo/com/"+tComInfo.getcComHeadImg());// 图片url
		data.put("comName", tComInfo.getcComName());

		data.put("address", tComInfo.getcComAddressId());// 公司地址

		data.put("certificateImgUrl", tComInfo.getcComLicenseImg());
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
		headImg = headImg.replaceAll(" ", "+");// base64字符串中加号被替换成空格，这里替换回来

		String imgFormat = params.get("imgFormat");

		if (!StringUtils.isEmpty(headImg) && !StringUtils.isEmpty(ImageUtil.photoFormat(imgFormat))) {
			String resp = ImageUtil.saveStr2Photo(path, headImg, imgFormat);
			if (!StringUtils.isEmpty(resp)) {
				tComInfo.setcComHeadImg(resp);
			}
		}
		if (!StringUtils.isEmpty(params.get("comName"))) {// 修改公司名称
			tComInfo.setcComName(params.get("comName"));
		}
		if (!StringUtils.isEmpty(params.get("address"))) {// 修改公司地址
			tComInfo.setcComAddressId(1);
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

}
