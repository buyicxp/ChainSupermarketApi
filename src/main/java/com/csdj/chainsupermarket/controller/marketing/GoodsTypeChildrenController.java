package com.csdj.chainsupermarket.controller.marketing;

import com.csdj.chainsupermarket.dao.marketing.GoodsTypeChildrenMapper;
import com.csdj.chainsupermarket.entity.marketing.GoodsTypeChildren;
import com.csdj.chainsupermarket.service.marketing.GoodsTypeChildrenService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 版本号        1.0
 * @author： 作者名称     张晟
 * @date 创建时间        2019/12/18/0018 9:59
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@RestController
public class GoodsTypeChildrenController {

    @Resource
    GoodsTypeChildrenService service;

    @RequestMapping("/goodschild/findGT")
    @CrossOrigin
    public List<GoodsTypeChildren> findAll(){
        return service.findAll();
    }
}
