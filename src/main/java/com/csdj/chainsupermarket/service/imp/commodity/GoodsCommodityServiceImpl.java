package com.csdj.chainsupermarket.service.imp.commodity;

import com.csdj.chainsupermarket.dao.commodity.GoodsCommodityMapper;
import com.csdj.chainsupermarket.entity.commodity.GoodsCommodity;
import com.csdj.chainsupermarket.service.commodity.GoodsCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品列表
 * @author 温朝明
 * @date 2019/12/16
 */
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
    public List<GoodsCommodity> listCommodity(int currentPage, int pageSize,String goodsName,Integer ccategoryid) {
        int start = (currentPage-1)*pageSize;
        return goodsCommodityMapper.listCommodity(start,pageSize,goodsName,ccategoryid);
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
    public int addCommodity(GoodsCommodity goodsCommodity) {
        return goodsCommodityMapper.addCommodity(goodsCommodity);
    }

    @Override
    public List<GoodsCommodity> boundsCommodity() {
        return goodsCommodityMapper.boundsCommodity();
    }

    @Override
    public List<GoodsCommodity> presellCommodity() {
        return goodsCommodityMapper.presellCommodity();
    }

    @Override
    public List<GoodsCommodity> activeCommodity() {
        return goodsCommodityMapper.activeCommodity();
    }
    @Override
    public List<GoodsCommodity> findGoods() {
        return goodsCommodityMapper.findGoods();
    }

    @Override
    public GoodsCommodity findGoodsById(int id) {
        return goodsCommodityMapper.findGoodsById(id);
    }
    @Override
    public GoodsCommodity getCommodity(Integer id) {
        return goodsCommodityMapper.getCommodity(id);
    }

    @Override
    public GoodsCommodity getComById(Integer id) {
        return goodsCommodityMapper.getComById(id);
    }

}
