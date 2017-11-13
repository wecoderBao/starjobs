package com.starjobs.mapper;

import com.starjobs.pojo.TComScore;
import com.starjobs.pojo.TComScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TComScoreMapper {
    int countByExample(TComScoreExample example);

    int deleteByExample(TComScoreExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(TComScore record);

    int insertSelective(TComScore record);

    List<TComScore> selectByExample(TComScoreExample example);

    TComScore selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TComScore record, @Param("example") TComScoreExample example);

    int updateByExample(@Param("record") TComScore record, @Param("example") TComScoreExample example);

    int updateByPrimaryKeySelective(TComScore record);

    int updateByPrimaryKey(TComScore record);
}