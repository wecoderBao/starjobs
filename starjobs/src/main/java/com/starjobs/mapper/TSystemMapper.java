package com.starjobs.mapper;

import com.starjobs.pojo.TSystem;
import com.starjobs.pojo.TSystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSystemMapper {
    int countByExample(TSystemExample example);

    int deleteByExample(TSystemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSystem record);

    int insertSelective(TSystem record);

    List<TSystem> selectByExample(TSystemExample example);

    TSystem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSystem record, @Param("example") TSystemExample example);

    int updateByExample(@Param("record") TSystem record, @Param("example") TSystemExample example);

    int updateByPrimaryKeySelective(TSystem record);

    int updateByPrimaryKey(TSystem record);
}