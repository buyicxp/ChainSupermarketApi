package com.csdj.chainsupermarket.service.imp.marketing;

import com.csdj.chainsupermarket.dao.marketing.DiscountCouponMapper;
import com.csdj.chainsupermarket.entity.marketing.DiscountCoupon;
import com.csdj.chainsupermarket.service.marketing.DiscountCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ Description   :  优惠券业务层实现层
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/5 23:04
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/5 23:04
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Service
public class DiscountCouponServiceImpl implements DiscountCouponService,Runnable {
    @Resource
    DiscountCouponMapper dao;
    private boolean flag = true;
    private static final Object obj = new Object() ;
    @Override
    public List<DiscountCoupon> findByAll() {
        Map map = new HashMap();
        return dao.findByAll(map);
    }

    @Override
    public DiscountCoupon findById(int couponId) {
        return dao.findById(couponId);
    }

    @Override
    public int addDiscountCoupon(String couponName,int couponTypeId,int faceValue,int distributionId,int limitGet,
                                 int paymentAmount, String begintime,String endtime,int periodOfValidity,int effectiveDays,
                                 int effectivePeriod,String startTime, String deadline,int computingId, int spId, int money,
                                 int preferentialId) {
        Map map  = new HashMap();
        map.put("couponName",couponName);
        map.put("couponTypeId",couponTypeId);
        map.put("faceValue",faceValue);
        map.put("distributionId",distributionId);
        map.put("limitGet",limitGet);
        map.put("paymentAmount",paymentAmount);
        map.put("begintime",begintime);
        map.put("endtime",endtime);
        map.put("periodOfValidity",periodOfValidity);
        map.put("effectiveDays",effectiveDays);
        map.put("effectivePeriod",effectivePeriod);
        map.put("startTime",startTime);
        map.put("deadline",deadline);
        map.put("computingId",computingId);
        map.put("spId",spId);
        map.put("money",money);
        map.put("preferentialId",preferentialId);
        map.put("now",new Date());
        return dao.addDiscountCoupon(map);
    }

    @Override
    public int delDiscountCoupon(int couponId) {
        return dao.delDiscountCoupon(couponId);
    }

    @Override
    public int updateDiscountCoupon(String couponName, int couponTypeId, int faceValue, int distributionId, int limitGet,
                                    int paymentAmount, String begintime, String endtime, int periodOfValidity,
                                    int effectiveDays, int effectivePeriod, String startTime, String deadline,
                                    int computingId, int spId, int money, int preferentialId,int couponId) {
        Map map  = new HashMap();
        map.put("couponName",couponName);
        map.put("couponTypeId",couponTypeId);
        map.put("faceValue",faceValue);
        map.put("distributionId",distributionId);
        map.put("limitGet",limitGet);
        map.put("paymentAmount",paymentAmount);
        map.put("begintime",begintime);
        map.put("endtime",endtime);
        map.put("periodOfValidity",periodOfValidity);
        map.put("effectiveDays",effectiveDays);
        map.put("effectivePeriod",effectivePeriod);
        map.put("startTime",startTime);
        map.put("deadline",deadline);
        map.put("computingId",computingId);
        map.put("spId",spId);
        map.put("money",money);
        map.put("preferentialId",preferentialId);
        map.put("now",new Date());
        map.put("couponId",couponId);
        return dao.updateDiscountCoupon(map);
    }

    @Override
    public List<DiscountCoupon> selectAll() {
        return dao.selectAll(null);
    }

    @Override
    public void run() {
        while (flag){
            take();
        }
    }

    /**
     * 领取优惠券
     */
    private  void take() {
        synchronized (obj){
//            if(ticketNums<=0){
//                flag = false;
//                return;
//            }
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName()+"抢到了第"+ticketNums-- +"张票");
        }
    }
}
