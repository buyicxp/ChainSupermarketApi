package com.csdj.chainsupermarket.service.imp.advertising;

import com.csdj.chainsupermarket.dao.advertising.AdVerTiListVoMapper;
import com.csdj.chainsupermarket.entity.advertising.AdVerTiListVO;
import com.csdj.chainsupermarket.entity.advertising.AdvertisingTypeVO;
import com.csdj.chainsupermarket.service.advertising.AdVerTiListVoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 丁丽群
 * @date 2019-12-05 23:49
 * @Description 广告业务实现类
 * @Version V1.0
 */
@Service("adVerTiListVoServiceImpl")
public class AdVerTiListVoServiceImpl implements AdVerTiListVoService {

    @Resource
    private AdVerTiListVoMapper adVerMapper;

    /**
     * 查询广告信息
     * @param adVerTiName 广告名称
     * @param advertisingTypeId 广告类型分类编号
     * @return 广告信息集合
     */
    @Override
    public List<AdVerTiListVO> findAdVerTiListVoListService(String adVerTiName, Integer advertisingTypeId) {
        return adVerMapper.findAdVerTiListVoList(adVerTiName,advertisingTypeId);
    }

    /**
     * 查询广告分类信息
     * @return 广告分类的名称
     */
    @Override
    public List<AdvertisingTypeVO> findAdvertisingTypeListService() {
        return adVerMapper.findAdvertisingTypeList();
    }

    /**
     * 添加广告信息
     * @param objAdVer 实体对象
     * @return 1成功 0失败
     */
    @Override
    public int addAdVerTiListVoService(AdVerTiListVO objAdVer) {
        return adVerMapper.addAdVerTiListVO(objAdVer);
    }

    /**
     * 修改广告信息
     * @param objAdVer  实体对象
     * @return  1成功 0失败
     */
    @Override
    public int updAdVerTiListVoService(AdVerTiListVO objAdVer) {
        return adVerMapper.updAdVerTiListVO(objAdVer);
    }

    /**
     * 删除广告信息
     * @param adVerTiListId 广告信息编号
     * @return 1成功 0失败
     */
    @Override
    public int delAdVerTiListVoService(Integer adVerTiListId) {
        return adVerMapper.delAdVerTiListVO(adVerTiListId);
    }

    /**
     * 根据ID查询一条数据
     * @param adVerTiListId 广告信息编号
     * @return 一条广告信息
     */
    @Override
    public AdVerTiListVO getByIdAdVerTiListVoService(Integer adVerTiListId) {
        return adVerMapper.getByIdAdVerTiListVO(adVerTiListId);
    }

    @Override
    public List<AdVerTiListVO> getAdVerTiListVoService() {
        return adVerMapper.getAdVerTiListVo();
    }
}
