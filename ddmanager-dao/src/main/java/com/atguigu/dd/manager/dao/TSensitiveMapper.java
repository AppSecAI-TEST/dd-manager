package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TSensitive;
import com.atguigu.dd.manager.bean.TSensitiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSensitiveMapper {
    long countByExample(TSensitiveExample example);

    int deleteByExample(TSensitiveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSensitive record);

    int insertSelective(TSensitive record);

    List<TSensitive> selectByExample(TSensitiveExample example);

    TSensitive selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSensitive record, @Param("example") TSensitiveExample example);

    int updateByExample(@Param("record") TSensitive record, @Param("example") TSensitiveExample example);

    int updateByPrimaryKeySelective(TSensitive record);

    int updateByPrimaryKey(TSensitive record);
}