package com.csdj.chainsupermarket.entity.marketing;

import com.csdj.chainsupermarket.entity.commodity.GoodsCommodity;
import com.csdj.chainsupermarket.entity.commodity.GoodsType;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @version 版本号        1.0
 * @author： 作者名称     张晟
 * @date 创建时间        2019/12/4/0004 16:04
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
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
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date activityTime;

    /** 活动范围（外键） */
    private ActivityRangeVO range;

    /** 活动状态 */
    private String activityState;
    
    public Date getEndtime() {
        return endtime;
    }
    
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
    
    /** 执行状态 */
    private String executingState;

    /** 活动详情 */
    private String activityDetail;

    /** 删除改变状态为不显示 */
    private Integer deleteState;
    /**
     * 商品（外键）
     */
    private GoodsCommodity goodsCommodity;
    /**
     * 商品类别（外键）
     */
    private GoodsType goodsType;
    /** 满足多少金额可参加活动 */
    private Integer money;
    
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date endtime;


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

    public Date getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(Date activityTime) {
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

    public GoodsCommodity getGoodsCommodity() {
        return goodsCommodity;
    }

    public void setGoodsCommodity(GoodsCommodity goodsCommodity) {
        this.goodsCommodity = goodsCommodity;
    }

    public GoodsType getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(GoodsType goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "FullActivityVO{" +
                "activityid=" + activityid +
                ", activityName='" + activityName + '\'' +
                ", type=" + type +
                ", activityTime=" + activityTime +
                ", range=" + range +
                ", activityState='" + activityState + '\'' +
                ", executingState='" + executingState + '\'' +
                ", activityDetail='" + activityDetail + '\'' +
                ", deleteState=" + deleteState +
                ", goodsCommodity=" + goodsCommodity +
                ", goodsType=" + goodsType +
                ", money=" + money +
                '}';
    }
}