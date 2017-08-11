package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TConsumeMessage;
import com.atguigu.dd.manager.bean.TConsumeMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TConsumeMessageMapper {
    long countByExample(TConsumeMessageExample example);

    int deleteByExample(TConsumeMessageExample example);

    int insert(TConsumeMessage record);

    int insertSelective(TConsumeMessage record);

    List<TConsumeMessage> selectByExample(TConsumeMessageExample example);

    int updateByExampleSelective(@Param("record") TConsumeMessage record, @Param("example") TConsumeMessageExample example);

    int updateByExample(@Param("record") TConsumeMessage record, @Param("example") TConsumeMessageExample example);
}