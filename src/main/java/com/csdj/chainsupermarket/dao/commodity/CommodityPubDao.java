package com.csdj.chainsupermarket.dao.commodity;

import com.csdj.chainsupermarket.entity.commodity.CommodityPub;
import org.springframework.stereotype.Repository;
/**
 * @ClassName EsCommodityPubDao
 * @Description: 搜索引擎维护接口
 * @Author 唐浪
 * @Date 2019/12/6
 * @Version V1.0
 **/
@Repository
public interface CommodityPubDao {
    /**
     * 添加商品索引
     * @param commodityPub 商品
     */
    void insertCommodityPub(CommodityPub commodityPub);
    /**
     * 修改商品索引
     * @param commodityPub 商品
     */
    void updateCommodityPub(CommodityPub commodityPub);

}
