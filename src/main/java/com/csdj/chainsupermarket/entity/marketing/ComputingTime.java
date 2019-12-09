package com.csdj.chainsupermarket.entity.marketing;
import lombok.Data;

import java.util.Date;

/**
 * COMPUTING_TIME
 * 计算时间方式实体类
 * @author bianj
 * @version 1.0.0 2019-12-04
 */
@Data
public class ComputingTime implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 2698707011354516199L;

    /** 计算时间方式编号 */
    private Long computingId;

    /** 计算时间名称 */
    private String computingName;

    /** 创建时间 */
    private Date gmtCreate;

    /** 修改时间 */
    private Date gmtModified;

}