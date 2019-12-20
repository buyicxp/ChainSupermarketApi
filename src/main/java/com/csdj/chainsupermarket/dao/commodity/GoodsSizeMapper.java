package com.csdj.chainsupermarket.dao.commodity;

import com.csdj.chainsupermarket.entity.commodity.GoodsSize;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description: 商品接口
 * @Author 陈熙鹏(商品规格)
 * @Date 2019/11/29
 * @Version V1.0
 **/
@Mapper
public interface GoodsSizeMapper {
    /**
     * 查询规格尺码表
     * @return尺码表数据
     */
    List<GoodsSize> goodsSizeSelect();
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
