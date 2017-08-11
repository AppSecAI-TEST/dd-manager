package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TUsertap;
import com.atguigu.dd.manager.bean.TUsertapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUsertapMapper {
    long countByExample(TUsertapExample example);

    int deleteByExample(TUsertapExample example);

    int deleteByPrimaryKey(Integer tapId);

    int insert(TUsertap record);

    int insertSelective(TUsertap record);

    List<TUsertap> selectByExample(TUsertapExample example);

    TUsertap selectByPrimaryKey(Integer tapId);

    int updateByExampleSelective(@Param("record") TUsertap record, @Param("example") TUsertapExample example);

    int updateByExample(@Param("record") TUsertap record, @Param("example") TUsertapExample example);

    int updateByPrimaryKeySelective(TUsertap record);

    int updateByPrimaryKey(TUsertap record);
}