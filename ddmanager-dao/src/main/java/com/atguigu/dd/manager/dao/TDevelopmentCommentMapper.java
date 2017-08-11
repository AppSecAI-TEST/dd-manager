package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TDevelopmentComment;
import com.atguigu.dd.manager.bean.TDevelopmentCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDevelopmentCommentMapper {
    long countByExample(TDevelopmentCommentExample example);

    int deleteByExample(TDevelopmentCommentExample example);

    int insert(TDevelopmentComment record);

    int insertSelective(TDevelopmentComment record);

    List<TDevelopmentComment> selectByExample(TDevelopmentCommentExample example);

    int updateByExampleSelective(@Param("record") TDevelopmentComment record, @Param("example") TDevelopmentCommentExample example);

    int updateByExample(@Param("record") TDevelopmentComment record, @Param("example") TDevelopmentCommentExample example);
}