package com.starjobs.mapper;

import com.starjobs.pojo.ChargeActivity;
import com.starjobs.pojo.ChargeActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChargeActivityMapper {
    int countByExample(ChargeActivityExample example);

    int deleteByExample(ChargeActivityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChargeActivity record);

    int insertSelective(ChargeActivity record);

    List<ChargeActivity> selectByExample(ChargeActivityExample example);

    ChargeActivity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChargeActivity record, @Param("example") ChargeActivityExample example);

    int updateByExample(@Param("record") ChargeActivity record, @Param("example") ChargeActivityExample example);

    int updateByPrimaryKeySelective(ChargeActivity record);

    int updateByPrimaryKey(ChargeActivity record);
}