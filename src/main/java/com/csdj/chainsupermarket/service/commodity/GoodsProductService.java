package com.csdj.chainsupermarket.service.commodity;

import com.csdj.chainsupermarket.entity.commodity.GoodsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 尹嘉丽
 * @date 2019-12-10
 * 产品表service
 */
public interface GoodsProductService {
    int addGoods(GoodsProduct goodsProduct);
    /**
     * 分页查询
     * @param currentPage
     * @param pageSize
     * @return
     */
    List<GoodsProduct> pageProduct(int currentPage, int pageSize);

    /**
     * 查询产品列表
     * @return 商品信息
     */
    List<GoodsProduct> listProduct(int currentPage, int pageSize,String goodsTitle, Integer categoryid);

    /**
     * 查询产品列表
     * @return 商品信息
     */
    List<GoodsProduct> listProductshelves(int currentPage, int pageSize,String goodsTitle, Integer categoryid);

    /**
     *查询总数
     * @return 产品总记录数
     */
    int countProduct();
    /**
     * 删除产品
     * @param id 产品id
     * @return 执行结果
     */
    int delProduct(@Param("id")Integer id);
    /**
     * 下架产品
     * @param id 商品id
     * @return 执行结果
     */
    int underCarriage(@Param("id")Integer id);

    /**
     * 上架产品
     * @param id 商品id
     * @return 执行结果
     */
    int grounding(@Param("id")Integer id);

    /**
     * 修改产品
     * @param
     * @return 执行结果
     */
    int upProduct(GoodsProduct goodsProduct);


    int updateProduct(@Param("id")Integer id,@Param("putshelves")Integer putshelves);



}
