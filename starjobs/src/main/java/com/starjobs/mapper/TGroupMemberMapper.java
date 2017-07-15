package com.starjobs.mapper;

import com.starjobs.pojo.TGroupMember;
import com.starjobs.pojo.TGroupMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGroupMemberMapper {
	int countByExample(TGroupMemberExample example);

	int deleteByExample(TGroupMemberExample example);

	int deleteByPrimaryKey(Integer cId);

	int insert(TGroupMember record);

	int insertSelective(TGroupMember record);

	List<TGroupMember> selectByExample(TGroupMemberExample example);

	TGroupMember selectByPrimaryKey(Integer cId);

	int updateByExampleSelective(@Param("record") TGroupMember record, @Param("example") TGroupMemberExample example);

	int updateByExample(@Param("record") TGroupMember record, @Param("example") TGroupMemberExample example);

	int updateByPrimaryKeySelective(TGroupMember record);

	int updateByPrimaryKey(TGroupMember record);

	// 根据手机号查询所在群组列表
	List<TGroupMember> selectByPhone(@Param("phoneNum") String phoneNum);

	// 根据群组id查询群组成员列表
	List<TGroupMember> selectByGroupId(@Param("groupId") Integer groupId);

	// 根据群组id和用户id查找群成员记录
	TGroupMember selectByGroupIdAndUserId(@Param("groupId") Integer groupId, @Param("userId") String userId);

	// 根据群组id和用户id删除群成员记录
	TGroupMember deleteByGroupIdAndUserId(@Param("groupId") Integer groupId, @Param("userId") String userId);
}