package com.csdj.chainsupermarket.entity.marketing;
import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author 贺芳
 * 实体类
 */
public class SnapUpActivities {

        /** 抢购活动编号 */
        private Integer ctivityId;


        /** 活动名称 */
        private String activityName;

        /** 活动开始时间 */
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        @JSONField(format = "yyyy-MM-dd HH:mm:ss")
        private Date activitystartTime;

        /** 活动结束时间 */
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        @JSONField(format = "yyyy-MM-dd HH:mm:ss")
        private Date activityendTime;

        /** 活动状态（0  1） */
        private Integer activitydTimeQuantum;

        /** 商品编号 */
        private Integer commodityId;

        /** 活动限购数量 */
        private Integer activityNumber;

        /** 用户类型(0 1。。。) */
        private Integer userType;

        /** 录入时间 */
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        @JSONField(format = "yyyy-MM-dd HH:mm:ss")
        private Date gmtCreate;

        /** 修改时间 */
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        @JSONField(format = "yyyy-MM-dd HH:mm:ss")
        private Date gmtModified;

        /** 店铺ID */
        private  String sophId;

        /**
         * 获取抢购活动编号
         *
         * @return 抢购活动编号
         */
        public Integer getCtivityId() {
            return this.ctivityId;
        }

        /**
         * 设置抢购活动编号
         *
         * @param ctivityId
         *          抢购活动编号
         */
        public void setCtivityId(Integer ctivityId) {
            this.ctivityId = ctivityId;
        }

        /**
         * 获取活动名称
         *
         * @return 活动名称
         */
        public String getActivityName() {
            return this.activityName;
        }

        /**
         * 设置活动名称
         *
         * @param activityName
         *          活动名称
         */
        public void setActivityName(String activityName) {
            this.activityName = activityName;
        }

        /**
         * 获取活动开始时间
         *
         * @return 活动开始时间
         */
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        @JSONField(format = "yyyy-MM-dd HH:mm:ss")
        public Date getActivitystartTime() {
            return this.activitystartTime;
        }

        /**
         * 设置活动开始时间
         *
         * @param activitystartTime
         *          活动开始时间
         */
        public void setActivitystartTime(Date activitystartTime) {
            this.activitystartTime = activitystartTime;
        }

        /**
         * 获取活动结束时间
         *
         * @return 活动结束时间
         */
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        @JSONField(format = "yyyy-MM-dd HH:mm:ss")
        public Date getActivityendTime() {
            return this.activityendTime;
        }

        /**
         * 设置活动结束时间
         *
         * @param activityendTime
         *          活动结束时间
         */
        public void setActivityendTime(Date activityendTime) {
            this.activityendTime = activityendTime;
        }

        /**
         * 获取活动时间段（0  1）
         *
         * @return 活动时间段（0  1）
         */
        public Integer getActivitydTimeQuantum() {
            return this.activitydTimeQuantum;
        }

        /**
         * 设置活动时间段（0  1）
         *
         * @param activitydTimeQuantum
         *          活动时间段（0  1）
         */
        public void setActivitydTimeQuantum(Integer activitydTimeQuantum) {
            this.activitydTimeQuantum = activitydTimeQuantum;
        }

        /**
         * 获取商品编号
         *
         * @return 商品编号
         */
        public Integer getCommodityId() {
            return this.commodityId;
        }

        /**
         * 设置商品编号
         *
         * @param commodityId
         *          商品编号
         */
        public void setCommodityId(Integer commodityId) {
            this.commodityId = commodityId;
        }

        /**
         * 获取活动限购数量
         *
         * @return 活动限购数量
         */
        public Integer getActivityNumber() {
            return this.activityNumber;
        }

        /**
         * 设置活动限购数量
         *
         * @param activityNumber
         *          活动限购数量
         */
        public void setActivityNumber(Integer activityNumber) {
            this.activityNumber = activityNumber;
        }

        /**
         * 获取用户类型(0 1。。。)
         *
         * @return 用户类型(0 1
         */
        public Integer getUserType() {
            return this.userType;
        }

        /**
         * 设置用户类型(0 1。。。)
         *
         * @param userType
         *          用户类型(0 1
         */
        public void setUserType(Integer userType) {
            this.userType = userType;
        }

        /**
         * 获取创建时间
         *
         * @return 创建时间
         */
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        @JSONField(format = "yyyy-MM-dd HH:mm:ss")
        public Date getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * 设置创建时间
         *
         * @param gmtCreate
         *          创建时间
         */
        public void setGmtCreate(Date gmtCreate) {
            this.gmtCreate = gmtCreate;
        }

        /**
         * 获取修改时间
         *
         * @return 修改时间
         */
        @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        @JSONField(format = "yyyy-MM-dd HH:mm:ss")
        public Date getGmtModified() {
            return this.gmtModified;
        }

        /**
         * 设置修改时间
         *
         * @param gmtModified
         *          修改时间
         */
        public void setGmtModified(Date gmtModified) {
            this.gmtModified = gmtModified;
        }

    /**
     * 获取店铺ID
     * @return
     */
    public String getSophId() {
            return sophId;
     }

    /**
     * 设置店铺ID
     * @param sophId
     */
    public void setSophId(String sophId) {
        this.sophId = sophId;
        }


    @Override
    public String toString() {
        return "SnapUpActivities{" +
                "ctivityId=" + ctivityId +
                ", activityName='" + activityName + '\'' +
                ", activitystartTime=" + activitystartTime +
                ", activityendTime=" + activityendTime +
                ", activitydTimeQuantum=" + activitydTimeQuantum +
                ", commodityId=" + commodityId +
                ", activityNumber=" + activityNumber +
                ", userType=" + userType +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", sophId='" + sophId + '\'' +
                '}';
    }
}
