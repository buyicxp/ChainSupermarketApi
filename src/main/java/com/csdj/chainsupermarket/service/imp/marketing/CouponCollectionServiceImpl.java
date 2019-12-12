package com.csdj.chainsupermarket.service.imp.marketing;


import com.csdj.chainsupermarket.dao.marketing.CouponCollectionMapper;
import com.csdj.chainsupermarket.service.marketing.CouponCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ Description   :  优惠券领取记录业务层实现层
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 10:23
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 10:23
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Service
public class CouponCollectionServiceImpl implements CouponCollectionService {
    @Resource
    CouponCollectionMapper dao;
    @Override
    public int findAlreadyReceived(int couponId) {
        return dao.findAlreadyReceived(couponId);
    }
}
