package com.csdj.chainsupermarket.dao.marketing;

import com.csdj.chainsupermarket.entity.marketing.CouponType;
import org.springframework.stereotype.Repository;

/**
 * @ Description   : 优惠券类型持久层接口
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 23:20
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 23:20
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Repository
public interface CouponTypeMapper {

    /**
     * @Description  ：  查询单个优惠券类型
     * @author       : JY
     * @param        : [couponTypeId] 优惠券类型主键
     * @return       : com.csdj.chainsupermarket.entity.marketing.CouponType
     * @exception    :
     * @date         : 2019/12/7 12:44
     */
    CouponType findCouponTypeById(int couponTypeId);

}