package com.csdj.chainsupermarket.service.marketing;

import com.csdj.chainsupermarket.entity.marketing.DiscountCoupon;

import java.util.List;

/**
 * @ Description   :  优惠券持久层接口
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/5 23:04
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/5 23:04
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public interface DiscountCouponService {
    /**
     * @Description  ：查询所有优惠券信息 后台
     * @author       : JY
     * @param        : []
     * @return       : java.util.List<com.csdj.chainsupermarket.entity.marketing.DiscountCoupon>
     * @exception    :
     * @date         : 2019/12/7 14:52
     */
    List<DiscountCoupon> findByAll();
}
