package com.csdj.chainsupermarket.service.marketing;

import com.csdj.chainsupermarket.entity.marketing.ComputingTime;

import java.util.List;
import java.util.Map;

/**
 * @ Description   :  计算时间持久层接口
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 10:22
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 10:22
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public interface ComputingTimeService {
    /**
     * @Description  ： 查询单个计算时间方式
     * @author       : JY
     * @param        : [computingId]
     * @return       : com.csdj.chainsupermarket.entity.marketing.ComputingTime
     * @exception    :
     * @date         : 2019/12/7 13:50
     */
    ComputingTime findComputingTimeById(int computingId);
    /**
     * @Description  ：查询所有计算时间方式
     * @author       : JY
     * @param        : []
     * @return       : java.util.List<com.csdj.chainsupermarket.entity.marketing.ComputingTime>
     * @exception    :
     * @date         : 2019/12/9 23:40
     */
    List<ComputingTime> findByAll();
}
