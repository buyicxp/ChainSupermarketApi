package com.csdj.chainsupermarket.service.imp.marketing;

import com.csdj.chainsupermarket.dao.marketing.GoodsTypeChildrenMapper;
import com.csdj.chainsupermarket.entity.marketing.GoodsTypeChildren;
import com.csdj.chainsupermarket.service.marketing.GoodsTypeChildrenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 版本号        1.0
 * @author： 作者名称     张晟
 * @date 创建时间        2019/12/18/0018 10:26
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@Service
public class GoodsTypeChildrenServiceImpl implements GoodsTypeChildrenService {

    @Resource
    GoodsTypeChildrenMapper dao;

    @Override
    public List<GoodsTypeChildren> findAll() {
        return dao.findAll();
    }
}
