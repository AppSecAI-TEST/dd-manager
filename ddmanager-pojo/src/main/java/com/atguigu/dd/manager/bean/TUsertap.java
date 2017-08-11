package com.atguigu.dd.manager.bean;

public class TUsertap {
    private Integer tapId;

    private String userTap;

    private Integer tapType;

    public Integer getTapId() {
        return tapId;
    }

    public void setTapId(Integer tapId) {
        this.tapId = tapId;
    }

    public String getUserTap() {
        return userTap;
    }

    public void setUserTap(String userTap) {
        this.userTap = userTap == null ? null : userTap.trim();
    }

    public Integer getTapType() {
        return tapType;
    }

    public void setTapType(Integer tapType) {
        this.tapType = tapType;
    }
}