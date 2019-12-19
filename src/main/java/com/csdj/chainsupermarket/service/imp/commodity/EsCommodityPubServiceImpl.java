package com.csdj.chainsupermarket.service.imp.commodity;

import com.csdj.chainsupermarket.dao.commodity.CommodityPubDao;
import com.csdj.chainsupermarket.dao.commodity.EsCommodityPubDao;
import com.csdj.chainsupermarket.entity.commodity.CommodityPub;
import com.csdj.chainsupermarket.service.commodity.EsCommodityPubService;
import org.apache.commons.lang3.StringUtils;
import org.assertj.core.util.Lists;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;


/**
 * @ClassName EsCommodityPubServiceImpl
 * @Description: 搜索引擎接口实现
 * @Author 唐浪
 * @Date 2019/12/5
 * @Version V1.0
 **/
@Service
public class EsCommodityPubServiceImpl implements EsCommodityPubService {
    @Resource
    EsCommodityPubDao esCommodityPubDao;
    @Resource
    CommodityPubDao commodityPubDao;
    @Override
    public List<CommodityPub> listCommodityPub(Pageable pageable, String goodsName) {
        // 1.创建查询对象
        BoolQueryBuilder boolQuery = QueryBuilders.boolQuery();
        // 2.查询方法
        if (!StringUtils.isEmpty(goodsName)) {
            MatchQueryBuilder matchQueryByGoodsName = QueryBuilders.matchQuery("goods_name", goodsName);
            MatchQueryBuilder matchQueryByDrop = QueryBuilders.matchQuery("drop", "0");
            MatchQueryBuilder matchQueryByUpperDown = QueryBuilders.matchQuery("upper_down", "0");
            boolQuery.must(matchQueryByGoodsName).must(matchQueryByDrop).must(matchQueryByUpperDown);
        }
        // 3.用迭代器接收查询返回的值
        Iterable<CommodityPub> search = esCommodityPubDao.search(boolQuery, pageable);
        System.err.println(""+Lists.newArrayList(search).size());
        // 4.将迭代器转换为集合
        return Lists.newArrayList(search);
    }

    @Override
    public void insertCommodityPub(CommodityPub commodityPub) {
        commodityPubDao.insertCommodityPub(commodityPub);
    }

    @Override
    public void updateCommodityPub(CommodityPub commodityPub) {
        commodityPubDao.updateCommodityPub(commodityPub);
    }

    @Override
    public void deleteCommodityPub(Integer goodsId) {
        commodityPubDao.deleteCommodityPub(goodsId);
    }
}
