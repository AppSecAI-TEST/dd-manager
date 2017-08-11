package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TShopkeeper;
import com.atguigu.dd.manager.bean.TShopkeeperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TShopkeeperMapper {
    long countByExample(TShopkeeperExample example);

    int deleteByExample(TShopkeeperExample example);

    int insert(TShopkeeper record);

    int insertSelective(TShopkeeper record);

    List<TShopkeeper> selectByExample(TShopkeeperExample example);

    int updateByExampleSelective(@Param("record") TShopkeeper record, @Param("example") TShopkeeperExample example);

    int updateByExample(@Param("record") TShopkeeper record, @Param("example") TShopkeeperExample example);
}