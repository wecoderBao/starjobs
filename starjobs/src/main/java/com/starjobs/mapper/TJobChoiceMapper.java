package com.starjobs.mapper;

import com.starjobs.pojo.TJobChoice;
import com.starjobs.pojo.TJobChoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TJobChoiceMapper {
    int countByExample(TJobChoiceExample example);

    int deleteByExample(TJobChoiceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TJobChoice record);

    int insertSelective(TJobChoice record);

    List<TJobChoice> selectByExample(TJobChoiceExample example);

    TJobChoice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TJobChoice record, @Param("example") TJobChoiceExample example);

    int updateByExample(@Param("record") TJobChoice record, @Param("example") TJobChoiceExample example);

    int updateByPrimaryKeySelective(TJobChoice record);

    int updateByPrimaryKey(TJobChoice record);
}