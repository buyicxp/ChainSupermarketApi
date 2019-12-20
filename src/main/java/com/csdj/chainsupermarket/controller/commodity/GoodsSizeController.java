package com.csdj.chainsupermarket.controller.commodity;

import com.csdj.chainsupermarket.entity.commodity.GoodsSize;
import com.csdj.chainsupermarket.service.commodity.GoodsSizeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/GoodsSize")
@CrossOrigin
public class GoodsSizeController {
    Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
    @Autowired
    GoodsSizeService goodsSizeService;

    /**
     * 尺码表查询方法
     * @return
     */
    @RequestMapping(value = "/goodsSizeSelect")
    public List<GoodsSize> goodsSizeSelect() {
        List<GoodsSize> goodsColourList = goodsSizeService.GoodsSizeSelect();
        return goodsColourList;
    }

    /**
     * 尺码表插入方法
     * @param sizeName
     * @return
     */
    @RequestMapping(value = "/goodsSizeInsert")
    public  String  goodsSizeInsert(String sizeName) {
        GoodsSize goodsSize = new GoodsSize();
        goodsSize.setSizename(sizeName);
        int res = goodsSizeService.goodsSizeInsert(goodsSize);
        System.out.println(res);
        if (res>0){
            return "true";
        }else{
            return "false";
        }
    }
    @RequestMapping(value = "/goodsSizeUpdate")
    public  String  goodsSizeUpdate(long sizeid,String sizeName) {
        GoodsSize goodsSize = new GoodsSize();
        goodsSize.setSizeid(sizeid);
        goodsSize.setSizename(sizeName);
        int res = goodsSizeService.goodsSizeUpdate(goodsSize);
        System.out.println(res);
        if (res>0){
            return "true";
        }else{
            return "false";
        }
    }

    /**
     * 删除方法
     * @param sizeid 选中的id
     * @return
     */
    @RequestMapping(value = "/goodsSizeDel")
    public  String  goodsSizeDel(long sizeid) {
        System.out.println(sizeid);
        int res = goodsSizeService.goodsSizeDel(sizeid);
        System.out.println(res);
        if (res>0){
            return "true";
        }else{
            return "false";
        }
    }

    /**
     * 尺码表分页查询
     * @param currentPage 当前页码数
     * @param pageSize   当前页总记录数
     * @return
     */
    @RequestMapping(value = "/goodsSizePage")
    public  List<GoodsSize>  goodsSizePage(int currentPage,int pageSize) {
        List<GoodsSize> goodsSizePagelist = goodsSizeService.goodsSizePage((currentPage-1)*pageSize, pageSize);
        return goodsSizePagelist;
    }

    /**
     * 查询尺码表总记录数
     * @return
     */
    @RequestMapping(value = "/goodsSizeCount")
    public  int  goodsSizeCount() {
        int count = goodsSizeService.goodsSizeCount();
        return count;
    }


}
