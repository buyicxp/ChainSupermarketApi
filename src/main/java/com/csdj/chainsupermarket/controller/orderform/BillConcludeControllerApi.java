package com.csdj.chainsupermarket.controller.orderform;

import com.csdj.chainsupermarket.entity.orderform.MerchandiseOrderPO;
import com.csdj.chainsupermarket.service.imp.orderform.BillConcludeServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author向仕懿
 * @date 2019/12/5
 */
@RestController
@CrossOrigin
@RequestMapping("/api")
public class BillConcludeControllerApi {
    @Resource
    BillConcludeServiceImp bcs;
    Logger logger = LoggerFactory.getLogger(OrderFormController.class);
    /**
     * 下单的api接口
     * @param mop 接收的实体类
     * @return map
     */
    @PostMapping("/order")
    public Map<String, Object> insert(@RequestBody MerchandiseOrderPO mop ){
        Map<String, Object> result = new HashMap<>();
        try {
            bcs.insert(mop);
            result.put("msg", "Success");
            result.put("code", 200);
            return result;
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
            result.put("msg", "Server error");
            result.put("code", 500);
        }
        return result;
    }


    /**
     * 退款的api接口
     * @param id 接收订单编号
     * @return map
     */
    @RequestMapping("/refund")
    public Map<String, Object> update(@RequestParam("id")int id){
        Map<String, Object> result = new HashMap<>();
        try {
            bcs.update(id);
            result.put("msg", "Success");
            result.put("code", 200);
            return result;
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
            result.put("msg", "Server error");
            result.put("code", 500);
        }
        return result;
    }
}
