package com.csdj.chainsupermarket.controller.marketing;

import com.alibaba.fastjson.JSON;
import com.csdj.chainsupermarket.entity.marketing.SnapUpActivities;
import com.csdj.chainsupermarket.service.marketing.MarketService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author 贺芳
 * 处理页面
 */
@Controller
@CrossOrigin
@RequestMapping("/marketings")
public class MarketController {
    @Resource
    private MarketService marketService;



    /**
     * 查询所有及分页  (模糊查询)
     * @param activityName
     * @param currentPage
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/selectMarket")
    @ResponseBody
        public String pageBrand(String activityName,Integer currentPage,Integer pageSize){
        System.out.println(currentPage+","+pageSize);
            Map map=new HashMap();
            map.put("activityName",activityName);
            map.put("currentPage",(currentPage-1)*pageSize);
            map.put("pageSize",pageSize);

        System.out.println(currentPage+","+pageSize);

            String str = JSON.toJSONString(marketService.getMarkList(map));

        String json="{\"code\":0,\"msg\":\"\",\"count\":"+marketService.markCount(map)+",\"result\":"+str+"}";
        System.out.println(json);
        return json;
    }


    /**
     * 添加抢购信息
     * @param snapUpActivities
     * @return
     */
    @RequestMapping(value="/addMarket")
    @ResponseBody
    public Object addUser(SnapUpActivities snapUpActivities){
        Map<String, Object> map = new HashMap();
        //0 添加
        System.out.println(snapUpActivities.getCtivityId()+"L");
        if( snapUpActivities.getCtivityId() == null){
            snapUpActivities.setGmtCreate(new Date());
            int rescount=marketService.insertMark(snapUpActivities);
           
    
            if(rescount==0){
                map.put("Msg", "添加失败!!!");
            }else {
                map.put("Msg", "添加成功!!!");
            }
            
            return  map;
        }else {
            //1修改
            snapUpActivities.setGmtModified(new Date());
            int rescount = marketService.updateMark(snapUpActivities);
            if(rescount==0){
                map.put("Msg", "修改失败!!!");
            }else {
                map.put("Msg", "修改成功!!!");
            }
            return  map;

        }

    }


    /**
     * 删除一条
     * @param lists
     * @return
     */
    @RequestMapping(value = "/delMarket")
    @ResponseBody
    public Object removeBr(@RequestParam(value="lists") List<Integer> lists){
        Map<String, Object> map = new HashMap();
    
       
        int listsize=lists.size();
        int size=0;
            //循环删除 / 单个删除
        for(Integer in:lists){
            size+=marketService.deleteMark(in);
        }
        if(listsize==size){
            map.put("Msg", "删除成功!!!");
        }else{
            map.put("Msg", "删除失败!!!");
        }
        return map;

    }

    /**
     * 修改查询
     * @param ctivityId
     * @return
     */
    @RequestMapping(value = "/updatelist")
    @ResponseBody
    public String removeBr(@RequestParam(value="ctivityId") Integer ctivityId){
        String str = JSON.toJSONString(marketService.updatelist(ctivityId));
        System.out.println(str);
        String json="{\"code\":0,\"msg\":\"\",\"count\":"+marketService.updatelist(ctivityId).size()+",\"data\":"+str+"}";
        return json;
    }

    /**
     * 修改
     * @param snapUpActivities
     * @return
     */
    @RequestMapping(value = "/updateMarket")
    @ResponseBody
    public Object updateBr(SnapUpActivities snapUpActivities){
        return  JSON.toJSONString(marketService.updateMark(snapUpActivities));
    }




    /**
     * 提供抢购的接口
     * @param ctivityId
     * @param activityName
     * @return
     */
    @RequestMapping(value = "/qgMarket")
    @ResponseBody
    public String qgMarket(Integer ctivityId,String activityName ){
        String str = JSON.toJSONString(marketService.qgMarket(ctivityId,activityName));
        System.out.println(str);
        String result = "{\"status\":200,\"message\":" + str + "}";
        return result;
    }


    /**
     * 提供抢购的接口 查询id、名称
     * @param
     * @param
     * @return
     */
    @RequestMapping("/show_name")
    @ResponseBody
    public Map<String,Object> show_name(){
        Map<String,Object> result=new HashMap<>();
        result.put("data",marketService.show_name());
        System.out.println(JSON.toJSONString(result));
        return result;

    }
}
