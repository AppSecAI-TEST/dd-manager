package com.atguigu.dd.manager.bean;

public class TGroupStatus {
    private Integer groupId;

    private Integer groupTatal;

    private Integer groupNum;

    private String userId;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getGroupTatal() {
        return groupTatal;
    }

    public void setGroupTatal(Integer groupTatal) {
        this.groupTatal = groupTatal;
    }

    public Integer getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(Integer groupNum) {
        this.groupNum = groupNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}