package com.water.entity;

import javax.persistence.*;

public class BrandType {
    @Id
    private Integer id;

    /**
     * 水类别
     */
    @Column(name = "typeId")
    private Integer typeid;

    /**
     * 1桶装水 2瓶装水
     */
    @Column(name = "categoryId")
    private Integer categoryid;

    /**
     * 水品牌
     */
    @Column(name = "brandId")
    private Integer brandid;

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
     * 获取水类别
     *
     * @return typeId - 水类别
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * 设置水类别
     *
     * @param typeid 水类别
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * 获取1桶装水 2瓶装水
     *
     * @return categoryId - 1桶装水 2瓶装水
     */
    public Integer getCategoryid() {
        return categoryid;
    }

    /**
     * 设置1桶装水 2瓶装水
     *
     * @param categoryid 1桶装水 2瓶装水
     */
    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * 获取水品牌
     *
     * @return brandId - 水品牌
     */
    public Integer getBrandid() {
        return brandid;
    }

    /**
     * 设置水品牌
     *
     * @param brandid 水品牌
     */
    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }
}