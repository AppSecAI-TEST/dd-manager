package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TUserUsertap;
import com.atguigu.dd.manager.bean.TUserUsertapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserUsertapMapper {
    long countByExample(TUserUsertapExample example);

    int deleteByExample(TUserUsertapExample example);

    int insert(TUserUsertap record);

    int insertSelective(TUserUsertap record);

    List<TUserUsertap> selectByExample(TUserUsertapExample example);

    int updateByExampleSelective(@Param("record") TUserUsertap record, @Param("example") TUserUsertapExample example);

    int updateByExample(@Param("record") TUserUsertap record, @Param("example") TUserUsertapExample example);
}