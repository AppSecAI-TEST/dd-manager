package com.atguigu.dd.manager.bean;

import java.util.Date;

public class TAvertisement {
    private Integer adId;

    private Integer shopId;

    private String adInfo;

    private String adPicture;

    private Date adData;

    private Integer adStatus;

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getAdInfo() {
        return adInfo;
    }

    public void setAdInfo(String adInfo) {
        this.adInfo = adInfo == null ? null : adInfo.trim();
    }

    public String getAdPicture() {
        return adPicture;
    }

    public void setAdPicture(String adPicture) {
        this.adPicture = adPicture == null ? null : adPicture.trim();
    }

    public Date getAdData() {
        return adData;
    }

    public void setAdData(Date adData) {
        this.adData = adData;
    }

    public Integer getAdStatus() {
        return adStatus;
    }

    public void setAdStatus(Integer adStatus) {
        this.adStatus = adStatus;
    }
}