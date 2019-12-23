package com.csdj.chainsupermarket.entity.marketing;
import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
/**
 * 预售活动实体类
 * @author 易富军
 * @version 1.0.0 2019-12-05
 */
public class AdvanceSaleActivitiesEntity {

    /** 预售活动编号 */
    private Integer advanceId;

    /** 预售活动名称 */
    private String advanceName;

    /** 预售开始时间 */
    @DateTimeFormat(pattern ="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date preSaleStartTime;

    /** 预售结束时间 */
    @DateTimeFormat(pattern ="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date preSaleEndTime;

    /** 出货时间 */
    @DateTimeFormat(pattern ="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date advanceTime;

    /** 活动状态  0未开始1活动中2已结束 */
    private Integer advanceStatus;

    /** 是否以删除 0未删除1 以删除 */
    private Integer status;

    /** 创建时间 */
    @DateTimeFormat(pattern ="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date gmtCreate;

    /** 修改时间 */
    @DateTimeFormat(pattern ="yyyy-MM-dd hh:mm:ss")
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date gmtModified;

    /** 预留1 */
    private String reserveOne;

    /** 预留2 */
    private String reserveTwo;

    /** 预留3 */
    private String reserveThree;

    private String storeId;

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public AdvanceSaleActivitiesEntity() {
    }
    public AdvanceSaleActivitiesEntity(String advanceName, Date preSaleStartTime, Date preSaleEndTime, Date advanceTime, Integer advanceStatus, Integer status, Date gmtCreate, Date gmtModified) {
        this.advanceName = advanceName;
        this.preSaleStartTime = preSaleStartTime;
        this.preSaleEndTime = preSaleEndTime;
        this.advanceTime = advanceTime;
        this.advanceStatus = advanceStatus;
        this.status = status;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }
    public Integer getAdvanceId() {
        return advanceId;
    }

    public void setAdvanceId(Integer advanceId) {
        this.advanceId = advanceId;
    }

    public String getAdvanceName() {
        return advanceName;
    }

    public void setAdvanceName(String advanceName) {
        this.advanceName = advanceName;
    }

    public Date getPreSaleStartTime() {
        return preSaleStartTime;
    }

    public void setPreSaleStartTime(Date preSaleStartTime) {
        this.preSaleStartTime = preSaleStartTime;
    }

    public Date getPreSaleEndTime() {
        return preSaleEndTime;
    }

    public void setPreSaleEndTime(Date preSaleEndTime) {
        this.preSaleEndTime = preSaleEndTime;
    }

    public Date getAdvanceTime() {
        return advanceTime;
    }

    public void setAdvanceTime(Date advanceTime) {
        this.advanceTime = advanceTime;
    }

    public Integer getAdvanceStatus() {
        return advanceStatus;
    }

    public void setAdvanceStatus(Integer advanceStatus) {
        this.advanceStatus = advanceStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getReserveOne() {
        return reserveOne;
    }

    public void setReserveOne(String reserveOne) {
        this.reserveOne = reserveOne;
    }

    public String getReserveTwo() {
        return reserveTwo;
    }

    public void setReserveTwo(String reserveTwo) {
        this.reserveTwo = reserveTwo;
    }

    public String getReserveThree() {
        return reserveThree;
    }

    public void setReserveThree(String reserveThree) {
        this.reserveThree = reserveThree;
    }

    @Override
    public String toString() {
        return "AdvanceSaleActivitiesEntity{" +
                "advanceId=" + advanceId +
                ", advanceName='" + advanceName + '\'' +
                ", preSaleStartTime=" + preSaleStartTime +
                ", preSaleEndTime=" + preSaleEndTime +
                ", advanceTime=" + advanceTime +
                ", advanceStatus=" + advanceStatus +
                ", status=" + status +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", reserveOne='" + reserveOne + '\'' +
                ", reserveTwo='" + reserveTwo + '\'' +
                ", reserveThree='" + reserveThree + '\'' +
                '}';
    }
}
