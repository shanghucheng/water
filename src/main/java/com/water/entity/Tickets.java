package com.water.entity;

import java.io.Serializable;

public class Tickets implements Serializable {
    private Integer id;

    private Integer userId;

    private String ticketNum;

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

    public String getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(String ticketNum) {
        this.ticketNum = ticketNum == null ? null : ticketNum.trim();
    }
}