package com.uustocks.entity;

import java.util.Date;

/**
 * app渠道激活统计表
 *
 * @author 西早哥哥
 * @date   2019/07/29 03:03:35
 */
public class OpAppActive {
    /**
     * 主键Id,逻辑id,软件内部关联
     */
    private Integer id;

    /**
     * 渠道号
     */
    private Integer opChannelId;

    /**
     * 渠道名称
     */
    private String channelName;

    /**
     * 渠道编码
     */
    private String channelCode;

    /**
     * 平台类型： pc:0； android:1;   ios:2;   wap:3
     */
    private String platform;

    /**
     * mac地址
     */
    private String mac;

    /**
     * 设备号,设备唯一标识
     */
    private String deviceId;

    /**
     * 手机类型(制造商)eg：xiaomi，OPPO，apple
     */
    private String phoneType;

    /**
     * 手机系统型号；eg：12.1.0
     */
    private String phoneSys;

    /**
     * IP
     */
    private String ip;

    /**
     * api版本号;0:代表不是使用app
     */
    private String apiVersion;

    /**
     * 添加时间
     */
    private Date insertTime;

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

    public Integer getOpChannelId() {
        return opChannelId;
    }

    public void setOpChannelId(Integer opChannelId) {
        this.opChannelId = opChannelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
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

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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