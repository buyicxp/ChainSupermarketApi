package com.csdj.chainsupermarket.controller.orderform;

import com.csdj.chainsupermarket.entity.orderform.MerchandiseOrderPO;
import com.csdj.chainsupermarket.service.imp.orderform.BillConcludeServiceImp;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
    /**
     * 下单的api接口
     * @param mop 接收的实体类
     * @return int
     */
    @RequestMapping("/order")
    public int insert(@RequestBody MerchandiseOrderPO mop ){
        System.out.println(mop.toString()+"=========");
        int res= bcs.insert(mop);
        return res;
    }


    /**
     * 退款的api接口
     * @param id 接收订单编号
     * @return int
     */
    @RequestMapping("/refund")
    public int update(int id){
        int res=bcs.update(id);
        return  res;
    }
}
