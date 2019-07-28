package com.uustocks.entity;

import java.util.Date;

/**
 * 用户信息扩展表
 *
 * @author 西早哥哥
 * @date   2019/07/29 03:03:35
 */
public class UExtendInfo {
    /**
     * 主键Id,逻辑id,软件内部关联
     */
    private Integer id;

    /**
     * 用户登录表 用户id 外键
     */
    private Integer uUserId;

    /**
     * 手机卡类型 电信 移动 联通
     */
    private String phoneCardType;

    /**
     * 手机归属地省份
     */
    private String phoneProv;

    /**
     * 手机归属地城市
     */
    private String phoneCity;

    /**
     * 生日 年份 
     */
    private Integer birthYear;

    /**
     * 生日 月份 
     */
    private Integer birthMonth;

    /**
     * 生日 天
     */
    private Integer birthDay;

    /**
     * 星座
     */
    private String horoscope;

    /**
     * 生肖
     */
    private String animal;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * QQ号码
     */
    private String qq;

    /**
     * 微信号码
     */
    private String wechat;

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

    public String getPhoneCardType() {
        return phoneCardType;
    }

    public void setPhoneCardType(String phoneCardType) {
        this.phoneCardType = phoneCardType;
    }

    public String getPhoneProv() {
        return phoneProv;
    }

    public void setPhoneProv(String phoneProv) {
        this.phoneProv = phoneProv;
    }

    public String getPhoneCity() {
        return phoneCity;
    }

    public void setPhoneCity(String phoneCity) {
        this.phoneCity = phoneCity;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(Integer birthMonth) {
        this.birthMonth = birthMonth;
    }

    public Integer getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
    }

    public String getHoroscope() {
        return horoscope;
    }

    public void setHoroscope(String horoscope) {
        this.horoscope = horoscope;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
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