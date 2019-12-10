package com.csdj.chainsupermarket.entity.orderform;

import lombok.Data;

/**
 * @ClassName MerchandiseOrderPO
 * @Description: 商品订单实体类
 * @Author 曾耀民
 * @Date 2019/12/09
 * @Version 1.0
 */
@Data
public class MerchandiseOrderPO {
    private Integer
            id,//订单唯一id 自动
            orderId,//订单编号（被引用，如物流） 必要
            tradeId,//交易订单id（引用交易订单表） 不必要
            shopId,//门店id（引用门店表shop_message） 必要
            goodsId,//商品id（引用商品表goods_product） 必要
            count,//商品数量 必要
            userId,//用户id（引用用户表member） 必要
            disId,//配送id（引用配送表goods_dispatching） 必要
            stat,//订单状态（引用商品订单状态表） 必要
            del;//删除标记（0：未删，1：已删） 必要
    private String
            time;//下单时间（后端生成） 必要
}