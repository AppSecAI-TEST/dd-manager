package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TAvertisement;
import com.atguigu.dd.manager.bean.TAvertisementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAvertisementMapper {
    long countByExample(TAvertisementExample example);

    int deleteByExample(TAvertisementExample example);

    int deleteByPrimaryKey(Integer adId);

    int insert(TAvertisement record);

    int insertSelective(TAvertisement record);

    List<TAvertisement> selectByExample(TAvertisementExample example);

    TAvertisement selectByPrimaryKey(Integer adId);

    int updateByExampleSelective(@Param("record") TAvertisement record, @Param("example") TAvertisementExample example);

    int updateByExample(@Param("record") TAvertisement record, @Param("example") TAvertisementExample example);

    int updateByPrimaryKeySelective(TAvertisement record);

    int updateByPrimaryKey(TAvertisement record);
}