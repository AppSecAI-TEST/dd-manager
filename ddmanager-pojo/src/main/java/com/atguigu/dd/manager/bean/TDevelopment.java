package com.atguigu.dd.manager.bean;

import java.util.Date;

public class TDevelopment {
    private Integer developmentId;

    private Integer userId;

    private String developmentMessage;

    private Date developmentsDate;

    private Integer isvideo;

    private String videoAdd;

    private Integer developmentStatus;

    public Integer getDevelopmentId() {
        return developmentId;
    }

    public void setDevelopmentId(Integer developmentId) {
        this.developmentId = developmentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDevelopmentMessage() {
        return developmentMessage;
    }

    public void setDevelopmentMessage(String developmentMessage) {
        this.developmentMessage = developmentMessage == null ? null : developmentMessage.trim();
    }

    public Date getDevelopmentsDate() {
        return developmentsDate;
    }

    public void setDevelopmentsDate(Date developmentsDate) {
        this.developmentsDate = developmentsDate;
    }

    public Integer getIsvideo() {
        return isvideo;
    }

    public void setIsvideo(Integer isvideo) {
        this.isvideo = isvideo;
    }

    public String getVideoAdd() {
        return videoAdd;
    }

    public void setVideoAdd(String videoAdd) {
        this.videoAdd = videoAdd == null ? null : videoAdd.trim();
    }

    public Integer getDevelopmentStatus() {
        return developmentStatus;
    }

    public void setDevelopmentStatus(Integer developmentStatus) {
        this.developmentStatus = developmentStatus;
    }
}