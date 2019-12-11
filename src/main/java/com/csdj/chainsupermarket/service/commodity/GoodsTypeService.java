package com.csdj.chainsupermarket.service.commodity;

import com.csdj.chainsupermarket.entity.commodity.GoodsType;

import java.util.List;

/**
 * @author: 邹泓广
 * @date: 2019/12/5
 * 商品类型Service层
 */
public interface GoodsTypeService {
    /**
     * 分页查询全部记录类型
     * @param parentid
     * @param currentPage
     * @param pageSize
     * @return
     */
    public List<GoodsType> getGoodsTypeList(int parentid, int currentPage, int pageSize);

    /**
     * 分页查询全部记录类型
     * @param parentid
     * @return
     */
    public List<GoodsType> getGoodsTypeList(int parentid);

    /**
     * 查询总数
     *
     * @return
     */
    public Integer getCount();
    /**
     * 删除状态修改
     * @param id
     * @return
     */
    public Integer getGoodsTypeDel(Integer id);
    /**
     * 1为停用的状态，变停用
     * @param id
     * @return
     */
    public Integer getGoodsTypeOne(Integer id,Integer stop);

    /**
     * 修改子类
     * @param parentid
     * @param stop
     * @return
     */
    public Integer getParentId(Integer parentid,Integer stop);

    /**
     * 父类查询
     * @return
     */
    public List<GoodsType> getTypeNameList();

    /**
     * @Description  ：查询所有父类
     * @author       : JY
     * @param        : []
     * @return       : java.util.List<com.csdj.chainsupermarket.entity.commodity.GoodsType>
     * @exception    :
     * @date         : 2019/12/10 17:32
     */
    public List<GoodsType> findByAll();

    /**
     * @Description  ：查询单个父类
     * @author       : JY
     * @param        : [id]
     * @return       : com.csdj.chainsupermarket.entity.commodity.GoodsType
     * @exception    :
     * @date         : 2019/12/10 17:33
     */
    public GoodsType findById(int id);

}
