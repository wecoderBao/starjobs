package com.starjobs.mapper;

import com.starjobs.pojo.TJobInfo;
import com.starjobs.pojo.TJobInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TJobInfoMapper {
    int countByExample(TJobInfoExample example);

    int deleteByExample(TJobInfoExample example);

    int deleteByPrimaryKey(Integer cJobId);

    int insert(TJobInfo record);

    int insertSelective(TJobInfo record);

    List<TJobInfo> selectByExampleWithBLOBs(TJobInfoExample example);

    List<TJobInfo> selectByExample(TJobInfoExample example);

    TJobInfo selectByPrimaryKey(Integer cJobId);

    int updateByExampleSelective(@Param("record") TJobInfo record, @Param("example") TJobInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TJobInfo record, @Param("example") TJobInfoExample example);

    int updateByExample(@Param("record") TJobInfo record, @Param("example") TJobInfoExample example);

    int updateByPrimaryKeySelective(TJobInfo record);

    int updateByPrimaryKeyWithBLOBs(TJobInfo record);

    int updateByPrimaryKey(TJobInfo record);
}