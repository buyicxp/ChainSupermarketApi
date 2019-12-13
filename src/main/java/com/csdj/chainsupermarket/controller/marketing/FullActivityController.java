package com.csdj.chainsupermarket.controller.marketing;

import com.csdj.chainsupermarket.entity.commodity.GoodsCommodity;
import com.csdj.chainsupermarket.entity.marketing.ActivityRangeVO;
import com.csdj.chainsupermarket.entity.marketing.ActivityTypeVO;
import com.csdj.chainsupermarket.entity.marketing.FullActivityVO;
import com.csdj.chainsupermarket.service.marketing.ActivityRangeService;
import com.csdj.chainsupermarket.service.marketing.ActivityTypeService;
import com.csdj.chainsupermarket.service.marketing.FullActivityService;
import com.csdj.chainsupermarket.util.shiro.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version 版本号        1.0
 * @author： 作者名称     张晟
 * @date 创建时间        2019/12/5/0005 10:36
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@RestController
@CrossOrigin
@RequestMapping("/fullActivity")
public class FullActivityController {
    @Resource
    private FullActivityService fullActivityService;
    @Resource
    private ActivityRangeService activityRangeService;
    @Resource
    private ActivityTypeService activityTypeService;

    /**
     * 分页查询所有满减满赠活动
     * @param index
     * @param pageSize
     * @param activityName
     * @param request
     * @param typeid
     * @param rangeid
     * @return
     */
    @RequestMapping("/list")
    public Map find(@RequestParam(defaultValue = "1") int index,@RequestParam(defaultValue = "4") int pageSize
            , String activityName, HttpServletRequest request,@RequestParam(defaultValue = "0") int typeid,@RequestParam(defaultValue = "0") int rangeid) {
        HttpSession session = request.getSession();
        if (typeid != 0) {
            session.setAttribute("typeid", typeid);
        } else { //
            /* 如果没有条件，则看Session中有没有条件。 */
            if (session.getAttribute("typeid") != null) {
                typeid = (int) session.getAttribute("typeid");
            }
        }
        if (rangeid != 0) {
            session.setAttribute("rangeid", rangeid);
        } else { //
            /* 如果没有条件，则看Session中有没有条件。 */
            if (session.getAttribute("rangeid") != null) {
                rangeid = (int) session.getAttribute("rangeid");
            }
        }
        if (activityName != null) {
            session.setAttribute("activityName", activityName);
        } else {
            if (session.getAttribute("activityName") != null) {
                activityName = (String)
                        session.getAttribute("activityName");
            }
        }
        PageUtil<FullActivityVO> pu=fullActivityService.findPage(index,pageSize,activityName);
        List<ActivityRangeVO>findAll=activityRangeService.findAllRange();
        List<ActivityTypeVO>find=activityTypeService.findAllType();
        Map<String,Object>map=new HashMap<>();
        int count=fullActivityService.getCount();
        map.put("activityName",activityName);
        map.put("typeid",typeid);
        map.put("rangeid",rangeid);
        map.put("findAll",findAll);
        map.put("find",find);
        map.put("count",count);
        map.put("pu",pu);
        return map;
    }

    /**
     * 删除活动（实际数据不删除，改变状态）
     * @param activityid
     * @return
     */
    @RequestMapping("/delete")
    public Map delete(int  activityid){
        Map<String,Object>map=new HashMap<>();
            int res=fullActivityService.delete(activityid);
            if (res >= 1) {
                map.put("Msg", "删除成功");
            } else {
                map.put("Msg", "删除失败");
            }
            System.out.println(res);
        return map;
    }

    @RequestMapping("/update")
    public Map update(int activityid,String activityState){
        Map<String,Object>map=new HashMap<>();
        int res=fullActivityService.update(activityid,activityState);
        if (res >= 1) {
            map.put("Msg", "修改成功");
        } else {
            map.put("Msg", "修改失败");
        }
        System.out.println(res);
        return map;
    }
    @RequestMapping("/add")
    public Map add(@RequestBody FullActivityVO fullActivityVO){
        Map map=new HashMap();
        int res=fullActivityService.add(fullActivityVO);
        if (res >= 1) {
            map.put("Msg", "添加成功");
        } else {
            map.put("Msg", "添加失败");
        }
        System.out.println(res);
        return map;
    }

}
