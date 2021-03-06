package com.csdj.chainsupermarket.service.orderform;

import com.csdj.chainsupermarket.entity.orderform.*;

import java.util.List;

/**
 * @ClassName OrderFormService
 * @Description: 订单操作Service接口
 * @Author 曾耀民
 * @Date 2019/12/09
 * @Version 1.0
 */
public interface OrderFormService {

    /**
     * 查询商品订单详细信息
     *
     * @param id 交易订单编号
     * @return 订单详细信息表现类
     */
    List<OrderFormDetailVO> detailById(String id);

    /**
     * 查询商品订单摘要列表
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
     * @return 订单表现类列表
     */
    List<OrderFormVO> summary(Integer userId, Integer shopId, Integer stat, Integer del, String orderId, String betTime, String andTime, Integer index, Integer size);

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
    int count(Integer userId, Integer shopId, Integer stat, Integer del, String orderId, String betTime, String andTime);

    /**
     * 根据唯一ID获取单个商品订单信息
     *
     * @param id 唯一ID
     * @return 订单详情表现类
     */
    OrderFormDetailVO get(Integer id);

    /**
     * 根据用户信息获取商品订单信息
     *
     * @param userId 用户ID
     * @param shopId 门店ID
     * @param stat   订单状态
     * @return 订单API表现类列表
     */
    List<OrderFormApiVO> listByUser(Integer userId, Integer shopId, Integer stat);

    /**
     * 根据唯一ID修改单个商品订单信息
     *
     * @param id    唯一ID
     * @param state 要修改的状态
     * @param del   删除状态
     * @return 影响的行数
     */
    int merge(Integer id, Integer state, Integer del);
    /**
     * 根据唯一ID修改单个商品订单信息
     *
     * @param id    唯一ID
     * @return 订单详情Api表现类
     */
    OrderFormDetailApiVO seek(Integer id);
}
