package com.csdj.chainsupermarket.dao.commodity;

import com.csdj.chainsupermarket.entity.commodity.CommodityPub;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName EsCommodityPubDao
 * @Description: 搜索引擎接口
 * @Author 唐浪
 * @Date 2019/12/6
 * @Version V1.0
 **/
public interface EsCommodityPubDao extends ElasticsearchRepository<CommodityPub, String> {

}
