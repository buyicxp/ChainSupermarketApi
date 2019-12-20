package com.csdj.chainsupermarket.service.marketing;

import com.csdj.chainsupermarket.entity.marketing.DiscountCoupon;

import java.util.List;
import java.util.Map;

/**
 * @ Description   :  优惠券持久层接口
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/5 23:04
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/5 23:04
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public interface DiscountCouponService {
    /**
     * @Description  ：查询所有优惠券信息 后台
     * @author       : JY
     * @param        : []
     * @return       : java.util.List<com.csdj.chainsupermarket.entity.marketing.DiscountCoupon>
     * @exception    :
     * @date         : 2019/12/7 14:52
     */
    List<DiscountCoupon> findByAll();

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
     * 添加一新的优惠券
     * @param couponName 优惠券名称
     * @param couponTypeId  优惠券类型
     * @param faceValue 面值
     * @param distributionId 发放类型
     * @param limitGet  每人限领
     * @param paymentAmount 发放总量
     * @param begintime 领取开始时间
     * @param endtime   领取结束时间
     * @param periodOfValidity  有效期
     * @param effectiveDays 领取后有效几天
     * @param effectivePeriod   领取后几天后生效
     * @param startTime 生效开始时间
     * @param deadline  生效结束时间
     * @param computingId   计算时间方式
     * @param spId  指定门店编号
     * @param money 订单金额
     * @param preferentialId 优惠类型
     * @return
     */
    int addDiscountCoupon(String couponName,int couponTypeId,int faceValue,int distributionId,int limitGet,
                          int paymentAmount, String begintime,String endtime,int periodOfValidity,int effectiveDays,
                          int effectivePeriod,String startTime, String deadline,int computingId, int spId, int money,
                          int preferentialId);

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
     * 修改优惠券
     * @param couponName 优惠券名称
     * @param couponTypeId  优惠券类型
     * @param faceValue 面值
     * @param distributionId 发放类型
     * @param limitGet  每人限领
     * @param paymentAmount 发放总量
     * @param begintime 领取开始时间
     * @param endtime   领取结束时间
     * @param periodOfValidity  有效期
     * @param effectiveDays 领取后有效几天
     * @param effectivePeriod   领取后几天后生效
     * @param startTime 生效开始时间
     * @param deadline  生效结束时间
     * @param computingId   计算时间方式
     * @param spId  指定门店编号
     * @param money 订单金额
     * @param preferentialId 优惠类型
     * @param couponId 优惠券主键
     * @return 修改结果 >0修改成功 >=0 修改失败
     */
    int updateDiscountCoupon(String couponName,int couponTypeId,int faceValue,int distributionId,int limitGet,
                             int paymentAmount, String begintime,String endtime,int periodOfValidity,int effectiveDays,
                             int effectivePeriod,String startTime, String deadline,int computingId, int spId, int money,
                             int preferentialId,int couponId);

    /**
     * @Description  ：小程序：查询所有可领取油优惠券
     * @author       : JY
     * @param        : [map]
     * @return       : java.util.List<com.csdj.chainsupermarket.entity.marketing.DiscountCoupon>
     * @exception    :
     * @date         : 2019/12/16 23:11
     */
    List<DiscountCoupon> selectAll();


    /**
     * @Description  ：定时更新：刷新优惠券状态
     * @author       : JY
     * @param        : []
     * @return       : int
     * @exception    :
     * @date         : 2019/12/16 23:22
     */
    int updateTime();
}
