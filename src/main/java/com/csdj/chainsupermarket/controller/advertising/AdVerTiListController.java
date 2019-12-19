package com.csdj.chainsupermarket.controller.advertising;

import com.alibaba.fastjson.JSON;
import com.csdj.chainsupermarket.entity.advertising.AdVerTiListVO;
import com.csdj.chainsupermarket.entity.advertising.AdvertisingTypeVO;
import com.csdj.chainsupermarket.service.advertising.AdVerTiListVoService;
import com.csdj.chainsupermarket.service.advertising.AdvertisingTypeVoService;
import com.csdj.chainsupermarket.util.marketing.PageUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Resource
    private AdvertisingTypeVoService service;
    
    /**
     * 根据广告名称和广告分类编号查询广告信息
     * @param adVerTiName
     * @param advertisingTypeId
     * @return
     */
    @PostMapping(value="/getAdVerTiList")
    public Map list(int index, int pageSize, String adVerTiName, String advertisingTypeId) {
        Map<String, Object> map = new HashMap();
        if ("0".equals(advertisingTypeId)){
            advertisingTypeId = null;
        }
        PageUtil<AdVerTiListVO> pageUtil = adVerService.findAdVerTiListVOList(index, pageSize, adVerTiName, advertisingTypeId);
        int Total = adVerService.getCount(adVerTiName, advertisingTypeId);
        List<AdvertisingTypeVO> list = service.findAdvertisingTypeVoListService();
        map.put("Total", Total);
        map.put("pageUtil", pageUtil);
        map.put("list", list);
        return map;
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
    
    
    @RequestMapping("/del")
    public Map del(String adVerTiListId){
        Map<String, Object> map = new HashMap<>();
        int res = adVerService.delAdVerTiListVoService(adVerTiListId);
        System.out.println(adVerTiListId);
        if (res >= 1) {
            map.put("Msg", "删除成功!!!");
        } else {
            map.put("Msg", "删除失败!!!");
        }
        return map;
    }
    
    @RequestMapping("/save")
    public Map save(AdVerTiListVO listVO){
        Map<String, Object> map = new HashMap();
        listVO.setCreateTime(new Date());
        listVO.setEnteringTime(new Date());
        listVO.setUpdateTime(new Date());
        if (listVO.getAdVerTiListId() != null) {
            int res = adVerService.updAdVerTiListVoService(listVO);
            if (res >= 1) {
                map.put("Msg", "修改成功!!!");
            } else {
                map.put("Msg", "修改失败!!!");
            }
        } else {
            boolean flag = adVerService.selectByActivityName(listVO.getAdVerTiName());
            if (!flag) {
                map.put("Msg", "该活动名称已存在!!!");
            } else {
                int res = adVerService.addAdVerTiListVoService(listVO);
                if (res >= 1) {
                    map.put("Msg", "添加成功!!!");
                } else {
                    map.put("Msg", "添加失败!!!");
                }
            }
        }
        return map;
    }
}
