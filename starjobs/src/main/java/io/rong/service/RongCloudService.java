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
	
	Map<String,Object> lookFriend(String userPhone,String phoneNum);
	
	Map<String,Object> readFriends(String phoneNum);
	
	Map<String,Object> deleteFriend(String fromUserId,String toUserId);
	
	Map<String,Object> createGroup(String userId,String groupName,String jobId);
	/**
	 * 创建群组带上群成员
	 * <p>一句话描述：
	 * <p>return type:Map<String,Object></p>
	 * <p>method name:createGroupWithMembers</p>
	 * @author:bao
	 * @date:2018年4月1日下午2:55:31
	 */
	Map<String,Object> createGroupWithMembers(String userId,String groupName,String jobId,String members);
	
	Map<String,Object> joinGroup(String userId,String groupId, String groupName);
	
	Map<String,Object> dismissGroup(String userId,String groupId);
	
	Map<String,Object> groupList(String phoneNum);
	
	Map<String,Object> groupMembers(String groupId);
	
	Map<String,Object> getGroupIdByJobId(String jobId);
	
	Map<String,Object> getGroupInfo(String groupId);
	
	Map<String,Object> quitGroup(String userId, String groupId);
	Map<String,Object> getRelations(String phoneNum);
}
