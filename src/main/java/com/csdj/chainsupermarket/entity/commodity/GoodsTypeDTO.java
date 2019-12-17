package com.csdj.chainsupermarket.entity.commodity;

import lombok.Data;

import java.util.Date;

/**
 * @author: 邹泓广
 * @date: 2019/12/11
 * DTO数据传输对象
 */
@Data
public class GoodsTypeDTO {
    /**
     * 商品类型序号
     */
    private Integer id;
    /**
     * 类型名称
     */
    private String typename;
    /**
     * 类型商品的数量
     */
    private Integer typecount;
    /**
     * 父子ID（父0，子1）
     */
    private Integer parentId;
}
