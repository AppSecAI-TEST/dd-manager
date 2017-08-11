package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TDishSingle;
import com.atguigu.dd.manager.bean.TDishSingleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDishSingleMapper {
    long countByExample(TDishSingleExample example);

    int deleteByExample(TDishSingleExample example);

    int deleteByPrimaryKey(Integer dishId);

    int insert(TDishSingle record);

    int insertSelective(TDishSingle record);

    List<TDishSingle> selectByExample(TDishSingleExample example);

    TDishSingle selectByPrimaryKey(Integer dishId);

    int updateByExampleSelective(@Param("record") TDishSingle record, @Param("example") TDishSingleExample example);

    int updateByExample(@Param("record") TDishSingle record, @Param("example") TDishSingleExample example);

    int updateByPrimaryKeySelective(TDishSingle record);

    int updateByPrimaryKey(TDishSingle record);
}