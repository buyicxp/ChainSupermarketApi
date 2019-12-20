package com.csdj.chainsupermarket.service.commodity;

import com.csdj.chainsupermarket.entity.commodity.CommodityPub;
import org.springframework.data.domain.Pageable;

import java.util.List;
/**
 * @ClassName CommodityPub
 * @Description: 搜索引擎接口
 * @Author 唐浪
 * @Date 2019/12/5
 * @Version V1.0
 **/
public interface EsCommodityPubService {
    /**
     * 搜索方法
     * @param pageable 分页
     * @param goodsName 商品名
     * @return CommodityPub
     */
     List<CommodityPub> listCommodityPub(Pageable pageable, String goodsName) ;
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
    /**
     * 删除全部商品索引
     */
    void deleteAll();
}
