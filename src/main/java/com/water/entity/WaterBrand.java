package com.water.entity;

import javax.persistence.*;

public class WaterBrand {
    @Id
    private Integer id;

    /**
     * 品牌名称
     */
    @Column(name = "brandName")
    private String brandname;

    /**
     * 品牌图片
     */
    @Column(name = "imgUrl")
    private String imgurl;

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
     * 获取品牌名称
     *
     * @return brandName - 品牌名称
     */
    public String getBrandname() {
        return brandname;
    }

    /**
     * 设置品牌名称
     *
     * @param brandname 品牌名称
     */
    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    /**
     * 获取品牌图片
     *
     * @return imgUrl - 品牌图片
     */
    public String getImgurl() {
        return imgurl;
    }

    /**
     * 设置品牌图片
     *
     * @param imgurl 品牌图片
     */
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
}