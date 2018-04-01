package com.starjobs.mapper;

import com.starjobs.pojo.TGroup;
import com.starjobs.pojo.TGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGroupMapper {
    int countByExample(TGroupExample example);

    int deleteByExample(TGroupExample example);

    int deleteByPrimaryKey(Integer cGroupId);

    int insert(TGroup record);
    //插入获取主键
    int insertSelective(TGroup record);

    List<TGroup> selectByExample(TGroupExample example);

    //根据主键获取活的群
    TGroup selectByPrimaryKey(Integer cGroupId);

    int updateByExampleSelective(@Param("record") TGroup record, @Param("example") TGroupExample example);

    int updateByExample(@Param("record") TGroup record, @Param("example") TGroupExample example);

    int updateByPrimaryKeySelective(TGroup record);

    int updateByPrimaryKey(TGroup record);
    //根据jobId查询记录
    TGroup selectByJobId(@Param("jobId") String jobId);
    
}