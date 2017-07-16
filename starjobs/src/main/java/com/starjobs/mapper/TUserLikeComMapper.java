package com.starjobs.mapper;

import com.starjobs.pojo.TUserLikeCom;
import com.starjobs.pojo.TUserLikeComExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserLikeComMapper {
    int countByExample(TUserLikeComExample example);

    int deleteByExample(TUserLikeComExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUserLikeCom record);

    int insertSelective(TUserLikeCom record);

    List<TUserLikeCom> selectByExample(TUserLikeComExample example);

    TUserLikeCom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUserLikeCom record, @Param("example") TUserLikeComExample example);

    int updateByExample(@Param("record") TUserLikeCom record, @Param("example") TUserLikeComExample example);

    int updateByPrimaryKeySelective(TUserLikeCom record);

    int updateByPrimaryKey(TUserLikeCom record);
}