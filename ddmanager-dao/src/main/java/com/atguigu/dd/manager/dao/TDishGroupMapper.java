package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TDishGroup;
import com.atguigu.dd.manager.bean.TDishGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDishGroupMapper {
    long countByExample(TDishGroupExample example);

    int deleteByExample(TDishGroupExample example);

    int deleteByPrimaryKey(Integer groupId);

    int insert(TDishGroup record);

    int insertSelective(TDishGroup record);

    List<TDishGroup> selectByExample(TDishGroupExample example);

    TDishGroup selectByPrimaryKey(Integer groupId);

    int updateByExampleSelective(@Param("record") TDishGroup record, @Param("example") TDishGroupExample example);

    int updateByExample(@Param("record") TDishGroup record, @Param("example") TDishGroupExample example);

    int updateByPrimaryKeySelective(TDishGroup record);

    int updateByPrimaryKey(TDishGroup record);
}