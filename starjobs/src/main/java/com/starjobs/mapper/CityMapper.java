package com.starjobs.mapper;

import com.starjobs.pojo.City;
import com.starjobs.pojo.CityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityMapper {
    int countByExample(CityExample example);

    int deleteByExample(CityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    City selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
    //根据行政级别level查询城市
    List<City> selectByLevel(@Param("level") int level);
    //根据城市代码获取对应id
    int selectIdByCode(@Param("parentCode") String parentCode);
    //根据父级id获取下属一级的城市
    List<City> selectByParentId(@Param("parentId") int parentId);
}