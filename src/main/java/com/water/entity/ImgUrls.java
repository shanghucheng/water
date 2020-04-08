package com.water.entity;

import javax.persistence.*;

public class ImgUrls {
    /**
     * 编号
     */
    @Id
    private Integer id;

    /**
     * 商品编号
     */
    @Column(name = "waterId")
    private Integer waterid;

    /**
     * 图片地址
     */
    private String url;

    /**
     * 等级 1 轮播图 2商品显示图 3商品详情轮播图 4商品详情图
     */
    private String level;

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
     * 获取商品编号
     *
     * @return waterId - 商品编号
     */
    public Integer getWaterid() {
        return waterid;
    }

    /**
     * 设置商品编号
     *
     * @param waterid 商品编号
     */
    public void setWaterid(Integer waterid) {
        this.waterid = waterid;
    }

    /**
     * 获取图片地址
     *
     * @return url - 图片地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置图片地址
     *
     * @param url 图片地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取等级 1 轮播图 2商品显示图 3商品详情轮播图 4商品详情图
     *
     * @return level - 等级 1 轮播图 2商品显示图 3商品详情轮播图 4商品详情图
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置等级 1 轮播图 2商品显示图 3商品详情轮播图 4商品详情图
     *
     * @param level 等级 1 轮播图 2商品显示图 3商品详情轮播图 4商品详情图
     */
    public void setLevel(String level) {
        this.level = level;
    }
}