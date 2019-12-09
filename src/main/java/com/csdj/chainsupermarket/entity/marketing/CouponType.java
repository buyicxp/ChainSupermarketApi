package com.csdj.chainsupermarket.entity.marketing;

import lombok.Data;

import java.util.Date;

/**
 * COUPON_TYPE
 * 优惠券类型实体类
 * @author bianj
 * @version 1.0.0 2019-12-04
 */
@Data
public class CouponType implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -4524047391520824963L;

    /** 优惠券类型编号 */
    private Long couponTypeId;

    /** 优惠券类型名称 */
    private String couponTypeName;

    /** 创建时间 */
    private Date gmtCreate;

    /** 修改时间 */
    private Date gmtModified;


}