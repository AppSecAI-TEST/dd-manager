package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TUserQuestion;
import com.atguigu.dd.manager.bean.TUserQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserQuestionMapper {
    long countByExample(TUserQuestionExample example);

    int deleteByExample(TUserQuestionExample example);

    int insert(TUserQuestion record);

    int insertSelective(TUserQuestion record);

    List<TUserQuestion> selectByExample(TUserQuestionExample example);

    int updateByExampleSelective(@Param("record") TUserQuestion record, @Param("example") TUserQuestionExample example);

    int updateByExample(@Param("record") TUserQuestion record, @Param("example") TUserQuestionExample example);
}