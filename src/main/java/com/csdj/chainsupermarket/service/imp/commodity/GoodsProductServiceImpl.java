package com.csdj.chainsupermarket.service.imp.commodity;

import com.csdj.chainsupermarket.dao.commodity.GoodsProductMapper;
import com.csdj.chainsupermarket.entity.commodity.GoodsProduct;
import com.csdj.chainsupermarket.service.commodity.GoodsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author 尹嘉丽
 * @date 2019-12-10
 * 产品表service实现类
 */
@Service
public class GoodsProductServiceImpl  implements GoodsProductService {
    @Autowired
    GoodsProductMapper goodsProductMapper;
    /**
     * 添加方法
     * @param goodsProduct
     * @return
     */
    @Override
    public int addGoods(GoodsProduct goodsProduct) {
        return goodsProductMapper.addGoods(goodsProduct);
    }
}
