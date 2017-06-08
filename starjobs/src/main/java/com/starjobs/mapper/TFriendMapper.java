package com.starjobs.mapper;

import com.starjobs.pojo.TFriend;
import com.starjobs.pojo.TFriendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFriendMapper {
    int countByExample(TFriendExample example);

    int deleteByExample(TFriendExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(TFriend record);

    int insertSelective(TFriend record);

    List<TFriend> selectByExample(TFriendExample example);

    TFriend selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TFriend record, @Param("example") TFriendExample example);

    int updateByExample(@Param("record") TFriend record, @Param("example") TFriendExample example);

    int updateByPrimaryKeySelective(TFriend record);

    int updateByPrimaryKey(TFriend record);
    //根据 cuid,cfid查找记录
    TFriend selectByUserId(@Param("cuid") String cuid, @Param("cfid") String cfid);
}