package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TShoptap;
import com.atguigu.dd.manager.bean.TShoptapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TShoptapMapper {
    long countByExample(TShoptapExample example);

    int deleteByExample(TShoptapExample example);

    int deleteByPrimaryKey(Integer tapId);

    int insert(TShoptap record);

    int insertSelective(TShoptap record);

    List<TShoptap> selectByExample(TShoptapExample example);

    TShoptap selectByPrimaryKey(Integer tapId);

    int updateByExampleSelective(@Param("record") TShoptap record, @Param("example") TShoptapExample example);

    int updateByExample(@Param("record") TShoptap record, @Param("example") TShoptapExample example);

    int updateByPrimaryKeySelective(TShoptap record);

    int updateByPrimaryKey(TShoptap record);
}