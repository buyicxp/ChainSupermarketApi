package com.csdj.chainsupermarket.entity.orderform;

import lombok.Data;

/**
 * @ClassName OrderFormDetailApiVO
 * @Description: 订单详情Api表现类
 * @Author 曾耀民
 * @Date 2019/12/18
 * @Version 1.0
 */
@Data
public class OrderFormDetailApiVO {
    private Integer
            tradeId,//交易订单id
            stat,//商品状态
            count;//商品数量
    private Double
            price;//商品价格
    private String
            goodsName,//商品名称
            goodsImgUrl,//商品图片URL
            dis,//配送方式
            time,//预约时间
            contact,//联系人
            phone,//电话
            address;//地址
}
