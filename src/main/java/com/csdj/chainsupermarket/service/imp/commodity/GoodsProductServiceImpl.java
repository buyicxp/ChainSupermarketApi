package com.csdj.chainsupermarket.service.imp.commodity;

import com.csdj.chainsupermarket.dao.commodity.GoodsProductMapper;
import com.csdj.chainsupermarket.entity.commodity.GoodsProduct;
import com.csdj.chainsupermarket.service.commodity.GoodsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    @Override
    public List<GoodsProduct> pageProduct(int currentPage, int pageSize) {
        int start = (currentPage-1)*pageSize;
        return goodsProductMapper.pageProduct(start,pageSize);
    }

    @Override
    public List<GoodsProduct> listProduct(int currentPage, int pageSize,String goodsTitle,Integer categoryid) {
        int start = (currentPage-1)*pageSize;
        return goodsProductMapper.listProduct(start,pageSize,goodsTitle,categoryid);
    }

    @Override
    public int countProduct() {
        return goodsProductMapper.countProduct();
    }

    @Override
    public int delProduct(Integer id) {
        return goodsProductMapper.delProduct(id);
    }

    @Override
    public int underCarriage(Integer id) {
        return goodsProductMapper.underCarriage(id);
    }

    @Override
    public int grounding(Integer id) {
        return goodsProductMapper.grounding(id);
    }

    @Override
    public int upProduct(GoodsProduct product) {
        return goodsProductMapper.upProduct(product);
    }

    @Override
    public int updateProduct(Integer id, Integer putshelves) {
        return goodsProductMapper.updateProduct(id,putshelves);
    }

    @Override
    public List<GoodsProduct> listProductshelves(int currentPage, int pageSize, String goodsTitle, Integer categoryid) {
        int start = (currentPage-1)*pageSize;
        return goodsProductMapper.listProductshelves(start,pageSize,goodsTitle,categoryid);
    }


}
