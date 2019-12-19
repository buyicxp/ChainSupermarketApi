package com.csdj.chainsupermarket.service.marketing;

import com.csdj.chainsupermarket.dao.marketing.GoodsTypeChildrenMapper;
import com.csdj.chainsupermarket.entity.marketing.GoodsTypeChildren;

import java.util.List;

/**
 * @version 版本号        1.0
 * @author： 作者名称     张晟
 * @date 创建时间        2019/12/18/0018 10:25
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
public interface GoodsTypeChildrenService {
    List<GoodsTypeChildren> findAll();
}
