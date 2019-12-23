package com.csdj.chainsupermarket.entity.marketing;

import java.util.Date;


/**
 * 预售记录表
 * @author 易富军
 * @version 1.0.0 2019-12-05
 */
public class AttendToBookingEntity {
    /**
     * 参加编号
     */
    private Integer attendId;
    /**
     * 活动编号
     */
    private Integer advanceId;
    /**
     * 店铺编号表示参加的店铺：外键
     */
    private Integer storeId;
    /**
     * 参加状态：0：活动参加  1：取消
     */
    private Integer attendStatus;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     *修改时间
     */
    private Date gmtModified;
    /** 预留1 */
    private String reserveOne;
    /** 预留2 */
    private String reserveTwo;
    /** 预留3 */
    private String reserveThree;

    /**门店表字段不需要使用*/
    private String spName;

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public AttendToBookingEntity(Integer advanceId, Integer storeId, Integer attendStatus, Date gmtCreate, Date gmtModified) {
        this.advanceId = advanceId;
        this.storeId = storeId;
        this.attendStatus = attendStatus;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public Integer getAttendId() {
        return attendId;
    }
    public void setAttendId(Integer attendId) {
        this.attendId = attendId;
    }

    public Integer getAdvanceId() {
        return advanceId;
    }

    public void setAdvanceId(Integer advanceId) {
        this.advanceId = advanceId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public AttendToBookingEntity() {
    }


    public Integer getAttendStatus() {
        return attendStatus;
    }

    public void setAttendStatus(Integer attendStatus) {
        this.attendStatus = attendStatus;
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
}
