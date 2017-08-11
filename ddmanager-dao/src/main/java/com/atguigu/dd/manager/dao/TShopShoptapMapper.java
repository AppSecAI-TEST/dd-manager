package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TShopShoptap;
import com.atguigu.dd.manager.bean.TShopShoptapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TShopShoptapMapper {
    long countByExample(TShopShoptapExample example);

    int deleteByExample(TShopShoptapExample example);

    int insert(TShopShoptap record);

    int insertSelective(TShopShoptap record);

    List<TShopShoptap> selectByExample(TShopShoptapExample example);

    int updateByExampleSelective(@Param("record") TShopShoptap record, @Param("example") TShopShoptapExample example);

    int updateByExample(@Param("record") TShopShoptap record, @Param("example") TShopShoptapExample example);
}