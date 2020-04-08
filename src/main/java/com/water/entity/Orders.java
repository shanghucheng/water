package com.water.entity;

import javax.persistence.*;

public class Orders {
    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "userId")
    private Integer userid;

    @Column(name = "addressid")
    private Integer addressid;

    /**
     * 商品数量
     */
    @Column(name = "totalNum")
    private String totalnum;

    /**
     * 商品总价
     */
    @Column(name = "totalPrice")
    private String totalprice;

    /**
     * 下单时间
     */
    @Column(name = "orderDate")
    private String orderdate;

    /**
     * 订单状态
1 支付完成
2 待支付
3 待收货
4 待付款

     */
    @Column(name = "orderState")
    private String orderstate;

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
     * 获取用户id
     *
     * @return userId - 用户id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置用户id
     *
     * @param userid 用户id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取商品数量
     *
     * @return totalNum - 商品数量
     */
    public String getTotalnum() {
        return totalnum;
    }

    /**
     * 设置商品数量
     *
     * @param totalnum 商品数量
     */
    public void setTotalnum(String totalnum) {
        this.totalnum = totalnum;
    }

    /**
     * 获取商品总价
     *
     * @return totalPrice - 商品总价
     */
    public String getTotalprice() {
        return totalprice;
    }

    /**
     * 设置商品总价
     *
     * @param totalprice 商品总价
     */
    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * 获取下单时间
     *
     * @return orderDate - 下单时间
     */
    public String getOrderdate() {
        return orderdate;
    }

    /**
     * 设置下单时间
     *
     * @param orderdate 下单时间
     */
    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    /**
     * 获取订单状态
1 支付完成
2 待支付
3 待收货
4 待付款

     *
     * @return orderState - 订单状态
1 支付完成
2 待支付
3 待收货
4 待付款

     */
    public String getOrderstate() {
        return orderstate;
    }

    /**
     * 设置订单状态
1 支付完成
2 待支付
3 待收货
4 待付款

     *
     * @param orderstate 订单状态
1 支付完成
2 待支付
3 待收货
4 待付款

     */
    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }
}