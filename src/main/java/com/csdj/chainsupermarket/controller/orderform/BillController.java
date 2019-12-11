package com.csdj.chainsupermarket.controller.orderform;

import com.csdj.chainsupermarket.entity.commodity.GoodsCommodity;
import com.csdj.chainsupermarket.entity.orderform.MerchandiseOrderPO;
import com.csdj.chainsupermarket.entity.shop.minuteshop.ShopMessage;
import com.csdj.chainsupermarket.service.orderform.BillService;
import org.springframework.beans.factory.annotation.Autowired;
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
     * @throws Exception 声明异常
     */
    @RequestMapping("/getfindShopName")
    @ResponseBody
    public List<ShopMessage> getfindShopName() throws Exception {
        return billService.findShopNameService();
    }

    /**
     * 修改订单数据
     * @param obj 订单对象
     * @return 影响行数
     * @throws Exception 声明异常
     */
    @RequestMapping("/getupdMerchandiseOrderPO")
    public int getupdMerchandiseOrderPO(@RequestBody MerchandiseOrderPO obj) throws Exception {
        return billService.updMerchandiseOrderPOService(obj);
    }

    /**
     * 删除订单(修改订单删除状态)
     * @param id 订单id
     * @return 影响行数
     * @throws Exception 声明异常
     */
    @RequestMapping("/getdelMerchandiseOrderPO")
    public int getdelMerchandiseOrderPO(Integer id) throws Exception {
        return billService.delMerchandiseOrderPOService(id);
    }

    /**
     * 根据门店id查询门店总会员数
     * @param shopId 门店id
     * @return 返回总会员数
     * @throws Exception 声明异常
     */
    @RequestMapping("/getfindShopMemberNewCount")
    public int getfindShopMemberNewCount(Long shopId) throws Exception {
        return billService.findShopMemberNewCountService(shopId);
    }

    /**
     * 根据门店id查询门店订单数
     * @param shopId 门店id
     * @return 返回订单数
     */
    @RequestMapping("/getfindShopBillCount")
    public int getfindShopBillCount(Integer shopId) throws Exception {
        return billService.findShopBillCountService(shopId);
    }

    /**
     * 根据门店id查询门店营业额
     * @param shopId 门店id
     * @return 返回营业额
     */
    @RequestMapping("/getfindShopBillMoneySum")
    public Double getfindShopBillMoneySum(Integer shopId) throws Exception {
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
     * @throws Exception
     */
    @RequestMapping("/getfindShopPerference")
    public Double getfindShopPerference(Integer shopId) throws Exception {
        //优惠额perference
        Double perference=0.0;
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
        for(int i=0;i<listPrice.size();i++){
            GoodsCommodity goods=(GoodsCommodity) listPrice.get(i);
            MerchandiseOrderPO counts=(MerchandiseOrderPO) listCount.get(i);
            //amoutPayable=amoutPayable+goods.getPrice()*counts.getCount();
        }
        //优惠额=应付金额-实付金额
        perference=amoutPayable-shopMoneySum;
        //返回优惠额
        return perference;
    }
}