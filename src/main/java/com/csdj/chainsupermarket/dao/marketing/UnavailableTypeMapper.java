package com.csdj.chainsupermarket.dao.marketing;

import com.csdj.chainsupermarket.entity.marketing.UnavailableType;
import org.springframework.stereotype.Repository;

/**
 * @ Description   :  优惠券的不可用类型持久层接口   商品外键没加
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 23:22
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 23:22
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Repository
public interface UnavailableTypeMapper {
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