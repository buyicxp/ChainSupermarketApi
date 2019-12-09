package com.csdj.chainsupermarket.entity.marketing;/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:5.8.8
 */

import java.sql.Timestamp;

/**
 * FULL_ACTIVITY
 * 
 * @author bianj
 * @version 1.0.0 2019-12-04
 */
public class FullActivityVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 433599641835467301L;

    /** 活动id */
    private Long activityid;

    /** 活动名称 */
    private String activityName;

    /** 活动类型（外键） */
    private ActivityTypeVO type;

    /** 活动时间 */
    private Timestamp activityTime;

    /** 活动范围（外键） */
    private ActivityRangeVO range;

    /** 活动状态 */
    private String activityState;

    /** 执行状态 */
    private String executingState;

    /** 活动详情 */
    private String activityDetail;

    /** 删除改变状态为不显示 */
    private Integer deleteState;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getActivityid() {
        return activityid;
    }

    public void setActivityid(Long activityid) {
        this.activityid = activityid;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public ActivityTypeVO getType() {
        return type;
    }

    public void setType(ActivityTypeVO type) {
        this.type = type;
    }

    public Timestamp getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(Timestamp activityTime) {
        this.activityTime = activityTime;
    }

    public ActivityRangeVO getRange() {
        return range;
    }

    public void setRange(ActivityRangeVO range) {
        this.range = range;
    }

    public String getActivityState() {
        return activityState;
    }

    public void setActivityState(String activityState) {
        this.activityState = activityState;
    }

    public String getExecutingState() {
        return executingState;
    }

    public void setExecutingState(String executingState) {
        this.executingState = executingState;
    }

    public String getActivityDetail() {
        return activityDetail;
    }

    public void setActivityDetail(String activityDetail) {
        this.activityDetail = activityDetail;
    }

    public Integer getDeleteState() {
        return deleteState;
    }

    public void setDeleteState(Integer deleteState) {
        this.deleteState = deleteState;
    }
}