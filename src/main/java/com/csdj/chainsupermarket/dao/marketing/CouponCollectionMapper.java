package com.csdj.chainsupermarket.dao.marketing;


import org.springframework.stereotype.Repository;

/**
 * @ Description   :  优惠券领取记录持久层接口  用户外键未加
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 23:19
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 23:19
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Repository
public interface CouponCollectionMapper  {

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