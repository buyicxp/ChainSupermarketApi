package com.csdj.chainsupermarket.controller.advertising;

import com.alibaba.fastjson.JSON;
import com.csdj.chainsupermarket.entity.advertising.AdvertisingTypeVO;
import com.csdj.chainsupermarket.service.advertising.AdvertisingTypeVoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author 丁丽群
 * @date 2019-12-08 22:20
 * @Description 广告分类控制层
 * @Version V1.0
 */
@RestController
@RequestMapping("/adver")
@CrossOrigin
public class AdvertisingTyPeVoController {
    @Resource
    private AdvertisingTypeVoService objService;

    /**
     * 查询广告分类所有信息
     * @param request
     * @param response
     * @return 广告分类集合
     */
    @PostMapping(value="/getBooks")
    public String getBooks(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("查询");
        List<AdvertisingTypeVO> booksList = objService.findAdvertisingTypeVoListService();
        String json= JSON.toJSONStringWithDateFormat(booksList,"yyyy-MM-dd");
        String result = "{\"status\":200,\"message\":" + json + "}";
        return result;
    }

    /**
     * 添加广告分类信息
     * @param brand
     * @return 1成功 0失败
     */
    @RequestMapping(value="/addAdvertisingTypeVO")
    public Integer addAdvertisingTypeVO(AdvertisingTypeVO brand){
        //@RequestBody
        objService.addAdvertisingTypeService(brand);
        return brand.getAdvertisingId();
    }

    /**
     * 删除广告分类
     * @param advertisingId 广告分类编号
     * @return 1成功 0失败
     */
    @RequestMapping(value = "/delAdvertisingTypeVO")
    public Object delAdvertisingTypeVO(Integer advertisingId){
        if(objService.deleteAdvertisingTypeService(advertisingId)>0){
            return true;
        };
        return false;
    }

}
