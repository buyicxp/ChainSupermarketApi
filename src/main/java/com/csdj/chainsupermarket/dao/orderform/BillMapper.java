package com.csdj.chainsupermarket.dao.orderform;

import com.csdj.chainsupermarket.entity.commodity.GoodsCommodity;
import com.csdj.chainsupermarket.entity.orderform.MerchandiseOrderPO;
import com.csdj.chainsupermarket.entity.shop.minuteshop.ShopMessage;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName BillMapper
 * @Description: 订单接口
 * @Author 李婉佳
 * @Date 2019/12/05
 * @Version V1.0
 **/
@Mapper
public interface BillMapper {
    /**
     * 查询门店列表
     * @return 门店集合
     */
    List<ShopMessage> findShopName();

    /**
     * 根据订单id修改订单数据
     * @param obj 订单对象
     * @return 返回影响行数
     */
    int updMerchandiseOrder(MerchandiseOrderPO obj);

    /**
     * 根据订单id删除订单(修改订单删除状态)
     * @param id 订单id
     * @return 返回影响行数
     */
    int delMerchandiseOrder(@Param("id") Integer id);

    /**
     * 根据门店id查询门店总会员数
     * @param shopId 门店id
     * @return 返回总会员数
     */
    int findShopMemberNewCount(@Param("shopId") Long shopId);

    /**
     * 根据门店id查询门店订单数
     * @param shopId 门店id
     * @return 返回订单数
     */
    int findShopBillCount(@Param("shopId") Integer shopId);

    /**
     * 根据门店id查询门店营业额
     * @param shopId 门店id
     * @return 返回营业额
     */
    Double findShopBillMoneySum(@Param("shopId") Integer shopId);

    /**
     * 根据门店id查询商品价格
     * @param shopId 门店id
     * @return 返回商品价格集合
     */
    List<GoodsCommodity> findGoodsPrice(@Param("shopId") Integer shopId);

    /**
     * 根据门店id查询订单商品数量
     * @param shopId 门店id
     * @return 返回订单商品数量集合
     */
    List<MerchandiseOrderPO> findBillGoodsCount(@Param("shopId") Integer shopId);

}
