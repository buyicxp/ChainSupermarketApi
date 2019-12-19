package com.csdj.chainsupermarket.dao.shop.minuteshop;

import com.csdj.chainsupermarket.entity.shop.minuteshop.ShopMessage;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName MessageMapper
 * @Description: 门店接口
 * @Author 刘时钟
 * @Date 2019/12/2
 * @Version V1.0
 **/
@Repository
public interface MessageMapper {
    /**
     * 查询门店列表
     * @param name
     * @param operating
     * @param currentPage
     * @param pageSize
     * @return 门店集合
     */
    List<ShopMessage> listShopMessage(@Param("name") String name, @Param("operating") String operating,
                                      @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize);

    /**
     * 查询门店记录数
     * @param name
     * @param operating
     * @return 门店个数
     */
    Integer countShopMessage(@Param("name") String name, @Param("operating") String operating);
    /**
     * 添加门店
     * @param message
     * @return
     */
    Integer  saveShopMessage(ShopMessage message);

    /**
     * 根据id查询要修改的门店
     * @param id
     * @return
     */
    ShopMessage getShopMessage(@Param("id") Integer id);
    /**
     * 修改门店
     * @param message
     * @return
     */
    int  updateShopMessage(ShopMessage message);

    /**
     * 停用门店
     * @param id
     * @return
     */
    int  disableShopMessage(@Param("id") Integer id, @Param("operating") String operating);

    /**
     * 查询门店名称
     * @return
     */
    List<ShopMessage> listShopMessageName();
}
