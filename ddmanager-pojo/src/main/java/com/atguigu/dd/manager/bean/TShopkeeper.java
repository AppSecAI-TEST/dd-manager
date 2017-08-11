package com.atguigu.dd.manager.bean;

public class TShopkeeper {
    private Integer shopId;

    private String shopkeeperId;

    private String corporationCardid;

    private String shopkeeperName;

    private String shopkeeperPhone;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopkeeperId() {
        return shopkeeperId;
    }

    public void setShopkeeperId(String shopkeeperId) {
        this.shopkeeperId = shopkeeperId == null ? null : shopkeeperId.trim();
    }

    public String getCorporationCardid() {
        return corporationCardid;
    }

    public void setCorporationCardid(String corporationCardid) {
        this.corporationCardid = corporationCardid == null ? null : corporationCardid.trim();
    }

    public String getShopkeeperName() {
        return shopkeeperName;
    }

    public void setShopkeeperName(String shopkeeperName) {
        this.shopkeeperName = shopkeeperName == null ? null : shopkeeperName.trim();
    }

    public String getShopkeeperPhone() {
        return shopkeeperPhone;
    }

    public void setShopkeeperPhone(String shopkeeperPhone) {
        this.shopkeeperPhone = shopkeeperPhone == null ? null : shopkeeperPhone.trim();
    }
}