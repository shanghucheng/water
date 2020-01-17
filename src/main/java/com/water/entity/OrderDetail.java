package com.water.entity;

import java.io.Serializable;

public class OrderDetail implements Serializable {
    private Integer id;

    private Integer orderId;

    private Integer addressId;

    private Integer waterId;

    private String waterSpecs;

    private String waterNum;

    private String waterPrice;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getWaterId() {
        return waterId;
    }

    public void setWaterId(Integer waterId) {
        this.waterId = waterId;
    }

    public String getWaterSpecs() {
        return waterSpecs;
    }

    public void setWaterSpecs(String waterSpecs) {
        this.waterSpecs = waterSpecs == null ? null : waterSpecs.trim();
    }

    public String getWaterNum() {
        return waterNum;
    }

    public void setWaterNum(String waterNum) {
        this.waterNum = waterNum == null ? null : waterNum.trim();
    }

    public String getWaterPrice() {
        return waterPrice;
    }

    public void setWaterPrice(String waterPrice) {
        this.waterPrice = waterPrice == null ? null : waterPrice.trim();
    }
}