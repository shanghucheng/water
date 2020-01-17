package com.water.entity;

import java.io.Serializable;

public class BuyCar implements Serializable {
    private Integer id;

    private Integer userId;

    private String imageurl;

    private String waterName;

    private String price;

    private String waterNum;

    private String total;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getWaterName() {
        return waterName;
    }

    public void setWaterName(String waterName) {
        this.waterName = waterName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWaterNum() {
        return waterNum;
    }

    public void setWaterNum(String waterNum) {
        this.waterNum = waterNum;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}