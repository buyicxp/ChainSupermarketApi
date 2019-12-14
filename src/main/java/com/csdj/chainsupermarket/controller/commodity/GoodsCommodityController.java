package com.csdj.chainsupermarket.controller.commodity;

import com.alibaba.fastjson.JSON;
import com.csdj.chainsupermarket.entity.commodity.CommodityPub;
import com.csdj.chainsupermarket.entity.commodity.GoodsCommodity;
import com.csdj.chainsupermarket.service.commodity.EsCommodityPubService;
import com.csdj.chainsupermarket.service.commodity.GoodsCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


/**
 * 商品列表
 * @author 温朝明
 * @Date 2019/12/5
 */
@RestController
@RequestMapping("/commodity")
@CrossOrigin
public class GoodsCommodityController {

    @Autowired
    private GoodsCommodityService goodsCommodityService;

    @Resource
    private EsCommodityPubService esCommodityPubService;
    /**
     * 按条件查询商品列表（分页）
     * @param start 起始页
     * @param pageSize 页面大小
     * @param goodsTitle 商品名称
     * @return
     */
    @RequestMapping(value ="/listCommodity",method = RequestMethod.POST)
    public String getBrand(@RequestParam(value = "start")int start,
                           @RequestParam(value = "pageSize") int pageSize,
                           @RequestParam(value="goodsTitle",required = false)String goodsTitle,
                           @RequestParam(value="ccategoryid",required = false)Integer ccategoryid){
        System.out.println(ccategoryid);
        String str = JSON.toJSONString(goodsCommodityService.listCommodity(start,pageSize,goodsTitle,ccategoryid));
        String result = "{\"status\":200,\"message\":" + str + "}";
        return result;
    }

    /**
     * 分页查询
     * @param start 起始页
     * @param pageSize 页面大小
     * @return 商品列表
     */
    @RequestMapping(value = "/pageCommodity",method = RequestMethod.POST)
    public String pageBrand(@RequestParam(value = "start")int start,@RequestParam(value = "pageSize") int pageSize){
        String str =JSON.toJSONString(goodsCommodityService.pageCommodity(start,pageSize));
        String result = "{\"status\":200,\"message\":" + str + "}";
        List<GoodsCommodity> list=goodsCommodityService.pageCommodity(start,pageSize);
        return result;
    }

    /**
     * 查询商品数量
     * @return 商品数量
     */
    @RequestMapping(value = "/count")
    public Object count(){
        return goodsCommodityService.countCommodity();
    }

    /**
     * 删除商品
     * @param id 商品id
     * @return 是否成功
     */
    @RequestMapping(value = "/delCommodity")
    public Object delComm(@RequestParam(value="id")int id){
        int num=goodsCommodityService.delCommodity(id);
        //创建搜索引擎对象
        CommodityPub commodityPub =new CommodityPub();
        commodityPub.setGoods_id(id);
        commodityPub.setDrop(1);
        //搜索引擎的修改，将drop状态改为1(删除)
        esCommodityPubService.updateCommodityPub(commodityPub);
        if(num>0){
            return true;
        }
        return false;
    }

    /**
     * 商品下架
     * @param id 商品id
     * @return 是否成功
     */
    @RequestMapping(value = "/underCarriage")
    public Object downComm(@RequestParam(value="id")int id){
        int num=goodsCommodityService.underCarriage(id);
        //创建搜索引擎对象
        CommodityPub commodityPub =new CommodityPub();
        commodityPub.setGoods_id(id);
        commodityPub.setCondition(1);
        //搜索引擎的修改，将condition状态改为1(下架)
        esCommodityPubService.updateCommodityPub(commodityPub);
        if(num>0){
            return true;
        }
        return false;
    }

    /**
     * 上架
     * @param id 商品id
     * @return 是否成功
     */
    @RequestMapping(value = "/grounding")
    public Object upComm(@RequestParam(value="id")int id){
        int num=goodsCommodityService.grounding(id);
        //创建搜索引擎对象
        CommodityPub commodityPub =new CommodityPub();
        commodityPub.setGoods_id(id);
        commodityPub.setCondition(1);
        //搜索引擎的修改，将condition状态改为0(上架)
        esCommodityPubService.updateCommodityPub(commodityPub);
        if (num>0){
            return true;
        }
        return false;
    }

    /**
     * 批量删除
     * @param list 商品id
     * @return 是否成功
     */
    @RequestMapping("/dele")
    public Object dele(@RequestParam("isList") List<Integer> list) {
        //创建搜索引擎对象
        CommodityPub commodityPub =new CommodityPub();
        for (Integer ints : list) {
            goodsCommodityService.delCommodity(ints);
            commodityPub.setGoods_id(ints);
            commodityPub.setDrop(1);
            //搜索引擎的修改，将drop状态改为1(删除)
            esCommodityPubService.updateCommodityPub(commodityPub);
        }
        return true;
    }

    /**
     * 按类型查询商品
     * @param ccategoryid
     * @return
     */
    @RequestMapping("/selectCom")
    public Object seleCom(@RequestParam(value="ccategoryid",required =false)Integer ccategoryid){
        String str =JSON.toJSONString(goodsCommodityService.selectCommodity(ccategoryid));
        String result = "{\"status\":200,\"message\":" + str + "}";
        return result;
    }


    /**
     * 添加商品
     * @param goodsCommodity 商品实体类
     * @return 是否成功
     */
    @RequestMapping("/addCom")
    public Object addCom(GoodsCommodity goodsCommodity){
        int num=goodsCommodityService.addCommodity(goodsCommodity);
        //创建搜索引擎对象
        CommodityPub commodityPub =new CommodityPub();
        commodityPub.setGoods_id(goodsCommodity.getId());
        commodityPub.setCondition(0);
        commodityPub.setDrop(0);
        commodityPub.setActivity_price(goodsCommodity.getActivityprice());
        commodityPub.setGoods_name(goodsCommodity.getGoodsName());
        commodityPub.setDetails(goodsCommodity.getDetails());
        commodityPub.setPicture_path(goodsCommodity.getPicturepath());
        commodityPub.setGoods_title(goodsCommodity.getGoodsTitle());
        commodityPub.setTimestamp(new Date());
        commodityPub.setUpper_down(0);
        //搜索引擎 商品的添加
        esCommodityPubService.insertCommodityPub(commodityPub);
        if(num>0){
            System.out.println(true);
            return true;
        }
        return false;
    }

    /**
     * 限购商品
     * @return 商品列表
     */
    @RequestMapping("/boundsCom")
    public Object boundsCom(){
        String str =JSON.toJSONString(goodsCommodityService.boundsCommodity());
        return str;
    }

    /**
     * 预售商品
     * @return 商品列表
     */
    @RequestMapping("/presellCom")
    public Object presellCom(){
        String str =JSON.toJSONString(goodsCommodityService.presellCommodity());
        return str;
    }

    /**
     * 拼团商品
     * @return 商品列表
     */
    @RequestMapping("/activeCom")
    public Object activeCom(){
        String str =JSON.toJSONString(goodsCommodityService.activeCommodity());
        return str;
    }

    /**
     * 通过id查询单个商品信息
     * @param id 商品id
     * @return 商品信息
     */
    @RequestMapping("/getById")
    public Object getComById(@RequestParam(value="id")Integer id){
        String str =JSON.toJSONString(goodsCommodityService.getComById(id));
        return str;
    }
}
