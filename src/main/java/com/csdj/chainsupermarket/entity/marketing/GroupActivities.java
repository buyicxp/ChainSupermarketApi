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
    private String activitiesId;
    private String activityName;
    private int activityNumber;
    private String activityPrice;
    private int validHours;
    private int limitedQuantity;
    private String startTime;
    private String endTime;
    private String creationTime;
    private String storeId;
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
