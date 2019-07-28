package com.uustocks.entity;

import java.util.Date;

/**
 * 用户登录表（用户主表）
 *
 * @author 西早哥哥
 * @date   2019/07/29 03:03:35
 */
public class UUser {
    /**
     * 主键Id,逻辑id,软件内部关联
     */
    private Integer id;

    /**
     * 用户唯一标识符,业务id,此id对外开放
     */
    private String uuid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 登录密码
     */
    private String loginPwd;

    /**
     * 交易密码
     */
    private String payPwd;

    /**
     * vip等级 默认为0:普通用户;
     */
    private Byte vip;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 用户状态 10:正常; 20:异常; 30:黑名单
     */
    private String state;

    /**
     * 盐
     */
    private String salt;

    /**
     * 平台类型： pc:0； android:1;   ios:2;   wap:3
     */
    private String platform;

    /**
     * 渠道id
     */
    private String opChannelId;

    /**
     * 添加时间
     */
    private Date insertTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 登录密码修改时间
     */
    private Date loginPwdUpdateTime;

    /**
     * 交易密码修改时间
     */
    private Date payPwdUpdateTime;

    /**
     * 邀请码; 默认-1,表示没有邀请码
     */
    private String inviteCode;

    /**
     * 版本号;用于更新时对比操作;
     */
    private Long versions;

    /**
     * 是否逻辑删除;0:false:不删除;1:true:逻辑删除;对用户显示，所有查询sql都要带上del=0这个条件
     */
    private String del;

    /**
     * 备注
     */
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getPayPwd() {
        return payPwd;
    }

    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd;
    }

    public Byte getVip() {
        return vip;
    }

    public void setVip(Byte vip) {
        this.vip = vip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOpChannelId() {
        return opChannelId;
    }

    public void setOpChannelId(String opChannelId) {
        this.opChannelId = opChannelId;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getLoginPwdUpdateTime() {
        return loginPwdUpdateTime;
    }

    public void setLoginPwdUpdateTime(Date loginPwdUpdateTime) {
        this.loginPwdUpdateTime = loginPwdUpdateTime;
    }

    public Date getPayPwdUpdateTime() {
        return payPwdUpdateTime;
    }

    public void setPayPwdUpdateTime(Date payPwdUpdateTime) {
        this.payPwdUpdateTime = payPwdUpdateTime;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public Long getVersions() {
        return versions;
    }

    public void setVersions(Long versions) {
        this.versions = versions;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}