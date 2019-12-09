package com.csdj.chainsupermarket.entity.marketing;

import lombok.Data;

import java.util.Date;

/**
 * UNAVAILABLE_TYPE
 * 优惠券的不可用类型实体类   商品外键没加
 * @author bianj
 * @version 1.0.0 2019-12-04
 */
@Data
public class UnavailableType implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 4170662524666973551L;

    /** 不可用类型编号 */
    private Long unavailableId;

    /** 对应商品编号外键 */
    private Long commdityId;

    /** 对应优惠券编号外键 */
    private DiscountCoupon discountCoupon;

    /** 创建时间 */
    private Date gmtCreate;

    /** 修改时间 */
    private Date gmtModified;

}