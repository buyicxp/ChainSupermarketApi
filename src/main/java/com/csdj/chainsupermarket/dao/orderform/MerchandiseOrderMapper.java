package com.csdj.chainsupermarket.dao.orderform;

import com.csdj.chainsupermarket.entity.orderform.MerchandiseOrderPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName MerchandiseOrderMapper
 * @Description: 商品订单操作接口
 * @Author 曾耀民
 * @Date 2019/12/09
 * @Version 1.0
 **/
@Mapper
public interface MerchandiseOrderMapper {
    /**
     * 查询商品订单列表
     *
     * @param userId  用户ID
     * @param shopId  门店ID
     * @param stat    订单状态
     * @param del     是否已删除
     * @param orderId 订单编号
     * @param betTime 订单生成时间_小
     * @param andTime 订单生成时间_大
     * @param index   查询开始索引
     * @param size    查询数量
     * @return 商品订单实体类列表
     */
    List<MerchandiseOrderPO> list(@Param("userId") Integer userId, @Param("shopId") Integer shopId, @Param("stat") Integer stat
            , @Param("del") Integer del, @Param("orderId") String orderId, @Param("betTime") String betTime
            , @Param("andTime") String andTime, @Param("index") Integer index, @Param("size") Integer size);

    /**
     * 查询商品订单数量
     *
     * @param userId  用户ID
     * @param shopId  门店ID
     * @param stat    订单状态
     * @param del     是否已删除
     * @param orderId 订单编号
     * @param betTime 订单生成时间_小
     * @param andTime 订单生成时间_大
     * @return 数量
     */
    int count(@Param("userId") Integer userId, @Param("shopId") Integer shopId, @Param("stat") Integer stat, @Param("del") Integer del
            , @Param("orderId") String orderId, @Param("betTime") String betTime, @Param("andTime") String andTime);

    /**
     * 根据唯一ID获取单个商品订单信息
     *
     * @param id 唯一ID
     * @return 商品订单实体类
     */
    MerchandiseOrderPO get(@Param("id") Integer id);

    /**
     * 根据唯一ID获取单个商品订单信息
     *
     * @param id    唯一ID
     * @param state 要修改的状态
     * @param del   删除状态
     * @return 影响行数
     */
    int merge(@Param("id") Integer id, @Param("state") Integer state, @Param("del") Integer del);
}
