package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TManager;
import com.atguigu.dd.manager.bean.TManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TManagerMapper {
    long countByExample(TManagerExample example);

    int deleteByExample(TManagerExample example);

    int deleteByPrimaryKey(Integer managerId);

    int insert(TManager record);

    int insertSelective(TManager record);

    List<TManager> selectByExample(TManagerExample example);

    TManager selectByPrimaryKey(Integer managerId);

    int updateByExampleSelective(@Param("record") TManager record, @Param("example") TManagerExample example);

    int updateByExample(@Param("record") TManager record, @Param("example") TManagerExample example);

    int updateByPrimaryKeySelective(TManager record);

    int updateByPrimaryKey(TManager record);
}