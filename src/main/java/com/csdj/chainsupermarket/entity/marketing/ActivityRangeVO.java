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

/**
 * ACTIVITY_RANGE
 * 
 * @author bianj
 * @version 1.0.0 2019-12-04
 */
public class ActivityRangeVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -1898224785872877672L;

    /** 范围id */
    private Long rangeid;

    /** 活动范围 */
    private String activityRange;

    /** 商品id（外键） */
    private Long goodsid;

    /** 商品类型id（外键） */
    private Long goodsTypeid;

    /**
     * 获取范围id
     * 
     * @return 范围id
     */
    public Long getRangeid() {
        return this.rangeid;
    }

    /**
     * 设置范围id
     * 
     * @param rangeid
     *          范围id
     */
    public void setRangeid(Long rangeid) {
        this.rangeid = rangeid;
    }

    /**
     * 获取活动范围
     * 
     * @return 活动范围
     */
    public String getActivityRange() {
        return this.activityRange;
    }

    /**
     * 设置活动范围
     * 
     * @param activityRange
     *          活动范围
     */
    public void setActivityRange(String activityRange) {
        this.activityRange = activityRange;
    }

    /**
     * 获取商品id（外键）
     * 
     * @return 商品id（外键）
     */
    public Long getGoodsid() {
        return this.goodsid;
    }

    /**
     * 设置商品id（外键）
     * 
     * @param goodsid
     *          商品id（外键）
     */
    public void setGoodsid(Long goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * 获取商品类型id（外键）
     * 
     * @return 商品类型id（外键）
     */
    public Long getGoodsTypeid() {
        return this.goodsTypeid;
    }

    /**
     * 设置商品类型id（外键）
     * 
     * @param goodsTypeid
     *          商品类型id（外键）
     */
    public void setGoodsTypeid(Long goodsTypeid) {
        this.goodsTypeid = goodsTypeid;
    }
}