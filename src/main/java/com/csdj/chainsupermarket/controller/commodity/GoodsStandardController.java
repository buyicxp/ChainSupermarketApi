package com.csdj.chainsupermarket.controller.commodity;

import com.csdj.chainsupermarket.entity.commodity.GoodsColour;
import com.csdj.chainsupermarket.service.commodity.GoodsStandardService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/commodity")
@CrossOrigin
public class GoodsStandardController {
    Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
    @Autowired
    GoodsStandardService goodsStandardService;
    /**
     * 查询所有颜色规格记录
     * @return
     */
    @RequestMapping(value = "/StandardSelect")
    public  List<GoodsColour>  StandardSelect() {
        List<String> res = new ArrayList<>();
        List<GoodsColour> goodsColourList = goodsStandardService.StandardSelect();
        for (GoodsColour goodsColour:goodsColourList){
            res.add(goodsColour.getColourname());
        }
        return goodsColourList;
    }

    /**
     * 添加颜色规格方法
     * @param colourname 颜色名字
     * @param colourpath 小图路径
     * @return
     */
    @RequestMapping(value = "/goodsStandardAdd")
    public  String  goodsStandardAdd(String colourname, String colourpath ) {
        GoodsColour goodsColour = new GoodsColour();
        goodsColour.setColourname(colourname);
        goodsColour.setColourpath(colourpath);
        int res = goodsStandardService.goodsStandardAdd(goodsColour);
        System.out.println(res);
        if (res>0){
            return "true";
        }else{
            return "false";
        }

    }

    /**
     * 修改颜色表数据
     * @param id 数据id
     * @param colourname 颜色名称
     * @param colourpath 颜色图片地址
     * @return
     */
    @RequestMapping(value = "/goodsStandardUpdate")
    public  String  goodsStandardUpdate(long id,String colourname, String colourpath ) {
        GoodsColour goodsColour = new GoodsColour();
        goodsColour.setId(id);
        goodsColour.setColourname(colourname);
        goodsColour.setColourpath(colourpath);
        int res = goodsStandardService.goodsStandardUpdate(goodsColour);
        System.out.println(res);
        if (res>0){
            return "true";
        }else{
            return "false";
        }
    }

    /**
     * 删除数据方法
     * @param id 数据id
     * @return
     */
    @RequestMapping(value = "/goodsStandardDel")
    public  String  goodsStandardDel(long id) {
        int res = goodsStandardService.goodsStandardDel(id);
        System.out.println(res);
        if (res>0){
            return "true";
        }else{
            return "false";
        }
    }

    /**
     * 颜色表分页查询
     * @param currentPage 当前页码数
     * @param pageSize 当前页总记录数
     * @return
     */
    @RequestMapping(value = "/pageInfoGoodsColour")
    public  List<GoodsColour>  pageInfoGoodsColour(@RequestParam(name = "currentPage") Integer currentPage,@RequestParam(name = "pageSize")  Integer pageSize) {
        List<GoodsColour> list = goodsStandardService.pageInfoGoodsColour((currentPage-1)*pageSize,pageSize);
        return list;
    }

    /**
     * 查询颜色表总记录数
     * @return
     */
    @RequestMapping(value = "/goodsCount")
        public  int  goodsCount()
    {
      return goodsStandardService.goodsCount();
    }
}
