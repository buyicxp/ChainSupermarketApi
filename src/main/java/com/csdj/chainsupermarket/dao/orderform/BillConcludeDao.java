package com.csdj.chainsupermarket.dao.orderform;

import com.csdj.chainsupermarket.entity.orderform.MerchandiseOrderPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author向仕懿
 * @date  2019/12/5
 * api下单接口
 */
@Mapper
public interface BillConcludeDao {
    /**
     * 订单表添加数据
     * @param mop 商品订单实体类
     * @return int
     */
    int insert(MerchandiseOrderPO mop);


    /**
     * 退款api接口 修改订单状态
     * @param id 传订单编号
     * @return  int
     */
    int update(int id);


    /**
     * 发货 修改订单状态
     * @param id 传订单编号
     * @return  int
     */
    int amend(int id);
}
