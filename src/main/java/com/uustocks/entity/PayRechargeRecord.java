package com.uustocks.entity;

import java.util.Date;

/**
 * 充值记录表
 *
 * @author 西早哥哥
 * @date   2019/07/29 03:03:35
 */
public class PayRechargeRecord {
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
     * 系统自身产生的订单id
     */
    private String orderIdLocal;

    /**
     * 第三方返回的订单号
     */
    private String orderIdServices;

    /**
     * 交易金额(分) 
     */
    private Long payMoney;

    /**
     * 支付类型：sdk; aip; h5; ebank(网银); sys(系统充值/后台管理人员充值)
     */
    private String payType;

    /**
     * 支付商家：wechat; alipay; system
     */
    private String payMerchant;

    /**
     * 交易状态 ，0:待支付; 1:正在处理;  2:交易成功;  3:交易失败
     */
    private String state;

    /**
     * 响应码
     */
    private String returnCode;

    /**
     * 响应信息
     */
    private String returnMsg;

    /**
     * 交易时的IP
     */
    private String ip;

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
     * 设备ID/mac地址
     */
    private String deviceId;

    /**
     * 随机字符串(微信支付用到)
     */
    private String nonceStr;

    /**
     * 预付id(微信支付用到)
     */
    private String prepayId;

    /**
     * 签名
     */
    private String sign;

    /**
     * 添加时间
     */
    private Date insertTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 交易完成时间
     */
    private Date finishTime;

    /**
     * 添加用户_管理员id
     */
    private Integer insertAdmin;

    /**
     * 修改用户_管理员id
     */
    private Integer updateAdmin;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOrderIdLocal() {
        return orderIdLocal;
    }

    public void setOrderIdLocal(String orderIdLocal) {
        this.orderIdLocal = orderIdLocal;
    }

    public String getOrderIdServices() {
        return orderIdServices;
    }

    public void setOrderIdServices(String orderIdServices) {
        this.orderIdServices = orderIdServices;
    }

    public Long getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayMerchant() {
        return payMerchant;
    }

    public void setPayMerchant(String payMerchant) {
        this.payMerchant = payMerchant;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
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

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getInsertAdmin() {
        return insertAdmin;
    }

    public void setInsertAdmin(Integer insertAdmin) {
        this.insertAdmin = insertAdmin;
    }

    public Integer getUpdateAdmin() {
        return updateAdmin;
    }

    public void setUpdateAdmin(Integer updateAdmin) {
        this.updateAdmin = updateAdmin;
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