package com.csdj.chainsupermarket.service.imp.commodity;

import com.csdj.chainsupermarket.dao.commodity.GoodsSizeMapper;
import com.csdj.chainsupermarket.entity.commodity.GoodsSize;
import com.csdj.chainsupermarket.service.commodity.GoodsSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("goodsSizeService")
public class GoodsSizeServiceimpl implements GoodsSizeService {
    @Autowired
    private GoodsSizeMapper goodsSizeMapper;

    /**
     * 查询规格尺码表
     * @return 规格尺码表所有数据
     */
    @Override
    public List<GoodsSize> GoodsSizeSelect() {
        return goodsSizeMapper.goodsSizeSelect();
    }

    /**
     * 添加尺码表数据
     * @param goodsSize 尺码表实体类
     * @return
     */
    @Override
    public int goodsSizeInsert(GoodsSize goodsSize) {
        return goodsSizeMapper.goodsSizeInsert(goodsSize);
    }
    /**
     *
     * @param goodsSize 尺码表实体类
     * @return 受影响行数
     */
    @Override
    public int goodsSizeUpdate(GoodsSize goodsSize){
        return goodsSizeMapper.goodsSizeUpdate(goodsSize);
    }

    /**
     *
     * @param sizeid 选中数据id
     * @return 受影响行数
     */
    @Override
    public int goodsSizeDel(long sizeid){
        return goodsSizeMapper.goodsSizeDel(sizeid);
    }

    @Override
    public List<GoodsSize> goodsSizePage(int currentPage, int pageSize) {
        return goodsSizeMapper.goodsSizePage(currentPage,pageSize);
    }

    @Override
    public int goodsSizeCount() {
        return goodsSizeMapper.goodsSizeCount();
    }
}
