package com.csdj.chainsupermarket.dao.commodity;

import com.csdj.chainsupermarket.entity.commodity.GoodsColour;
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
@Repository("GoodsStandardMapper")
public interface GoodsStandardMapper {
    /**
     * 查询颜色规格
     * @return 颜色规格所有记录
     */
    List<GoodsColour> standardSelect();

    /**
     * 查询颜色规格
     * @return 颜色规格所有记录
     */
    List<GoodsColour> pageInfoGoodsColour(@Param("currentPage") int currentPage, @Param("pageSize") int pageSize);

    /**
     * 查询总记录数
     * @return 总记录数
     */
    int goodsCount();
    /**
     * 添加颜色信息
     * @param goodsColour 表实体类
     * @return 受影响行数
     */
    int goodsStandardAdd(GoodsColour goodsColour);

    /**
     *修改
     * @param goodsColour 表实体类
     * @return 受影响行数
     */
    int goodsStandardUpdate(GoodsColour goodsColour);

    /**
     * 删除方法
     * @param id 需要删除的id集合
     * @return
     */
    int goodsStandardDel(long id);
}

