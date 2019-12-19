package com.csdj.chainsupermarket.dao.advertising;

import com.csdj.chainsupermarket.entity.advertising.AdvertisingTypeVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Welcome to use the TableGo Tools.
 *
 *
 * @Author:丁丽群
 * @Description: 广告分类接口
 * @date 2019-12-05 16:50
 * @Version:5.8.8
 */
public interface AdvertisingTypeVoMapper {
    /**
     * 广告分类进行查询
     * @return 广告分类集合
     */
     List<AdvertisingTypeVO> findAdvertisingTypeVoList();

    /**
     * 添加广告类型信息
     * @param objAdVer
     * @return 1成功 0失败
     */
     Integer addAdvertisingType(AdvertisingTypeVO objAdVer);

    /**
     * 删除广告类型信息
     * @param advertisingId 广告类型编号
     * @return 1成功 0失败
     */
    int deleteAdvertisingType(@Param("advertisingId") String advertisingId);
    
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
     * 分页查询
     * @param map
     * @return
     */
    List<AdvertisingTypeVO> findAdvertisingTypeVoLists(Map map);
    
    /**
     * 修改类型信息
     * @param brand
     * @return
     */
    int updateType(AdvertisingTypeVO brand);
    
    /**
     * 查询名称是否冲突
     * @param advertisingName
     * @return
     */
    AdvertisingTypeVO selectByActivityName(String advertisingName);
}
