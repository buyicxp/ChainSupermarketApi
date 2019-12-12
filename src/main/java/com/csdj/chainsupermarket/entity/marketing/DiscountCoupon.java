package com.csdj.chainsupermarket.entity.marketing;

import com.csdj.chainsupermarket.entity.shop.minuteshop.ShopMessage;
import lombok.Data;

import java.util.Date;

/**
 * DISCOUNT_COUPON
 * 优惠券实体类
 * @author bianj
 * @version 1.0.0 2019-12-04
 */
@Data
public class DiscountCoupon implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 5485605786819430570L;

    /** 优惠券编号 */
    private Long couponId;

    /** 优惠券名称 */
    private String couponName;

    /** 优惠券类型编号：外键 */
    private CouponType couponType;

    /** 面值 */
    private Integer faceValue;

    /** 发放类型 */
    private DistributionType distributionType;

    /** 每人限领张数 */
    private Integer limitGet;

    /** 发放总量 */
    private Integer paymentAmount;

    /** 开始发放时间 */
    private Date begintime;

    /** 结束发放时间 */
    private Date endtime;

    /** 有效期：0：只设置领取后立刻生效 */
    private Integer periodOfValidity;

    /** 有效天数 */
    private Integer effectiveDays;

    /** 生效期：几天后生效 */
    private Integer effectivePeriod;

    /** 生效开始时间 */
    private Date startTime;

    /** 生效后的截止时间 */
    private Date deadline;

    /** 计算时间方式：外键 */
    private ComputingTime computingTime;

    /** 门店编号：外键 */
    private ShopMessage shop;

    /** 订单金额 */
    private Integer money;

    /** 优惠类型编号：外键 */
    private PreferentialType preferentialType;

    /** 是否过期  0:未过期 1已过期 */
    private Integer staleDated;

    /** 是否以删除 0未删除1 以删除 */
    private Integer status;

    /** 创建时间 */
    private Date gmtCreate;

    /** 修改时间 */
    private Date gmtModified;

}