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

	//返回主键
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

	// 更据查询条件查询兼职信息
	List<TJobInfo> selectByUser(@Param("jobState")String jobState,@Param("city") String city, @Param("area") List<String> area, @Param("typeId") List<Integer> typeId,
			@Param("choiceId") List<Integer> choiceId, @Param("start") Integer start, @Param("offset") Integer offset);
	//更新用户查看次数
	int updateUserLike(@Param("id") Integer id,@Param("cUserLike") Integer cUserLike);
	
	//根据公司id查询兼职列表
	List<TJobInfo> selectByComId(@Param("comId") Integer comId);
}