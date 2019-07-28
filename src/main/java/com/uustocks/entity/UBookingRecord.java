package com.uustocks.entity;

import java.util.Date;

/**
 * 订阅记录表；每一次订阅记录都在此体现
 *
 * @author 西早哥哥
 * @date   2019/07/29 03:03:35
 */
public class UBookingRecord {
    /**
     * 主键Id,逻辑id,软件内部关联
     */
    private Integer id;

    /**
     * 用户登录表 用户id 外键
     */
    private Integer uUserId;

    /**
     * 流水编号，毫秒级别的时间戳 +(拼接) 用户id
     */
    private String recordNo;

    /**
     * 订阅类型
     */
    private String bookingType;

    /**
     * 订阅名称
     */
    private String name;

    /**
     * 订阅周期(月)eg：1，3，6，12
     */
    private Integer period;

    /**
     * 订阅价格
     */
    private Integer price;

    /**
     * 插入时间
     */
    private Date insertTime;

    /**
     * 订阅开始时间（如果是续订，则是上一次订阅结束时间）
     */
    private Date startTime;

    /**
     * 订阅结束时间
     */
    private Date endTime;

    /**
     * api版本号;0:代表不是使用app
     */
    private String apiVersion;

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

    public String getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(String recordNo) {
        this.recordNo = recordNo;
    }

    public String getBookingType() {
        return bookingType;
    }

    public void setBookingType(String bookingType) {
        this.bookingType = bookingType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
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