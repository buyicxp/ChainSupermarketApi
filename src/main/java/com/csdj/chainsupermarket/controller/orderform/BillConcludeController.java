package com.csdj.chainsupermarket.controller.orderform;


import com.csdj.chainsupermarket.service.imp.orderform.BillConcludeServiceImp;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import java.util.Map;

/**
 * 后台 调用退款和发货
 * @author 向仕懿
 * @date 2019/12/6
 */
@Controller
@RequestMapping("backstage")
public class BillConcludeController {


    @Autowired
    BillConcludeServiceImp bcs;
    Logger logger = LoggerFactory.getLogger(OrderFormController.class);

    /**
     * 修改订单状态为退款
     * @param id 订单编号
     * @return map
     */
    @RequestMapping("refund")
    public Map<String, Object> refund(@RequestParam("id")int id){
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

    /**
     * 修改订单状态为发货
     * @param id 订单编号
     * @return map
     */
    @RequestMapping("shipments")
    public Map<String, Object> shipments(@RequestParam("id")int id){
        Map<String, Object> result = new HashMap<>();
        try {
            bcs.amend(id);
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
