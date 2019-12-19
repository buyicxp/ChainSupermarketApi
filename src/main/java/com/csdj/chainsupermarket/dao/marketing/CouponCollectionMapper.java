package com.csdj.chainsupermarket.dao.marketing;


import com.csdj.chainsupermarket.entity.marketing.CouponCollection;
import com.csdj.chainsupermarket.entity.marketing.DiscountCoupon;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

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

    /**
     * @Description  ：小程序：显示用户的优惠券
     * @author       : JY
     * @param        : [map]
     * @return       : java.util.List<com.csdj.chainsupermarket.entity.marketing.DiscountCoupon>
     * @exception    :
     * @date         : 2019/12/16 23:10
     */
    List<DiscountCoupon> selectUserAll(Map map);

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
     * @Description  ：领取优惠券
     * @author       : JY
     * @param        : [map]
     * @return       : int
     * @exception    :
     * @date         : 2019/12/16 23:21
     */
    int addCouponCollection(Map map);
    /**
     * @Description  ：查询用户领取了几张该优惠券
     * @author       : JY
     * @param        : [map]
     * @return       : int
     * @exception    :
     * @date         : 2019/12/18 21:35
     */
    int findCount(Map map);
}