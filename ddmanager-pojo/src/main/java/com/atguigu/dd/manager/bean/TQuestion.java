package com.atguigu.dd.manager.bean;

public class TQuestion {
    private Integer questionId;

    private String questionInfo;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestionInfo() {
        return questionInfo;
    }

    public void setQuestionInfo(String questionInfo) {
        this.questionInfo = questionInfo == null ? null : questionInfo.trim();
    }
}