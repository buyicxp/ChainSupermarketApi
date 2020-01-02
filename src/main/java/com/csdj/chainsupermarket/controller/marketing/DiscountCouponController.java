package com.csdj.chainsupermarket.controller.marketing;

import com.csdj.chainsupermarket.entity.marketing.*;
import com.csdj.chainsupermarket.service.marketing.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/discount")
@Transactional
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
     * @param restrictionName   使用限制名称
     * @param restrictionBeginTime  使用限制开始时间
     * @param stoptime  使用限制结束时间
     * @param spId  指定门店编号
     * @param money 订单金额
     * @param preferentialId 优惠类型
     * @param goodsTypeId 不可用类型
     * @return
     */
    @RequestMapping("/addCoupon")
    public Map addDiscountCoupon(String couponName, @RequestParam(defaultValue = "0")int couponTypeId,
                                 @RequestParam(defaultValue = "0")int faceValue,
                                 @RequestParam(defaultValue = "0")int distributionId,
                                 @RequestParam(defaultValue = "0")int limitGet,
                                 @RequestParam(defaultValue = "0")int paymentAmount, String begintime, String endtime,
                                 @RequestParam(defaultValue = "0")int periodOfValidity,
                                 @RequestParam(defaultValue = "0")int effectiveDays,
                                 @RequestParam(defaultValue = "0")int effectivePeriod,String startTime, String deadline,
                                 @RequestParam(defaultValue = "0")int computingId,String restrictionName,
                                 String restrictionBeginTime, String stoptime,
                                 @RequestParam(defaultValue = "0")int goodsTypeId,
                                 @RequestParam(defaultValue = "0")int spId,
                                 @RequestParam(defaultValue = "0")int money,
                                 @RequestParam(defaultValue = "0")int preferentialId) throws Exception {
        Map map = new HashMap();
//        int res = 0;
        if(startTime=="" || deadline==""){
            startTime = null;
            deadline = null;
        }
        //测试优惠券
        System.out.println(couponName+"-"+couponTypeId+"-"+faceValue+"-"+ distributionId+"-"+ limitGet+"-"+
                paymentAmount+"-"+ begintime+"-"+ endtime+"-"+ periodOfValidity+"-"+ effectiveDays+"-"+ effectivePeriod+"-"+startTime+"-"+
                deadline+"-"+ computingId+"-"+ spId+"-"+ money+"-"+preferentialId);
        int  res = discountCouponService.addDiscountCoupon(couponName, couponTypeId, faceValue, distributionId, limitGet,
                paymentAmount, begintime, endtime, periodOfValidity, effectiveDays, effectivePeriod, startTime,
                deadline, computingId,spId, money, preferentialId);
        //测试使用限制
        System.out.println(restrictionName+"ce"+restrictionBeginTime+"ce"+stoptime);
        if (restrictionName != null && restrictionName!=""){
           res = usageRestrictionService.addUsageRestriction(restrictionName, restrictionBeginTime, stoptime);
        }
        System.out.println(goodsTypeId);
        //不可用类型为0就为未选，不添加
        if (goodsTypeId !=0) {
            res = unavailableTypeService.addUnavailableType(goodsTypeId, restrictionName);
        }

        if (res > 0) {
            map.put("msg", "添加成功！");
        } else {
            map.put("msg", "添加失败！");
        }
        return map;
    }

    /**
     * @Description  ：删除优惠券
     * @author       : JY
     * @param        : [couponId] 优惠券主键
     * @return       : java.util.Map
     * @exception    :
     * @date         : 2019/12/16 10:20
     */
    @RequestMapping("deldiscountcoupon")
    public Map delDiscountCoupon(int couponId){
        Map map = new HashMap();
        int res = discountCouponService.delDiscountCoupon(couponId);
        if(res>0){
            map.put("msg", "修改成功！");
        }else{
            map.put("msg", "修改失败！");
        }
        return map;
    }

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
    @RequestMapping("/updatediscountcoupon")
    public Map updateDiscountCoupon(String couponName, @RequestParam(defaultValue = "0")int couponTypeId,
                                    @RequestParam(defaultValue = "0")int faceValue,
                                    @RequestParam(defaultValue = "0")int distributionId,
                                    @RequestParam(defaultValue = "0")int limitGet,
                                    @RequestParam(defaultValue = "0")int paymentAmount, String begintime, String endtime,
                                    @RequestParam(defaultValue = "0")int periodOfValidity,
                                    @RequestParam(defaultValue = "0")int effectiveDays,
                                    @RequestParam(defaultValue = "0")int effectivePeriod,String startTime, String deadline,
                                    @RequestParam(defaultValue = "0")int computingId,String restrictionName,
                                    String restrictionBeginTime, String stoptime,
                                    @RequestParam(defaultValue = "0")int goodsTypeId,
                                    @RequestParam(defaultValue = "0")int spId,
                                    @RequestParam(defaultValue = "0")int money,
                                    @RequestParam(defaultValue = "0")int preferentialId,int couponId){

        Map map = new HashMap();

        //更新优惠券
        int res = discountCouponService.updateDiscountCoupon(couponName, couponTypeId, faceValue, distributionId, limitGet,
                paymentAmount, begintime, endtime, periodOfValidity, effectiveDays, effectivePeriod, startTime,
                deadline, computingId,spId, money, preferentialId,couponId);

        if(restrictionName==null || restrictionName==""){
            //没有使用限制就删除该优惠券的使用限制
            System.out.println("删除优惠券的使用限制");
            usageRestrictionService.delUsageRestriction(couponId);
        }else{
            //有就进行修改
            //还要判断是否有该优惠券的使用限制，没有就添加
            if(usageRestrictionService.findById(couponId)==null){
                System.out.println("没有优惠券的使用限制，进行添加");
                usageRestrictionService.addInfo(couponId, restrictionName, restrictionBeginTime, stoptime);
            }else{
                System.out.println("有优惠券的使用限制，进行修改");
                usageRestrictionService.updateUsageRestriction(couponId, restrictionName, restrictionBeginTime, stoptime);
            }

//            System.out.println("修改优惠券的使用限制");
        }

        if(goodsTypeId !=0){
            //修改不可用类型

            //还要判断是否有该优惠券的不可用，没有就添加
            if(unavailableTypeService.findById(couponId)!=null){
                System.out.println("修改不可用类型");
                unavailableTypeService.updateUnacailableType(couponId, goodsTypeId);
            }else{
                System.out.println("添加不可用类型");
                unavailableTypeService.addInfo(couponId, goodsTypeId);
            }
        }else{
            //删除不可用类型
            System.out.println("删除不可用类型");
            unavailableTypeService.delUnavailableType(couponId);
        }
        if (res == 0) {
            map.put("msg", "修改成功！");
        } else {
            map.put("msg", "修改失败！");
        }
        return map;
    }

    /**
     * @Description  ：微信小程序：查询所有可以领取的优惠券
     * @author       : JY
     * @param        : []
     * @return       : java.util.List<com.csdj.chainsupermarket.entity.marketing.DiscountCoupon>
     * @exception    :
     * @date         : 2019/12/16 23:18
     */
    @RequestMapping("/selectAll")
    public List<DiscountCoupon> selectAll(){
        return discountCouponService.selectAll();
    }

    /**
     * @Description  ：用户：领取优惠券
     * @author       : JY
     * @param        : [couponId, userId]优惠券编号，用户编号
     * @return       : int
     * @exception    :
     * @date         : 2019/12/16 23:38
     */
    @RequestMapping("/addCouponCollection")
    public Map addCouponCollection(Integer couponId,Integer userId){
        Map map = new HashMap();
        //先出查询优惠券
        System.out.println("查找优惠券");
        DiscountCoupon discountCoupon = discountCouponService.findById(couponId);

        //优惠券是否已被全部领取

        int sum = couponCollectionService.findAlreadyReceived(couponId);
        System.out.println("优惠券已被领取："+sum);
        System.out.println("只能领"+discountCoupon.getPaymentAmount());
        if(sum<=0){
            map.put("msg", "该优惠券已被全部领取！");
            return map;
        }

        //判断领取时时间是建否过期
        if(discountCoupon.getEndtime().before(new Date())){
            map.put("msg", "你已超过了领取时间！");
            return map;
        }
        System.out.println("限制几张："+discountCoupon.getLimitGet());

        int count = couponCollectionService.findCount(couponId,userId);
        System.out.println("查询用户领了几张："+count);
        if(count<discountCoupon.getLimitGet()){
            System.out.println("领取优惠券");
            if(couponCollectionService.addCouponCollection(couponId, userId)==0){
                map.put("msg", "领取失败");
            }else{
                map.put("msg", "领取成功");
            }
        }else{
            map.put("msg", "你超过了领取限制！");
        }
        return map;
    }

//    @RequestMapping("/test")
//    public int test(){
//        System.out.println("测试");
//        int res = discountCouponService.updateTime();
//        return res;
//    }

    /**
     * @Description  ：查询单张优惠券的领取记录
     * @author       : JY
     * @param        : [couponId]
     * @return       : java.util.List<com.csdj.chainsupermarket.entity.marketing.CouponCollection>
     * @exception    :
     * @date         : 2019/12/18 20:42
     */
    @RequestMapping("/selectUserAll")
    public PageInfo selectUserAll(@RequestParam(defaultValue = "0") int pageNum,
                                  @RequestParam(defaultValue = "0") int pageSize,int couponId){
        PageHelper.startPage(pageNum, pageSize);
        PageInfo page = new PageInfo(couponCollectionService.selectUserAll(couponId));
        return  page;
    }
}
