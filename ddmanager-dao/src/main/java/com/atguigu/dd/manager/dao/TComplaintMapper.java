package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TComplaint;
import com.atguigu.dd.manager.bean.TComplaintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TComplaintMapper {
    long countByExample(TComplaintExample example);

    int deleteByExample(TComplaintExample example);

    int insert(TComplaint record);

    int insertSelective(TComplaint record);

    List<TComplaint> selectByExample(TComplaintExample example);

    int updateByExampleSelective(@Param("record") TComplaint record, @Param("example") TComplaintExample example);

    int updateByExample(@Param("record") TComplaint record, @Param("example") TComplaintExample example);
}