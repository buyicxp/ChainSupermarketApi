package com.csdj.chainsupermarket.controller.advertising;

import com.alibaba.fastjson.JSON;
import com.csdj.chainsupermarket.entity.advertising.AdvertisingTypeVO;
import com.csdj.chainsupermarket.service.advertising.AdvertisingTypeVoService;
import com.csdj.chainsupermarket.util.marketing.PageUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     * @param index
     * @param pageSize
     * @return
     */
    @PostMapping(value="/List")
    public Map list(int index, int pageSize) {
        Map<String, Object> map = new HashMap();
        PageUtil<AdvertisingTypeVO> pageUtil = objService.findAdvertisingTypeVoList(index, pageSize);
        int Total = objService.getCount();
        map.put("Total", Total);
        map.put("pageUtil", pageUtil);
        return map;
    }

    /**
     * 添加广告分类信息
     * @param brand
     * @return map
     */
    @RequestMapping(value="/addAdvertisingTypeVO")
    public Map addAdvertisingTypeVO(AdvertisingTypeVO brand){
        Map<String, Object> map = new HashMap();
        brand.setCreateTime(new Date());
        brand.setEnteringTime(new Date());
        brand.setUpdateTime(new Date());
        if (brand.getAdvertisingId() != null) {
            int res = objService.updateType(brand);
            if (res >= 1) {
                map.put("Msg", "修改成功!!!");
            } else {
                map.put("Msg", "修改失败!!!");
            }
        } else {
            boolean flag = objService.selectByActivityName(brand.getAdvertisingName());
            if (!flag) {
                map.put("Msg", "该活动名称已存在!!!");
            } else {
                int res = objService.addAdvertisingTypeService(brand);
                if (res >= 1) {
                    map.put("Msg", "添加成功!!!");
                } else {
                    map.put("Msg", "添加失败!!!");
                }
            }
        }
        return map;
    }

    /**
     * 删除广告分类
     * @param advertisingId 广告分类编号
     * @return 1成功 0失败
     */
    @RequestMapping("/del")
    public Map del(String advertisingId){
        Map<String, Object> map = new HashMap<>();
        int res = objService.deleteAdvertisingTypeService(advertisingId);
        System.out.println(advertisingId);
        if (res >= 1) {
            map.put("Msg", "删除成功!!!");
        } else {
            map.put("Msg", "删除失败!!!");
        }
        return map;
    }

}
