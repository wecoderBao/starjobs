package com.starjobs.mapper;

import com.starjobs.pojo.TUserToken;
import com.starjobs.pojo.TUserTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserTokenMapper {
    int countByExample(TUserTokenExample example);

    int deleteByExample(TUserTokenExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(TUserToken record);

    int insertSelective(TUserToken record);

    List<TUserToken> selectByExample(TUserTokenExample example);

    TUserToken selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TUserToken record, @Param("example") TUserTokenExample example);

    int updateByExample(@Param("record") TUserToken record, @Param("example") TUserTokenExample example);

    int updateByPrimaryKeySelective(TUserToken record);

    int updateByPrimaryKey(TUserToken record);
}