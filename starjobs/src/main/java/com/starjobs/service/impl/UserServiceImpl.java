/**
 * 
 */
package com.starjobs.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.starjobs.mapper.TCompanyInfoMapper;
import com.starjobs.mapper.TUserInfoMapper;
import com.starjobs.pojo.TCompanyInfo;
import com.starjobs.pojo.TUserInfo;
import com.starjobs.service.TokenService;
import com.starjobs.service.UserService;
import com.starjobs.sms.util.MobClient;
import com.starjobs.sys.SystemUtil;

/**
 * <p>
 * Title:SignInServiceImpl
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 */
@Service
public class UserServiceImpl implements UserService {
	// 公司信息操作类
	@Autowired
	TCompanyInfoMapper tComapanyInfoMapper;
	// 个人用户信息操作类
	@Autowired
	TUserInfoMapper tUserInfoMapper;
	//token操作
	@Autowired
	TokenService tokenService;

	// 向短信验证平台发送验证请求
	private String sendVerifyCode(String phone, String code, String appFlag) {
		String appKey = "";
		if (SystemUtil.ANDROID.equals(appFlag.trim())) {
			appKey = SystemUtil.APP_KEY_ANDROID;
		} else if (SystemUtil.IOS.equals(appFlag.trim())) {
			appKey = SystemUtil.APP_KEY_IOS;
		}

		MobClient client = null;
		try {
			client = new MobClient();
			client.addRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
			client.addRequestProperty("Accept", "application/json");
			client.addParam("appkey", appKey);
			client.addParam("phone", phone);
			client.addParam("zone", SystemUtil.ZONE);
			client.addParam("code", code);
			String result = client.post();
			return result;
		} catch (Exception e) {

		} finally {
			client.release();
		}
		return null;
	}

	// 验证验证码
	public Map<String, Object> verifyCode(String phone, String code, String password, String userFlag, String appFlag) {

		String result = SystemUtil.CODE_FAIL;
		// 验证输入的验证码
		result = this.sendVerifyCode(phone, code, appFlag);
		JSONObject jsonResult = JSONObject.parseObject(result);

		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", jsonResult.get("status"));

		// 验证码正确，用户为公司
		if (SystemUtil.CODE_SUCC.equals(jsonResult.get("status").toString())
				&& SystemUtil.USER_COM.equals(userFlag.trim())) {
			//查询用户是否存在，若存在则不能再注册
			
			TCompanyInfo tciRecord = new TCompanyInfo();
			tciRecord.setcComPhone(phone);
			tciRecord.setcComPassword(password);
			tciRecord.setcComName(phone);
			tciRecord.setcComBalance(50);// 账户余额默认为50元
			tComapanyInfoMapper.insert(tciRecord);
			modelMap.put("error_code", SystemUtil.CODE_SUCC);
			modelMap.put("message", "success");

			return modelMap;
		} else if (SystemUtil.CODE_SUCC.equals(jsonResult.get("status").toString())
				&& SystemUtil.USER_STU.equals(userFlag.trim())) {
			//查询用户是否存在，若存在则不能再注册
			
			// 验证码正确，用户为个人
			TUserInfo tuiRecord = new TUserInfo();
			tuiRecord.setcUserPhone(phone);
			tuiRecord.setcUserBalance(0);
			tuiRecord.setcUsername(phone);
			tuiRecord.setcUserPassword(password);
			tUserInfoMapper.insert(tuiRecord);
			modelMap.put("error_code", SystemUtil.CODE_SUCC);
			modelMap.put("message", "success");

			return modelMap;
		}
		modelMap.put("message", "fail");
		return modelMap;
	}

	// 用户找回密码
	public Map<String, Object> userRetrievePwd(String phone, String code, String password, String userFlag,
			String appFlag) {
		String result = "";
		// 验证输入的验证码
		result = this.sendVerifyCode(phone, code, appFlag);
		JSONObject jsonResult = JSONObject.parseObject(result);

		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", jsonResult.get("status"));

		// 验证码正确，用户为公司
		if (SystemUtil.CODE_SUCC.equals(jsonResult.get("status").toString())
				&& SystemUtil.USER_COM.equals(userFlag.trim())) {
			int re = 0;
			re = tComapanyInfoMapper.updatePwdByPhoneNum(phone, password);
			if (re == 1) {
				modelMap.put("error_code", SystemUtil.CODE_SUCC);
				modelMap.put("message", "success");
				return modelMap;
			}
		} else if (SystemUtil.CODE_SUCC.equals(jsonResult.get("status").toString())
				&& SystemUtil.USER_STU.equals(userFlag.trim())) {
			// 验证码正确，用户为个人
			int re = 0;
			re = tUserInfoMapper.updatePwdByPhoneNum(phone, password);
			if (re == 1) {
				modelMap.put("error_code", SystemUtil.CODE_SUCC);
				modelMap.put("message", "success");

				return modelMap;
			}
		}
		modelMap.put("message", "fail");
		return modelMap;
	}

	// 用户登录
	public Map<String, Object> userLogin(String phone, String password, String userFlag) {
		String result = SystemUtil.CODE_FAIL;

		Map<String, Object> modelMap = new HashMap<String, Object>(3);
		modelMap.put("error_code", result);
		modelMap.put("message", "fail");
		// 用户token
		String token = SystemUtil.generateToken(phone);

		if (SystemUtil.USER_COM.equals(userFlag)) {
			// 用户为公司，验证登录操作
			TCompanyInfo tciRecord = tComapanyInfoMapper.selectByPhone(phone);
			if(tciRecord != null && password.equals(tciRecord.getcComPassword())){
				//验证密码成功
				Map<String,Object> data = new HashMap<String,Object>();
				data.put("token", token);
				data.put("userid", tciRecord.getcComId());
				data.put("nickname", tciRecord.getcComName());
				data.put("phone", tciRecord.getcComPhone());
				data.put("balance", tciRecord.getcComBalance());
				
				modelMap.put("error_code", SystemUtil.CODE_SUCC);
				modelMap.put("message", "success");
				modelMap.put("data", data);
				modelMap.put("userFlag", SystemUtil.USER_COM);
				//将token放入数据库中
				int re = 0;
				re = tokenService.save(token, phone);
				if(re == 1){
					return modelMap;
				}
			}else{
				modelMap.put("error_code", SystemUtil.NOT_REGISTER);
				modelMap.put("message", "not register");
			}
		} else if (SystemUtil.USER_STU.equals(userFlag)) {
			// 用户为个人，验证登录操作
			TUserInfo tuiRecord = tUserInfoMapper.selectByPhone(phone);
			if(tuiRecord != null && password.equals(tuiRecord.getcUserPassword())){
				//验证密码成功
				Map<String,Object> data = new HashMap<String,Object>();
				data.put("token", token);
				data.put("userid", tuiRecord.getcUserId());
				data.put("nickname", tuiRecord.getcUserNickname());
				data.put("phone", tuiRecord.getcUserPhone());
				data.put("balance", tuiRecord.getcUserBalance());
				
				modelMap.put("error_code", SystemUtil.CODE_SUCC);
				modelMap.put("message", "success");
				modelMap.put("data", data);
				modelMap.put("userFlag", SystemUtil.USER_STU);
				//将token放入数据库中
				int re = 0;
				re = tokenService.save(token, phone);
				if(re == 1){
					return modelMap;
				}
			}else{
				modelMap.put("error_code", SystemUtil.NOT_REGISTER);
				modelMap.put("message", "not register");
			}
		}
		return modelMap;
	}

}
