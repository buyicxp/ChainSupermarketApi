package com.csdj.chainsupermarket.dao.shop.minuteshop;

import com.csdj.chainsupermarket.entity.shop.minuteshop.ShopMessage;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName ShopMessage
 * @Description: 门店数据持久层
 * @Author 刘时钟
 * @Date 2019/12/2
 * @Version V1.0
 **/
@Repository
public interface ShopMessageMapper {

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
