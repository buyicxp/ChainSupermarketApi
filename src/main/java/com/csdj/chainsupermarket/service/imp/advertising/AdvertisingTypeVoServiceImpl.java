package com.csdj.chainsupermarket.service.imp.advertising;

import com.csdj.chainsupermarket.dao.advertising.AdvertisingTypeVoMapper;
import com.csdj.chainsupermarket.entity.advertising.AdvertisingTypeVO;
import com.csdj.chainsupermarket.service.advertising.AdvertisingTypeVoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 丁丽群
 * @date 2019-12-05 19:55
 * @Description 广告分类业务实现类
 */
@Service("advertisingTypeVoServiceImpl")
public class AdvertisingTypeVoServiceImpl implements AdvertisingTypeVoService {

    @Resource
    private AdvertisingTypeVoMapper adverMapper;

    /**
     * 查询广告分类信息
     * @return 广告分类集合
     */
    @Override
    public List<AdvertisingTypeVO> findAdvertisingTypeVoListService() {
        return adverMapper.findAdvertisingTypeVoList();
    }

    /**
     * 添加广告分类信息
     * @param objAdVer 广告分类实体对象
     * @return 1成功 0失败
     */
    @Override
    public int addAdvertisingTypeService(AdvertisingTypeVO objAdVer) {
        return adverMapper.addAdvertisingType(objAdVer);
    }

    /**
     * 删除广告分类信息
     * @param advertisingId 广告类型编号
     * @return 1成功 0失败
     */
    @Override
    public int deleteAdvertisingTypeService(Integer advertisingId) {
        return adverMapper.deleteAdvertisingType(advertisingId);
    }
}
