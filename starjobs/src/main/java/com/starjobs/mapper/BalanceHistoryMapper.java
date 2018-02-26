package com.starjobs.mapper;

import com.starjobs.pojo.BalanceHistory;
import com.starjobs.pojo.BalanceHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BalanceHistoryMapper {
    int countByExample(BalanceHistoryExample example);

    int deleteByExample(BalanceHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BalanceHistory record);

    int insertSelective(BalanceHistory record);

    List<BalanceHistory> selectByExample(BalanceHistoryExample example);

    BalanceHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BalanceHistory record, @Param("example") BalanceHistoryExample example);

    int updateByExample(@Param("record") BalanceHistory record, @Param("example") BalanceHistoryExample example);

    int updateByPrimaryKeySelective(BalanceHistory record);

    int updateByPrimaryKey(BalanceHistory record);
}