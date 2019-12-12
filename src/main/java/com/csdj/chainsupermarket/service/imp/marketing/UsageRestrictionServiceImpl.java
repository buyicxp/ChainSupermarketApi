package com.csdj.chainsupermarket.service.imp.marketing;

import com.csdj.chainsupermarket.dao.marketing.UsageRestrictionMapper;
import com.csdj.chainsupermarket.entity.marketing.UsageRestriction;
import com.csdj.chainsupermarket.service.marketing.UsageRestrictionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ Description   :  使用限制业务层实现层
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 15:13
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 15:13
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Service
public class UsageRestrictionServiceImpl implements UsageRestrictionService {
    @Resource
    UsageRestrictionMapper dao;
    @Override
    public UsageRestriction findById(int couponId) {
        return dao.findById(couponId);
    }
}
