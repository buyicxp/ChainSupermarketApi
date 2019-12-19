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

    /**
     * @Description  ：用户领取优惠券
     * @author       : JY
     * @param        : [couponId, userId]优惠券编号，用户编号
     * @return       : int
     * @exception    :
     * @date         : 2019/12/16 23:32
     */
    int addCouponCollection(int couponId,int userId);

    /**
     * @Description  ： 查询优惠券的领取记录
     * @author       : JY
     * @param        : [couponId] 优惠券主键
     * @return       : java.util.List<com.csdj.chainsupermarket.entity.marketing.CouponCollection>
     * @exception    :
     * @date         : 2019/12/18 16:20
     */
    List<CouponCollection> selectUserAll(int couponId);

    /**
     * @Description  ：查询用户领取了几张该优惠券
     * @author       : JY
     * @param        : [map]
     * @return       : int
     * @exception    :
     * @date         : 2019/12/18 21:35
     */
    int findCount(int couponId,int userId);
}
