package com.csdj.chainsupermarket.controller.orderform;


import com.csdj.chainsupermarket.service.imp.orderform.BillConcludeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    /**
     * 修改订单状态为退款
     * @param id 订单编号
     * @return
     */
    @RequestMapping("refund")
    public String refund(int id){
        bcs.update(id);
        return "";
    }


    /**
     * 修改订单状态为发货
     * @param id 订单编号
     * @return
     */
    @RequestMapping("shipments")
    public String shipments(int id){
        bcs.amend(id);
        return "";
    }
}
