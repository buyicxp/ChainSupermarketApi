package com.csdj.chainsupermarket.service.advertising;

import com.csdj.chainsupermarket.entity.advertising.AdvertisingTypeVO;
import com.csdj.chainsupermarket.util.marketing.PageUtil;

import java.util.List;

/**
 * Welcome to use the TableGo Tools.
 *
 *
 * @Author:bianj
 * @Description 广告分类业务接口
 * @date 2019-12-05 16:50
 * @Version:5.8.8
 */
public interface AdvertisingTypeVoService {
    /**
     * 广告分类进行查询
     * @return 广告分类集合
     */
    public List<AdvertisingTypeVO> findAdvertisingTypeVoListService();

    /**
     * 添加广告类型信息
     * @param objAdVer
     * @return 1成功 0失败
     */
    public int addAdvertisingTypeService(AdvertisingTypeVO objAdVer);

    /**
     * 删除广告类型信息
     * @param advertisingId 广告类型编号
     * @return 1成功 0失败
     */
    public int deleteAdvertisingTypeService(String advertisingId);
    
    /**
     * 查询分类名称
     * @param advertisingId
     * @return
     */
    AdvertisingTypeVO findByName(String advertisingId);
    
    /**
     * 查类型总数
     * @return
     */
    int getCount();
    
    /**
     * 分页查类型
     * @param index
     * @param pageSize
     * @return
     */
    PageUtil<AdvertisingTypeVO> findAdvertisingTypeVoList(int index, int pageSize);
    
    /**
     * 查询名称是否冲突
     * @param advertisingName
     * @return
     */
    boolean selectByActivityName(String advertisingName);
    
    /**
     * 修改广告类型
     * @param brand
     * @return
     */
    int updateType(AdvertisingTypeVO brand);
}
