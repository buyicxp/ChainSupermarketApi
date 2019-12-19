package com.csdj.chainsupermarket.entity.advertising;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author 丁丽群
 * @Description: 广告信息实体
 * @date 2019-12-05 16:35
 * @Version V1.0
 */
public class AdVerTiListVO<AdvertisingType> {
    /** 广告列表id*/
    private String adVerTiListId;
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
    
    public AdvertisingType getType() {
        return type;
    }
    
    public void setType(AdvertisingType type) {
        this.type = type;
    }
    
    /**
     * 广告分类编号映射分类对象
     */
    private AdvertisingType type;
    
    public String getAdvertisingTypeId() {
        return advertisingTypeId;
    }
    
    public void setAdvertisingTypeId(String advertisingTypeId) {
        this.advertisingTypeId = advertisingTypeId;
    }
    
    private String advertisingTypeId;
    /**
     *广告内容
     */
    private String advertContent;
    /**
     * 商品编号（外键）
     */
    private Integer commodityId;

    public String getAdVerTiListId() {
        return adVerTiListId;
    }

    public void setAdVerTiListId(String adVerTiListId) {
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
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getEnteringTime() {
        return enteringTime;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setEnteringTime(Date enteringTime) {
        this.enteringTime = enteringTime;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getUpdateTime() {
        return updateTime;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
