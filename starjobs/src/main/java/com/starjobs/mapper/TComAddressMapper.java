package com.starjobs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.starjobs.pojo.TComAddress;
import com.starjobs.pojo.TComAddressExample;

public interface TComAddressMapper {
    int countByExample(TComAddressExample example);

    int deleteByExample(TComAddressExample example);

    int deleteByPrimaryKey(Integer cComAddressId);

    int insert(TComAddress record);

    int insertSelective(TComAddress record);

    List<TComAddress> selectByExampleWithBLOBs(TComAddressExample example);

    List<TComAddress> selectByExample(TComAddressExample example);

    TComAddress selectByPrimaryKey(Integer cComAddressId);

    int updateByExampleSelective(@Param("record") TComAddress record, @Param("example") TComAddressExample example);

    int updateByExampleWithBLOBs(@Param("record") TComAddress record, @Param("example") TComAddressExample example);

    int updateByExample(@Param("record") TComAddress record, @Param("example") TComAddressExample example);

    int updateByPrimaryKeySelective(TComAddress record);

    int updateByPrimaryKeyWithBLOBs(TComAddress record);

    int updateByPrimaryKey(TComAddress record);
  //插入一条地址信息，返回主键
    int insertSelectiveReId(TComAddress record);
}