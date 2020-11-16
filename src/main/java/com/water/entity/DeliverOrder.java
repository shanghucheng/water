package com.water.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "deliver_order")
public class DeliverOrder {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 调拨单主键
     */
    @Column(name = "inv_allot_header_pk")
    private Integer invAllotHeaderPk;

    /**
     * 单据类型
     */
    @Column(name = "allot_type")
    private String allotType;

    /**
     * 调拨单号
     */
    @Column(name = "doc_number")
    private String docNumber;

    /**
     * 调拨日期
     */
    @Column(name = "allot_date")
    private Date allotDate;

    /**
     * 项目号
     */
    @Column(name = "project_code")
    private String projectCode;

    /**
     * 出库仓库编码
     */
    @Column(name = "out_sec_inv_name")
    private String outSecInvName;

    /**
     * 出库仓库名称
     */
    @Column(name = "subinv_name")
    private String subinvName;

    /**
     * 状态
     */
    private String status;

    /**
     * 创建人
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 组织机构id
     */
    @Column(name = "organization_id")
    private Integer organizationId;

    /**
     * 回传状态
     */
    @Column(name = "back_status")
    private Boolean backStatus;

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
     * 获取调拨单主键
     *
     * @return inv_allot_header_pk - 调拨单主键
     */
    public Integer getInvAllotHeaderPk() {
        return invAllotHeaderPk;
    }

    /**
     * 设置调拨单主键
     *
     * @param invAllotHeaderPk 调拨单主键
     */
    public void setInvAllotHeaderPk(Integer invAllotHeaderPk) {
        this.invAllotHeaderPk = invAllotHeaderPk;
    }

    /**
     * 获取单据类型
     *
     * @return allot_type - 单据类型
     */
    public String getAllotType() {
        return allotType;
    }

    /**
     * 设置单据类型
     *
     * @param allotType 单据类型
     */
    public void setAllotType(String allotType) {
        this.allotType = allotType;
    }

    /**
     * 获取调拨单号
     *
     * @return doc_number - 调拨单号
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * 设置调拨单号
     *
     * @param docNumber 调拨单号
     */
    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    /**
     * 获取调拨日期
     *
     * @return allot_date - 调拨日期
     */
    public Date getAllotDate() {
        return allotDate;
    }

    /**
     * 设置调拨日期
     *
     * @param allotDate 调拨日期
     */
    public void setAllotDate(Date allotDate) {
        this.allotDate = allotDate;
    }

    /**
     * 获取项目号
     *
     * @return project_code - 项目号
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * 设置项目号
     *
     * @param projectCode 项目号
     */
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    /**
     * 获取出库仓库编码
     *
     * @return out_sec_inv_name - 出库仓库编码
     */
    public String getOutSecInvName() {
        return outSecInvName;
    }

    /**
     * 设置出库仓库编码
     *
     * @param outSecInvName 出库仓库编码
     */
    public void setOutSecInvName(String outSecInvName) {
        this.outSecInvName = outSecInvName;
    }

    /**
     * 获取出库仓库名称
     *
     * @return subinv_name - 出库仓库名称
     */
    public String getSubinvName() {
        return subinvName;
    }

    /**
     * 设置出库仓库名称
     *
     * @param subinvName 出库仓库名称
     */
    public void setSubinvName(String subinvName) {
        this.subinvName = subinvName;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取创建人
     *
     * @return user_name - 创建人
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置创建人
     *
     * @param userName 创建人
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取组织机构id
     *
     * @return organization_id - 组织机构id
     */
    public Integer getOrganizationId() {
        return organizationId;
    }

    /**
     * 设置组织机构id
     *
     * @param organizationId 组织机构id
     */
    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * 获取回传状态
     *
     * @return back_status - 回传状态
     */
    public Boolean getBackStatus() {
        return backStatus;
    }

    /**
     * 设置回传状态
     *
     * @param backStatus 回传状态
     */
    public void setBackStatus(Boolean backStatus) {
        this.backStatus = backStatus;
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