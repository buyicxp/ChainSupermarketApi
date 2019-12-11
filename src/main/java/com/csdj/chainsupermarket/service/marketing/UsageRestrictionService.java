package com.csdj.chainsupermarket.service.marketing;

import com.csdj.chainsupermarket.entity.marketing.UsageRestriction;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ Description   :  使用限制持久层接口
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 15:13
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 15:13
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public interface UsageRestrictionService {
    /**
     * @Description  ：查询使用限制
     * @author       : JY
     * @param        : [couponId] 优惠券ID
     * @return       : com.csdj.chainsupermarket.entity.marketing.UsageRestriction
     * @exception    :
     * @date         : 2019/12/9 20:49
     */
    UsageRestriction findById(int couponId);
}
