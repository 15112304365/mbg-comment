package com.uustocks.entity;

import java.util.Date;

/**
 * 用户资金流水表
 *
 * @author 西早哥哥
 * @date   2019/07/29 03:03:35
 */
public class UFundRecord {
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
     * 操作金额 （分）
     */
    private Long money;

    /**
     * 状态 0:false:收入; 1:true:支出
     */
    private String state;

    /**
     * 操作类别  cz:用户充值  earnings:收益；tx:提现; tx_fail:提现失败已返款 ; buy:购买产品; back:返款; invite：邀请奖励；other:其它
     */
    private String type;

    /**
     * 支付商家：wechat; alipay; system
     */
    private String payMerchant;

    /**
     * 用户当前余额（分）
     */
    private Long currentMoney;

    /**
     * 添加时间
     */
    private Date insertTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * api版本号;0:代表不是使用app
     */
    private String apiVersion;

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

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPayMerchant() {
        return payMerchant;
    }

    public void setPayMerchant(String payMerchant) {
        this.payMerchant = payMerchant;
    }

    public Long getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(Long currentMoney) {
        this.currentMoney = currentMoney;
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

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
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