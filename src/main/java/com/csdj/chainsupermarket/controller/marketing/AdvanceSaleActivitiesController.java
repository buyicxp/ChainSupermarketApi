package com.csdj.chainsupermarket.controller.marketing;import com.alibaba.fastjson.JSON;import com.csdj.chainsupermarket.entity.marketing.AdvanceSaleActivitiesEntity;import com.csdj.chainsupermarket.service.marketing.AdvanceSaleActivitiesService;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.web.bind.annotation.*;import java.text.ParseException;import java.text.SimpleDateFormat;import java.util.Date;import java.util.HashMap;import java.util.Map;/** * @author 易富军 * @version 1.0 * @date 2019/12/5 13:31 * @description: 销售活动处理层 */@RestController@RequestMapping("/marketing")@CrossOriginpublic class AdvanceSaleActivitiesController {    @Autowired    private AdvanceSaleActivitiesService advanceSaleActivitiesServiceImpl;    @RequestMapping("/pageBrand")    @ResponseBody    public  Object select(@RequestParam(value = "advanceName",required = false) String advanceName,String start,String pageSize){        System.out.println("123456"+advanceName+" "+start+" "+pageSize);        int lists=advanceSaleActivitiesServiceImpl.AdvanceSaleActivitiesCount(advanceName);        String list=JSON.toJSONString(advanceSaleActivitiesServiceImpl.AdvanceSaleActivitiesFenYe(advanceName,Integer.parseInt(start),Integer.parseInt(pageSize)));        String result = "{\"status\":200,\"message\":" + list + ",\"totol\":" + lists + "}";        return result;    }    /**     *     * @param advanceName 活动名称     * @param advanceTime 出货时间     * @param lists 门店id     * @param preSaleStartTime 开始时间     * @param preSaleEndTime 结束时间     * @return int     */    @RequestMapping("/BrandInsertUpdate")    public Map BrandInsertUpdate(@RequestParam(value="advanceName")String advanceName,@RequestParam(value="advanceTime")String advanceTime,@RequestParam(value="lists")String lists,                                 @RequestParam(value="preSaleStartTime")String preSaleStartTime,@RequestParam(value="preSaleEndTime")String preSaleEndTime) throws ParseException {        Map<String, Object> map = new HashMap();        System.out.println(advanceName+"<>"+advanceTime+"<>"+preSaleStartTime+"<>"+preSaleEndTime);        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");        Date date1=sdf.parse(advanceTime);        Date kaishi=sdf.parse(preSaleStartTime);        Date jieshu=sdf.parse(preSaleEndTime);        System.out.println(date1);        //添加            AdvanceSaleActivitiesEntity advanceSaleActivitiesEntity=new AdvanceSaleActivitiesEntity(                    advanceName,date1,kaishi,jieshu,1,0, new Date(), new Date());            advanceSaleActivitiesEntity.setStoreId(lists);            int count=advanceSaleActivitiesServiceImpl.AdvanceSaleActivitiesInsert(advanceSaleActivitiesEntity);            int id = advanceSaleActivitiesServiceImpl.AdvanceSaleActivitiesId(advanceSaleActivitiesEntity.getGmtCreate());            if(count>0){                map.put("Msg", "添加成功!!!");            }else{                map.put("Msg", "添加失败!!!");            }            return  map;    }    /**     * 前台点击修改按钮显示(根据预售id显示门店信息)     * 如果id为空默认为空查询全部     * @param id  id     * @return String     */    @RequestMapping("mendian")    public String mengdian(String id){        String json="";        if(id==""||id==null) {            json=JSON.toJSONString(advanceSaleActivitiesServiceImpl.selectShopMessages());        }else{            json=JSON.toJSONString(advanceSaleActivitiesServiceImpl.selectShopMessage(Integer.parseInt(id)));        }        System.out.println(json);        String result = "{\"status\":200,\"message\":" + json + ",\"totol\":" + json + "}";        return result;     }    /**     * 删除     * @param id     * @return     */     @RequestMapping("shagnchu")    public Map shagnchu(String id){         Map<String, Object> map = new HashMap();         System.out.println(id);        int count=advanceSaleActivitiesServiceImpl.deleteAdvanceSaleActivitiesUpdate(Integer.parseInt(id));        if(count>0){            map.put("Msg","删除成功");            return map;        }        map.put("Msg","删除失败");        return map;     }    /**     * 修改时显示数据     * @param ids  根据预售id查询     * @return     */     @RequestMapping("/updateSelect")    public String updateSelect(String ids){         String json=JSON.toJSONString(advanceSaleActivitiesServiceImpl.selectAdvanceSaleActivitiesDetails(Integer.parseInt(ids)));         String jsons=JSON.toJSONString(advanceSaleActivitiesServiceImpl.selectAttendToBookingEntity(Integer.parseInt(ids)));         String result = "{\"status\":200,\"message\":" + json + ",\"totol\":" + jsons + "}";         return result;     }     @RequestMapping("/updateSaleActivities")    public Map updateSaleActivities(@RequestParam(value="advanceId")Integer advanceId,@RequestParam(value="advanceName")String advanceName,@RequestParam(value="advanceTime")String advanceTime,@RequestParam(value="lists")String lists,                                    @RequestParam(value="preSaleStartTime")String preSaleStartTime,@RequestParam(value="preSaleEndTime")String preSaleEndTime)throws ParseException{         AdvanceSaleActivitiesEntity advanceSaleActivitiesEntity=new AdvanceSaleActivitiesEntity();         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");         Date date1=sdf.parse(advanceTime);         Date kaishi=sdf.parse(preSaleStartTime);         Date jieshu=sdf.parse(preSaleEndTime);         advanceSaleActivitiesEntity.setAdvanceId(advanceId);         advanceSaleActivitiesEntity.setAdvanceName(advanceName);         advanceSaleActivitiesEntity.setPreSaleEndTime(kaishi);         advanceSaleActivitiesEntity.setPreSaleStartTime(jieshu);         advanceSaleActivitiesEntity.setAdvanceTime(date1);         advanceSaleActivitiesEntity.setStoreId(lists);         advanceSaleActivitiesEntity.setGmtModified(new Date());         Map<String, Object> map = new HashMap();         System.out.println(advanceSaleActivitiesEntity.getStoreId());         int count=advanceSaleActivitiesServiceImpl.AdvanceSaleActivitiesUpdate(advanceSaleActivitiesEntity);         System.out.println(count);         if(count>0){             map.put("Msg", "修改成功!!!");         }else{             map.put("Msg", "修改失败!!!");         }         return map;     }    /**     * 预留接口查询营销 名称、id、查询总条数     * @param     * @return     */    @RequestMapping("/shownaemid")    @ResponseBody    public Map<String,Object> shownaemid(){        Map<String,Object> result=new HashMap<>();        result.put("data",advanceSaleActivitiesServiceImpl.advancshowname());        System.out.println(JSON.toJSONString(result));        return result;    }}