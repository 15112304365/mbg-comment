package com.uustocks.entity;

import java.util.Date;

/**
 * 研报产品表,不包含内容;该表和(pro_product_details)一对一关系
 *
 * @author 西早哥哥
 * @date   2019/07/29 03:03:35
 */
public class ProProduct {
    /**
     * 主键Id,逻辑id,软件内部关联
     */
    private Integer id;

    /**
     * 产品唯一标识符,业务id,此id对外开放
     */
    private String uuid;

    /**
     * 研报产品详情表id,此为逻辑id
     */
    private String proProductDetailsId;

    /**
     * 研报名称
     */
    private String title;

    /**
     * 站内信摘要
     */
    private String description;

    /**
     * 总份数; 如果为0,则代表不设上限;如果大于0,则代表最大可卖的份数
     */
    private Integer totalCopies;

    /**
     * 剩余份数
     */
    private Integer leftCopies;

    /**
     * 卖出份数; 如果总份数为0,则卖出份数不设上限,如果总份数大于0,则最大卖出份数不超过总份数
     */
    private Integer saleCopies;

    /**
     * 是否推荐产品；0：不推荐；1：推荐
     */
    private String hot;

    /**
     * 产品类型；（预留字段）; 默认为0; 
     */
    private String productType;

    /**
     * 产品级别；默认为0（预留字段）可结合用户vip等级使用
     */
    private String productLeave;

    /**
     * 缩略图地址
     */
    private String smallImgUrl;

    /**
     * 正文内容地址;多张图片用分号分开
     */
    private String bigImgUrl;

    /**
     * 产品标签
     */
    private String productTag;

    /**
     * 产品状态：-10：dba下架；-11：运营下架；-12:到期自动下架 -13:已售罄下架  10：待审核；11：已审核不通过；12：已审核通过；20：预约中；30：出售中；
     */
    private String state;

    /**
     * 用户点赞次数
     */
    private Integer favor;

    /**
     * 插入时间
     */
    private Date insertTime;

    /**
     * 产品审核时间
     */
    private Date auditTime;

    /**
     * 预约上线时间
     */
    private Date bookingTime;

    /**
     * 开始售卖时间
     */
    private Date saleTime;

    /**
     * 产品下架时间
     */
    private Date finishTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 添加用户_管理员id
     */
    private Integer insertAdmin;

    /**
     * 修改用户_管理员id
     */
    private Integer updateAdmin;

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

    public String getProProductDetailsId() {
        return proProductDetailsId;
    }

    public void setProProductDetailsId(String proProductDetailsId) {
        this.proProductDetailsId = proProductDetailsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(Integer totalCopies) {
        this.totalCopies = totalCopies;
    }

    public Integer getLeftCopies() {
        return leftCopies;
    }

    public void setLeftCopies(Integer leftCopies) {
        this.leftCopies = leftCopies;
    }

    public Integer getSaleCopies() {
        return saleCopies;
    }

    public void setSaleCopies(Integer saleCopies) {
        this.saleCopies = saleCopies;
    }

    public String getHot() {
        return hot;
    }

    public void setHot(String hot) {
        this.hot = hot;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductLeave() {
        return productLeave;
    }

    public void setProductLeave(String productLeave) {
        this.productLeave = productLeave;
    }

    public String getSmallImgUrl() {
        return smallImgUrl;
    }

    public void setSmallImgUrl(String smallImgUrl) {
        this.smallImgUrl = smallImgUrl;
    }

    public String getBigImgUrl() {
        return bigImgUrl;
    }

    public void setBigImgUrl(String bigImgUrl) {
        this.bigImgUrl = bigImgUrl;
    }

    public String getProductTag() {
        return productTag;
    }

    public void setProductTag(String productTag) {
        this.productTag = productTag;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getFavor() {
        return favor;
    }

    public void setFavor(Integer favor) {
        this.favor = favor;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public Date getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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