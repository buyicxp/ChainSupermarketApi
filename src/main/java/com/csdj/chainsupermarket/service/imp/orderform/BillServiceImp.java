package com.csdj.chainsupermarket.service.imp.orderform;

import com.csdj.chainsupermarket.dao.orderform.BillMapper;
import com.csdj.chainsupermarket.entity.commodity.GoodsCommodity;
import com.csdj.chainsupermarket.entity.orderform.MerchandiseOrderPO;
import com.csdj.chainsupermarket.entity.shop.minuteshop.ShopMessage;
import com.csdj.chainsupermarket.service.orderform.BillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName BillServiceImp
 * @Description: 实现订单接口类
 * @Author 李婉佳
 * @Date 2019/12/05
 * @Version V1.0
 **/
@Service
public class BillServiceImp implements BillService {
    @Resource
    private BillMapper billMapper;

    @Override
    public List<ShopMessage> findShopNameService() {
        return billMapper.findShopName();
    }

    @Override
    public int updMerchandiseOrderPOService(MerchandiseOrderPO obj){
        return billMapper.updMerchandiseOrderPO(obj);
    }

    @Override
    public int delMerchandiseOrderPOService(Integer id){
        return billMapper.delMerchandiseOrderPO(id);
    }

    @Override
    public int findShopMemberNewCountService(Long shopId){
        return billMapper.findShopMemberNewCount(shopId);
    }

    @Override
    public int findShopBillCountService(Integer shopId){
        return billMapper.findShopBillCount(shopId);
    }

    @Override
    public Double findShopBillMoneySumService(Integer shopId){
        return billMapper.findShopBillMoneySum(shopId);
    }

    @Override
    public List<GoodsCommodity> findGoodsPriceService(Integer shopId){
        return billMapper.findGoodsPrice(shopId);
    }

    @Override
    public List<MerchandiseOrderPO> findBillGoodsCountService(Integer shopId){
        return billMapper.findBillGoodsCount(shopId);
    }
}
