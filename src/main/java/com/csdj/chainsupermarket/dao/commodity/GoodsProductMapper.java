package com.csdj.chainsupermarket.dao.commodity;

import com.csdj.chainsupermarket.entity.commodity.GoodsProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 尹嘉丽
 * @date 2019-12-10
 * 产品表dao层
 */
@Repository
public interface GoodsProductMapper {
    /**
    *@author 宠儿
    *@date
     * 添加方法
    *@return
    */
    int addGoods(GoodsProduct goodsProduct);
    /**
     * 分页查询
     * @param start
     * @param pageSize
     * @return
     */
    List<GoodsProduct> pageProduct(@Param(value = "start") int start,
                              @Param(value = "pageSize") int pageSize);

    /**
     * 查询产品列表
     * @return 产品信息
     */
    List<GoodsProduct> listProduct(@Param(value = "start") int start,
                              @Param(value = "pageSize") int pageSize,
                              @Param(value="goodsTitle")String goodsTitle,
                              @Param(value="categoryid")Integer categoryid);

    /**
     *产品总数
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

    /**
     * 查询产品列表
     * @return 商品信息
     */
    List<GoodsProduct> listProductshelves(@Param(value = "start") int start,
                                          @Param(value = "pageSize") int pageSize,
                                          @Param(value="goodsTitle")String goodsTitle,
                                          @Param(value="categoryid")Integer categoryid);


    /**
     * 修改产品拉取ID
     * @return 商品信息
     */
    int updateProduct(@Param("id")Integer id,@Param(value="putshelves")Integer putshelves);

}
