package com.csdj.chainsupermarket.service.imp.shop.minuteshop;

import com.csdj.chainsupermarket.dao.shop.minuteshop.ShopMessageMapper;
import com.csdj.chainsupermarket.entity.shop.minuteshop.ShopMessage;
import com.csdj.chainsupermarket.service.shop.minuteshop.ShopMessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName ShopMessage
 * @Description: 门店业务层实现层
 * @Author 刘时钟
 * @Date 2019/12/2
 * @Version V1.0
 **/
@Service
public class ShopMessageServiceImpl implements ShopMessageService {
    @Resource
    ShopMessageMapper dao;

    @Override
    public ShopMessage findById(int spId) {
        return dao.findById(spId);
    }

    @Override
    public List<ShopMessage> findByAll() {
        return dao.findByAll();
    }
}
