package com.csdj.chainsupermarket.service.marketing;

import com.csdj.chainsupermarket.entity.marketing.CouponCollection;

import java.util.List;
import java.util.Map;

/**
 * @ Description   :  优惠券领取记录持久层接口
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 10:23
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 10:23
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public interface CouponCollectionService {
    /**
     * @Description  ：查看已领取张数
     * @author       : JY
     * @param        : [couponId] 优惠券主键
     * @return       : int
     * @exception    :
     * @date         : 2019/12/8 11:21
     */
    int findAlreadyReceived(int couponId);
}
