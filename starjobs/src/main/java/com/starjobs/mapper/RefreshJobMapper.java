package com.starjobs.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.starjobs.pojo.RefreshJob;
import com.starjobs.pojo.RefreshJobExample;

public interface RefreshJobMapper {
    int countByExample(RefreshJobExample example);

    int deleteByExample(RefreshJobExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RefreshJob record);

    int insertSelective(RefreshJob record);

    List<RefreshJob> selectByExample(RefreshJobExample example);

    RefreshJob selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RefreshJob record, @Param("example") RefreshJobExample example);

    int updateByExample(@Param("record") RefreshJob record, @Param("example") RefreshJobExample example);

    int updateByPrimaryKeySelective(RefreshJob record);

    int updateByPrimaryKey(RefreshJob record);
    
    int queryRefreshTotal(Map<String,Object> map);
    
    List<RefreshJob> queryRefreshList(Map<String,Object> map);
}