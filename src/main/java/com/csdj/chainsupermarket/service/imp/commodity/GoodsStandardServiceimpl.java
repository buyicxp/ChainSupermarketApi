package com.csdj.chainsupermarket.service.imp.commodity;

import com.csdj.chainsupermarket.dao.commodity.GoodsStandardMapper;
import com.csdj.chainsupermarket.entity.commodity.GoodsColour;
import com.csdj.chainsupermarket.service.commodity.GoodsStandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("goodsStandardService")
public class GoodsStandardServiceimpl implements GoodsStandardService {
    @Autowired
    private GoodsStandardMapper goodsStandardMapper;
    /**
     * 查询商品颜色规格
     * @return商品颜色规格
     */
    @Override
    public List<GoodsColour> StandardSelect() {
        return goodsStandardMapper.standardSelect();
    }
    /**
     *
     * @param goodsColour 表实体类
     */
    @Override
    public int goodsStandardAdd(GoodsColour goodsColour) {
        return goodsStandardMapper.goodsStandardAdd(goodsColour);
    }
    /**
     *
     * @param goodsColour 表实体类
     * @return 受影响行数
     */
    @Override
    public int goodsStandardUpdate(GoodsColour goodsColour) {
        return goodsStandardMapper.goodsStandardUpdate(goodsColour);
    }

    @Override
    public int goodsStandardDel(long id) {
        return goodsStandardMapper.goodsStandardDel(id);
    }

    @Override
    public List<GoodsColour> pageInfoGoodsColour(int currentPage, int pageSize){
        return goodsStandardMapper.pageInfoGoodsColour(currentPage, pageSize);
    }

    @Override
    public int goodsCount() {
        return goodsStandardMapper.goodsCount();
    }
}
