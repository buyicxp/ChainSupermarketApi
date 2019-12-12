package com.csdj.chainsupermarket.service.shop.minuteshop;

import com.csdj.chainsupermarket.entity.shop.minuteshop.ShopMessage;

import java.util.List;

/**
 * @ClassName ShopMessage
 * @Description: 门店业务层接口
 * @Author 刘时钟
 * @Date 2019/12/2
 * @Version V1.0
 **/
public interface ShopMessageService {
    /**
     * 查询单个门店
     * @param spId 门店主键
     * @return
     */
    ShopMessage findById(int spId);

    /**
     * 查询所有门店
     * @return
     */
    List<ShopMessage> findByAll();

}
