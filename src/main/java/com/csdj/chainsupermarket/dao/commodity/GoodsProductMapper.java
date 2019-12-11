package com.csdj.chainsupermarket.dao.commodity;

import com.csdj.chainsupermarket.entity.commodity.GoodsProduct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 尹嘉丽
 * @date 2019-12-10
 * 产品表dao层
 */
@Repository
@Mapper
public interface GoodsProductMapper {
    int addGoods(GoodsProduct goodsProduct);
}
