package com.csdj.chainsupermarket.entity.marketing;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author 贺芳
 * 抢购活动实体类
 */
public class SnapUpActivities {
    /**活动ID*/
    private Integer ctivityId;
    /**活动名称*/
    private String ctivityName;
    /**活动开始时间*/
    private Date activitystarTime;
    /**活动结束时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date activityendTime;
    /**活动状态*/
    private Integer activitydTimeQuantum;
    /**商品编号*/
    private Integer commodityId;
    /**限购数量*/
    private Integer activityNumber;
    /**用户类型*/
    private Integer userType;
    /**创建时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtCreate;
    /**修改时间*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ssdd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtModified;
    /**店铺ID*/
    private Integer sophId;

    public Integer getCtivityId() {
        return ctivityId;
    }

    public void setCtivityId(Integer ctivityId) {
        this.ctivityId = ctivityId;
    }

    public String getCtivityName() {
        return ctivityName;
    }

    public void setCtivityName(String ctivityName) {
        this.ctivityName = ctivityName;
    }

    public Date getActivitystarTime() {
        return activitystarTime;
    }

    public void setActivitystarTime(Date activitystarTime) {
        this.activitystarTime = activitystarTime;
    }

    public Date getActivityendTime() {
        return activityendTime;
    }

    public void setActivityendTime(Date activityendTime) {
        this.activityendTime = activityendTime;
    }

    public Integer getActivitydTimeQuantum() {
        return activitydTimeQuantum;
    }

    public void setActivitydTimeQuantum(Integer activitydTimeQuantum) {
        this.activitydTimeQuantum = activitydTimeQuantum;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getActivityNumber() {
        return activityNumber;
    }

    public void setActivityNumber(Integer activityNumber) {
        this.activityNumber = activityNumber;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
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

    public Integer getSophId() {
        return sophId;
    }

    public void setSophId(Integer sophId) {
        this.sophId = sophId;
    }
}
