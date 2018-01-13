package com.starjobs.mapper;

import com.starjobs.pojo.RefreshJob;
import com.starjobs.pojo.RefreshJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}