package com.csdj.chainsupermarket.entity.marketing;

import lombok.Data;

import java.util.Date;

/**
 * DISTRIBUTION_TYPE
 * 优惠券的发放类型实体类
 * @author bianj
 * @version 1.0.0 2019-12-04
 */
@Data
public class DistributionType implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7216940341858128309L;

    /** 发放类型编号 */
    private Long distributionId;

    /** 发放类型名称 */
    private String distributionName;

    /** 创建时间 */
    private Date gmtCreate;

    /** 修改时间 */
    private Date gmtModified;


}