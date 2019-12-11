package com.csdj.chainsupermarket.controller.commodity;

import com.csdj.chainsupermarket.entity.commodity.GoodsProduct;
import com.csdj.chainsupermarket.service.commodity.GoodsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 尹嘉丽
 * @date 2019-12-10
 * 产品表控制器类
 */
@CrossOrigin
@Controller
@RequestMapping("/commodity")
public class GoodsProductController {
    @Autowired
    GoodsProductService goodsProductService;

    @RequestMapping(value = "/addGoods")
    @ResponseBody
    public Map<String, Object> addGoods(@RequestBody GoodsProduct goodsProduct){
        System.out.println(goodsProduct);
        Map<String,Object> result =new HashMap<>();
        result.put("res",goodsProductService.addGoods(goodsProduct));
        return result;
    }

}
