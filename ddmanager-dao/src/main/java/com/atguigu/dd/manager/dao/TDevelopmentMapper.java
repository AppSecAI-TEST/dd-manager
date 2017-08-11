package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TDevelopment;
import com.atguigu.dd.manager.bean.TDevelopmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDevelopmentMapper {
    long countByExample(TDevelopmentExample example);

    int deleteByExample(TDevelopmentExample example);

    int deleteByPrimaryKey(Integer developmentId);

    int insert(TDevelopment record);

    int insertSelective(TDevelopment record);

    List<TDevelopment> selectByExample(TDevelopmentExample example);

    TDevelopment selectByPrimaryKey(Integer developmentId);

    int updateByExampleSelective(@Param("record") TDevelopment record, @Param("example") TDevelopmentExample example);

    int updateByExample(@Param("record") TDevelopment record, @Param("example") TDevelopmentExample example);

    int updateByPrimaryKeySelective(TDevelopment record);

    int updateByPrimaryKey(TDevelopment record);
}