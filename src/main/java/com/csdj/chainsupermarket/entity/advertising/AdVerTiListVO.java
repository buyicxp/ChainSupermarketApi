package com.csdj.chainsupermarket.entity.advertising;

import java.util.Date;

/**
 * @author 丁丽群
 * @Description: 广告信息实体
 * @date 2019-12-05 16:35
 * @Version V1.0
 */
public class AdVerTiListVO {
    /** 广告列表id*/
    private Integer adVerTiListId;
    /**广告图标*/
    private String adVerTiImage;
    /**
     * 广告名称
     */
    private String adVerTiName;
    /**
     * 广告链接
     */
    private String adVerTiLink;
    /**
     * 是否可用
     */
    private Integer usable;
    /**
     * 排序
     */
    private Integer orderByBy;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 录入时间
     */
    private Date enteringTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 广告分类编号
     */
    private Integer advertisingTypeId;
    /**
     * 与广告分类表关联
     */
    private String advertisingName;
    /**
     *广告内容
     */
    private String advertContent;
    /**
     * 商品编号（外键）
     */
    private Integer commodityId;

    /**
     * 显示数据
     * @return 广告信息
     */
    @Override
    public String toString() {
        return "AdVerTiListVO{" +
                "adVerTiListId=" + adVerTiListId +
                ", adVerTiImage='" + adVerTiImage + '\'' +
                ", adVerTiName='" + adVerTiName + '\'' +
                ", adVerTiLink='" + adVerTiLink + '\'' +
                ", usable=" + usable +
                ", orderByBy=" + orderByBy +
                ", createTime=" + createTime +
                ", enteringTime=" + enteringTime +
                ", updateTime=" + updateTime +
                ", advertisingTypeId=" + advertisingTypeId +
                ", advertisingName=" + advertisingName +
                ", advertContent='" + advertContent + '\'' +
                ", commodityId=" + commodityId +
                '}';
    }

    public Integer getAdVerTiListId() {
        return adVerTiListId;
    }

    public void setAdVerTiListId(Integer adVerTiListId) {
        this.adVerTiListId = adVerTiListId;
    }

    public String getAdVerTiImage() {
        return adVerTiImage;
    }

    public void setAdVerTiImage(String adVerTiImage) {
        this.adVerTiImage = adVerTiImage;
    }

    public String getAdVerTiName() {
        return adVerTiName;
    }

    public void setAdVerTiName(String adVerTiName) {
        this.adVerTiName = adVerTiName;
    }

    public String getAdVerTiLink() {
        return adVerTiLink;
    }

    public void setAdVerTiLink(String adVerTiLink) {
        this.adVerTiLink = adVerTiLink;
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

    public Date getCreateTime() {
        return createTime;
    }

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

    public Integer getAdvertisingTypeId() {
        return advertisingTypeId;
    }

    public void setAdvertisingTypeId(Integer advertisingTypeId) {
        this.advertisingTypeId = advertisingTypeId;
    }

    public String getAdvertContent() {
        return advertContent;
    }

    public void setAdvertContent(String advertContent) {
        this.advertContent = advertContent;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

}
