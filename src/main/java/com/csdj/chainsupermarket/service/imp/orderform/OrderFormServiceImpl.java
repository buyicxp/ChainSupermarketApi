package com.csdj.chainsupermarket.service.imp.orderform;

import com.csdj.chainsupermarket.dao.orderform.MerchandiseOrderMapper;
import com.csdj.chainsupermarket.dao.orderform.MerchandiseOrderStatMapper;
import com.csdj.chainsupermarket.dao.orderform.TradeOrderMapper;
import com.csdj.chainsupermarket.entity.orderform.MerchandiseOrderPO;
import com.csdj.chainsupermarket.entity.orderform.OrderFormDetailVO;
import com.csdj.chainsupermarket.entity.orderform.OrderFormVO;
import com.csdj.chainsupermarket.entity.orderform.StatPO;
import com.csdj.chainsupermarket.service.orderform.OrderFormService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 曾耀民
 * @ClassName OrderFormServiceImpl
 * @Description: 订单操作Service实现
 * @Date 2019/12/09
 * @Version 1.0
 */
@Service("OrderFormService")
public class OrderFormServiceImpl implements OrderFormService {
    @Resource
    private MerchandiseOrderStatMapper merchandiseOrderStatMapper;
    @Resource
    private MerchandiseOrderMapper merchandiseOrderMapper;
    @Resource
    private TradeOrderMapper tradeOrderMapper;

    @Override
    public List<OrderFormDetailVO> detailById(String id) {
        List<OrderFormDetailVO> list = new ArrayList<>();
        List<MerchandiseOrderPO> merchandiseOrderList = merchandiseOrderMapper.list(null, null, null
                , id, null, null, null, null);
        for (MerchandiseOrderPO m : merchandiseOrderList) {
            OrderFormDetailVO orderFormDetailVO = new OrderFormDetailVO();
            orderFormDetailVO.setGoodsId(m.getGoodsId());
            orderFormDetailVO.setTime(m.getTime());
            orderFormDetailVO.setCount(m.getCount());
            orderFormDetailVO.setStat(m.getStat());
            orderFormDetailVO.setDel(m.getDel());
            orderFormDetailVO.setGoodsName("未定义商品名称");
            //来自商品表，单价
            orderFormDetailVO.setConMoney(0.0);
            //来自商品表，图片URL
            orderFormDetailVO.setGoodsImgUrl("");
            orderFormDetailVO.setDis("未定义物流");
            orderFormDetailVO.setContact("未定义联系人");
            orderFormDetailVO.setPhone("未定义电话");
            orderFormDetailVO.setAddress("未定义地址");
            list.add(orderFormDetailVO);
        }
        return list;
    }

    @Override
    public List<OrderFormVO> summary(Integer userId, Integer stat, Integer del, String orderId, String betTime, String andTime
            , Integer index, Integer size) {
        List<OrderFormVO> list = new ArrayList<>();
        List<MerchandiseOrderPO> merchandiseOrderList = merchandiseOrderMapper.list(userId, stat, del, orderId, betTime
                , andTime, index, size);
        List<StatPO> statList = merchandiseOrderStatMapper.list(null);
        for (MerchandiseOrderPO m : merchandiseOrderList) {
            OrderFormVO orderFormVO = new OrderFormVO();
            for (StatPO s : statList) {
                if (m.getStat().equals(s.getId())) {
                    orderFormVO.setStatus(s.getName());
                }
            }
            if (m.getStat() != 0 && m.getTradeId() != null && m.getTradeId() != 0) {
                orderFormVO.setAmount(tradeOrderMapper.get(m.getTradeId()).getAmount());
            } else {
                orderFormVO.setAmount(0.0);
            }
            orderFormVO.setTime(m.getTime());
            orderFormVO.setCount(m.getCount());
            orderFormVO.setDel(m.getDel());
            orderFormVO.setId(m.getOrderId());
            orderFormVO.setName("未定义商品名称");
            orderFormVO.setContactInformation("未定义配送信息");
            orderFormVO.setDefray("未定义支付状态");
            orderFormVO.setDis("未定义物流");
            orderFormVO.setUserName("未定义用户名");
            orderFormVO.setContactInformation("未定义联系方式");
            list.add(orderFormVO);
        }
        return list;
    }

    @Override
    public int count(Integer userId, Integer stat, Integer del, String orderId, String betTime, String andTime) {
        return merchandiseOrderMapper.count(userId, stat, del, orderId, betTime, andTime);
    }
}
