package com.csdj.chainsupermarket.controller.commodity;

import com.alibaba.fastjson.JSON;
import com.csdj.chainsupermarket.entity.commodity.GoodsCommodity;
import com.csdj.chainsupermarket.service.commodity.GoodsCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    /**
     * 按条件查询商品列表（分页）
     * @param start 起始页
     * @param pageSize 页面大小
     * @param goodsName 商品名称
     * @return 商品列表
     */
    @RequestMapping(value ="/listCommodity",method = RequestMethod.POST)
    public String getBrand(@RequestParam(value = "start")int start,
                           @RequestParam(value = "pageSize") int pageSize,
                           @RequestParam(value="goodsName",required = false)String goodsName,
                           @RequestParam(value="ccategoryid",required = false)Integer ccategoryid){
        System.out.println(ccategoryid);
        String str = JSON.toJSONString(goodsCommodityService.listCommodity(start,pageSize,goodsName,ccategoryid));
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
        for (Integer ints : list) {
            goodsCommodityService.delCommodity(ints);
        }
        return true;
    }

    /**
     * 按类型查询商品
     * @param ccategoryid 商品类型的id
     * @return 商品列表
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
