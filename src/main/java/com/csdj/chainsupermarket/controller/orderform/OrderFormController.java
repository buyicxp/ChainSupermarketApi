package com.csdj.chainsupermarket.controller.orderform;

import com.csdj.chainsupermarket.service.orderform.OrderFormService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName OrderFormController
 * @Description: 订单控制器
 * @Author 曾耀民
 * @Date 2019/12/05
 * @Version 1.0
 */
@Controller
@RequestMapping("/OrderForm")
@CrossOrigin
public class OrderFormController {
    @Resource
    private OrderFormService orderFormService;
    private final Logger logger = LoggerFactory.getLogger(OrderFormController.class);

    @GetMapping("/summary")
    @ResponseBody
    public Map<String, Object> summary(
            @RequestParam(value = "userId", required = false) Integer userId,
            @RequestParam(value = "stat", required = false) Integer stat,
            @RequestParam(value = "del", required = false) Integer del,
            @RequestParam(value = "id", required = false) String id,
            @RequestParam(value = "betTime", required = false) String betTime,
            @RequestParam(value = "andTime", required = false) String andTime,
            @RequestParam("index") Integer index,
            @RequestParam("size") Integer size
    ) {
        Map<String, Object> result = new HashMap<>(3);
        try {
            if (betTime != null && notValidDate(betTime)) {
                result.put("msg", "Bad request at betTime=" + betTime);
                result.put("code", 400);
                return result;
            }
            if (andTime != null && notValidDate(andTime)) {
                result.put("msg", "Bad request at andTime=" + andTime);
                result.put("code", 400);
                return result;
            }
            result.put("data", orderFormService.summary(userId, stat, del, id, betTime, andTime, index, size));
            result.put("count", orderFormService.count(userId, stat, del, id, betTime, andTime));
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
    public Map<String, Object> detail(@RequestParam("id") String id) {
        Map<String, Object> result = new HashMap<>(3);
        try {
            result.put("data", orderFormService.detailById(id));
            result.put("msg", "Success");
            result.put("code", 200);
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
            result.put("msg", "Server error");
            result.put("code", 500);
        }
        return result;
    }

    private boolean notValidDate(String strDate) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2018-02-29会被接受，并转换成2018-03-01
            format.setLenient(false);
            format.parse(strDate);
        } catch (Exception e) {
            return true;
        }
        return false;
    }
}
