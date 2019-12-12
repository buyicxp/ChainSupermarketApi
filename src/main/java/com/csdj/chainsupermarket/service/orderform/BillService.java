package com.csdj.chainsupermarket.service.orderform;

import com.csdj.chainsupermarket.entity.commodity.GoodsCommodity;
import com.csdj.chainsupermarket.entity.orderform.MerchandiseOrderPO;
import com.csdj.chainsupermarket.entity.shop.minuteshop.ShopMessage;

import java.util.List;

/**
 * @ClassName BillService
 * @Description: 订单Service接口
 * @Author 李婉佳
 * @Date 2019/12/05
 * @Version V1.0
 **/
public interface BillService {
    /**
     * 查询门店列表
     * @return 门店集合
     */
    List<ShopMessage> findShopNameService();

    /**
     * 修改订单数据
     * @param obj 订单对象
     * @return 返回影响行数
     */
    int updMerchandiseOrderService(MerchandiseOrderPO obj);

    /**
     * 删除订单(修改订单删除状态)
     * @param id 订单id
     * @return 返回影响行数
     */
    int delMerchandiseOrderService(Integer id);

    /**
     * 根据门店id查询门店总会员数
     * @param shopId 门店id
     * @return 返回总会员数
     */
    int findShopMemberNewCountService(Long shopId);

    /**
     * 根据门店id查询门店订单数
     * @param shopId 门店id
     * @return 返回订单数
     */
    int findShopBillCountService(Integer shopId);

    /**
     * 根据门店id查询门店营业额
     * @param shopId 门店id
     * @return 返回营业额
     */
    Double findShopBillMoneySumService(Integer shopId);

    /**
     * 根据门店id查询商品价格
     * @param shopId 门店id
     * @return 返回价格集合
     */
    List<GoodsCommodity> findGoodsPriceService(Integer shopId);

    /**
     * 根据门店id查询订单商品数量
     * @param shopId 门店id
     * @return 返回订单商品数量集合
     */
    List<MerchandiseOrderPO> findBillGoodsCountService(Integer shopId);
}
