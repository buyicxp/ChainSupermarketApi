package com.csdj.chainsupermarket.service.advertising;

import com.csdj.chainsupermarket.entity.advertising.AdVerTiListVO;
import com.csdj.chainsupermarket.entity.advertising.AdvertisingTypeVO;
import com.csdj.chainsupermarket.util.marketing.PageUtil;

import java.util.List;

/**
 * Welcome to use the TableGo Tools.
 *
 *
 * @Author:丁丽群
 * @Description 广告业务接口
 * @date 2019-12-05 16:50
 * @Version:5.8.8
 */
public interface AdVerTiListVoService {
    /**
     * 根据广告名称和广告类型分类查询广告信息
     * @param adVerTiName 广告名称
     * @param advertisingTypeId 广告类型分类编号
     * @param     index
     * @param     pageSize
     * @return 广告信息集合
     */
    PageUtil<AdVerTiListVO> findAdVerTiListVOList(int index, int pageSize, String adVerTiName, String advertisingTypeId);
    
    /**
     * 查询广告数量
     * @param adVerTiName
     * @param advertisingTypeId
     * @return
     */
    int getCount(String adVerTiName, String advertisingTypeId);

    /**
     * 添加广告信息
     * @param objAdVer
     * @return 1成功 0失败
     */
    int addAdVerTiListVoService(AdVerTiListVO objAdVer);

    /**
     * 修改广告信息
     * @param objAdVer
     * @return 1成功 0失败
     */
    int updAdVerTiListVoService(AdVerTiListVO objAdVer);

    /**
     * 删除广告信息
     * @param adVerTiListId 广告信息编号
     * @return 1成功 0失败
     */
    int delAdVerTiListVoService(String adVerTiListId);

    /**
     * 根据广告信息编号进行查询单条数据
     * @param adVerTiListId 广告信息编号
     * @return 单条广告信息
     */
    AdVerTiListVO getByIdAdVerTiListVoService(String adVerTiListId);

    /**
     * 查询广告首页信息
     * @return
     */
    List<AdVerTiListVO> getAdVerTiListVoService();
    
    /**
     * 查询活动名称是否冲突
     * @param adVerTiName
     * @return
     */
    boolean selectByActivityName(String adVerTiName);
}
