package com.csdj.chainsupermarket.dao.marketing;

import com.csdj.chainsupermarket.entity.marketing.DiscountCoupon;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @ Description   :  优惠券持久层接口
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 23:21
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 23:21
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Repository
public interface DiscountCouponMapper {

    /**
     * @Description  ：查询优惠券信息 后台
     * @author       : JY
     * @param        : [map] 搜索条件
     * @return       : java.util.List<com.csdj.chainsupermarket.entity.marketing.DiscountCoupon>
     * @exception    :
     * @date         : 2019/12/7 14:52
     */
    List<DiscountCoupon> findByAll(Map map);

    /**
     * @Description  ：添加优惠券
     * @author       : JY
     * @param        : [discountCoupon]
     * @return       : int
     * @exception    :
     * @date         : 2019/12/9 10:52
     */
    int addDiscountCoupon(DiscountCoupon discountCoupon);
}