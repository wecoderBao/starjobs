package com.starjobs.mapper;

import com.starjobs.pojo.TCompanyInfo;
import com.starjobs.pojo.TCompanyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCompanyInfoMapper {
    int countByExample(TCompanyInfoExample example);

    int deleteByExample(TCompanyInfoExample example);

    int deleteByPrimaryKey(Integer cComId);

    int insert(TCompanyInfo record);

    int insertSelective(TCompanyInfo record);

    List<TCompanyInfo> selectByExampleWithBLOBs(TCompanyInfoExample example);

    List<TCompanyInfo> selectByExample(TCompanyInfoExample example);

    TCompanyInfo selectByPrimaryKey(Integer cComId);

    int updateByExampleSelective(@Param("record") TCompanyInfo record, @Param("example") TCompanyInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TCompanyInfo record, @Param("example") TCompanyInfoExample example);

    int updateByExample(@Param("record") TCompanyInfo record, @Param("example") TCompanyInfoExample example);

    int updateByPrimaryKeySelective(TCompanyInfo record);

    int updateByPrimaryKeyWithBLOBs(TCompanyInfo record);

    int updateByPrimaryKey(TCompanyInfo record);
}