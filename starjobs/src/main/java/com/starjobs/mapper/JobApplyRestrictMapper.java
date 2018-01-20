package com.starjobs.mapper;

import com.starjobs.pojo.JobApplyRestrict;
import com.starjobs.pojo.JobApplyRestrictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobApplyRestrictMapper {
    int countByExample(JobApplyRestrictExample example);

    int deleteByExample(JobApplyRestrictExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobApplyRestrict record);

    int insertSelective(JobApplyRestrict record);

    List<JobApplyRestrict> selectByExample(JobApplyRestrictExample example);

    JobApplyRestrict selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobApplyRestrict record, @Param("example") JobApplyRestrictExample example);

    int updateByExample(@Param("record") JobApplyRestrict record, @Param("example") JobApplyRestrictExample example);

    int updateByPrimaryKeySelective(JobApplyRestrict record);

    int updateByPrimaryKey(JobApplyRestrict record);
}