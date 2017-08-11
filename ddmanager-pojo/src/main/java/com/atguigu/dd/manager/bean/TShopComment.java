package com.atguigu.dd.manager.bean;

import java.util.Date;

public class TShopComment {
    private Integer commentId;

    private Integer userId;

    private Integer shopId;

    private Integer dishId;

    private String commentInfo;

    private Date commentData;

    private Integer thumbStatus;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public String getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(String commentInfo) {
        this.commentInfo = commentInfo == null ? null : commentInfo.trim();
    }

    public Date getCommentData() {
        return commentData;
    }

    public void setCommentData(Date commentData) {
        this.commentData = commentData;
    }

    public Integer getThumbStatus() {
        return thumbStatus;
    }

    public void setThumbStatus(Integer thumbStatus) {
        this.thumbStatus = thumbStatus;
    }
}