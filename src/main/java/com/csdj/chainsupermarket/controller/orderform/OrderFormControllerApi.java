package com.csdj.chainsupermarket.controller.orderform;

import com.csdj.chainsupermarket.service.orderform.OrderFormService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName OrderFormControllerApi
 * @Description: 订单控制器API
 * @Author 曾耀民
 * @Date 2019/12/17
 * @Version 1.0
 */
@Controller
@RequestMapping("/OrderFormApi")
@CrossOrigin
public class OrderFormControllerApi {
    @Resource
    private OrderFormService orderFormService;
    private final Logger logger = LoggerFactory.getLogger(OrderFormControllerApi.class);

    @GetMapping("/summary")
    @ResponseBody
    public Map<String, Object> summary(
            @RequestParam("userId") Integer userId,
            @RequestParam(value = "stat", required = false) Integer stat,
            @RequestParam("shopId") Integer shopId
    ) {
        Map<String, Object> result = new HashMap<>(4);
        try {
            result.put("data", orderFormService.listByUser(userId, shopId, stat));
            result.put("msg", "Success");
            result.put("code", 200);
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
            result.put("msg", "Server error");
            result.put("code", 500);
        }
        return result;
    }

    @GetMapping("/cancel")
    @ResponseBody
    public Map<String, Object> cancel(
            @RequestParam("id") Integer id
    ) {
        Map<String, Object> result = new HashMap<>(4);
        try {
            result.put("data", orderFormService.merge(id, null, 1));
            result.put("msg", "Success");
            result.put("code", 200);
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
            result.put("msg", "Server error");
            result.put("code", 500);
        }
        return result;
    }

    @GetMapping("/detail")
    @ResponseBody
    public Map<String, Object> detail(
            @RequestParam("id") Integer id
    ) {
        Map<String, Object> result = new HashMap<>(4);
        try {
            result.put("data", orderFormService.seek(id));
            result.put("msg", "Success");
            result.put("code", 200);
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
            result.put("msg", "Server error");
            result.put("code", 500);
        }
        return result;
    }
}
