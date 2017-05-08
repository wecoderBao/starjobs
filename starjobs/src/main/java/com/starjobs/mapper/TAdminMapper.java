package com.starjobs.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.starjobs.pojo.TAdmin;
import com.starjobs.pojo.TAdminExample;

public interface TAdminMapper {
    int countByExample(TAdminExample example);

    int deleteByExample(TAdminExample example);

    int deleteByPrimaryKey(Integer cAdminId);

    int insert(TAdmin record);

    int insertSelective(TAdmin record);

    List<TAdmin> selectByExample(TAdminExample example);

    TAdmin selectByPrimaryKey(Integer cAdminId);

    int updateByExampleSelective(@Param("record") TAdmin record, @Param("example") TAdminExample example);

    int updateByExample(@Param("record") TAdmin record, @Param("example") TAdminExample example);

    int updateByPrimaryKeySelective(TAdmin record);

    int updateByPrimaryKey(TAdmin record);
    
  //根据用户名进行查找
  	public TAdmin findUserByName(@Param("cAdminName") String cAdminName);
  	
  	//全部查出
  	
  	public List<TAdmin> selectAll();
}