package com.csdj.chainsupermarket.service.imp.orderform;

import com.csdj.chainsupermarket.dao.commodity.GoodsCommodityMapper;
import com.csdj.chainsupermarket.dao.member.MemberMapper;
import com.csdj.chainsupermarket.dao.orderform.MerchandiseOrderMapper;
import com.csdj.chainsupermarket.dao.orderform.MerchandiseOrderStatMapper;
import com.csdj.chainsupermarket.dao.orderform.TradeOrderMapper;
import com.csdj.chainsupermarket.entity.commodity.GoodsCommodity;
import com.csdj.chainsupermarket.entity.member.Member;
import com.csdj.chainsupermarket.entity.orderform.*;
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
    @Resource
    private GoodsCommodityMapper goodsCommodityMapper;
    @Resource
    private MemberMapper memberMapper;

    @Override
    public List<OrderFormDetailVO> detailById(String id) {
        List<OrderFormDetailVO> list = new ArrayList<>();
        List<MerchandiseOrderPO> merchandiseOrderList = merchandiseOrderMapper.list(null, null
                , null, null, id, null, null, null, null);
        for (MerchandiseOrderPO m : merchandiseOrderList) {
            list.add(getOrderFormDetail(m));
        }
        return list;
    }

    @Override
    public List<OrderFormVO> summary(Integer userId, Integer shopId, Integer stat, Integer del, String orderId
            , String betTime, String andTime, Integer index, Integer size) {
        List<OrderFormVO> list = new ArrayList<>();
        List<MerchandiseOrderPO> merchandiseOrderList = merchandiseOrderMapper.list(userId, shopId, stat, del, orderId
                , betTime, andTime, index, size);
        for (MerchandiseOrderPO m : merchandiseOrderList) {
            list.add(getOrderForm(m));
        }
        return list;
    }

    @Override
    public int count(Integer userId, Integer shopId, Integer stat, Integer del, String orderId, String betTime
            , String andTime) {
        return merchandiseOrderMapper.count(userId, shopId, stat, del, orderId, betTime, andTime);
    }

    @Override
    public OrderFormDetailVO get(Integer id) {
        MerchandiseOrderPO merchandiseOrder = merchandiseOrderMapper.get(id);
        return getOrderFormDetail(merchandiseOrder);
    }

    @Override
    public List<OrderFormApiVO> listByUser(Integer userId, Integer shopId, Integer stat) {
        List<OrderFormApiVO> list = new ArrayList<>();
        List<MerchandiseOrderPO> merchandiseOrderList = merchandiseOrderMapper.list(userId, shopId, stat, 0
                , null, null, null, null, null);
        for (MerchandiseOrderPO m : merchandiseOrderList) {
            GoodsCommodity goodsCommodity = goodsCommodityMapper.getCommodity(m.getGoodsId());
            OrderFormApiVO orderFormApiVO = new OrderFormApiVO();
            orderFormApiVO.setAmount(goodsCommodity.getPrice());
            orderFormApiVO.setCount(m.getCount());
            orderFormApiVO.setGoodsImgUrl(goodsCommodity.getPicturepath());
            orderFormApiVO.setId(m.getId());
            orderFormApiVO.setOrderId(m.getOrderId());
            orderFormApiVO.setStatus(m.getStat());
            orderFormApiVO.setName(goodsCommodity.getGoodsName());
            orderFormApiVO.setTime(m.getTime());
            list.add(orderFormApiVO);
        }
        return list;
    }

    /**
     * 获取订单表现对象
     *
     * @return 订单表现对象
     */
    private OrderFormVO getOrderForm(MerchandiseOrderPO merchandiseOrder) {
        GoodsCommodity goodsCommodity = goodsCommodityMapper.getCommodity(merchandiseOrder.getGoodsId());
        List<StatPO> statList = merchandiseOrderStatMapper.list(null);
        OrderFormVO orderFormVO = new OrderFormVO();
        for (StatPO s : statList) {
            if (merchandiseOrder.getStat().equals(s.getId())) {
                orderFormVO.setStatus(s.getName());
            }
        }
        if (merchandiseOrder.getStat() != 0 && merchandiseOrder.getTradeId() != null && merchandiseOrder.getTradeId() != 0) {
            orderFormVO.setAmount(tradeOrderMapper.get(merchandiseOrder.getTradeId()).getAmount());
            orderFormVO.setDefray("已支付");
        } else {
            orderFormVO.setAmount(0.0);
            orderFormVO.setDefray("未支付");
        }
        orderFormVO.setTime(merchandiseOrder.getTime());
        orderFormVO.setCount(merchandiseOrder.getCount());
        orderFormVO.setDel(merchandiseOrder.getDel());
        orderFormVO.setId(merchandiseOrder.getId());
        orderFormVO.setOrderId(merchandiseOrder.getOrderId());
        orderFormVO.setName(goodsCommodity.getGoodsName());
        orderFormVO.setContactInformation("未定义配送信息");
        orderFormVO.setDis("未定义物流");
        Member member = memberMapper.selectMemberId(merchandiseOrder.getUserId());
        orderFormVO.setUserName(member.getVipMname());
        orderFormVO.setContactInformation(member.getVipPhone());
        return orderFormVO;
    }

    /**
     * 获取表单详细信息视图对象
     *
     * @return 表单详细信息视图对象
     */
    private OrderFormDetailVO getOrderFormDetail(MerchandiseOrderPO merchandiseOrder) {
        OrderFormDetailVO orderFormDetailVO = new OrderFormDetailVO();
        GoodsCommodity goodsCommodity = goodsCommodityMapper.getCommodity(merchandiseOrder.getGoodsId());
        orderFormDetailVO.setTradeId(merchandiseOrder.getTradeId());
        orderFormDetailVO.setGoodsId(merchandiseOrder.getGoodsId());
        orderFormDetailVO.setTime(merchandiseOrder.getTime());
        orderFormDetailVO.setCount(merchandiseOrder.getCount());
        orderFormDetailVO.setDel(merchandiseOrder.getDel());
        orderFormDetailVO.setStat(merchandiseOrder.getStat());
        orderFormDetailVO.setGoodsName(goodsCommodity.getGoodsName());
        orderFormDetailVO.setConMoney(goodsCommodity.getPrice());
        orderFormDetailVO.setGoodsImgUrl(goodsCommodity.getPicturepath());
        orderFormDetailVO.setAddress("未定义地址");
        orderFormDetailVO.setDis("未定义物流");
        orderFormDetailVO.setContact("未定义联系人");
        orderFormDetailVO.setPhone("未定义电话");
        return orderFormDetailVO;
    }
}
