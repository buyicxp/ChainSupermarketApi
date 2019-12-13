package com.csdj.chainsupermarket.service.imp.shop.minuteshop;


import com.csdj.chainsupermarket.dao.shop.minuteshop.MessageMapper;
import com.csdj.chainsupermarket.entity.shop.minuteshop.ShopMessage;
import com.csdj.chainsupermarket.service.shop.minuteshop.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName MessageServiceImp
 * @Description: 门店接口实现
 * @Author 刘时钟
 * @Date 2019/12/2
 * @Version V1.0
 **/
@Service("messageService")
public class MessageServiceImp implements MessageService {
    @Autowired
    private MessageMapper messageMapper;
    @Override
    public List<ShopMessage> listShopMessageService(String name, String operating,Integer currentPage, Integer pageSize) {
        return messageMapper.listShopMessage(name,operating, currentPage,  pageSize);
    }

    @Override
    public Integer countShopMessageService(String name, String operating) {
        return messageMapper.countShopMessage(name,operating);
    }

    @Override
    public int saveShopMessageService(ShopMessage message) {
        return messageMapper.saveShopMessage(message);
    }

    @Override
    public ShopMessage getShopMessageService(Integer id) {
        return messageMapper.getShopMessage(id);
    }

    @Override
    public int updateShopMessageService(ShopMessage message) {
        return messageMapper.updateShopMessage(message);
    }

    @Override
    public int disableShopMessageService(Integer id, String operating) {
        return messageMapper.disableShopMessage(id,operating);
    }

    @Override
    public List<ShopMessage> listShopMessageNameService() {
        return messageMapper.listShopMessageName();
    }
}
