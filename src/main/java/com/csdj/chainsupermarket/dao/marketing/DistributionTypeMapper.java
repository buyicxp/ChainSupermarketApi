package com.csdj.chainsupermarket.dao.marketing;

import com.csdj.chainsupermarket.entity.marketing.DistributionType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * DISTRIBUTION_TYPE
 * 优惠券的发放类型实体类
 * @author bianj
 * @version 1.0.0 2019-12-04
 */
@Repository
public interface DistributionTypeMapper {

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
    List<DistributionType>  findByAll();
}