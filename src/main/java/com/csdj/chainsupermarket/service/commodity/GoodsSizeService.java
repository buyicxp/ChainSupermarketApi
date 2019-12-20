package com.csdj.chainsupermarket.service.commodity;

import com.csdj.chainsupermarket.entity.commodity.GoodsSize;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsSizeService {
    /**
     * 查询规格尺码表
     * @return
     */
    List<GoodsSize> GoodsSizeSelect();
    /**
     *
     * @param goodsSize 尺码表实体类
     * @return 受影响行数
     */
    int goodsSizeInsert(GoodsSize goodsSize);
    /**
     *
     * @param goodsSize 尺码表实体类
     * @return 受影响行数
     */
    int goodsSizeUpdate(GoodsSize goodsSize);

    /**
     *
     * @param sizeid 选中数据id
     * @return 受影响行数
     */
    int goodsSizeDel(long sizeid);

    /**
     * 分页查询规格尺码表
     * @return尺码表数据
     */
    List<GoodsSize> goodsSizePage(@Param("currentPage") int currentPage, @Param("pageSize") int pageSize);

    /**
     * 查询总记录数
     * @return
     */
    int goodsSizeCount();

}
