package com.csdj.chainsupermarket.controller.shop.minuteshop;

import com.csdj.chainsupermarket.entity.shop.minuteshop.ShopMessage;
import com.csdj.chainsupermarket.service.shop.minuteshop.ShopMessageService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/shop")
public class ShopMessageController {
    @Resource
    ShopMessageService shopMessageService;

    @RequestMapping("/findById")
    public ShopMessage findById(int spId){
        return shopMessageService.findById(spId);
    }
    @RequestMapping("/findByAll")
    public List<ShopMessage> findByAll(){
        return shopMessageService.findByAll();
    }
}
