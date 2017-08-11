package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TManagerRole;
import com.atguigu.dd.manager.bean.TManagerRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TManagerRoleMapper {
    long countByExample(TManagerRoleExample example);

    int deleteByExample(TManagerRoleExample example);

    int insert(TManagerRole record);

    int insertSelective(TManagerRole record);

    List<TManagerRole> selectByExample(TManagerRoleExample example);

    int updateByExampleSelective(@Param("record") TManagerRole record, @Param("example") TManagerRoleExample example);

    int updateByExample(@Param("record") TManagerRole record, @Param("example") TManagerRoleExample example);
}