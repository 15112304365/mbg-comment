package com.uustocks.entity;

import java.util.Date;

/**
 * 用户留言表（反馈内容）
 *
 * @author 西早哥哥
 * @date   2019/07/29 03:03:35
 */
public class OpComment {
    /**
     * 主键Id,逻辑id,软件内部关联
     */
    private Integer id;

    /**
     * 用户登录表 用户id 外键
     */
    private Integer uUserId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 反馈内容
     */
    private String content;

    /**
     * 平台类型： pc:0； android:1;   ios:2;   wap:3
     */
    private String platform;

    /**
     * IP
     */
    private String ip;

    /**
     * api版本号;0:代表不是使用app
     */
    private String apiVersion;

    /**
     * 应用程序版本号
     */
    private String appVersion;

    /**
     * 手机类型(制造商)eg：xiaomi，OPPO，apple
     */
    private String phoneType;

    /**
     * 手机系统型号；eg：12.1.0
     */
    private String phoneSys;

    /**
     * 是否回复用户; 0:未回复; 1:已回复;
     */
    private String returnState;

    /**
     * 站内信Id,如对此条内容进行回复，则回复消息发给用户站内信
     */
    private Integer uInmailId;

    /**
     * 添加时间
     */
    private Date insertTime;

    /**
     * 修改时间
     */
    private Date updateTime;

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

    public Integer getuUserId() {
        return uUserId;
    }

    public void setuUserId(Integer uUserId) {
        this.uUserId = uUserId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getPhoneSys() {
        return phoneSys;
    }

    public void setPhoneSys(String phoneSys) {
        this.phoneSys = phoneSys;
    }

    public String getReturnState() {
        return returnState;
    }

    public void setReturnState(String returnState) {
        this.returnState = returnState;
    }

    public Integer getuInmailId() {
        return uInmailId;
    }

    public void setuInmailId(Integer uInmailId) {
        this.uInmailId = uInmailId;
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