package com.water.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class WaterInfo {
    /**
     * 编号
     */
    @Id
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 图片
     */
    private String url;

    /**
     * 规格
     */
    private String specs;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 库存
     */
    private String stock;

    /**
     * 销量
     */
    @Column(name = "salesVolume")
    private String salesvolume;

    /**
     * 上新时间
     */
    @Column(name = "onLineDate")
    private Date onlinedate;

    /**
     * 分享次数
     */
    @Column(name = "shareNum")
    private String sharenum;

    /**
     * 水的种类
     */
    @Column(name = "waterType")
    private String watertype;

    /**
     * 描述
     */
    private String describe;

    /**
     * 状态 1 下架 0正常
     */
    private String state;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取图片
     *
     * @return url - 图片
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置图片
     *
     * @param url 图片
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取规格
     *
     * @return specs - 规格
     */
    public String getSpecs() {
        return specs;
    }

    /**
     * 设置规格
     *
     * @param specs 规格
     */
    public void setSpecs(String specs) {
        this.specs = specs;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取折扣
     *
     * @return discount - 折扣
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * 设置折扣
     *
     * @param discount 折扣
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * 获取库存
     *
     * @return stock - 库存
     */
    public String getStock() {
        return stock;
    }

    /**
     * 设置库存
     *
     * @param stock 库存
     */
    public void setStock(String stock) {
        this.stock = stock;
    }

    /**
     * 获取销量
     *
     * @return salesVolume - 销量
     */
    public String getSalesvolume() {
        return salesvolume;
    }

    /**
     * 设置销量
     *
     * @param salesvolume 销量
     */
    public void setSalesvolume(String salesvolume) {
        this.salesvolume = salesvolume;
    }

    /**
     * 获取上新时间
     *
     * @return onLineDate - 上新时间
     */
    public Date getOnlinedate() {
        return onlinedate;
    }

    /**
     * 设置上新时间
     *
     * @param onlinedate 上新时间
     */
    public void setOnlinedate(Date onlinedate) {
        this.onlinedate = onlinedate;
    }

    /**
     * 获取分享次数
     *
     * @return shareNum - 分享次数
     */
    public String getSharenum() {
        return sharenum;
    }

    /**
     * 设置分享次数
     *
     * @param sharenum 分享次数
     */
    public void setSharenum(String sharenum) {
        this.sharenum = sharenum;
    }

    /**
     * 获取水的种类
     *
     * @return waterType - 水的种类
     */
    public String getWatertype() {
        return watertype;
    }

    /**
     * 设置水的种类
     *
     * @param watertype 水的种类
     */
    public void setWatertype(String watertype) {
        this.watertype = watertype;
    }

    /**
     * 获取描述
     *
     * @return describe - 描述
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 设置描述
     *
     * @param describe 描述
     */
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    /**
     * 获取状态 1 下架 0正常
     *
     * @return state - 状态 1 下架 0正常
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态 1 下架 0正常
     *
     * @param state 状态 1 下架 0正常
     */
    public void setState(String state) {
        this.state = state;
    }
}