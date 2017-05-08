package com.starjobs.mapper;

import com.starjobs.pojo.TUserWithdraw;
import com.starjobs.pojo.TUserWithdrawExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserWithdrawMapper {
    int countByExample(TUserWithdrawExample example);

    int deleteByExample(TUserWithdrawExample example);

    int deleteByPrimaryKey(Integer cUserWithdrawId);

    int insert(TUserWithdraw record);

    int insertSelective(TUserWithdraw record);

    List<TUserWithdraw> selectByExample(TUserWithdrawExample example);

    TUserWithdraw selectByPrimaryKey(Integer cUserWithdrawId);

    int updateByExampleSelective(@Param("record") TUserWithdraw record, @Param("example") TUserWithdrawExample example);

    int updateByExample(@Param("record") TUserWithdraw record, @Param("example") TUserWithdrawExample example);

    int updateByPrimaryKeySelective(TUserWithdraw record);

    int updateByPrimaryKey(TUserWithdraw record);
}