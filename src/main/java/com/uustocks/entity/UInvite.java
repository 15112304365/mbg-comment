package com.uustocks.entity;

import java.util.Date;

/**
 * 用户好友邀请关系记录表
 *
 * @author 西早哥哥
 * @date   2019/07/29 03:03:35
 */
public class UInvite {
    /**
     * 主键Id,逻辑id,软件内部关联
     */
    private Integer id;

    /**
     * 邀请人Id
     */
    private Integer uUserId;

    /**
     * 邀请人用户名
     */
    private String username;

    /**
     * 被邀请人Id
     */
    private Integer beUUserId;

    /**
     * 被邀请人用户名
     */
    private String beUsername;

    /**
     * 邀请人酬劳状态：默认为0；
     */
    private String state;

    /**
     * 被邀请人酬劳状态：默认为0；
     */
    private String beState;

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

    public Integer getBeUUserId() {
        return beUUserId;
    }

    public void setBeUUserId(Integer beUUserId) {
        this.beUUserId = beUUserId;
    }

    public String getBeUsername() {
        return beUsername;
    }

    public void setBeUsername(String beUsername) {
        this.beUsername = beUsername;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBeState() {
        return beState;
    }

    public void setBeState(String beState) {
        this.beState = beState;
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