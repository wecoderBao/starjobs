/**
 * 
 */
package io.rong.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starjobs.common.StarConstants;
import com.starjobs.mapper.TCompanyInfoMapper;
import com.starjobs.mapper.TFriendMapper;
import com.starjobs.mapper.TGroupMapper;
import com.starjobs.mapper.TGroupMemberMapper;
import com.starjobs.mapper.TJobInfoMapper;
import com.starjobs.mapper.TUserInfoMapper;
import com.starjobs.pojo.TCompanyInfo;
import com.starjobs.pojo.TFriend;
import com.starjobs.pojo.TGroup;
import com.starjobs.pojo.TGroupMember;
import com.starjobs.pojo.TGroupMemberExample;
import com.starjobs.pojo.TJobInfo;
import com.starjobs.pojo.TUserInfo;

import io.rong.RongCloud;
import io.rong.messages.ContactNtfMessage;
import io.rong.messages.GroupNtfMessage;
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
	private TFriendMapper tFriendMapper;
	@Autowired
	private TUserInfoMapper tUserInfoMapper;
	@Autowired
	private TCompanyInfoMapper tCompanyInfoMapper;
	@Autowired
	private TGroupMapper tGroupMapper;
	@Autowired
	private TGroupMemberMapper tGroupMemberMapper;
	@Autowired
	private TJobInfoMapper tJobInfoMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.rong.service.RongCloudService#getToken()
	 */
	public Map<String, Object> getToken(String phoneNum, String name, String portraitUri) {
		if (StringUtils.isEmpty(name)) {
			name = "Tom";
		}
		if (StringUtils.isEmpty(portraitUri)) {
			portraitUri = "http://www.rongcloud.cn/images/logo.png";
		}
		try {
			TokenResult userGetTokenResult = RongCloud.getInstance(RongConstants.RONG_APP_KEY,
					RongConstants.RONG_APP_SECRET).user.getToken(phoneNum, name, portraitUri);
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("code", userGetTokenResult.getCode().toString());
			result.put("rongToken", userGetTokenResult.getToken());
			result.put("userId", userGetTokenResult.getUserId());
			return result;
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.rong.service.RongCloudService#addFriend(java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String)
	 */
	public Map<String, Object> addFriend(String fromUserId, String toUserId, String content, String pushContent) {
		// 将标识排序，做小右大
		Long fid = Long.parseLong(fromUserId);
		Long tid = Long.parseLong(toUserId);
		String cuid = fromUserId;
		String cfid = toUserId;
		if (fid.equals(tid))
			return null;// 自己和自己不能成为好友
		if (fid > tid) {
			cuid = toUserId;
			cfid = fromUserId;
		}
		// 检查是否已经是好友
		TFriend friend = tFriendMapper.selectByUserId(cuid, cfid);
		// 检查好友状态
		if (null != friend && !friend.getcState().equals("0")) {
			return null;// 已经添加过或者是好友
		}
		if (null == friend) {
			friend = new TFriend();
			friend.setcUid(cuid);
			friend.setcFid(cfid);
			friend.setcState(fromUserId);
			tFriendMapper.insert(friend);// 添加好友
		} else {
			friend.setcState(fromUserId);// 修改状态为请求待确认
			tFriendMapper.updateByPrimaryKey(friend);
		}

		String[] toUserIds = { toUserId };
		ContactNtfMessage ntfMessage = new ContactNtfMessage("add friend", "extra", fromUserId, toUserId, pushContent);
		try {
			CodeSuccessResult result = RongCloud.getInstance(RongConstants.RONG_APP_KEY,
					RongConstants.RONG_APP_SECRET).message.PublishSystem(fromUserId, toUserIds, ntfMessage, pushContent,
							null, 1, 1);
			if (null != result) {
				Map<String, Object> data = new HashMap<String, Object>();
				data.put("code", result.getCode().toString());
				return data;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * io.rong.service.RongCloudService#confirmFriendAdded(java.lang.String,
	 * java.lang.String)
	 */
	public Map<String, Object> confirmFriendAdded(String fromUserId, String toUserId) {
		// 将标识排序，做小右大
		Long fid = Long.parseLong(fromUserId);
		Long tid = Long.parseLong(toUserId);
		String cuid = fromUserId;
		String cfid = toUserId;
		if (fid.equals(tid))
			return null;// 自己和自己不能成为好友
		if (fid > tid) {
			cuid = toUserId;
			cfid = fromUserId;
		}
		// 检查是否已经是好友
		TFriend friend = tFriendMapper.selectByUserId(cuid, cfid);
		if (friend == null) {// 记录必须存在
			return null;
		}
		if (friend.equals("0")) {
			return null;// 陌生人
		}
		if (null != friend && friend.equals("2")) {
			return null;// 已经是好友
		}
		friend.setcState("2");// 成为好友
		tFriendMapper.updateByPrimaryKey(friend);// 添加好友
		// 向融云发送通知信息
		String[] toUserIds = { toUserId };
		String content = "" + fromUserId + "与" + toUserId + "成为好友";
		ContactNtfMessage ntfMessage = new ContactNtfMessage("confirm friend_added", "extra", fromUserId, toUserId,
				content);
		try {
			CodeSuccessResult result = RongCloud.getInstance(RongConstants.RONG_APP_KEY,
					RongConstants.RONG_APP_SECRET).message.PublishSystem(fromUserId, toUserIds, ntfMessage, null, null,
							1, 1);
			if (null != result) {
				Map<String, Object> data = new HashMap<String, Object>();
				data.put("code", result.getCode().toString());
				return data;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.rong.service.RongCloudService#lookFriend(java.lang.String)
	 */
	public Map<String, Object> lookFriend(String userPhone, String phoneNum) {
		// 将标识排序，做小右大
		Long fid = Long.parseLong(userPhone);
		Long tid = Long.parseLong(phoneNum);
		String cuid = userPhone;
		String cfid = phoneNum;
		if (fid.equals(tid))
			return null;// 自己和自己不能成为好友
		if (fid > tid) {
			cuid = phoneNum;
			cfid = userPhone;
		}
		// 检查是否已经是好友
		TFriend friend = tFriendMapper.selectByUserId(cuid, cfid);
		String state = "0";// 陌生人
		if (null != friend) {
			state = friend.getcState();
		}
		// 根据手机号查找用户
		TUserInfo userInfo = tUserInfoMapper.selectByPhone(phoneNum.trim());
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if (null != userInfo) {
			resultMap.put("friendName", userInfo.getcUserNickname());
			resultMap.put("friendPicUrl", StarConstants.USER_IMG_URL+userInfo.getcUserImg());
			resultMap.put("friendPhoneNum", userInfo.getcUserPhone());
			resultMap.put("state", state);
			return resultMap;
		}
		// 普通用户不存在，查找公司用户
		TCompanyInfo comInfo = tCompanyInfoMapper.selectByPhone(phoneNum.trim());
		if (null != comInfo) {
			resultMap.put("friendName", comInfo.getcComName());
			resultMap.put("friendPicUrl", StarConstants.COM_IMG_URL+comInfo.getcComHeadImg());
			resultMap.put("friendPhoneNum", comInfo.getcComPhone());
			resultMap.put("state", state);
			return resultMap;
		}
		// 都没找到
		return null;
	}

	public Map<String, Object> readFriends(String phoneNum) {
		// 根据手机号查找好友，本人在左侧
		List<TFriend> leftList = tFriendMapper.selectByUid(phoneNum);
		Map<String, Object> result = new HashMap<String, Object>();
		List<Map<String, Object>> friendList = new ArrayList<Map<String, Object>>();
		if (null != leftList && leftList.size() > 0) {
			for (TFriend tf : leftList) {
				TUserInfo info = tUserInfoMapper.selectByPhone(tf.getcFid());
				if (info != null && tf.getcState().equals("2")) {// 好友
					Map<String, Object> fr = new HashMap<String, Object>(3);
					fr.put("friendName", info.getcUserNickname());
					fr.put("friendPicUrl", StarConstants.USER_IMG_URL+info.getcUserImg());
					fr.put("friendPhoneNum", info.getcUserPhone());
					friendList.add(fr);
				}
			}
		}

		// 查找好友，本人在右侧
		List<TFriend> rightList = tFriendMapper.selectByFid(phoneNum);
		if (null != rightList && rightList.size() > 0) {
			for (TFriend tf : rightList) {
				TUserInfo info = tUserInfoMapper.selectByPhone(tf.getcUid());
				if (info != null && tf.getcState().equals("2")) {// 好友
					Map<String, Object> fr = new HashMap<String, Object>(3);
					fr.put("friendName", info.getcUserNickname());
					fr.put("friendPicUrl", StarConstants.USER_IMG_URL+info.getcUserImg());
					fr.put("friendPhoneNum", info.getcUserPhone());
					friendList.add(fr);
				}
			}
		}
		result.put("friendList", friendList);
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.rong.service.RongCloudService#createGroup(java.lang.String,
	 * java.lang.String)
	 */
	public Map<String, Object> createGroup(String userId, String groupName, String jobId) {
		RongCloud rongCloud = RongCloud.getInstance(RongConstants.RONG_APP_KEY, RongConstants.RONG_APP_SECRET);
		String[] groupCreateUserId = { userId };
		Map<String, Object> result = new HashMap<String, Object>();
		try {
//			TCompanyInfo comInfo = tCompanyInfoMapper.selectByPhone(userId);
//			String comHeadImg = comInfo.getcComHeadImg();
//			comHeadImg = (comHeadImg==null?"default.png":comHeadImg);
			String groupHeadImg = "";
			TJobInfo job = tJobInfoMapper.selectByPrimaryKey(Integer.parseInt(jobId));
			if(null == job) {
				return null;
			}
			groupHeadImg = getGroupHeadImgByType(job.getcJobTypeId());
			// 保存群组
			TGroup group = new TGroup();
			group.setcGroupCreaterId(userId);
			group.setcGroupHeadImg(groupHeadImg);
			group.setcGroupName(groupName);
			group.setcGroupStatu("1");
			group.setcJobId(jobId);
			tGroupMapper.insertSelective(group);
			// 保存群组成员
			TGroupMember member = new TGroupMember();
			member.setcGroupId(group.getcGroupId());// 所在群组id
			member.setcGroupMemberId(userId);// 成员手机号
			member.setcGroupMemberIdentity("0");// 群主标识
			tGroupMemberMapper.insertSelective(member);
			CodeSuccessResult groupCreateResult = rongCloud.group.create(groupCreateUserId,
					String.valueOf(group.getcGroupId()), groupName);
			System.out.println("--" + groupCreateResult.toString());
			if (groupCreateResult != null && groupCreateResult.getCode() == 200) {

				String[] messagePublishGroupToGroupId = { String.valueOf(group.getcGroupId()) };
				Map<String, Object> data = new HashMap<String, Object>();
				data.put("operatorNickname", userId);
				data.put("targetGroupName", groupName);
				GroupNtfMessage groupMessage = new GroupNtfMessage(userId, "Create", data, "创建群组：" + groupName,
						"创建群组：" + groupName);
				CodeSuccessResult messagePublishGroupResult = rongCloud.message.publishGroup(userId,
						messagePublishGroupToGroupId, groupMessage, "创建群组：" + groupName,
						"{\"pushData\":\"" + "创建群组：" + groupName + "\"}", 1, 1, 1);
				System.out.println("--2--" + messagePublishGroupResult.toString());
				if (messagePublishGroupResult.getCode() == 200) {
					group.setcGroupStatu("0");// 创建成功群组激活
					tGroupMapper.updateByPrimaryKey(group);
					result.put("code", "200");
					return result;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	private String getGroupHeadImgByType(Integer typeId) {
		if(typeId == null) {
			return "default.png";
		}else if(typeId == 2) {
			return "02daogou.png";
		}else if(typeId == 3) {
			return "03server.png";
		}else if(typeId == 4) {
			return "04teacher.png";
		}else if(typeId == 5) {
			return "05fadan.png";
		}else if(typeId == 6) {
			return "06wenyuan.png";
		}else if(typeId == 7) {
			return "07huawu.png";
		}else if(typeId == 8) {
			return "08liyi.png";
		}else if(typeId == 9) {
			return "09jiaolian.png";
		}else if(typeId == 10) {
			return "10pugong.png";
		}else if(typeId == 11) {
			return "11jishu.png";
		}else if(typeId == 12) {
			return "12huodong.png";
		}else if(typeId == 13) {
			return "13sheji.png";
		}else if(typeId == 14) {
			return "14website.png";
		}else if(typeId == 15) {
			return "15kaifa.png";
		}else if(typeId == 16) {
			return "16yingxiao.png";
		}else if(typeId == 17) {
			return "17falv.png";
		}else if(typeId == 18) {
			return "18daili.png";
		}
		return "default.png";
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see io.rong.service.RongCloudService#joinGroup(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	public Map<String, Object> joinGroup(String userId, String groupId, String groupName) {
		RongCloud rongCloud = RongCloud.getInstance(RongConstants.RONG_APP_KEY, RongConstants.RONG_APP_SECRET);
		// 将用户加入指定群组，用户将可以收到该群的消息，同一用户最多可加入 500 个群，每个群最大至 3000 人。
		String[] groupJoinUserId = userId.split(";");
		Map<String, Object> result = new HashMap<String, Object>();
		// 获取融云端群组id
		TGroup group = tGroupMapper.selectByPrimaryKey(Integer.parseInt(groupId));
		if (group == null) {
			return null;
		}
		try {
			CodeSuccessResult groupJoinResult = rongCloud.group.join(groupJoinUserId,
					String.valueOf(group.getcGroupId()), groupName);
			if (groupJoinResult != null && groupJoinResult.getCode() == 200) {
				// 添加群成员记录
				// todo
				TGroupMember member = new TGroupMember();
				member.setcGroupId(Integer.parseInt(groupId));// 所在群组id
				member.setcGroupMemberId(userId);// 成员手机号
				member.setcGroupMemberIdentity("1");// 群主标识
				tGroupMemberMapper.insertSelective(member);
				result.put("code", "200");
				String[] messagePublishGroupToGroupId = { String.valueOf(group.getcGroupId()) };
				Map<String, Object> data = new HashMap<String, Object>();
				data.put("operatorNickname", userId);
				String[] targetUserIds = { userId };
				data.put("targetUserIds", targetUserIds);
				data.put("operatorNickname", userId);
				TUserInfo userInfo = tUserInfoMapper.selectByPhone(userId);
				GroupNtfMessage groupMessage = new GroupNtfMessage(userId, "Add", data, userInfo.getcUserNickname()+" 加入群组",
						userInfo.getcUserNickname()+" 加入群组");
				CodeSuccessResult messagePublishGroupResult = rongCloud.message.publishGroup(userId,
						messagePublishGroupToGroupId, groupMessage, "加入群组：" + groupName,
						"{\"pushData\":\"" + "加入群组：" + groupName + "\"}", 1, 1, 1);
				return result;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.rong.service.RongCloudService#dismissGroup(java.lang.String,
	 * java.lang.String)
	 */
	public Map<String, Object> dismissGroup(String userId, String groupId) {
		// 解散群组方法。（将该群解散，所有用户都无法再接收该群的消息。）
		RongCloud rongCloud = RongCloud.getInstance(RongConstants.RONG_APP_KEY, RongConstants.RONG_APP_SECRET);
		Map<String, Object> result = new HashMap<String, Object>();
		// 获取融云端群组id
		TGroup group = tGroupMapper.selectByPrimaryKey(Integer.parseInt(groupId));
		if (group == null) {
			return null;
		}
		try {
			CodeSuccessResult groupDismissResult = rongCloud.group.dismiss(userId, groupId);
			if (groupDismissResult != null && groupDismissResult.getCode() == 200) {
				// 对群记录进行修改
				// todo
				group.setcGroupStatu("1");// 群组失效
				tGroupMapper.updateByPrimaryKey(group);// 更新群组信息
				result.put("code", "200");
				String[] messagePublishGroupToGroupId = { String.valueOf(group.getcGroupId()) };
				Map<String, Object> data = new HashMap<String, Object>();
				data.put("operatorNickname", userId);
				String pushTip = "群组：" + group.getcGroupName() + "解散了";
				GroupNtfMessage groupMessage = new GroupNtfMessage(userId, "Dismiss", data, pushTip, pushTip);
				CodeSuccessResult messagePublishGroupResult = rongCloud.message.publishGroup(userId,
						messagePublishGroupToGroupId, groupMessage, pushTip, "{\"pushData\":\"" + pushTip + "\"}", 1, 1,
						1);

				return result;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.rong.service.RongCloudService#groupList(java.lang.String)
	 */
	public Map<String, Object> groupList(String phoneNum) {
		// 根据手机号查询所在的群id
		List<TGroupMember> memberList = tGroupMemberMapper.selectByPhone(phoneNum);
		Map<String, Object> result = new HashMap<String, Object>();
		List<Map<String, Object>> groupList = new ArrayList<Map<String, Object>>();
		if (memberList != null && memberList.size() > 0) {
			// 根据所在群id获取群组信息
			for (TGroupMember member : memberList) {
				TGroup group = tGroupMapper.selectByPrimaryKey(member.getcGroupId());
				Map<String, Object> aGroup = new HashMap<String, Object>();
				if (null != group && group.getcGroupStatu().equals("0")) {
					aGroup.put("groupName", group.getcGroupName());
					aGroup.put("groupId", String.valueOf(group.getcGroupId()));
					aGroup.put("groupImg",StarConstants.GROUP_IMG_URL+ group.getcGroupHeadImg());
					TGroupMemberExample memberExample = new TGroupMemberExample();
					TGroupMemberExample.Criteria criteria = memberExample.createCriteria();
					criteria.andCGroupIdEqualTo(group.getcGroupId());
					int groupSize = tGroupMemberMapper.countByExample(memberExample);
					aGroup.put("groupSize", groupSize);
					groupList.add(aGroup);
				}
			}
		}
		result.put("groupList", groupList);
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.rong.service.RongCloudService#groupMembers(java.lang.String)
	 */
	public Map<String, Object> groupMembers(String groupId) {
		Integer id = Integer.parseInt(groupId);
		List<TGroupMember> members = tGroupMemberMapper.selectByGroupId(id);
		Map<String, Object> result = new HashMap<String, Object>();
		List<Map<String, Object>> memberList = new ArrayList<Map<String, Object>>();
		for (TGroupMember member : members) {
			Map<String, Object> aMember = new HashMap<String, Object>();
			if (member.getcGroupMemberIdentity().equals("0")) {// 群主是公司用户
				TCompanyInfo info = tCompanyInfoMapper.selectByPhone(member.getcGroupMemberId());
				if (info != null) {
					aMember.put("memberName", info.getcComName());
					aMember.put("memberImg",StarConstants.COM_IMG_URL+ info.getcComHeadImg());
					aMember.put("memberId", info.getcComPhone());
					aMember.put("memberIdentity", member.getcGroupMemberIdentity());
					memberList.add(aMember);
				}
			} else {
				TUserInfo info = tUserInfoMapper.selectByPhone(member.getcGroupMemberId());
				if (info != null) {
					aMember.put("memberName", info.getcUserNickname());
					aMember.put("memberImg", StarConstants.USER_IMG_URL+info.getcUserImg());
					aMember.put("memberId", info.getcUserPhone());
					aMember.put("memberIdentity", member.getcGroupMemberIdentity());
					memberList.add(aMember);
				}
			}
		}
		result.put("memberList", memberList);
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.rong.service.RongCloudService#deleteFriend(java.lang.String,
	 * java.lang.String)
	 */
	public Map<String, Object> deleteFriend(String fromUserId, String toUserId) {
		long currId = Long.parseLong(fromUserId);
		long delId = Long.parseLong(toUserId);
		String leftId = fromUserId;
		String rightId = toUserId;
		if (currId > delId) {
			leftId = toUserId;
			rightId = fromUserId;
		}
		int result = tFriendMapper.deleteByChoice(leftId, rightId);
		if (result > 0) {
			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put("code", "200");
			return resultMap;
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * io.rong.service.RongCloudService#groupGroupIdByJobId(java.lang.String)
	 */
	public Map<String, Object> getGroupIdByJobId(String jobId) {
		TGroup group = tGroupMapper.selectByJobId(jobId);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if (null != group) {
			resultMap.put("groupId", String.valueOf(group.getcGroupId()));
		} else {
			resultMap.put("groupId", "-1");
		}

		return resultMap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.rong.service.RongCloudService#getGroupInfo(java.lang.String)
	 */
	@Override
	public Map<String, Object> getGroupInfo(String groupId) {
		int group_id = Integer.parseInt(groupId);
		TGroup group = tGroupMapper.selectByPrimaryKey(group_id);
		Map<String, Object> groupInfoMap = new HashMap<String, Object>();
		// 根据群组id获取群成员列表
		List<TGroupMember> members = tGroupMemberMapper.selectByGroupId(group_id);
		String groupSize = "0";
		if (members != null) {
			groupSize = String.valueOf(members.size());
		}
		if (null != group) {
			groupInfoMap.put("groupId", groupId);
			groupInfoMap.put("groupName", group.getcGroupName());
			groupInfoMap.put("groupOwnerId", group.getcGroupCreaterId());
			groupInfoMap.put("groupImgUrl", StarConstants.GROUP_IMG_URL+group.getcGroupHeadImg());
			groupInfoMap.put("groupSize", groupSize);
			TJobInfo job = tJobInfoMapper.selectByPrimaryKey(Integer.parseInt(group.getcJobId()));
			if(job!=null) {
				groupInfoMap.put("job", job.getcJobTitle());
			}
			
		}

		return groupInfoMap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see io.rong.service.RongCloudService#quitGroup(java.lang.String,
	 * java.lang.String)
	 */
	public Map<String, Object> quitGroup(String userId, String groupId) {
		// 退出群组方法（将用户从群中移除，不再接收该群组的消息.）
		RongCloud rongCloud = RongCloud.getInstance(RongConstants.RONG_APP_KEY, RongConstants.RONG_APP_SECRET);

		String[] groupQuitUserId = { userId };
		Map<String, Object> resultMap = new HashMap<String, Object>();
		TGroup group = tGroupMapper.selectByPrimaryKey(Integer.parseInt(groupId));
		if (group == null) {
			return null;
		}
		if (group.getcGroupCreaterId().equals(userId)) {
			return null;// 群主无法退群
		}
		try {
			CodeSuccessResult groupQuitResult = rongCloud.group.quit(groupQuitUserId, groupId);
			if (groupQuitResult.getCode() == 200) {
				resultMap.put("code", "200");
				// 删除数据库中的群成员记录
				tGroupMemberMapper.deleteByGroupIdAndUserId(Integer.parseInt(groupId), userId);
				String[] messagePublishGroupToGroupId = { String.valueOf(group.getcGroupId()) };
				Map<String, Object> data = new HashMap<String, Object>();
				data.put("operatorNickname", userId);
				String[] targetUserIds = { userId, group.getcGroupCreaterId() };
				data.put("targetUserIds", targetUserIds);
				data.put("targetUserDisplayNames", groupQuitUserId);
				GroupNtfMessage groupMessage = new GroupNtfMessage(userId, "Quit", data, "退出群组", "退出群组");
				CodeSuccessResult messagePublishGroupResult = rongCloud.message.publishGroup(userId,
						messagePublishGroupToGroupId, groupMessage, "退出群组", "{\"pushData\":\"" + "退出群组\"}", 1, 1, 1);
				return resultMap;
			}

		} catch (Exception e) {

		}
		return null;
	}

	public Map<String, Object> getRelations(String phoneNum) {
		// 根据手机号查找好友，本人在左侧
		List<TFriend> leftList = tFriendMapper.selectByUid(phoneNum);
		Map<String, Object> result = new HashMap<String, Object>();
		List<Map<String, Object>> friendList = new ArrayList<Map<String, Object>>();
		if (null != leftList && leftList.size() > 0) {
			for (TFriend tf : leftList) {
				TUserInfo info = tUserInfoMapper.selectByPhone(tf.getcFid());
				if (info != null) {// 好友
					Map<String, Object> fr = new HashMap<String, Object>(3);
					fr.put("friendName", info.getcUserNickname());
					fr.put("friendPicUrl",StarConstants.USER_IMG_URL+ info.getcUserImg());
					fr.put("friendPhoneNum", info.getcUserPhone());
					fr.put("state", tf.getcState());
					friendList.add(fr);
				}
			}
		}

		// 查找好友，本人在右侧
		List<TFriend> rightList = tFriendMapper.selectByFid(phoneNum);
		if (null != rightList && rightList.size() > 0) {
			for (TFriend tf : rightList) {
				TUserInfo info = tUserInfoMapper.selectByPhone(tf.getcUid());
				if (info != null) {// 好友
					Map<String, Object> fr = new HashMap<String, Object>(3);
					fr.put("friendName", info.getcUserNickname());
					fr.put("friendPicUrl",StarConstants.USER_IMG_URL+ info.getcUserImg());
					fr.put("friendPhoneNum", info.getcUserPhone());
					fr.put("state", tf.getcState());
					friendList.add(fr);
				}
			}
		}
		result.put("relationList", friendList);
		return result;
	}
}
