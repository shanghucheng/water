package com.water.entity;

import javax.persistence.*;

public class RiderOrder {
    @Id
    private Integer id;

    @Column(name = "riderId")
    private Integer riderid;

    @Column(name = "orderId")
    private Integer orderid;

    @Column(name = "orderTime")
    private String ordertime;

    public String getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime;
    }

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
     * @return riderId
     */
    public Integer getRiderid() {
        return riderid;
    }

    /**
     * @param riderid
     */
    public void setRiderid(Integer riderid) {
        this.riderid = riderid;
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
}