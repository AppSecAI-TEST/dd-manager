package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TQuestion;
import com.atguigu.dd.manager.bean.TQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TQuestionMapper {
    long countByExample(TQuestionExample example);

    int deleteByExample(TQuestionExample example);

    int deleteByPrimaryKey(Integer questionId);

    int insert(TQuestion record);

    int insertSelective(TQuestion record);

    List<TQuestion> selectByExample(TQuestionExample example);

    TQuestion selectByPrimaryKey(Integer questionId);

    int updateByExampleSelective(@Param("record") TQuestion record, @Param("example") TQuestionExample example);

    int updateByExample(@Param("record") TQuestion record, @Param("example") TQuestionExample example);

    int updateByPrimaryKeySelective(TQuestion record);

    int updateByPrimaryKey(TQuestion record);
}