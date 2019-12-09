package com.csdj.chainsupermarket.entity.marketing;

import java.util.Date;

/**
 * COUPON_COLLECTION
 * 优惠券领取记录  用户外键未加
 * @author bianj
 * @version 1.0.0 2019-12-04
 */
public class CouponCollection implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -8266898803981640025L;

    /** 优惠领取记录编号，主键，自动增长 */
    private Long collectionId;

    /** 优惠券编号：外键 */
    private DiscountCoupon discountCoupon;

    /** 用户编号：外键 */
    private Long userId;

    /** 领取时间 */
    private Date drawTime;

    /** 使用: 0:已使用  1：未使用 */
    private Integer use;

    /** 删除状态 0：未删除  1：已删除 */
    private Integer status;

    /** 创建时间 */
    private Date gmtCreate;

    /** 修改时间 */
    private Date gmtModified;

}