package com.csdj.chainsupermarket.dao.commodity;

import com.csdj.chainsupermarket.entity.commodity.CommodityPub;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @ClassName EsCommodityPubDao
 * @Description: 搜索引擎接口
 * @Author 唐浪
 * @Date 2019/12/6
 * @Version V1.0
 **/
public interface EsCommodityPubDao extends ElasticsearchRepository<CommodityPub, String> {

}
