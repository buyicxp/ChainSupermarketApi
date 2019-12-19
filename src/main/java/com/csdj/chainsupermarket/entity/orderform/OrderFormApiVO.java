package com.csdj.chainsupermarket.entity.orderform;

import lombok.Data;

/**
 * @ClassName OrderFormApiVO
 * @Description: 订单API表现类
 * @Author 曾耀民
 * @Date 2019/12/17
 * @Version 1.0
 */
@Data
public class OrderFormApiVO {
    private Integer
            id,//订单绝对id，删除用
            orderId,//订单编号
            status,//订单状态
            count;//商品数量
    private Double
            amount;//金额
    private String
            name,//商品名称
            goodsImgUrl,//商品图片URL
            time;//下单时间
}
