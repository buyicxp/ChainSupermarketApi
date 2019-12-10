package com.csdj.chainsupermarket.service.orderform;

import com.csdj.chainsupermarket.entity.orderform.OrderFormDetailVO;
import com.csdj.chainsupermarket.entity.orderform.OrderFormVO;

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
     * @param stat    订单状态
     * @param del     是否已删除
     * @param orderId 订单编号
     * @param betTime 订单生成时间_小
     * @param andTime 订单生成时间_大
     * @param index   查询开始索引
     * @param size    查询数量
     * @return 订单表现类
     */
    List<OrderFormVO> summary(Integer userId, Integer stat, Integer del, String orderId, String betTime, String andTime, Integer index, Integer size);

    /**
     * 查询商品订单数量
     *
     * @param userId  用户ID
     * @param stat    订单状态
     * @param del     是否已删除
     * @param orderId 订单编号
     * @param betTime 订单生成时间_小
     * @param andTime 订单生成时间_大
     * @return 数量
     */
    int count(Integer userId, Integer stat, Integer del, String orderId, String betTime, String andTime);
}
