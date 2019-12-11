package com.csdj.chainsupermarket.service.marketing;

import com.csdj.chainsupermarket.dao.marketing.DistributionTypeMapper;
import com.csdj.chainsupermarket.entity.marketing.DistributionType;

import java.util.List;

/**
 * @ Description   :  优惠券的发放类型的持久层接口
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 14:00
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 14:00
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public interface DistributionTypeService {

    /**
     * @Description  ：查询单个发放类型
     * @author       : JY
     * @param        : [distributionId] 发放类型主键
     * @return       : com.csdj.chainsupermarket.entity.marketing.DistributionType
     * @exception    :
     * @date         : 2019/12/9 14:20
     */
    DistributionType findById(int distributionId);

    /**
     * @Description  ：查询所有的发放类型
     * @author       : JY
     * @param        : []
     * @return       : java.util.List<com.csdj.chainsupermarket.entity.marketing.DistributionType>
     * @exception    :
     * @date         : 2019/12/9 14:49
     */
    List<DistributionType> findByAll();
}
