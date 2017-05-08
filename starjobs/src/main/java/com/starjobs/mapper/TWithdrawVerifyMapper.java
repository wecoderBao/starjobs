package com.starjobs.mapper;

import com.starjobs.pojo.TWithdrawVerify;
import com.starjobs.pojo.TWithdrawVerifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWithdrawVerifyMapper {
    int countByExample(TWithdrawVerifyExample example);

    int deleteByExample(TWithdrawVerifyExample example);

    int deleteByPrimaryKey(Integer cVerifyId);

    int insert(TWithdrawVerify record);

    int insertSelective(TWithdrawVerify record);

    List<TWithdrawVerify> selectByExample(TWithdrawVerifyExample example);

    TWithdrawVerify selectByPrimaryKey(Integer cVerifyId);

    int updateByExampleSelective(@Param("record") TWithdrawVerify record, @Param("example") TWithdrawVerifyExample example);

    int updateByExample(@Param("record") TWithdrawVerify record, @Param("example") TWithdrawVerifyExample example);

    int updateByPrimaryKeySelective(TWithdrawVerify record);

    int updateByPrimaryKey(TWithdrawVerify record);
}