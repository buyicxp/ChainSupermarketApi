package com.csdj.chainsupermarket.controller.marketing;

import com.csdj.chainsupermarket.entity.marketing.DiscountCoupon;
import com.csdj.chainsupermarket.service.marketing.CouponCollectionService;
import com.csdj.chainsupermarket.service.marketing.DiscountCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/discount")
public class DiscountCouponController {
    //优惠券
    @Autowired
    DiscountCouponService discountCouponService;
    //领取记录
    @Autowired
    CouponCollectionService couponCollectionService;

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
        System.out.println(123);
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
}
