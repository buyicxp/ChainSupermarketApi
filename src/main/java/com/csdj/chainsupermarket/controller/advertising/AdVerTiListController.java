package com.csdj.chainsupermarket.controller.advertising;

import com.alibaba.fastjson.JSON;
import com.csdj.chainsupermarket.entity.advertising.AdVerTiListVO;
import com.csdj.chainsupermarket.entity.advertising.AdvertisingTypeVO;
import com.csdj.chainsupermarket.service.advertising.AdVerTiListVoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author 丁丽群
 * @date 2019-12-09 16:50
 * @Description 广告控制层
 * @Version V1.0
 */
@RestController
@RequestMapping("/adVer")
@CrossOrigin
public class AdVerTiListController {
    @Resource
    private AdVerTiListVoService adVerService;

    /**
     * 根据广告名称和广告分类编号查询广告信息
     * @param adVerTiName
     * @param advertisingTypeId
     * @param request
     * @param response
     * @return
     */
    @PostMapping(value="/getAdVerTiList")
    public String getAdVerTiList(@RequestParam(value = "adVerTiName")String adVerTiName,@RequestParam(value = "advertisingTypeId")Integer advertisingTypeId,
                                  HttpServletRequest request, HttpServletResponse response) {
        List<AdVerTiListVO> booksList = adVerService.findAdVerTiListVoListService(adVerTiName,advertisingTypeId);
        String json= JSON.toJSONString(booksList);
        String result = "{\"status\":200,\"message\":" + json + "}";
        return json;
    }

    /**
     *给首页的广告接口
     * @param request
     * @param response
     * @return
     */
    @PostMapping(value="/findAdVerTiList")
    public String findAdVerTiList(HttpServletRequest request, HttpServletResponse response) {
        List<AdVerTiListVO> booksList = adVerService.getAdVerTiListVoService();
        String json= JSON.toJSONStringWithDateFormat(booksList,"yyyy-MM-dd");
        String result = "{\"status\":200,\"message\":" + json + "}";
        return result;
    }

    /**
     *下拉列表查询广告分类信息
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value="/getAdvertisingType")
    public String getAdvertisingType(HttpServletRequest request, HttpServletResponse response) {
        List<AdvertisingTypeVO> booksList = adVerService.findAdvertisingTypeListService();
        String json= JSON.toJSONString(booksList);
        String result = "{\"status\":200,\"message\":" + json + "}";
        return result;
    }

    /**
     * 删除广告信息
     * @param adVerTiListId
     * @return
     */
    @RequestMapping(value = "/delAdVerTiList")
    public String delAdVerTiList(Integer adVerTiListId){
        int count=adVerService.delAdVerTiListVoService(adVerTiListId);
        String json=JSON.toJSONString(count);
        return json;
    }
}
