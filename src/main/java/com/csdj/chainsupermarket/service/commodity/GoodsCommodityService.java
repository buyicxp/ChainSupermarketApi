package com.csdj.chainsupermarket.service.commodity;

import com.csdj.chainsupermarket.entity.commodity.GoodsCommodity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsCommodityService {
    /**
     * 分页查询
     * @param currentPage
     * @param pageSize
     * @return
     */
    List<GoodsCommodity> pageCommodity(int currentPage, int pageSize);

    /**
     * 查询商品列表
     * @return 商品信息
     */
    List<GoodsCommodity> listCommodity(int currentPage, int pageSize, String goodsName, Integer ccategoryid);

    /**
     *查询总数
     * @return 商品总记录数
     */
    int countCommodity();

    /**
     * 删除商品
     * @param id
     * @return 删除结果
     */
    int delCommodity(@Param("id")Integer id);

    /**
     * 下架商品
     * @param id 商品id
     * @return 执行结果
     */
    int underCarriage(@Param("id")Integer id);

    /**
     * 上架商品
     * @param id 商品id
     * @return 执行结果
     */
    int grounding(@Param("id")Integer id);

    /**
     * 修改商品
     * @param goodsCommodity
     * @return 执行结果
     */
    int upCommodity(GoodsCommodity goodsCommodity);

    /**
     * 按类型查询商品
     * @param ccategoryid 类型外键
     * @return 商品列表
     */
    List<GoodsCommodity> selectCommodity(@Param("ccategoryid")Integer ccategoryid);

    /**
     * 添加商品
     * @param goodsCommodity 商品实体类
     * @return 添加成功
     */
    int addCommodity(GoodsCommodity goodsCommodity);

    /**
     * 限购商品
     * @return 商品列表
     */
    List<GoodsCommodity> boundsCommodity();

    /**
     * 预售商品
     * @return 商品列表
     */
    List<GoodsCommodity> presellCommodity();

    /**
     * 拼团商品
     * @return 商品列表
     */
    List<GoodsCommodity> activeCommodity();

    /**
     * 查询商品
     * @return
     */
    List<GoodsCommodity> findGoods();

    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    GoodsCommodity findGoodsById(int id);
    GoodsCommodity getCommodity(@Param("id")Integer id);

}
