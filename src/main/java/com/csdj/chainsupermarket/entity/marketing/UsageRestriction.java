package com.csdj.chainsupermarket.entity.marketing;



import lombok.Data;

import java.util.Date;

/**
 * USAGE_RESTRICTION
 * 使用限制实体类
 * @author bianj
 * @version 1.0.0 2019-12-04
 */
@Data
public class UsageRestriction implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -401140619407658213L;

    /** 使用限制编号 */
    private Long restrictionId;

    /** 对应优惠券编号：外键 */
    private DiscountCoupon discountCoupon;

    /** 使用限制名称 */
    private String restrictionName;

    /** 开始时间 */
    private Date begintime;

    /** 结束时间 */
    private Date stoptime;

    /** 创建时间 */
    private Date gmtCreate;

    /** 修改时间 */
    private Date gmtModified;

}