package com.starjobs.mapper;

import com.starjobs.pojo.TUserRecharge;
import com.starjobs.pojo.TUserRechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserRechargeMapper {
    int countByExample(TUserRechargeExample example);

    int deleteByExample(TUserRechargeExample example);

    int deleteByPrimaryKey(Integer cUserRechargeId);

    int insert(TUserRecharge record);

    int insertSelective(TUserRecharge record);

    List<TUserRecharge> selectByExample(TUserRechargeExample example);

    TUserRecharge selectByPrimaryKey(Integer cUserRechargeId);

    int updateByExampleSelective(@Param("record") TUserRecharge record, @Param("example") TUserRechargeExample example);

    int updateByExample(@Param("record") TUserRecharge record, @Param("example") TUserRechargeExample example);

    int updateByPrimaryKeySelective(TUserRecharge record);

    int updateByPrimaryKey(TUserRecharge record);
}