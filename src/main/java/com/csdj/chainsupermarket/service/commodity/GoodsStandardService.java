package com.csdj.chainsupermarket.service.commodity;

import com.csdj.chainsupermarket.entity.commodity.GoodsColour;

import java.util.List;
public interface GoodsStandardService {
    /**
     * 查询颜色规格
     * @return 颜色规格所有记录
     */
    List<GoodsColour> StandardSelect();
    /**
     * 添加颜色信息
     * @param goodsColour 表实体类
     * @return
     */
    int goodsStandardAdd(GoodsColour goodsColour);
    /**
     *
     * @param goodsColour 表实体类
     * @return 受影响行数
     */
    int goodsStandardUpdate(GoodsColour goodsColour);
    /**
     * 删除方法
     * @param  id 需要删除的id
     * @return
     */
    int goodsStandardDel(long id);

    /**
     * 分页接口
     * @param currentPage 当前页码数
     * @param pageSize  总记录数
     * @return
     */
    List<GoodsColour> pageInfoGoodsColour(int currentPage, int pageSize);
    /**
     * 查询总记录数
     * @return 总记录数
     */
    int goodsCount();

}
