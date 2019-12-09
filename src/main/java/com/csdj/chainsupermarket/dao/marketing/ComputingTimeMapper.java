package com.csdj.chainsupermarket.dao.marketing;


import com.csdj.chainsupermarket.entity.marketing.ComputingTime;
import org.springframework.stereotype.Repository;

/**
 * @ Description   :  计算时间方式持久层接口
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 23:17
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 23:17
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Repository
public interface ComputingTimeMapper {

    /**
     * @Description  ： 查询单个计算时间方式
     * @author       : JY
     * @param        : [computingId]
     * @return       : com.csdj.chainsupermarket.entity.marketing.ComputingTime
     * @exception    :
     * @date         : 2019/12/7 13:50
     */
    ComputingTime findComputingTimeById(int computingId);
}