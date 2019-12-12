package com.csdj.chainsupermarket.service.marketing;

import com.csdj.chainsupermarket.entity.marketing.UnavailableType;

import java.util.List;

/**
 * @ Description   :  优惠券的不可用类型持久层接口
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 14:39
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 14:39
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public interface UnavailableTypeService {
    /**
     * @Description  ：查询优惠券的不可用类型
     * @author       : JY
     * @param        : [couponId]
     * @return       : com.csdj.chainsupermarket.entity.marketing.UnavailableType
     * @exception    :
     * @date         : 2019/12/9 21:41
     */
    UnavailableType findById(int couponId);
}
