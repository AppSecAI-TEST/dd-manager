package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TGroupStatus;
import com.atguigu.dd.manager.bean.TGroupStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGroupStatusMapper {
    long countByExample(TGroupStatusExample example);

    int deleteByExample(TGroupStatusExample example);

    int insert(TGroupStatus record);

    int insertSelective(TGroupStatus record);

    List<TGroupStatus> selectByExample(TGroupStatusExample example);

    int updateByExampleSelective(@Param("record") TGroupStatus record, @Param("example") TGroupStatusExample example);

    int updateByExample(@Param("record") TGroupStatus record, @Param("example") TGroupStatusExample example);
}