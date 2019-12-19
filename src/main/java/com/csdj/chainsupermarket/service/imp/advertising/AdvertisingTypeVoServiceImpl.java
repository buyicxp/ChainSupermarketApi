package com.csdj.chainsupermarket.service.imp.advertising;

import com.csdj.chainsupermarket.dao.advertising.AdvertisingTypeVoMapper;
import com.csdj.chainsupermarket.entity.advertising.AdvertisingTypeVO;
import com.csdj.chainsupermarket.service.advertising.AdvertisingTypeVoService;
import com.csdj.chainsupermarket.util.marketing.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 丁丽群
 * @date 2019-12-05 19:55
 * @Description 广告分类业务实现类
 */
@Service
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
    public int deleteAdvertisingTypeService(String advertisingId) {
        return adverMapper.deleteAdvertisingType(advertisingId);
    }
    
    @Override
    public AdvertisingTypeVO findByName(String advertisingId) {
        return adverMapper.findByName(advertisingId);
    }
    
    @Override
    public int getCount() {
        return adverMapper.getCount();
    }
    
    @Override
    public PageUtil<AdvertisingTypeVO> findAdvertisingTypeVoList(int index, int pageSize) {
        PageUtil<AdvertisingTypeVO> pageUtil = new PageUtil<>();
    
        // 把控制器传递的分页参数进行封装
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("off", (index - 1) * pageSize);
        map.put("size", pageSize);
        // 取出分页的当前页数据
        pageUtil.setList(adverMapper.findAdvertisingTypeVoLists(map));
        // 当前页码
        pageUtil.setPageIndex(index);
        // 每页大小
        pageUtil.setPageSize(pageSize);
        // 总记录数
        int count = getCount();
        pageUtil.setRowCount(count);
        // 计算总页数
        if (count % pageSize == 0) {
            pageUtil.setPageNumber(count / pageSize);
        } else {
            pageUtil.setPageNumber(count / pageSize + 1);
        }
        return pageUtil;
    }
    
    @Override
    public boolean selectByActivityName(String advertisingName) {
        boolean flag = false;
        if (adverMapper.selectByActivityName(advertisingName) == null) {
            flag = true;
        }
        return flag;
    }
    
    @Override
    public int updateType(AdvertisingTypeVO brand) {
        return adverMapper.updateType(brand);
    }
}
