package com.csdj.chainsupermarket.entity.orderform;

import lombok.Data;

/**
 * @ClassName OrderFormVO
 * @Description: 订单表现类
 * @Author 曾耀民
 * @Date 2019/12/09
 * @Version 1.0
 */
@Data
public class OrderFormVO {
    private Integer
            id,//订单绝对id，删除用
            orderId,//订单编号
            count,//商品数量
            del;//删除状态（未删0，已删1）
    private Double
            amount;//实付金额
    private String
            name,//商品名称
            userName,//顾客信息
            contactInformation,//联系方式
            dis,//物流信息
            status,//订单状态
            defray,//支付状态
            time;//下单时间
}
