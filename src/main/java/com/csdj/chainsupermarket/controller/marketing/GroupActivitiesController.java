package com.csdj.chainsupermarket.controller.marketing;

import com.alibaba.fastjson.JSON;
import com.csdj.chainsupermarket.entity.marketing.GroupActivities;
import com.csdj.chainsupermarket.service.marketing.GroupActivitiesService;
import com.csdj.chainsupermarket.util.marketing.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author :阿浩i
 * @Description : 拼团活动控制器
 * @CreateDate :  2019/12/3 16:21
 * @Version : 1.0
 */
@RestController
@RequestMapping(value = "/Purchase")
@CrossOrigin
public class GroupActivitiesController {
    @Resource
    private GroupActivitiesService service;
    @Autowired
    StringRedisTemplate srt;
    @Autowired
    RedisTemplate<String,Object> rt;
    
    
    /**
     * 查询所有拼团活动
     * @author    阿浩i
     * @param     index
     * @param     pageSize
     * @param     activityName
     * @return    java.util.Map
     * @date      2019/12/4 16:04
     */
    @RequestMapping("/list")
    public Map list(int index, int pageSize, String activityName){
        PageUtil<GroupActivities> pageUtil = service.findGroupActivities(index, pageSize, activityName);
        Map<String, Object> map = new HashMap();
        int Total = service.getCount(activityName);
        
        map.put("Total", Total);
        map.put("pageUtil", pageUtil);
        return map;
    }
    
    /**
     * 新增或者修改活动
     * @author    阿浩i
     * @param     groupActivities
     * @return    java.util.Map
     * @date      2019/12/5 14:29
     */
    @RequestMapping("/save")
    public Map save(GroupActivities groupActivities){
        Map<String, Object> map = new HashMap();
        groupActivities.setCreationTime(new Date());
        System.out.println(groupActivities.getCreationTime());
        if (groupActivities.getActivitiesId() != null) {
            int res = service.updateGroupActivities(groupActivities);
            if (res >= 1) {
                map.put("Msg", "修改成功!!!");
            } else {
                map.put("Msg", "修改失败!!!");
            }
        } else {
            if (service.selectByActivityName(groupActivities.getActivityName())) {
                int res = service.addGroup(groupActivities);
                if (res >= 1) {
                    map.put("Msg", "添加成功!!!");
                } else {
                    map.put("Msg", "添加失败!!!");
                }
            } else {
                map.put("Msg", "该活动名称已存在!!!");
            }
        }
        return map;
    }
    
    /**
     * 根据主键批量删除数据
     * @author    阿浩i
     * @param     activitiesId
     * @return    java.util.Map
     * @date      2019/12/5 14:36
     */
    @RequestMapping("/del")
    public Map del(String activitiesId){
        Map<String, Object> map = new HashMap<>();
        int res = service.deleteGroupActivitiesByIds(activitiesId);
        System.out.println(activitiesId);
        if (res >= 1) {
            map.put("Msg", "删除成功!!!");
        } else {
            map.put("Msg", "删除失败!!!");
        }
        return map;
    }
    
    /**
     * 查询所有数据，设置活动接口
     * @author    阿浩i
     * @param
     * @return    java.util.Map<java.lang.String,java.lang.Object>
     * @date      2019/12/11 11:24
     */
    @RequestMapping("/getAll")
    public Map<String,Object> getAll(){
        Map<String,Object> result=new HashMap<>();
        result.put("data",service.findAllGroupActivities());
        System.out.println(com.alibaba.fastjson.JSON.toJSONString(result));
        return result;
    }
}
