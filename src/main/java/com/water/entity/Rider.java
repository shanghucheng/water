package com.water.entity;

import javax.persistence.*;

public class Rider {
    @Id
    private Integer id;

    private String name;

    private String passwrod;

    private String sex;

    private String tel;

    private String integral;

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }

    @Column(name = "cardId")
    private String cardid;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return passwrod
     */
    public String getPasswrod() {
        return passwrod;
    }

    /**
     * @param passwrod
     */
    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return cardId
     */
    public String getCardid() {
        return cardid;
    }

    /**
     * @param cardid
     */
    public void setCardid(String cardid) {
        this.cardid = cardid;
    }
}