package com.water.entity;

import javax.persistence.*;

@Table(name = "scan_goods")
public class ScanGoods {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 调拨单项主键
     */
    @Column(name = "deliver_order_item_id")
    private Integer deliverOrderItemId;

    /**
     * 物资唯一编码
     */
    @Column(name = "goods_unique_code")
    private String goodsUniqueCode;

    /**
     * 物料编码
     */
    @Column(name = "material_code")
    private String materialCode;

    /**
     * 供应商编码
     */
    @Column(name = "vendor_code")
    private String vendorCode;

    /**
     * 流水码
     */
    @Column(name = "stream_code")
    private String streamCode;

    /**
     * 校验码
     */
    @Column(name = "check_code")
    private String checkCode;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private String createUser;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private String modifyTime;

    /**
     * 修改人
     */
    @Column(name = "modify_user")
    private String modifyUser;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取调拨单项主键
     *
     * @return deliver_order_item_id - 调拨单项主键
     */
    public Integer getDeliverOrderItemId() {
        return deliverOrderItemId;
    }

    /**
     * 设置调拨单项主键
     *
     * @param deliverOrderItemId 调拨单项主键
     */
    public void setDeliverOrderItemId(Integer deliverOrderItemId) {
        this.deliverOrderItemId = deliverOrderItemId;
    }

    /**
     * 获取物资唯一编码
     *
     * @return goods_unique_code - 物资唯一编码
     */
    public String getGoodsUniqueCode() {
        return goodsUniqueCode;
    }

    /**
     * 设置物资唯一编码
     *
     * @param goodsUniqueCode 物资唯一编码
     */
    public void setGoodsUniqueCode(String goodsUniqueCode) {
        this.goodsUniqueCode = goodsUniqueCode;
    }

    /**
     * 获取物料编码
     *
     * @return material_code - 物料编码
     */
    public String getMaterialCode() {
        return materialCode;
    }

    /**
     * 设置物料编码
     *
     * @param materialCode 物料编码
     */
    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    /**
     * 获取供应商编码
     *
     * @return vendor_code - 供应商编码
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * 设置供应商编码
     *
     * @param vendorCode 供应商编码
     */
    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    /**
     * 获取流水码
     *
     * @return stream_code - 流水码
     */
    public String getStreamCode() {
        return streamCode;
    }

    /**
     * 设置流水码
     *
     * @param streamCode 流水码
     */
    public void setStreamCode(String streamCode) {
        this.streamCode = streamCode;
    }

    /**
     * 获取校验码
     *
     * @return check_code - 校验码
     */
    public String getCheckCode() {
        return checkCode;
    }

    /**
     * 设置校验码
     *
     * @param checkCode 校验码
     */
    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取修改人
     *
     * @return modify_user - 修改人
     */
    public String getModifyUser() {
        return modifyUser;
    }

    /**
     * 设置修改人
     *
     * @param modifyUser 修改人
     */
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }
}