package com.wf.shardingjdbcdemo.dao;

import com.wf.shardingjdbcdemo.domain.CourseA;
import com.wf.shardingjdbcdemo.domain.CourseAExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseAMapper {
    long countByExample(CourseAExample example);

    int deleteByExample(CourseAExample example);

    int deleteByPrimaryKey(Long cid);

    int insert(CourseA record);

    int insertSelective(CourseA record);

    List<CourseA> selectByExample(CourseAExample example);

    CourseA selectByPrimaryKey(Long cid);

    int updateByExampleSelective(@Param("record") CourseA record, @Param("example") CourseAExample example);

    int updateByExample(@Param("record") CourseA record, @Param("example") CourseAExample example);

    int updateByPrimaryKeySelective(CourseA record);

    int updateByPrimaryKey(CourseA record);
}