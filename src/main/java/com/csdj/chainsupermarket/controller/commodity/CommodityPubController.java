package com.csdj.chainsupermarket.controller.commodity;

import com.csdj.chainsupermarket.service.commodity.EsCommodityPubService;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
/**
 * @ClassName CommodityPubController
 * @Description: 搜索引擎控制层
 * @Author 唐浪
 * @Date 2019/12/6
 * @Version V1.0
 **/
@RestController
@RequestMapping("/commodityPub")
@CrossOrigin
public class CommodityPubController {
    @Resource
    EsCommodityPubService esCommodityPubService;
    /**
     * 查询的api接口
     * @return Map<String,Object>
     */
    @PostMapping("list")
    public Map<String,Object> listCommodityPub(@PageableDefault Pageable pageable, @RequestParam("goodsName") String goodsName){
        System.err.println(goodsName);
        Map<String,Object> map=new HashMap<>(10);
        map.put("data",esCommodityPubService.listCommodityPub(pageable,goodsName));
        return map;
    }
}
