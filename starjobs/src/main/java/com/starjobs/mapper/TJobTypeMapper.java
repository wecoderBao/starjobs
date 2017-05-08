package com.starjobs.mapper;

import com.starjobs.pojo.TJobType;
import com.starjobs.pojo.TJobTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TJobTypeMapper {
    int countByExample(TJobTypeExample example);

    int deleteByExample(TJobTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TJobType record);

    int insertSelective(TJobType record);

    List<TJobType> selectByExample(TJobTypeExample example);

    TJobType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TJobType record, @Param("example") TJobTypeExample example);

    int updateByExample(@Param("record") TJobType record, @Param("example") TJobTypeExample example);

    int updateByPrimaryKeySelective(TJobType record);

    int updateByPrimaryKey(TJobType record);
    //获取所有兼职类型信息
    List<TJobType> selectAllType();
}