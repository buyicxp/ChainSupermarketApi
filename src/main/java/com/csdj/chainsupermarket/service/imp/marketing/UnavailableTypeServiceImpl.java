package com.csdj.chainsupermarket.service.imp.marketing;

import com.csdj.chainsupermarket.dao.marketing.UnavailableTypeMapper;
import com.csdj.chainsupermarket.entity.marketing.UnavailableType;
import com.csdj.chainsupermarket.service.marketing.UnavailableTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ Description   :  优惠券的不可用类型业务层实现层
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 14:39
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 14:39
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Service
public class UnavailableTypeServiceImpl implements UnavailableTypeService {

    @Resource
    UnavailableTypeMapper dao;
    @Override
    public UnavailableType findById(int couponId) {
        return dao.findById(couponId);
    }
}
