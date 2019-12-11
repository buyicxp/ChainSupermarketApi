package com.csdj.chainsupermarket.service.advertising;

import com.csdj.chainsupermarket.entity.advertising.AdvertisingTypeVO;

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
    public int deleteAdvertisingTypeService(Integer advertisingId);
}
