package com.water.entity;

import javax.persistence.*;

@Table(name = "deliver_order_item")
public class DeliverOrderItem {
    @Id
    private Integer id;

    /**
     * 调拨单主键
     */
    @Column(name = "deliver_order_pk")
    private Integer deliverOrderPk;

    /**
     * allot_line_pk
     */
    @Column(name = "inv_allot_line_pk")
    private Integer invAllotLinePk;

    /**
     * 行号
     */
    @Column(name = "line_number")
    private Integer lineNumber;

    /**
     * allot_header_pk
     */
    @Column(name = "inv_allot_header_pk")
    private Integer invAllotHeaderPk;

    /**
     * 物料编码
     */
    @Column(name = "item_code")
    private String itemCode;

    /**
     * 物料名称
     */
    @Column(name = "item_name")
    private String itemName;

    /**
     * 计量单位
     */
    @Column(name = "uom_code_name")
    private String uomCodeName;

    /**
     * 批次号
     */
    @Column(name = "lot_number")
    private String lotNumber;

    /**
     * 开单数量
     */
    private Double qty;

    /**
     * 是否已回传
     */
    @Column(name = "is_post_back")
    private Integer isPostBack;

    /**
     * 已扫码的货物
     */
    @Column(name = "scaned_conut")
    private Double scanedConut;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private String createUser;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * 修改人
     */
    @Column(name = "modify_user")
    private String modifyUser;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private String modifyTime;

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
     * 获取调拨单主键
     *
     * @return deliver_order_pk - 调拨单主键
     */
    public Integer getDeliverOrderPk() {
        return deliverOrderPk;
    }

    /**
     * 设置调拨单主键
     *
     * @param deliverOrderPk 调拨单主键
     */
    public void setDeliverOrderPk(Integer deliverOrderPk) {
        this.deliverOrderPk = deliverOrderPk;
    }

    /**
     * 获取allot_line_pk
     *
     * @return inv_allot_line_pk - allot_line_pk
     */
    public Integer getInvAllotLinePk() {
        return invAllotLinePk;
    }

    /**
     * 设置allot_line_pk
     *
     * @param invAllotLinePk allot_line_pk
     */
    public void setInvAllotLinePk(Integer invAllotLinePk) {
        this.invAllotLinePk = invAllotLinePk;
    }

    /**
     * 获取行号
     *
     * @return line_number - 行号
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * 设置行号
     *
     * @param lineNumber 行号
     */
    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * 获取allot_header_pk
     *
     * @return inv_allot_header_pk - allot_header_pk
     */
    public Integer getInvAllotHeaderPk() {
        return invAllotHeaderPk;
    }

    /**
     * 设置allot_header_pk
     *
     * @param invAllotHeaderPk allot_header_pk
     */
    public void setInvAllotHeaderPk(Integer invAllotHeaderPk) {
        this.invAllotHeaderPk = invAllotHeaderPk;
    }

    /**
     * 获取物料编码
     *
     * @return item_code - 物料编码
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * 设置物料编码
     *
     * @param itemCode 物料编码
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * 获取物料名称
     *
     * @return item_name - 物料名称
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置物料名称
     *
     * @param itemName 物料名称
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 获取计量单位
     *
     * @return uom_code_name - 计量单位
     */
    public String getUomCodeName() {
        return uomCodeName;
    }

    /**
     * 设置计量单位
     *
     * @param uomCodeName 计量单位
     */
    public void setUomCodeName(String uomCodeName) {
        this.uomCodeName = uomCodeName;
    }

    /**
     * 获取批次号
     *
     * @return lot_number - 批次号
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * 设置批次号
     *
     * @param lotNumber 批次号
     */
    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    /**
     * 获取开单数量
     *
     * @return qty - 开单数量
     */
    public Double getQty() {
        return qty;
    }

    /**
     * 设置开单数量
     *
     * @param qty 开单数量
     */
    public void setQty(Double qty) {
        this.qty = qty;
    }

    /**
     * 获取是否已回传
     *
     * @return is_post_back - 是否已回传
     */
    public Integer getIsPostBack() {
        return isPostBack;
    }

    /**
     * 设置是否已回传
     *
     * @param isPostBack 是否已回传
     */
    public void setIsPostBack(Integer isPostBack) {
        this.isPostBack = isPostBack;
    }

    /**
     * 获取已扫码的货物
     *
     * @return scaned_conut - 已扫码的货物
     */
    public Double getScanedConut() {
        return scanedConut;
    }

    /**
     * 设置已扫码的货物
     *
     * @param scanedConut 已扫码的货物
     */
    public void setScanedConut(Double scanedConut) {
        this.scanedConut = scanedConut;
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
}