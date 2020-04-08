package com.water.entity;

import javax.persistence.*;

public class Ordersdetail {
    @Id
    private Integer id;

    @Column(name = "orderId")
    private Integer orderid;

    /**
     * 商品id
     */
    @Column(name = "waterId")
    private Integer waterid;

    /**
     * 商品数量
     */
    @Column(name = "goodsNum")
    private String goodsnum;

    /**
     * 商品价钱
     */
    @Column(name = "goodsPrice")
    private String goodsprice;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return orderId
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * @param orderid
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    /**
     * 获取商品id
     *
     * @return waterId - 商品id
     */
    public Integer getWaterid() {
        return waterid;
    }

    /**
     * 设置商品id
     *
     * @param waterid 商品id
     */
    public void setWaterid(Integer waterid) {
        this.waterid = waterid;
    }

    /**
     * 获取商品数量
     *
     * @return goodsNum - 商品数量
     */
    public String getGoodsnum() {
        return goodsnum;
    }

    /**
     * 设置商品数量
     *
     * @param goodsnum 商品数量
     */
    public void setGoodsnum(String goodsnum) {
        this.goodsnum = goodsnum;
    }

    /**
     * 获取商品价钱
     *
     * @return goodsPrice - 商品价钱
     */
    public String getGoodsprice() {
        return goodsprice;
    }

    /**
     * 设置商品价钱
     *
     * @param goodsprice 商品价钱
     */
    public void setGoodsprice(String goodsprice) {
        this.goodsprice = goodsprice;
    }
}