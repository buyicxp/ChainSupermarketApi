package com.csdj.chainsupermarket.controller.marketing;

import com.csdj.chainsupermarket.entity.marketing.*;
import com.csdj.chainsupermarket.service.marketing.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/discount")
public class DiscountCouponController {
    //优惠券
    @Resource
    DiscountCouponService discountCouponService;
    //领取记录
    @Resource
    CouponCollectionService couponCollectionService;
    //优惠券类型
    @Resource
    CouponTypeService couponTypeService;
    //发放类型
    @Resource
    DistributionTypeService distributionTypeService;
    //计算时间方式
    @Resource
    ComputingTimeService computingTimeService;
    //使用限制
    @Resource
    UsageRestrictionService usageRestrictionService;
    //不可用类型
    @Resource
    UnavailableTypeService unavailableTypeService;
    //优惠类型
    @Resource
    PreferentialTypeService preferentialTypeService;

    /**
     * @Description  ：查询所有优惠券 后台
     * @author       : JY
     * @param        : []
     * @return       : java.util.List<com.csdj.chainsupermarket.entity.marketing.DiscountCoupon>
     * @exception    :
     * @date         : 2019/12/8 12:40
     */
    @RequestMapping("/findByAll")
    public List<DiscountCoupon> findByAll(){
        return  discountCouponService.findByAll();


    }
    /**
     * @Description  ：查询该优惠券可领取的张数
     * @author       : JY
     * @param        : [couponId] 优惠券主键
     * @return       : int
     * @exception    :
     * @date         : 2019/12/8 13:07
     */
    @RequestMapping("/count")
    public int findAlreadyReceived(int couponId){
        return couponCollectionService.findAlreadyReceived(couponId);
    }
    /**
     * @Description  ：所有优惠券类型
     * @author       : JY
     * @param        : []
     * @return       : java.util.List<com.csdj.chainsupermarket.entity.marketing.CouponType>
     * @exception    :
     * @date         : 2019/12/9 13:57
     */
    @RequestMapping("/coupontypes")
    public List<CouponType> findAllCouponTypes(){
        return couponTypeService.findByAll();
    }
    /**
     * @Description  ：所有发放类型
     * @author       : JY
     * @param        : []
     * @return       : java.util.List<com.csdj.chainsupermarket.entity.marketing.DistributionType>
     * @exception    :
     * @date         : 2019/12/9 14:51
     */
    @RequestMapping("/distributiontypes")
    public List<DistributionType> findAllDistributionTypes(){
        return distributionTypeService.findByAll();
    }
    /**
     * @Description  ：查询该优惠券的使用限制
     * @author       : JY
     * @param        : [restrictionId]
     * @return       : com.csdj.chainsupermarket.entity.marketing.UsageRestriction
     * @exception    :
     * @date         : 2019/12/9 21:18
     */
    @RequestMapping("/usagerestriction")
    public UsageRestriction findUsageRestriction(int couponId){
        return usageRestrictionService.findById(couponId);
    }
    /**
     * @Description  ：查询优惠券的不可用类型
     * @author       : JY
     * @param        : [couponId]
     * @return       : com.csdj.chainsupermarket.entity.marketing.UnavailableType
     * @exception    :
     * @date         : 2019/12/9 22:04
     */
    @RequestMapping("/unavailabletype")
    public UnavailableType findUnavailableType(int couponId){
        return unavailableTypeService.findById(couponId);
    }

    /**
     * @Description  ：查询所有计算时间方式
     * @author       : JY
     * @param        : []
     * @return       : com.csdj.chainsupermarket.entity.marketing.ComputingTime
     * @exception    :
     * @date         : 2019/12/9 23:43
     */
    @RequestMapping("/computingtime")
    public List<ComputingTime> findComputingTime(){
        System.out.println("计算时间方式");
        return computingTimeService.findByAll();
    }
    /**
     * @Description  ：查询所有优惠类型
     * @author       : JY
     * @param        : []
     * @return       : java.util.List<com.csdj.chainsupermarket.entity.marketing.PreferentialType>
     * @exception    :
     * @date         : 2019/12/10 9:11
     */
    @RequestMapping("/preferentialtype")
    public List<PreferentialType> findPreferentialType(){
        System.out.println("查询所有优惠类型");
        return preferentialTypeService.findByAll();
    }
    /**
     * @Description  ：查询单个优惠券
     * @author       : JY
     * @param        : [couponId] 优惠券主键
     * @return       : com.csdj.chainsupermarket.entity.marketing.DiscountCoupon
     * @exception    :
     * @date         : 2019/12/10 23:01
     */
    @RequestMapping("/findDiscountCoupon")
    public DiscountCoupon findDiscountCoupon(Integer couponId){
        return  discountCouponService.findById(couponId);
    }

}
