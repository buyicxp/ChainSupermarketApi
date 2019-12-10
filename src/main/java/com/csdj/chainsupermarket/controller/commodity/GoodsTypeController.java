package com.csdj.chainsupermarket.controller.commodity;

import com.alibaba.fastjson.JSON;
import com.csdj.chainsupermarket.entity.commodity.GoodsType;
import com.csdj.chainsupermarket.service.commodity.GoodsTypeService;
import com.csdj.chainsupermarket.util.goodstype.TreeUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: 邹泓广
 * @date: 2019/12/5
 */
@RestController
@CrossOrigin
public class GoodsTypeController {
    @Resource
    GoodsTypeService goodsTypeService;

    @PostMapping("/goodstype")
    public Map<String, Object> findProduct(@RequestParam(value = "start")int start, @RequestParam(value = "pageSize") int pageSize) {
        /*
         * 接收在数据库中查询到的数据
         */
        List<GoodsType> list = goodsTypeService.getGoodsTypeList(0,start,pageSize);
        for (GoodsType type:list) {
            type.setChildList(goodsTypeService.getGoodsTypeList(type.getId()));
        }
        /*
         * 调用工具类，第一个参数是默认传入的顶级id，和查询出来的数据
         */
        List<GoodsType> tree = TreeUtil.getTreeList(0, list);
        Map<String, Object> result = new HashMap<>();
        result.put("message", tree);
        result.put("status", 200);
        result.put("count", goodsTypeService.getCount());
        return result;
    }

    @RequestMapping(value = "/del")
    public Object removeBr(Integer id){
        if(goodsTypeService.getGoodsTypeDel(id)>0){
            return true;
        }
        return false;
    }

    @RequestMapping(value = "/pidel")
    public Object pidel(@RequestParam("isList") List<Integer> list){
        for (Integer cou:list) {
            goodsTypeService.getGoodsTypeDel(cou);
        }
        return true;
    }

    @RequestMapping(value = "/one")
    public Integer one(Integer id,Integer stop,Integer parentid){
        //判断ID
//        if(id==0){
//            id=1;
//        }else {
//            id=0;
//        }
        Integer count = 0;
        if(parentid==0){
            /*修改所有的子类启停状态*/
            count = goodsTypeService.getGoodsTypeOne(id,stop);
            count = goodsTypeService.getParentId(id,stop);
        }else {
            /*修改所有的启停状态*/
            count = goodsTypeService.getGoodsTypeOne(id,stop);
        }
        return count;
    }

    @RequestMapping(value = "/typeNameList")
    public Object typeNameList(){
        List<GoodsType> list = goodsTypeService.getTypeNameList();
        return list;
    }

}
