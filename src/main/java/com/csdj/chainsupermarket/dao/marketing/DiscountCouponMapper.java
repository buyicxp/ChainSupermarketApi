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
     * @Description  ：小程序：查询所有可领取油优惠券
     * @author       : JY
     * @param        : [map]
     * @return       : java.util.List<com.csdj.chainsupermarket.entity.marketing.DiscountCoupon>
     * @exception    :
     * @date         : 2019/12/16 23:11
     */
    List<DiscountCoupon> selectAll(Map map);

    /**
     * @Description  ：添加优惠券
     * @author       : JY
     * @param        : [map] 添加的数据
     * @return       : int
     * @exception    :
     * @date         : 2019/12/9 10:52
     */
    int addDiscountCoupon(Map map);
    /**
     * @Description  ：查询单个优惠券
     * @author       : JY
     * @param        : [couponId] 优惠券主键
     * @return       : int
     * @exception    :
     * @date         : 2019/12/9 20:50
     */
    DiscountCoupon findById(int couponId);

    /**
     * @Description  ：删除优惠券
     * @author       : JY
     * @param        : [couponId] 优惠券主键
     * @return       : int
     * @exception    :
     * @date         : 2019/12/16 8:48
     */
    int delDiscountCoupon(int couponId);

    /**
     * @Description  ： 修改优惠券信息
     * @author       : JY
     * @param        :
     * @return       : 修改结果 >0修改成功 >=0 修改失败
     * @exception    :
     * @date         : 2019/12/16 11:17
     */
    int updateDiscountCoupon(Map map);


    /**
     * @Description  ：定时更新：刷新优惠券状态
     * @author       : JY
     * @param        : []
     * @return       : int
     * @exception    :
     * @date         : 2019/12/16 23:22
     */
    int updateTime(Map map);
}