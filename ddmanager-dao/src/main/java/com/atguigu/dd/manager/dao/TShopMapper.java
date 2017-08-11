package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TShop;
import com.atguigu.dd.manager.bean.TShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TShopMapper {
    long countByExample(TShopExample example);

    int deleteByExample(TShopExample example);

    int deleteByPrimaryKey(Integer shopId);

    int insert(TShop record);

    int insertSelective(TShop record);

    List<TShop> selectByExample(TShopExample example);

    TShop selectByPrimaryKey(Integer shopId);

    int updateByExampleSelective(@Param("record") TShop record, @Param("example") TShopExample example);

    int updateByExample(@Param("record") TShop record, @Param("example") TShopExample example);

    int updateByPrimaryKeySelective(TShop record);

    int updateByPrimaryKey(TShop record);
}