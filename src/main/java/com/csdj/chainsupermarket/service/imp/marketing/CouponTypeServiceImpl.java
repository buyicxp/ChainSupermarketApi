package com.csdj.chainsupermarket.service.imp.marketing;


import com.csdj.chainsupermarket.dao.marketing.CouponTypeMapper;
import com.csdj.chainsupermarket.entity.marketing.CouponType;
import com.csdj.chainsupermarket.service.marketing.CouponTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ Description   :  优惠券类型业务层实现层
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 13:52
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 13:52
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Service
public class CouponTypeServiceImpl implements CouponTypeService {

    @Resource
    CouponTypeMapper dao;

    @Override
    public List<CouponType> findByAll() {
        return dao.findByAll();
    }
}
