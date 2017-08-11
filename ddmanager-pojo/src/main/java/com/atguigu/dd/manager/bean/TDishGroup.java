package com.atguigu.dd.manager.bean;

import java.math.BigDecimal;

public class TDishGroup {
    private Integer groupId;

    private Integer shopId;

    private String groupIntro;

    private BigDecimal groupPrice;

    private String groupPicture;

    private String groupEvaluate;

    private Integer personTatal;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getGroupIntro() {
        return groupIntro;
    }

    public void setGroupIntro(String groupIntro) {
        this.groupIntro = groupIntro == null ? null : groupIntro.trim();
    }

    public BigDecimal getGroupPrice() {
        return groupPrice;
    }

    public void setGroupPrice(BigDecimal groupPrice) {
        this.groupPrice = groupPrice;
    }

    public String getGroupPicture() {
        return groupPicture;
    }

    public void setGroupPicture(String groupPicture) {
        this.groupPicture = groupPicture == null ? null : groupPicture.trim();
    }

    public String getGroupEvaluate() {
        return groupEvaluate;
    }

    public void setGroupEvaluate(String groupEvaluate) {
        this.groupEvaluate = groupEvaluate == null ? null : groupEvaluate.trim();
    }

    public Integer getPersonTatal() {
        return personTatal;
    }

    public void setPersonTatal(Integer personTatal) {
        this.personTatal = personTatal;
    }
}