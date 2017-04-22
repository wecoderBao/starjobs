package com.starjobs.mapper;

import com.starjobs.pojo.TLocation;
import com.starjobs.pojo.TLocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLocationMapper {
    int countByExample(TLocationExample example);

    int deleteByExample(TLocationExample example);

    int deleteByPrimaryKey(Integer cLocationId);

    int insert(TLocation record);

    int insertSelective(TLocation record);

    List<TLocation> selectByExample(TLocationExample example);

    TLocation selectByPrimaryKey(Integer cLocationId);

    int updateByExampleSelective(@Param("record") TLocation record, @Param("example") TLocationExample example);

    int updateByExample(@Param("record") TLocation record, @Param("example") TLocationExample example);

    int updateByPrimaryKeySelective(TLocation record);

    int updateByPrimaryKey(TLocation record);
    //插入一条位置信息，返回主键
    int insertSelectiveReId(TLocation record);
}