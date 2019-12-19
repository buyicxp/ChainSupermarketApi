package com.csdj.chainsupermarket.dao.advertising;

import com.csdj.chainsupermarket.entity.advertising.AdVerTiListVO;
import com.csdj.chainsupermarket.entity.advertising.AdvertisingTypeVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Welcome to use the TableGo Tools.
 *
 *
 * @Author:丁丽群
 * @Description: 广告接口
 * @date 2019-12-05 16:50
 * @Version:5.8.8
 */
public interface AdVerTiListVoMapper {
    /**
     * 根据广告名称和广告类型分类查询广告信息
     * @param map
     * @return
     */
   List<AdVerTiListVO> findAdVerTiListVOList(Map map);
    
    /**
     * 查询广告数量
     * @param map
     * @return
     */
   int getCount(Map map);

    /**
     * 添加广告信息
     * @param objAdVer
     * @return 1成功 0失败
     */
   int addAdVerTiListVO(AdVerTiListVO objAdVer);
   
   

    /**
     * 修改广告信息
     * @param objAdVer
     * @return 1成功 0失败
     */
   int updAdVerTiListVO(AdVerTiListVO objAdVer);

    /**
     * 删除广告信息
     * @param adVerTiListId 广告信息编号
     * @return 1成功 0失败
     */
   int delAdVerTiListVO(String adVerTiListId);

    /**
     * 根据广告信息编号进行查询单条数据
     * @param adVerTiListId 广告信息编号
     * @return 单条广告信息
     */
    AdVerTiListVO getByIdAdVerTiListVO(String adVerTiListId);

    /**
     * 查询广告首页信息
     * @return
     */
    List<AdVerTiListVO> getAdVerTiListVo();
    
    /**
     * 查询广告名称是否冲突
     * @param adVerTiName
     * @return
     */
    AdVerTiListVO selectByActivityName(String adVerTiName);
}
