package com.water.entity;

import java.io.Serializable;

public class WaterInfo implements Serializable {
    private Integer id;

    private String name;

    private String price;

    private String specs;

    private String waterNum;

    private String addr;

    private String introction;

    private Integer businessId;

    private String salesVolume;

    private Double cost;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs == null ? null : specs.trim();
    }

    public String getWaterNum() {
        return waterNum;
    }

    public void setWaterNum(String waterNum) {
        this.waterNum = waterNum == null ? null : waterNum.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getIntroction() {
        return introction;
    }

    public void setIntroction(String introction) {
        this.introction = introction == null ? null : introction.trim();
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(String salesVolume) {
        this.salesVolume = salesVolume == null ? null : salesVolume.trim();
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}