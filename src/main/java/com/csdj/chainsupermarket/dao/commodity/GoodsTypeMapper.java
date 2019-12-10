package com.csdj.chainsupermarket.dao.commodity;

import com.csdj.chainsupermarket.entity.commodity.GoodsType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: 邹泓广
 * @date: 2019/12/5
 * 商品类型dao层
 */
@Repository("goodsTypeMapper")
public interface GoodsTypeMapper {
    /**
     * 分页查询全部记录类型
     *
     * @return
     */
    public List<GoodsType> getGoodsTypeList(@Param("parentid") int parentid, @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize);

    /**
     * 查询总数
     *
     * @return
     */
    public Integer getCount();

    /**
     * 删除状态的修改
     * @param id
     * @return
     */
    public Integer getGoodsTypeDel(@Param("id") Integer id);

    /**
     * 1为停用状态，变停用
     * @param id
     * @return
     */
    public Integer getGoodsTypeOne(@Param("id") Integer id,@Param("stop")Integer stop);

    /**
     * 修改子类
     * @param parentid
     * @param stop
     * @return
     */
    public Integer getParentId(@Param("parentid") Integer parentid,@Param("stop")Integer stop);
}