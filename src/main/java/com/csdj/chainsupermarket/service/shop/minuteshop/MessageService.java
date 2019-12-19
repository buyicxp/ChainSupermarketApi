package com.csdj.chainsupermarket.service.shop.minuteshop;


import com.csdj.chainsupermarket.entity.shop.minuteshop.ShopMessage;

import java.util.List;

/**
 * @ClassName MessageService
 * @Description: 门店接口
 * @Author 刘时钟
 * @Date 2019/12/2
 * @Version V1.0
 **/
public interface MessageService {
    /**
     * 查询门店列表
     * @param name
     * @param operating
     * @return
     */
    List<ShopMessage> listShopMessageService(String name, String operating,
                                             Integer currentPage, Integer pageSize);

    /**
     * 查询门店记录数
     * @param name
     * @param operating
     * @return
     */
    Integer countShopMessageService(String name, String operating);

    /**
     * 添加门店
     * @param message
     * @return
     */
    int  saveShopMessageService(ShopMessage message);

    /**
     * 根据id查询要修改的门店
     * @param id
     * @return
     */
    ShopMessage getShopMessageService(Integer id);
    /**
     * 修改门店
     * @param message
     * @return
     */
    int  updateShopMessageService(ShopMessage message);

    /**
     * 停用门店
     * @param id
     * @return
     */
    int  disableShopMessageService(Integer id, String operating);
    /**
     * 查询门店名称
     * @return
     */
    List<ShopMessage> listShopMessageNameService();
}
