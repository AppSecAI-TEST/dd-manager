package com.atguigu.dd.manager.bean;

import java.math.BigDecimal;

public class TDishSingle {
    private Integer dishId;

    private Integer shopId;

    private String dishName;

    private String dishIntro;

    private BigDecimal dishPrice;

    private String dishPicture;

    private String dishEvaluate;

    private Integer thumbAccount;

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName == null ? null : dishName.trim();
    }

    public String getDishIntro() {
        return dishIntro;
    }

    public void setDishIntro(String dishIntro) {
        this.dishIntro = dishIntro == null ? null : dishIntro.trim();
    }

    public BigDecimal getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(BigDecimal dishPrice) {
        this.dishPrice = dishPrice;
    }

    public String getDishPicture() {
        return dishPicture;
    }

    public void setDishPicture(String dishPicture) {
        this.dishPicture = dishPicture == null ? null : dishPicture.trim();
    }

    public String getDishEvaluate() {
        return dishEvaluate;
    }

    public void setDishEvaluate(String dishEvaluate) {
        this.dishEvaluate = dishEvaluate == null ? null : dishEvaluate.trim();
    }

    public Integer getThumbAccount() {
        return thumbAccount;
    }

    public void setThumbAccount(Integer thumbAccount) {
        this.thumbAccount = thumbAccount;
    }
}