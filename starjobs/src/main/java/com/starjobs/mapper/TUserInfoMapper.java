package com.starjobs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.starjobs.pojo.TUserInfo;
import com.starjobs.pojo.TUserInfoExample;

public interface TUserInfoMapper {
    int countByExample(TUserInfoExample example);

    int deleteByExample(TUserInfoExample example);

    int deleteByPrimaryKey(Integer cUserId);

    int insert(TUserInfo record);

    int insertSelective(TUserInfo record);

    List<TUserInfo> selectByExample(TUserInfoExample example);

    TUserInfo selectByPrimaryKey(Integer cUserId);

    int updateByExampleSelective(@Param("record") TUserInfo record, @Param("example") TUserInfoExample example);

    int updateByExample(@Param("record") TUserInfo record, @Param("example") TUserInfoExample example);

    int updateByPrimaryKeySelective(TUserInfo record);

    int updateByPrimaryKey(TUserInfo record);
  //根据手机号更新用户密码
    int updatePwdByPhoneNum(@Param("cUserPhone") String cUserPhone,@Param("cUserPassword") String cUserPassword);
  //根据手机号查询用户信息
    TUserInfo selectByPhone(@Param("cUserPhone") String cUserPhone);
}