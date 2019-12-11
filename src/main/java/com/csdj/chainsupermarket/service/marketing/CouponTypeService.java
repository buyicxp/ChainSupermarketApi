package com.csdj.chainsupermarket.service.marketing;

import com.csdj.chainsupermarket.entity.marketing.CouponType;

import java.util.List;

/**
 * @ Description   :  优惠券类型持久层接口
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 13:52
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 13:52
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public interface CouponTypeService {
    /**
     * @Description  ：查询所有优惠券类型
     * @author       : JY
     * @param        : []
     * @return       : java.util.List<com.csdj.chainsupermarket.entity.marketing.CouponType>
     * @exception    :
     * @date         : 2019/12/9 13:46
     */
    List<CouponType> findByAll();
}
