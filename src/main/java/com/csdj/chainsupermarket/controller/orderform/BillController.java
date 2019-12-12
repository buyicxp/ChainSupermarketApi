package com.csdj.chainsupermarket.controller.orderform;

import com.csdj.chainsupermarket.entity.commodity.GoodsCommodity;
import com.csdj.chainsupermarket.entity.orderform.MerchandiseOrderPO;
import com.csdj.chainsupermarket.entity.shop.minuteshop.ShopMessage;
import com.csdj.chainsupermarket.service.orderform.BillService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName BillController
 * @Description: 订单处理器
 * @Author 李婉佳
 * @Date 2019/12/05
 * @Version V1.0
 **/
@RestController
@RequestMapping("/bill")
@CrossOrigin
public class BillController {

    @Resource
    private BillService billService;

    /**
     * 查询门店列表
     * @return 返回门店集合json
     */
    @RequestMapping("/getFindShopName")
    @ResponseBody
    public List<ShopMessage> getFindShopName(){
        return billService.findShopNameService();
    }

    /**
     * 修改订单数据
     * @param obj 订单对象
     * @return 影响行数
     */
    @RequestMapping("/getUpdMerchandiseOrder")
    public int getUpdMerchandiseOrder(@RequestBody MerchandiseOrderPO obj){
        return billService.updMerchandiseOrderService(obj);
    }

    /**
     * 删除订单(修改订单删除状态)
     * @param id 订单id
     * @return 影响行数
     */
    @RequestMapping("/getDelMerchandiseOrder")
    public int getDelMerchandiseOrder(Integer id){
        return billService.delMerchandiseOrderService(id);
    }

    /**
     * 根据门店id查询门店总会员数
     * @param shopId 门店id
     * @return 返回总会员数
     */
    @RequestMapping("/getFindShopMemberNewCount")
    public int getFindShopMemberNewCount(Long shopId){
        return billService.findShopMemberNewCountService(shopId);
    }

    /**
     * 根据门店id查询门店订单数
     * @param shopId 门店id
     * @return 返回订单数
     */
    @RequestMapping("/getFindShopBillCount")
    public int getFindShopBillCount(Integer shopId){
        return billService.findShopBillCountService(shopId);
    }

    /**
     * 根据门店id查询门店营业额
     * @param shopId 门店id
     * @return 返回营业额
     */
    @RequestMapping("/getFindShopBillMoneySum")
    public Double getFindShopBillMoneySum(Integer shopId){
        Double count=billService.findShopBillMoneySumService(shopId);
        if(count==null){
            count=0.0;
        }
        return count;
    }

    /**
     * 根据门店id查询订单优惠额
     * @param shopId 门店id
     * @return 返回订单优惠额
     */
    @RequestMapping("/getFindShopPreference")
    public Double getFindShopPreference(Integer shopId){
        //优惠额PreferenceMoney
        double preferenceMoney;
        //应付金额amoutPayable
        Double amoutPayable=0.0;
        //实付金额--门店营业额shopMoneySum
        Double shopMoneySum=billService.findShopBillMoneySumService(shopId);
        if(shopMoneySum==null){
            shopMoneySum=0.0;
        }
        //根据门店id查询商品价格
        List<GoodsCommodity> listPrice=billService.findGoodsPriceService(shopId);
        //根据门店id查询订单商品数量
        List<MerchandiseOrderPO> listCount=billService.findBillGoodsCountService(shopId);
        for(int number=0;number<listPrice.size();number++){
            GoodsCommodity goods= listPrice.get(number);
            MerchandiseOrderPO bills= listCount.get(number);
            amoutPayable=amoutPayable+goods.getPrice()*bills.getCount();
        }
        preferenceMoney=amoutPayable-shopMoneySum;
        //返回优惠额
        return preferenceMoney;
    }
}