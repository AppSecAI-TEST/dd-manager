package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TConcernShop;
import com.atguigu.dd.manager.bean.TConcernShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TConcernShopMapper {
    long countByExample(TConcernShopExample example);

    int deleteByExample(TConcernShopExample example);

    int insert(TConcernShop record);

    int insertSelective(TConcernShop record);

    List<TConcernShop> selectByExample(TConcernShopExample example);

    int updateByExampleSelective(@Param("record") TConcernShop record, @Param("example") TConcernShopExample example);

    int updateByExample(@Param("record") TConcernShop record, @Param("example") TConcernShopExample example);
}