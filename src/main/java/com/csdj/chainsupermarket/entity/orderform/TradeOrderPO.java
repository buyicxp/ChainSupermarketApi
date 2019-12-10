package com.csdj.chainsupermarket.entity.orderform;

import lombok.Data;

/**
 * @ClassName MerchandiseOrderPO
 * @Description: 交易订单实体类
 * @Author 曾耀民
 * @Date 2019/12/09
 * @Version 1.0
 */
@Data
public class TradeOrderPO {
    private Integer
            id,//交易id 必要
            userId,//用户id 必要
            stat,//订单状态 必要
            del;//删除标记（0：未删，1：已删） 必要
    private Double
            amount;//交易金额 必要
    private String
            time;//交易时间 必要
}
