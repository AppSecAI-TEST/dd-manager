package com.atguigu.dd.manager.bean;

public class TShoptap {
    private Integer tapId;

    private String tapName;

    public Integer getTapId() {
        return tapId;
    }

    public void setTapId(Integer tapId) {
        this.tapId = tapId;
    }

    public String getTapName() {
        return tapName;
    }

    public void setTapName(String tapName) {
        this.tapName = tapName == null ? null : tapName.trim();
    }
}