package com.atguigu.dd.manager.dao;

import com.atguigu.dd.manager.bean.TShopComment;
import com.atguigu.dd.manager.bean.TShopCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TShopCommentMapper {
    long countByExample(TShopCommentExample example);

    int deleteByExample(TShopCommentExample example);

    int deleteByPrimaryKey(Integer commentId);

    int insert(TShopComment record);

    int insertSelective(TShopComment record);

    List<TShopComment> selectByExample(TShopCommentExample example);

    TShopComment selectByPrimaryKey(Integer commentId);

    int updateByExampleSelective(@Param("record") TShopComment record, @Param("example") TShopCommentExample example);

    int updateByExample(@Param("record") TShopComment record, @Param("example") TShopCommentExample example);

    int updateByPrimaryKeySelective(TShopComment record);

    int updateByPrimaryKey(TShopComment record);
}