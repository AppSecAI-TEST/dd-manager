package com.atguigu.dd.manager.bean;

import java.math.BigDecimal;

public class TOrderItem {
    private Integer orderId;

    private BigDecimal dishPrice;

    private Integer dishCount;

    private Long dishTotal;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(BigDecimal dishPrice) {
        this.dishPrice = dishPrice;
    }

    public Integer getDishCount() {
        return dishCount;
    }

    public void setDishCount(Integer dishCount) {
        this.dishCount = dishCount;
    }

    public Long getDishTotal() {
        return dishTotal;
    }

    public void setDishTotal(Long dishTotal) {
        this.dishTotal = dishTotal;
    }
}