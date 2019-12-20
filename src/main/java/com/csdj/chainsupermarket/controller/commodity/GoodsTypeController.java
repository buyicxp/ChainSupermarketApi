package com.csdj.chainsupermarket.controller.commodity;

import com.alibaba.fastjson.JSON;
import com.csdj.chainsupermarket.entity.commodity.GoodsType;
import com.csdj.chainsupermarket.entity.commodity.GoodsTypeDTO;
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

    /**
     * 树状图分页查询
     * @param start
     * @param pageSize
     * @return
     */
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

    /**
     * 单个删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/del")
    public Object removeBr(Integer id){
        if(goodsTypeService.getGoodsTypeDel(id)>0){
            return true;
        }
        return false;
    }

    /**
     * 批量删除
     * @param list
     * @return
     */
    @RequestMapping(value = "/pidel")
    public Object pidel(@RequestParam("isList") List<Integer> list){
        for (Integer cou:list) {
            goodsTypeService.getGoodsTypeDel(cou);
        }
        return true;
    }

    /**
     * 停启用
     * @param id
     * @param stop
     * @param parentid
     * @return
     */
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

    /**
     * 所有父分类查询
     * @return
     */
    @RequestMapping(value = "/typeNameList")
    public Object typeNameList(){
        String str =JSON.toJSONString(goodsTypeService.getTypeNameList());
        String result = "{\"status\":200,\"message\":" + str + "}";
        System.out.println(result);
        return result;
    }

    /**
     * 所有父分类查询
     * @return
     */
    @RequestMapping("goods/findByAll")
    public List<GoodsType> findByAll(){
        return goodsTypeService.findByAll();
    }

    /**
     * 根据ID查询分类
     * @param id
     * @return
     */
    @RequestMapping("goods/findById")
    public GoodsType findById(int id){
        return goodsTypeService.findById(id);
    }

    /**
     * 类型修改
     * @param goodsType
     * @return
     */
    @RequestMapping(value = "/update")
    public Integer update(@RequestBody GoodsTypeDTO goodsType){
        System.out.println(goodsType.getTypename()+"<><><>"+goodsType.getTypecount());
        return goodsTypeService.getGoodsTypeUpdate(goodsType);
    }

    /**
     * 父类增加
     * @param goodsType
     * @return
     */
    @RequestMapping(value = "/addfu")
    public Integer addfu(@RequestBody GoodsTypeDTO goodsType){
        System.out.println(goodsType.getTypename()+"<1><2><3>"+goodsType.getTypecount());
        return goodsTypeService.getGoodsTypeAddfu(goodsType);
    }

    /**
     * 子类增加
     * @param goodsType
     * @return
     */
    @RequestMapping(value = "/addzi")
    public Integer addzi(@RequestBody GoodsTypeDTO goodsType){
        System.out.println(goodsType.getTypename()+"<4><5><6>"+goodsType.getTypecount()+"<7>"+goodsType.getId()+"+ParentId+"+goodsType.getParentId());
        return goodsTypeService.getGoodsTypeAddzi(goodsType);
    }

}
