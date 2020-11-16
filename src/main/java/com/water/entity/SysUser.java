package com.water.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser {
    /**
     * 用户id
     */
    @Id
    @Column(name = "user_id")
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 名字
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 公司编码
     */
    @Column(name = "org_code")
    private String orgCode;

    /**
     * 部门编码
     */
    @Column(name = "dept_id")
    private String deptId;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 状态 0:禁用，1:正常 2未激活
     */
    private Byte status;

    /**
     * 创建用户id
     */
    @Column(name = "user_id_create")
    private Long userIdCreate;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private String gmtCreate;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    private String gmtModified;

    /**
     * 性别
     */
    private Long sex;

    /**
     * 出身日期
     */
    private Date birth;

    @Column(name = "pic_id")
    private Long picId;

    /**
     * 现居住地
     */
    @Column(name = "live_address")
    private String liveAddress;

    /**
     * 爱好
     */
    private String hobby;

    /**
     * 省份
     */
    private String province;

    /**
     * 所在城市
     */
    private String city;

    /**
     * 所在地区
     */
    private String district;

    /**
     * 是否管理员
     */
    @Column(name = "is_admin")
    private String isAdmin;

    /**
     * 用户类型
     */
    @Column(name = "user_type")
    private String userType;

    @Column(name = "validate_code")
    private String validateCode;

    @Column(name = "last_time")
    private String lastTime;

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
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
     * 获取名字
     *
     * @return name - 名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名字
     *
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取公司编码
     *
     * @return org_code - 公司编码
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置公司编码
     *
     * @param orgCode 公司编码
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * 获取部门编码
     *
     * @return dept_id - 部门编码
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * 设置部门编码
     *
     * @param deptId 部门编码
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取状态 0:禁用，1:正常 2未激活
     *
     * @return status - 状态 0:禁用，1:正常 2未激活
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态 0:禁用，1:正常 2未激活
     *
     * @param status 状态 0:禁用，1:正常 2未激活
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取创建用户id
     *
     * @return user_id_create - 创建用户id
     */
    public Long getUserIdCreate() {
        return userIdCreate;
    }

    /**
     * 设置创建用户id
     *
     * @param userIdCreate 创建用户id
     */
    public void setUserIdCreate(Long userIdCreate) {
        this.userIdCreate = userIdCreate;
    }

    /**
     * 获取创建时间
     *
     * @return gmt_create - 创建时间
     */
    public String getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取修改时间
     *
     * @return gmt_modified - 修改时间
     */
    public String getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置修改时间
     *
     * @param gmtModified 修改时间
     */
    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public Long getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Long sex) {
        this.sex = sex;
    }

    /**
     * 获取出身日期
     *
     * @return birth - 出身日期
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * 设置出身日期
     *
     * @param birth 出身日期
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * @return pic_id
     */
    public Long getPicId() {
        return picId;
    }

    /**
     * @param picId
     */
    public void setPicId(Long picId) {
        this.picId = picId;
    }

    /**
     * 获取现居住地
     *
     * @return live_address - 现居住地
     */
    public String getLiveAddress() {
        return liveAddress;
    }

    /**
     * 设置现居住地
     *
     * @param liveAddress 现居住地
     */
    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    /**
     * 获取爱好
     *
     * @return hobby - 爱好
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * 设置爱好
     *
     * @param hobby 爱好
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取所在城市
     *
     * @return city - 所在城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置所在城市
     *
     * @param city 所在城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取所在地区
     *
     * @return district - 所在地区
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置所在地区
     *
     * @param district 所在地区
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * 获取是否管理员
     *
     * @return is_admin - 是否管理员
     */
    public String getIsAdmin() {
        return isAdmin;
    }

    /**
     * 设置是否管理员
     *
     * @param isAdmin 是否管理员
     */
    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * 获取用户类型
     *
     * @return user_type - 用户类型
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置用户类型
     *
     * @param userType 用户类型
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * @return validate_code
     */
    public String getValidateCode() {
        return validateCode;
    }

    /**
     * @param validateCode
     */
    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }

    /**
     * @return last_time
     */
    public String getLastTime() {
        return lastTime;
    }

    /**
     * @param lastTime
     */
    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }
}