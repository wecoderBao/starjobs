/**
 * 
 */
package com.starjobs.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.starjobs.common.StarConstants;
import com.starjobs.mapper.RefreshJobMapper;
import com.starjobs.mapper.TComAddressMapper;
import com.starjobs.mapper.TComScoreMapper;
import com.starjobs.mapper.TCompanyInfoMapper;
import com.starjobs.mapper.TFriendMapper;
import com.starjobs.mapper.TGroupMapper;
import com.starjobs.mapper.TJobInfoMapper;
import com.starjobs.mapper.TLocationMapper;
import com.starjobs.mapper.TUserInfoMapper;
import com.starjobs.mapper.TUserJobApplyMapper;
import com.starjobs.mapper.TUserLikeComMapper;
import com.starjobs.pojo.RefreshJob;
import com.starjobs.pojo.TComAddress;
import com.starjobs.pojo.TComScore;
import com.starjobs.pojo.TComScoreExample;
import com.starjobs.pojo.TCompanyInfo;
import com.starjobs.pojo.TFriend;
import com.starjobs.pojo.TFriendExample;
import com.starjobs.pojo.TGroup;
import com.starjobs.pojo.TJobInfo;
import com.starjobs.pojo.TLocation;
import com.starjobs.pojo.TUserInfo;
import com.starjobs.pojo.TUserJobApplyExample;
import com.starjobs.pojo.TUserLikeComExample;
import com.starjobs.service.TokenService;
import com.starjobs.service.UserService;
import com.starjobs.sms.util.MobClient;
import com.starjobs.sys.SystemUtil;

import io.rong.service.RongCloudService;

/**
 * <p>
 * Title:SignInServiceImpl
 * </p>
 * <p>
 * Description:app用户服务类
 * </p>
 * 
 * @author:bao
 */
@Service
public class UserServiceImpl implements UserService {
	// 公司信息操作类
	@Autowired
	private TCompanyInfoMapper tCompanyInfoMapper;
	// 个人用户信息操作类
	@Autowired
	private TUserInfoMapper tUserInfoMapper;
	// token操作
	@Autowired
	private TokenService tokenService;
	// 兼职信息操作
	@Autowired
	private TJobInfoMapper tJobInfoMapper;
	// 地点操作类
	@Autowired
	private TLocationMapper tLocationMapper;
	// 申请兼职操作类
	@Autowired
	private TUserJobApplyMapper tUserJobApplyMapper;
	// 关注公司
	@Autowired
	private TUserLikeComMapper tUserLikeComMapper;
	// 群组操作类
	@Autowired
	private TGroupMapper tGroupMapper;
	//好友
	@Autowired
	private TFriendMapper tFriendMapper;
	//公司地址
	@Autowired
	private TComAddressMapper tComAddressMapper;
	@Autowired
	private TComScoreMapper tComScoreMapper;
	@Autowired
	private RongCloudService rongCloudService;
	@Autowired
	private RefreshJobMapper refreshJobMapper;

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
		if (jsonResult == null) {
			modelMap.put("error_code", SystemUtil.CODE_FAIL);
			return modelMap;
		}
		modelMap.put("error_code", jsonResult.get("status"));

		// 验证码正确，用户为公司
		if (SystemUtil.CODE_SUCC.equals(jsonResult.get("status").toString())
				&& SystemUtil.USER_COM.equals(userFlag.trim())) {
			// 查询用户是否存在，若存在则不能再注册
			TCompanyInfo record = tCompanyInfoMapper.selectByPhone(phone);
			if (record != null) {
				modelMap.put("error_code", SystemUtil.PHONE_REGISTERED);
				modelMap.put("message", "phone registered");
				return modelMap;
			}
			TCompanyInfo tciRecord = new TCompanyInfo();
			tciRecord.setcComPhone(phone);
			tciRecord.setcComPassword(password);
			tciRecord.setcComName(phone);
			tciRecord.setcComBalance("50");// 账户余额默认为50元
			tciRecord.setcComDesc("公司简介待补充...");
			tciRecord.setcExtraBalance("0");
			tciRecord.setcComHaslicense("0");
			tciRecord.setcComScore("5");
			tciRecord.setcComHeadImg("default.png");
			tciRecord.setcUserState("1");
			tciRecord.setcComLicenseImg("default.png");
			
			tCompanyInfoMapper.insertSelective(tciRecord);
			modelMap.put("error_code", SystemUtil.CODE_SUCC);
			modelMap.put("message", "success");

			return modelMap;
		} else if (SystemUtil.CODE_SUCC.equals(jsonResult.get("status").toString())
				&& SystemUtil.USER_STU.equals(userFlag.trim())) {
			// 查询用户是否存在，若存在则不能再注册
			TUserInfo record = tUserInfoMapper.selectByPhone(phone);
			if (record != null) {
				modelMap.put("error_code", SystemUtil.PHONE_REGISTERED);
				modelMap.put("message", "success");
				return modelMap;
			}
			// 验证码正确，用户为个人
			TUserInfo tuiRecord = new TUserInfo();
			tuiRecord.setcUserPhone(phone);
			tuiRecord.setcUserBalance("0");
			tuiRecord.setcUsername(phone);
			tuiRecord.setcUserNickname(phone);
			tuiRecord.setcUserPassword(password);
			tuiRecord.setcUserAliAccount("0");
			tuiRecord.setcUserBirthDate("0");
			tuiRecord.setcUserDesc("简介待补充...");
			tuiRecord.setcUserDonetimes("0");
			tuiRecord.setcUserEduState("0");
			tuiRecord.setcUserGender("男");
			tuiRecord.setcUserHeight("180cm");
			tuiRecord.setcUserImg("default.png");
			tuiRecord.setcUserSchoolName("未知");
			tuiRecord.setcUserScore("5");
			tuiRecord.setcUserState("0");
			
			tUserInfoMapper.insertSelective(tuiRecord);
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
			re = tCompanyInfoMapper.updatePwdByPhoneNum(phone, password);
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
			TCompanyInfo tciRecord = tCompanyInfoMapper.selectByPhone(phone);
			if (tciRecord != null && password.equals(tciRecord.getcComPassword())) {
				// 验证密码成功
				Map<String, Object> data = new HashMap<String, Object>();
				data.put("token", token);
				data.put("userFlag", userFlag);
				data.put("headImgUrl", SystemUtil.APP_SERVER_URL + "/photo/com/" + tciRecord.getcComHeadImg());// 图片url
				data.put("nickname", tciRecord.getcComName());
				if (null != tciRecord.getcComAddressId()) {
					TComAddress addr = tComAddressMapper.selectByPrimaryKey(tciRecord.getcComAddressId());
					if (null != addr) {
						data.put("province", addr.getcProvince());
						data.put("city", addr.getcCity());
						data.put("area", addr.getcTown());
						data.put("address", addr.getcAddressDetail());// 公司地址
					}else {
						data.put("province", "0");
						data.put("city", "0");
						data.put("area", "0");
						data.put("address", "地址不详，请和客服确认。");
					}
				}else{
					data.put("province", "0");
					data.put("city", "0");
					data.put("area", "0");
					data.put("address", "地址不详，请和客服确认。");
				}
				data.put("hasLicense", tciRecord.getcComHaslicense());
				data.put("comDesc", tciRecord.getcComDesc());// 公司简介
				data.put("score", tciRecord.getcComScore());
				data.put("phone", tciRecord.getcComPhone());
				data.put("balance", tciRecord.getcComBalance());
				data.put("extraBalance", tciRecord.getcExtraBalance());// 招聘余额
				data.put("userid", String.valueOf(tciRecord.getcComId()));
				
				modelMap.put("error_code", SystemUtil.CODE_SUCC);
				modelMap.put("message", "success");
				modelMap.put("data", data);

				// 将token放入数据库中
				int re = 0;
				re = tokenService.save(token, phone);
				if (re == 1) {
					return modelMap;
				}
			} else {
				modelMap.put("error_code", SystemUtil.NOT_REGISTER);
				modelMap.put("message", "not register");
			}
		} else if (SystemUtil.USER_STU.equals(userFlag)) {
			// 用户为个人，验证登录操作
			TUserInfo tuiRecord = tUserInfoMapper.selectByPhone(phone);
			if (tuiRecord != null && password.equals(tuiRecord.getcUserPassword())) {
				// 验证密码成功
				Map<String, Object> data = new HashMap<String, Object>();
				data.put("token", token);
				data.put("userid", tuiRecord.getcUserId());
				data.put("nickname", tuiRecord.getcUserNickname());
				data.put("phone", tuiRecord.getcUserPhone());
				data.put("balance", tuiRecord.getcUserBalance());
				data.put("userFlag", SystemUtil.USER_STU);
				data.put("headImgUrl", SystemUtil.APP_SERVER_URL + "/photo/user/" + tuiRecord.getcUserImg());// 图片url
				
				data.put("username", tuiRecord.getcUsername());
				data.put("gender", tuiRecord.getcUserGender());
				data.put("birthday", tuiRecord.getcUserBirthDate());// 出生日期
				data.put("height", tuiRecord.getcUserHeight());
				data.put("eduState", tuiRecord.getcUserEduState());
				data.put("school", tuiRecord.getcUserSchoolName());
				data.put("phone", tuiRecord.getcUserPhone());
				
				data.put("doneTimes", tuiRecord.getcUserDonetimes());// 兼职次数
				data.put("score", tuiRecord.getcUserScore());// 个人评分
				data.put("introduction", tuiRecord.getcUserDesc());// 个人简介

				modelMap.put("error_code", SystemUtil.CODE_SUCC);
				modelMap.put("message", "success");
				modelMap.put("data", data);

				// 将token放入数据库中
				int re = 0;
				re = tokenService.save(token, phone);
				if (re == 1) {
					return modelMap;
				}
			} else {
				modelMap.put("error_code", SystemUtil.NOT_REGISTER);
				modelMap.put("message", "not register");
			}
		}
		return modelMap;
	}

	// 用户查询兼职信息列表
	public Map<String, Object> userGetJobInfo(String city, String area, String typeId, String choiceId, String page) {
		if (StringUtils.isEmpty(city)) {
			city = SystemUtil.DEFAULT_CITY_CODE;
		}

		List<String> areas = null;
		if (!StringUtils.isEmpty(area)) {
			areas = new ArrayList<String>();
			for (String s : area.split(";")) {
				areas.add(s);
			}
		}

		ArrayList<Integer> typeIds = null;
		ArrayList<Integer> choiceIds = null;
		// typeid
		if (!StringUtils.isEmpty(typeId)) {
			typeIds = new ArrayList<Integer>();
			for (String s : typeId.split(";")) {
				if(Integer.parseInt(s)!=0){
					typeIds.add(Integer.parseInt(s));
				}
			}
		}
		// choiceid
		if (!StringUtils.isEmpty(choiceId)) {
			choiceIds = new ArrayList<Integer>();
			for (String s : choiceId.split(";")) {
				if(Integer.parseInt(s) != 0){
					choiceIds.add(Integer.parseInt(s));	
				}
			}
		}
		int start = 0, offset = SystemUtil.PAGE_OFFSET;
		// page
		if (!StringUtils.isEmpty(page) && Integer.parseInt(page) > 0) {
			start = Integer.parseInt(page) - 1;
			start = start * 10;
		}
		Map<String, Object> modelMap = new HashMap<String, Object>();
		ArrayList<Map<String, Object>> infos = new ArrayList<Map<String, Object>>();
		//显示正常的招聘信息
		String jobState = "0";
		List<TJobInfo> jobList = tJobInfoMapper.selectByUser(jobState,city, areas, typeIds, choiceIds, start, offset);
		if (null == jobList || jobList.size() == 0) {
			return modelMap;
		}
		for (TJobInfo jobInfo : jobList) {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("comId", jobInfo.getcComId());
			TCompanyInfo company = tCompanyInfoMapper.selectByPrimaryKey(jobInfo.getcComId());
			data.put("comImg", company.getcComHeadImg());
			data.put("publishTime", jobInfo.getcJobPublishDate());
			data.put("jobId", jobInfo.getcJobId());
			data.put("jobName", jobInfo.getcJobTitle());
			TLocation locRecord = tLocationMapper.selectByPrimaryKey(jobInfo.getcJobLocationId());
			data.put("locationX", locRecord.getcLocationLatitude());
			data.put("locationY", locRecord.getcLocationLongitude());
			data.put("locationName", locRecord.getcLocationName());
			data.put("workDate", jobInfo.getcJobWorkDate());
			data.put("workTime", jobInfo.getcJobWorkTime());
			data.put("salary", jobInfo.getcJobSalary());
			data.put("jobTypeId", String.valueOf(jobInfo.getcJobTypeId()));
			data.put("area", jobInfo.getcJobArea());
			infos.add(data);
		}
		modelMap.put("jobList", infos);
		return modelMap;
	}

	// 用户查询兼职详细信息
	public Map<String, Object> userGetJobDetail(String jobId, String userPhone) {
		int id = -1;
		id = Integer.parseInt(jobId);

		Map<String, Object> modelMap = new HashMap<String, Object>();

		TJobInfo jobInfo = tJobInfoMapper.selectByPrimaryKey(id);
		if (null == jobInfo) {
			return modelMap;
		}
		TUserInfo userInfo = tUserInfoMapper.selectByPhone(userPhone);
		if (userInfo == null) {
			return modelMap;
		}
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("jobType",String.valueOf(jobInfo.getcJobTypeId()));
		data.put("comId", jobInfo.getcComId());
		TCompanyInfo company = tCompanyInfoMapper.selectByPrimaryKey(jobInfo.getcComId());
		data.put("comImg", StarConstants.COM_IMG_URL + company.getcComHeadImg());
		data.put("comName", company.getcComName());
		data.put("publishTime", jobInfo.getcJobPublishDate());
		data.put("jobId", jobInfo.getcJobId());
		data.put("jobName", jobInfo.getcJobTitle());
		data.put("jobDesc", jobInfo.getcJobDesc());
		data.put("payMethod", jobInfo.getcJobPayMethod());
		data.put("gender", jobInfo.getcJobPersonGender());
		data.put("totalPerson", jobInfo.getcJobTotalPerson());
		TLocation locRecord = tLocationMapper.selectByPrimaryKey(jobInfo.getcJobLocationId());
		data.put("locationX", locRecord.getcLocationLatitude());
		data.put("locationY", locRecord.getcLocationLongitude());
		data.put("locationName", locRecord.getcLocationName());
		data.put("workDate", jobInfo.getcJobWorkDate());
		data.put("workTime", jobInfo.getcJobWorkTime());
		data.put("salary", jobInfo.getcJobSalary());
		data.put("city", jobInfo.getcJobCity());
		data.put("area", jobInfo.getcJobArea());
		data.put("address", jobInfo.getcJobPosition());
		// 用户是否报名该兼职
		TUserJobApplyExample example = new TUserJobApplyExample();
		TUserJobApplyExample.Criteria criteria = example.createCriteria();
		criteria.andCUserIdEqualTo(userInfo.getcUserId());
		criteria.andCJobIdEqualTo(id);
		int result = tUserJobApplyMapper.countByExample(example);
		if (result > 0) {
			data.put("applied", "1");
		} else {
			data.put("applied", "0");
		}
		// 报名人数
		TUserJobApplyExample example2 = new TUserJobApplyExample();
		TUserJobApplyExample.Criteria criteria2 = example2.createCriteria();
		criteria2.andCJobIdEqualTo(id);
		int result2 = tUserJobApplyMapper.countByExample(example2);
		data.put("totalApplied", result2);
		// 查找对应的群
		TGroup group = tGroupMapper.selectByJobId(jobId);
		if (group == null) {
			data.put("groupId", "");
		} else {
			data.put("groupId", group.getcGroupId().toString());
		}
		data.put("comPhone", company.getcComPhone());
		// 是否关注公司
		TUserLikeComExample likeExample = new TUserLikeComExample();
		TUserLikeComExample.Criteria likeCriteria = likeExample.createCriteria();
		likeCriteria.andComPhoneEqualTo(company.getcComPhone());
		likeCriteria.andUserPhoneEqualTo(userPhone);
		int likeRet = tUserLikeComMapper.countByExample(likeExample);
		if (likeRet > 0) {
			data.put("isLike", "1");// 关注为1
		} else {
			data.put("isLike", "0");// 未关注0
		}
		// 是否为好友
		// 将标识排序，做小右大
		Long fid = Long.parseLong(userPhone);
		Long tid = Long.parseLong(company.getcComPhone());
		String cuid = userPhone;
		String cfid = company.getcComPhone();
		if (fid > tid) {
			cuid = company.getcComPhone();
			cfid = userPhone;
		}
		TFriendExample frExample = new TFriendExample();
		TFriendExample.Criteria frCriteria = frExample.createCriteria();
		frCriteria.andCFidEqualTo(cfid);
		frCriteria.andCUidEqualTo(cuid);
		List<TFriend> frRet = tFriendMapper.selectByExample(frExample);
		data.put("isFriend", "0");
		if(frRet!=null&&frRet.size() > 0){
			data.put("isFriend", frRet.get(0).getcState());
		}
		//公司地址
		String comAddress = "不详";
		TComAddress comAddr = tComAddressMapper.selectByPrimaryKey(company.getcComAddressId());
		comAddress = comAddr==null?"不详":comAddr.getcAddressDetail();
		data.put("comAddress", comAddress);
		//公司评分
		TComScoreExample scoreExample = new TComScoreExample();
		TComScoreExample.Criteria scoreCriteria = scoreExample.createCriteria();
		scoreCriteria.andCComIdEqualTo(company.getcComId());
		List<TComScore> comScoreList = tComScoreMapper.selectByExample(scoreExample);
		if(comScoreList == null || comScoreList.size()==0){
			data.put("score", "5");
		}else{
			TComScore comScore = comScoreList.get(0);
			int value = comScore.getcTotalScore()/comScore.getcTotalUser();
			data.put("score", value);
		}
		// 查看次数
		data.put("like", jobInfo.getcUserLike());
		// 更新查看次数
		tJobInfoMapper.updateUserLike(id, jobInfo.getcUserLike() + 1);
		modelMap.put("jobDetail", data);
		return modelMap;
	}

	// 发布兼职信息
	public Map<String, Object> publishJobInfo(Map<String, String> params) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		TCompanyInfo comInfo = tCompanyInfoMapper.selectByPrimaryKey(Integer.parseInt(params.get("comId")));
		if(null == comInfo) {
			return null;
		}
		
		double balance = Double.parseDouble(comInfo.getcComBalance());
		if(balance < 10){
			resultMap.put("code", SystemUtil.CODE_NOT_ENOUGH_BALANCE);
			return resultMap;
		}
		
		
		
		TJobInfo jobInfo = new TJobInfo();
		// 兼职地址信息
		TLocation location = new TLocation();
		// 维度
		String latitude = params.get("locationX");
		location.setcLocationLatitude(latitude);
		// 经度
		String longitude = params.get("locationY");
		location.setcLocationLongitude(longitude);
		// 位置名字
		location.setcLocationName(params.get("locationName"));

		int locId = 0;
		tLocationMapper.insertSelectiveReId(location);
		// 获取插入后的主键
		locId = location.getcLocationId();
		jobInfo.setcJobLocationId(locId);
		jobInfo.setcComId(Integer.parseInt(params.get("comId")));
		jobInfo.setcJobTitle(params.get("jobName"));
		jobInfo.setcJobDesc(params.get("jobDesc"));
		jobInfo.setcJobPayMethod(params.get("payMethod"));
		jobInfo.setcJobPersonGender(params.get("gender"));
		jobInfo.setcJobTotalPerson(Integer.parseInt(params.get("totalPerson")));
		jobInfo.setcJobChoiceOpId(Integer.parseInt(params.get("jobChoice")));
		jobInfo.setcJobTypeId(Integer.parseInt(params.get("jobType")));
		jobInfo.setcJobCity(params.get("city"));
		jobInfo.setcJobArea(params.get("area"));
		jobInfo.setcJobPosition(params.get("address"));
		// 发布时间
		jobInfo.setcJobPublishDate(new Date());
		jobInfo.setcJobWorkDate(params.get("workDate"));
		jobInfo.setcJobWorkTime(params.get("workTime"));
		jobInfo.setcJobSalary(params.get("salary"));
		//兼职状态
		jobInfo.setcJobState(StarConstants.JOB_KEEPING);
		tJobInfoMapper.insertSelective(jobInfo);
		
		rongCloudService.createGroup(comInfo.getcComPhone(),jobInfo.getcJobTitle(),String.valueOf(jobInfo.getcJobId()));
		
		balance -=10;
		comInfo.setcComBalance(String.valueOf(balance));
		tCompanyInfoMapper.updateByPrimaryKey(comInfo);
		jobInfo.setcJobState(StarConstants.JOB_KEEPING);
		/**
		 * 记录操作
		 */
		RefreshJob refreshJob = new RefreshJob();
		refreshJob.setComId(comInfo.getcComId());
		refreshJob.setCreateTime(new Date());
		refreshJob.setRefreshCost(new BigDecimal(10));
		refreshJob.setJobId(jobInfo.getcJobId());
		refreshJobMapper.insertSelective(refreshJob);
		resultMap.put("code", "200");
		resultMap.put("jobId", String.valueOf(jobInfo.getcJobId()));
		return resultMap;
	}
}
