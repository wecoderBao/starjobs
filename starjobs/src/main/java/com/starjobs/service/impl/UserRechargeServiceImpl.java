package com.starjobs.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starjobs.common.StarConstants;
import com.starjobs.dto.UserRechargeRecordDto;
import com.starjobs.mapper.BalanceHistoryMapper;
import com.starjobs.mapper.ChargeActivityMapper;
import com.starjobs.mapper.TCompanyInfoMapper;
import com.starjobs.mapper.TUserRechargeMapper;
import com.starjobs.pojo.BalanceHistory;
import com.starjobs.pojo.ChargeActivity;
import com.starjobs.pojo.TCompanyInfo;
import com.starjobs.pojo.TUserRecharge;
import com.starjobs.pojo.TUserRechargeExample;
import com.starjobs.service.UserRechargeService;
import com.starjobs.sys.SystemUtil;

@Service
public class UserRechargeServiceImpl implements UserRechargeService {
	@Autowired
	private TUserRechargeMapper tUserRechargeMapper;
	@Autowired
	private ChargeActivityMapper chargeActivityMapper;
	@Autowired 
	private TCompanyInfoMapper tCompanyInfoMapper;
	@Autowired
	private BalanceHistoryMapper balanceHistoryMapper;

	@Override
	public List<UserRechargeRecordDto> getUserRechargeRecord(int userId) {
		List<UserRechargeRecordDto> dtoList = new ArrayList<UserRechargeRecordDto>();
		TUserRechargeExample example = new TUserRechargeExample();
		example.or().andUserIdEqualTo(userId);
		example.setOrderByClause("create_time Desc");
		List<TUserRecharge> rechargeList = tUserRechargeMapper.selectByExample(example);
		if(null != rechargeList) {
			for(TUserRecharge recharge : rechargeList) {
				UserRechargeRecordDto dto = new UserRechargeRecordDto();
				dto.setBalance(recharge.getBalance().toString());
				dto.setCreateTime(recharge.getCreateTime().getTime());
				dto.setRechargeMoney(recharge.getRechargeMoney().toString());
				dtoList.add(dto);
			}
		}
		return dtoList;
	}

	@Override
	public Map<String, Object> chargeExtraBalance(int activityId, String phone,String token,String userFlag) {
		Map<String, Object> modelMap = new HashMap<String, Object>(4);
		modelMap.put("error_code", SystemUtil.CODE_FAIL);
		modelMap.put("message", "fail");
		TCompanyInfo comInfo = tCompanyInfoMapper.selectByPhone(phone);
		ChargeActivity activity = chargeActivityMapper.selectByPrimaryKey(activityId);
		if(null == comInfo || null == activity) {
			return modelMap;
		}
		BigDecimal balance = new BigDecimal(comInfo.getcComBalance());
		BigDecimal extraBalance = new BigDecimal(comInfo.getcExtraBalance());
		BigDecimal cashnum = activity.getCashnum();
		Map<String,Object> resultMap = new HashMap<String,Object>(4);
		resultMap.put("token", token);
		resultMap.put("userFlag", userFlag);
		modelMap.put("data", resultMap);
		if(balance.compareTo(cashnum) < 0) {
			modelMap.put("error_code", SystemUtil.CODE_NOT_ENOUGH_BALANCE);
			modelMap.put("message", "余额不足");
			return modelMap;
		}else {
			balance = balance.subtract(cashnum);
			extraBalance = extraBalance.add(getCashnumByActivityId(activityId));
			/**
			 * 更新记录
			 */
			comInfo.setcComBalance(balance.toString());
			comInfo.setcExtraBalance(extraBalance.toString());
			tCompanyInfoMapper.updateByPrimaryKeySelective(comInfo);
			/**
			 * 记录消费历史
			 */
			BalanceHistory balanceHistory = new BalanceHistory();
			balanceHistory.setCost(cashnum);
			balanceHistory.setCostType(StarConstants.COST_TYPE_CHARGE_EXTRA_BALANCE);
			balanceHistory.setCreateTime(new Date());
			balanceHistory.setPhone(comInfo.getcComPhone());
			balanceHistoryMapper.insertSelective(balanceHistory);
			modelMap.put("error_code", SystemUtil.CODE_SUCC);
			modelMap.put("message", "success");
			return modelMap;
		}
	}
	/**
	 * 根据活动id获取充值金额
	 */
	private BigDecimal getCashnumByActivityId(int activityId) {
		BigDecimal cashnum = new BigDecimal(0);
		switch(activityId) {
			case 1:
				cashnum = new BigDecimal(110);
				break;
			case 2:
				cashnum = new BigDecimal(230);
				break;
			case 3:
				cashnum = new BigDecimal(580);
				break;
			case 4:
				cashnum = new BigDecimal(1200);
				break;
			case 5:
				cashnum = new BigDecimal(2500);
				break;
			case 6:
				cashnum = new BigDecimal(7500);
				break;
			default:
				cashnum = new BigDecimal(0);
				break;
		}
		return cashnum;
	}
}
