package com.csdj.chainsupermarket.dao.freight;

import com.csdj.chainsupermarket.entity.freight.BillFreight;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @InterfaceName BillFreightMapper
 * @Description 物流操作接口
 * @Author 孤街
 * @Date 2019/12/2 16:19
 * @Version 1.0
 **/
@Repository
public interface BillFreightMapper {

    /**
     * 按条件查询物流信息
     * @param formId 目标物流编号
     * @return 返回对应物流信息集合
     *
     */
    List<BillFreight> listConditionFreight(@Param("formId") Integer formId);

    /**
     * 增加物流
     * @param freight 要增加的物流对象
     * @return  返回执行结果受影响行数
     */
    Integer saveFreight(BillFreight freight);

    /**
     * 修改物流信息
     * @param freight 要修改的物流对象
     * @return 返回修改结果
     */
    Integer updateFreight(BillFreight freight);
}
