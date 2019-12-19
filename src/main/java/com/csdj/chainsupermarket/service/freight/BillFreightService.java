package com.csdj.chainsupermarket.service.freight;

import com.csdj.chainsupermarket.entity.freight.BillFreight;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @InterfaceName BillFreightService
 * @Description 物流操作业务层
 * @Author 孤街
 * @Date 2019/12/2 16:40
 * @Version 1.0
 **/
public interface BillFreightService {
    /**
     * 查询所有物流信息
     * @param pageNum 当前页
     * @param pageSize 页大小
     * @return 返回物流对象的集合的分页对象
     */
    PageInfo<BillFreight> listFreight(Integer pageNum, Integer pageSize);

    /**
     * 增加物流
     * @param freight 要增加的物流对象
     * @return  返回执行结果受影响行数
     */
    Integer saveFreight(BillFreight freight);

    /**
     * 按id查询物流信息
     * @param formId 订单编号
     * @return 返回对应的物流信息
     */
    BillFreight getFreightById(Integer formId);

    /**
     * 修改物流信息
     * @param freight 要修改的物流对象
     * @return 返回修改结果
     */
    Integer updateFreight(BillFreight freight);
}
