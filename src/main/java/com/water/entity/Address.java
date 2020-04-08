package com.water.entity;

import javax.persistence.*;

public class Address {
    /**
     * 编号
     */
    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 用户名
     */
    @Column(name = "userName")
    private String username;

    /**
     * 电话
     */
    @Column(name = "telNumber")
    private String telnumber;

    /**
     * 省
     */
    @Column(name = "provinceName")
    private String provincename;

    /**
     * 市
     */
    @Column(name = "cityName")
    private String cityname;

    /**
     * 区
     */
    @Column(name = "countyName")
    private String countyname;

    /**
     * 详细地址
     */
    @Column(name = "detailInfo")
    private String detailinfo;

    /**
     * 是否是默认的1 是 0对否
     */
    @Column(name = "isDefault")
    private String isdefault;

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
     * 获取用户名
     *
     * @return userName - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取电话
     *
     * @return telNumber - 电话
     */
    public String getTelnumber() {
        return telnumber;
    }

    /**
     * 设置电话
     *
     * @param telnumber 电话
     */
    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber;
    }

    /**
     * 获取省
     *
     * @return provinceName - 省
     */
    public String getProvincename() {
        return provincename;
    }

    /**
     * 设置省
     *
     * @param provincename 省
     */
    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    /**
     * 获取市
     *
     * @return cityName - 市
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * 设置市
     *
     * @param cityname 市
     */
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    /**
     * 获取区
     *
     * @return countyName - 区
     */
    public String getCountyname() {
        return countyname;
    }

    /**
     * 设置区
     *
     * @param countyname 区
     */
    public void setCountyname(String countyname) {
        this.countyname = countyname;
    }

    /**
     * 获取详细地址
     *
     * @return detailInfo - 详细地址
     */
    public String getDetailinfo() {
        return detailinfo;
    }

    /**
     * 设置详细地址
     *
     * @param detailinfo 详细地址
     */
    public void setDetailinfo(String detailinfo) {
        this.detailinfo = detailinfo;
    }

    /**
     * 获取是否是默认的1 是 0对否
     *
     * @return isDefault - 是否是默认的1 是 0对否
     */
    public String getIsdefault() {
        return isdefault;
    }

    /**
     * 设置是否是默认的1 是 0对否
     *
     * @param isdefault 是否是默认的1 是 0对否
     */
    public void setIsdefault(String isdefault) {
        this.isdefault = isdefault;
    }
}