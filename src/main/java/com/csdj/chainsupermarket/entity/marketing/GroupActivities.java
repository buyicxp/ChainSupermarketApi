package com.csdj.chainsupermarket.entity.marketing;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author :阿浩i
 * @Description : 拼团活动实体类
 * @CreateDate :  2019/12/3 16:10
 * @Version : 1.0
 */
public class GroupActivities {
    /**
     * 活动id，自增列
     */
    private String activitiesId;
    
    /**
     * 活动名称
     */
    private String activityName;
    
    /**
     * 成团人数
     */
    private int activityNumber;
    
    /**
     * 同时参团数
     */
    private String activityPrice;
    
    /**
     * 成团时限
     */
    private int validHours;
    
    /**
     * 限购数量
     */
    private int limitedQuantity;
    
    /**
     * 活动开始时间
     */
    private String startTime;
    
    /**
     * 活动结束时间
     */
    private String endTime;
    
    /**
     * 活动创建时间
     */
    private String creationTime;
    
    /**
     * 参与活动的门店ID
     */
    private String storeId;
    
    /**
     * 活动状态 0为已过期，1为正在进行中或者未开始
     */
    private int activityState;
    
    public String getActivitiesId() {
        return activitiesId;
    }
    
    public void setActivitiesId(String activitiesId) {
        this.activitiesId = activitiesId;
    }
    
    public String getActivityName() {
        return activityName;
    }
    
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }
    
    public int getActivityNumber() {
        return activityNumber;
    }
    
    public void setActivityNumber(int activityNumber) {
        this.activityNumber = activityNumber;
    }
    
    public String getActivityPrice() {
        return activityPrice;
    }
    
    public void setActivityPrice(String activityPrice) {
        this.activityPrice = activityPrice;
    }
    
    public int getValidHours() {
        return validHours;
    }
    
    public void setValidHours(int validHours) {
        this.validHours = validHours;
    }
    
    public int getLimitedQuantity() {
        return limitedQuantity;
    }
    
    public void setLimitedQuantity(int limitedQuantity) {
        this.limitedQuantity = limitedQuantity;
    }
    
    public String getStartTime() {
        return startTime;
    }
    
    public void setStartTime(Date startTime) {
        this.startTime = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(startTime);
    }
    
    public String getEndTime() {
        return endTime;
    }
    
    public void setEndTime(Date endTime) {
        this.endTime = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(endTime);
    }
    
    public String getCreationTime() {
        return creationTime;
    }
    
    public void setCreationTime(Date creationTime) {
        this.creationTime = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(creationTime);
    }
    
    public String getStoreId() {
        return storeId;
    }
    
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }
    
    public int getActivityState() {
        return activityState;
    }
    
    public void setActivityState(int activityState) {
        this.activityState = activityState;
    }
}
