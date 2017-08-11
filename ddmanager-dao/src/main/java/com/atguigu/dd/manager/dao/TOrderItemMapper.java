package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TOrderItem;
import com.atguigu.dd.manager.bean.TOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrderItemMapper {
    long countByExample(TOrderItemExample example);

    int deleteByExample(TOrderItemExample example);

    int insert(TOrderItem record);

    int insertSelective(TOrderItem record);

    List<TOrderItem> selectByExample(TOrderItemExample example);

    int updateByExampleSelective(@Param("record") TOrderItem record, @Param("example") TOrderItemExample example);

    int updateByExample(@Param("record") TOrderItem record, @Param("example") TOrderItemExample example);
}