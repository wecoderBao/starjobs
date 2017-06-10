/**
 * 
 */
package io.rong.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starjobs.mapper.TFriendMapper;
import com.starjobs.pojo.TFriend;

import io.rong.RongCloud;
import io.rong.messages.TxtMessage;
import io.rong.models.CodeSuccessResult;
import io.rong.models.TokenResult;
import io.rong.service.RongCloudService;
import io.rong.util.RongConstants;

/**
 * <p>
 * Title:RongCloudServiceImpl
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author:bao
 * @date:2017年6月7日下午11:04:47
 */
@Service
public class RongCloudServiceImpl implements RongCloudService {

	@Autowired
	TFriendMapper tFriendMapper;
	/*
	 * (non-Javadoc)
	 * 
	 * @see io.rong.service.RongCloudService#getToken()
	 */
	public Map<String, Object> getToken(String phoneNum,String name,String portraitUri) {
		if(StringUtils.isEmpty(name)){
			name="Tom";
		}
		if(StringUtils.isEmpty(portraitUri)){
			portraitUri="http://www.rongcloud.cn/images/logo.png";
		}
		try {
			TokenResult userGetTokenResult = RongCloud.getInstance(RongConstants.RONG_APP_KEY, RongConstants.RONG_APP_SECRET).user.getToken(phoneNum,
					name, portraitUri);
			Map<String,Object> result = new HashMap<String,Object>();
			result.put("code", userGetTokenResult.getCode().toString());
			result.put("rongToken", userGetTokenResult.getToken());
			result.put("userId", userGetTokenResult.getUserId());
			return result;
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
		
	}

	/* (non-Javadoc)
	 * @see io.rong.service.RongCloudService#addFriend(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	public Map<String, Object> addFriend(String fromUserId, String toUserId, String content, String pushContent) {
		String[] toUserIds = {toUserId};
		TxtMessage txtMessage = new TxtMessage(content, "extra");
		try {
			CodeSuccessResult result =RongCloud.getInstance(RongConstants.RONG_APP_KEY, RongConstants.RONG_APP_SECRET).message.PublishSystem(fromUserId, toUserIds, txtMessage, pushContent, null, 1, 1);
			if(null!=result){
				Map<String,Object> data = new HashMap<String,Object>();
				data.put("code", result.getCode().toString());
				return data;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see io.rong.service.RongCloudService#confirmFriendAdded(java.lang.String, java.lang.String)
	 */
	public Map<String, Object> confirmFriendAdded(String fromUserId, String toUserId) {
		// 将标识排序
		long fid = Long.parseLong(fromUserId);
		long tid = Long.parseLong(toUserId);
		String cuid = fromUserId;
		String cfid = toUserId;
		if(fid == tid)
			return null;//自己和自己不能成为好友
		if(fid > tid){
			cuid = toUserId;
			cfid = fromUserId;
		}
		//检查是否已经是好友
		TFriend friend = tFriendMapper.selectByUserId(cuid, cfid);
		if(null != friend){
			return null;//已经是好友
		}
		friend = new TFriend();
		friend.setcUid(cuid);
		friend.setcFid(cfid);
		tFriendMapper.insert(friend);//添加好友
		//向融云发送通知信息
		String[] toUserIds = {fromUserId,toUserId};
		String content = ""+fromUserId+"与"+toUserId+"成为好友";
		TxtMessage txtMessage = new TxtMessage(content, "extra");
		try {
			CodeSuccessResult result =RongCloud.getInstance(RongConstants.RONG_APP_KEY, RongConstants.RONG_APP_SECRET).message.PublishSystem(fromUserId, toUserIds, txtMessage, null, null, 1, 1);
			if(null!=result){
				Map<String,Object> data = new HashMap<String,Object>();
				data.put("code", result.getCode().toString());
				return data;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
