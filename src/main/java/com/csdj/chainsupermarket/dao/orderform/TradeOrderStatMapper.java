package com.csdj.chainsupermarket.dao.orderform;

import com.csdj.chainsupermarket.entity.orderform.StatPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName MerchandiseOrderStatMapper
 * @Description: 交易订单状态操作接口
 * @Author 曾耀民
 * @Date 2019/12/09
 * @Version 1.0
 **/
@Mapper
public interface TradeOrderStatMapper {
    /**
     * 查询交易订单状态列表
     *
     * @param id ID
     * @return 状态实体类列表
     */
    List<StatPO> list(@Param("id") Integer id);
}
