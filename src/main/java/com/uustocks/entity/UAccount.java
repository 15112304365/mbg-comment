package com.uustocks.entity;

import java.util.Date;

/**
 * 用户账户表
 *
 * @author 西早哥哥
 * @date   2019/07/29 03:03:35
 */
public class UAccount {
    /**
     * 主键Id,逻辑id,软件内部关联
     */
    private Integer id;

    /**
     * 用户登录表 用户id 外键
     */
    private Integer uUserId;

    /**
     * 账户总金额 （分）
     */
    private Long totalMoney;

    /**
     * 账户可用总金额（分）
     */
    private Long leftMoney;

    /**
     * 账户冻结金额（分）
     */
    private Long freezeMoney;

    /**
     * 邀请好友获得的总奖励（分）
     */
    private Long inviteMoney;

    /**
     * 总积分
     */
    private Long totalPoint;

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

    public Long getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Long totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Long getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(Long leftMoney) {
        this.leftMoney = leftMoney;
    }

    public Long getFreezeMoney() {
        return freezeMoney;
    }

    public void setFreezeMoney(Long freezeMoney) {
        this.freezeMoney = freezeMoney;
    }

    public Long getInviteMoney() {
        return inviteMoney;
    }

    public void setInviteMoney(Long inviteMoney) {
        this.inviteMoney = inviteMoney;
    }

    public Long getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(Long totalPoint) {
        this.totalPoint = totalPoint;
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