package com.csdj.chainsupermarket.service.imp.commodity;

import com.csdj.chainsupermarket.dao.commodity.GoodsCommodityMapper;
import com.csdj.chainsupermarket.entity.commodity.GoodsCommodity;
import com.csdj.chainsupermarket.service.commodity.GoodsCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("goods_CommodityService")
@Transactional
public class GoodsCommodityServiceImpl implements GoodsCommodityService {

    @Autowired
    private GoodsCommodityMapper goodsCommodityMapper;

    @Override
    public List<GoodsCommodity> pageCommodity(int currentPage, int pageSize) {
        int start = (currentPage-1)*pageSize;
        return goodsCommodityMapper.pageCommodity(start,pageSize);
    }

    @Override
    public List<GoodsCommodity> listCommodity(int currentPage, int pageSize,String goodsTitle,Integer ccategoryid) {
        int start = (currentPage-1)*pageSize;
        return goodsCommodityMapper.listCommodity(start,pageSize,goodsTitle,ccategoryid);
    }

    @Override
    public int countCommodity() {
        return goodsCommodityMapper.countCommodity();
    }

    @Override
    public int delCommodity(Integer id) {
        return goodsCommodityMapper.delCommodity(id);
    }

    @Override
    public int underCarriage(Integer id) {
        return goodsCommodityMapper.underCarriage(id);
    }

    @Override
    public int grounding(Integer id) {
        return goodsCommodityMapper.grounding(id);
    }

    @Override
    public int upCommodity(GoodsCommodity goodsCommodity) {
        return goodsCommodityMapper.upCommodity(goodsCommodity);
    }

    @Override
    public List<GoodsCommodity> selectCommodity(Integer ccategoryid) {
        return goodsCommodityMapper.selectCommodity(ccategoryid);
    }

    @Override
    public List<GoodsCommodity> activeCommodity(Integer activityid) {
        return goodsCommodityMapper.activeCommodity(activityid);
    }

    @Override
    public List<GoodsCommodity> boundsCommodity(Integer bounds) {
        return goodsCommodityMapper.boundsCommodity(bounds);
    }

    @Override
    public List<GoodsCommodity> presellCommodity(Integer presell) {
        return goodsCommodityMapper.presellCommodity(presell);
    }

    @Override
    public int addCommodity(GoodsCommodity goodsCommodity) {
        return goodsCommodityMapper.addCommodity(goodsCommodity);
    }

    @Override
    public List<GoodsCommodity> findGoods() {
        return goodsCommodityMapper.findGoods();
    }

    @Override
    public GoodsCommodity findGoodsById(int id) {
        return goodsCommodityMapper.findGoodsById(id);
    }
}