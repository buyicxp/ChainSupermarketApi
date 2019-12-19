package com.csdj.chainsupermarket.entity.advertising;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author丁丽群
 * @Description: 广告分类实体类
 * @date 2019-12-05 16:50
 * @Version V1.0
 */
public class AdvertisingTypeVO {
    /**
     *广告分类编号
     */
    private String advertisingId;
    /**
     *广告分类名称
     */
    private String advertisingName;
    /**
     *是否可用
     */
    private Integer usable;
    /**
     *排序
     */
    private Integer orderByBy;
    /**
     *创建时间
     */
    private Date createTime;
    /**
     *录入时间
     */
    private Date enteringTime;
    /**
     *修改时间
     */
    private Date updateTime;
    /**
     *内容
     */
    private String advertContent;

    /**
     * 数据
     */
    private int num;
    /**
     * 显示数据
     * @return 广告分类信息
     */
    @Override
    public String toString() {
        return "AdvertisingTypeVO{" +
                "advertising_id=" + advertisingId +
                ", advertising_name='" + advertisingName + '\'' +
                ", usable=" + usable +
                ", orderByBy=" + orderByBy +
                ", createTime=" + createTime +
                ", enteringTime=" + enteringTime +
                ", updateTime=" + updateTime +
                ", advertContent='" + advertContent + '\'' +
                '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getAdvertisingId() {
        return advertisingId;
    }

    public void setAdvertisingId(String advertisingId) {
        this.advertisingId = advertisingId;
    }

    public String getAdvertisingName() {
        return advertisingName;
    }

    public void setAdvertisingName(String advertisingName) {
        this.advertisingName = advertisingName;
    }

    public Integer getUsable() {
        return usable;
    }

    public void setUsable(Integer usable) {
        this.usable = usable;
    }

    public Integer getOrderByBy() {
        return orderByBy;
    }

    public void setOrderByBy(Integer orderByBy) {
        this.orderByBy = orderByBy;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreateTime() {
        return createTime;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEnteringTime() {
        return enteringTime;
    }

    public void setEnteringTime(Date enteringTime) {
        this.enteringTime = enteringTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getAdvertContent() {
        return advertContent;
    }

    public void setAdvertContent(String advertContent) {
        this.advertContent = advertContent;
    }
}
