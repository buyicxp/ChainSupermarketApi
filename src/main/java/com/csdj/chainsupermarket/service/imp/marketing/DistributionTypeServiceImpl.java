package com.csdj.chainsupermarket.service.imp.marketing;

import com.csdj.chainsupermarket.dao.marketing.DistributionTypeMapper;
import com.csdj.chainsupermarket.entity.marketing.DistributionType;
import com.csdj.chainsupermarket.service.marketing.DistributionTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ Description   :  优惠券的发放类型的业务层实现层
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 14:00
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 14:00
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Service
public class DistributionTypeServiceImpl implements DistributionTypeService {
    @Resource
    DistributionTypeMapper dao;

    @Override
    public DistributionType findById(int distributionId) {
        return dao.findById(distributionId);
    }

    @Override
    public List<DistributionType> findByAll() {
        return dao.findByAll();
    }
}
