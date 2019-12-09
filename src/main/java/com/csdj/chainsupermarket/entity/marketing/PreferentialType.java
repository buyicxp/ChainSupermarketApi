package com.csdj.chainsupermarket.entity.marketing;

import lombok.Data;

import java.util.Date;

/**
 * PREFERENTIAL_TYPE
 * 优惠类型实体类
 * @author bianj
 * @version 1.0.0 2019-12-04
 */
@Data
public class PreferentialType implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -6130248678851942414L;

    /** 优惠类型编号 */
    private Long preferentialId;

    /** 优惠类型名称 */
    private String preferentialName;

    /** 创建时间 */
    private Date gmtCreate;

    /** 修改时间 */
    private Date gmtModified;


}