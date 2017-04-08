package com.starjobs.mapper;

import com.starjobs.pojo.TUserJobApply;
import com.starjobs.pojo.TUserJobApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserJobApplyMapper {
    int countByExample(TUserJobApplyExample example);

    int deleteByExample(TUserJobApplyExample example);

    int deleteByPrimaryKey(Integer cApplyId);

    int insert(TUserJobApply record);

    int insertSelective(TUserJobApply record);

    List<TUserJobApply> selectByExample(TUserJobApplyExample example);

    TUserJobApply selectByPrimaryKey(Integer cApplyId);

    int updateByExampleSelective(@Param("record") TUserJobApply record, @Param("example") TUserJobApplyExample example);

    int updateByExample(@Param("record") TUserJobApply record, @Param("example") TUserJobApplyExample example);

    int updateByPrimaryKeySelective(TUserJobApply record);

    int updateByPrimaryKey(TUserJobApply record);
}