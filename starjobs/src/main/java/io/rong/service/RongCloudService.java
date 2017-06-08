/**
 * 
 */
package io.rong.service;

import java.util.Map;

/**
 * <p>Title:RongCloudService</p>
 * <p>Description:</p>
 * @author:bao
 * @date:2017年6月7日下午11:00:21
 */
public interface RongCloudService {

	Map<String,Object> getToken(String phoneNum,String name,String portraitUri);
	
	Map<String,Object> addFriend(String fromUserId,String toUserId,String content,String pushContent);
	
	Map<String,Object> confirmFriendAdded(String fromUserId,String toUserId);
}
