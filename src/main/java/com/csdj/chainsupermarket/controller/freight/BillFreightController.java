package com.csdj.chainsupermarket.controller.freight;

import com.csdj.chainsupermarket.entity.freight.BillFreight;
import com.csdj.chainsupermarket.service.freight.BillFreightService;
import com.csdj.chainsupermarket.util.freight.EntCoordSyncJobUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName BillFreightController
 * @Description 物流功能控制器
 * @Author 孤街
 * @Date 2019/12/2 16:39
 * @Version 1.0
 **/
@RestController
@RequestMapping("/freight")
@CrossOrigin
public class BillFreightController {

    @Autowired
    BillFreightService billFreightService;


    @RequestMapping("freight.query")
    public Object findFreight(@RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                              @RequestParam(value = "pageSize", required = false, defaultValue = "3") Integer pageSize) {
        PageInfo<BillFreight> billFreights = billFreightService.listFreight(pageNum, pageSize);

        return billFreights;
    }

    @RequestMapping(value = "freight.save", method = RequestMethod.POST)
    public Object addFreight(BillFreight freight) {
        int result = billFreightService.saveFreight(freight);
        return result;
    }

    @RequestMapping(value = "freightById.do")
    public Object findFreightById(Integer id) {
        BillFreight freight = billFreightService.getFreightById(id);
        return freight;
    }

    @RequestMapping(value = "freight.update", method = RequestMethod.POST)
    public Object updateFreight(BillFreight freight){
        // 封装对象
//        BillFreight freight = new BillFreight(billId, billFormId, billFormPrice, billStartAddress,
//                billEndAddress, billPrice, billWeight, billState, billFreightCharge);

        int result = billFreightService.updateFreight(freight);
        return result;
    }

    @RequestMapping("coord.do")
    public Object getCoord(String startAddress, String endAddress) {
        List<Map> list = new ArrayList<Map>();
        // 获取出发地的坐标
        Map<String, Object> startMap = EntCoordSyncJobUtil.getCoordinate(startAddress);
        // 获取目的地的坐标
        Map<String, Object> endMap = EntCoordSyncJobUtil.getCoordinate(endAddress);
        list.add(startMap);
        list.add(endMap);
        return list;
    }

}
