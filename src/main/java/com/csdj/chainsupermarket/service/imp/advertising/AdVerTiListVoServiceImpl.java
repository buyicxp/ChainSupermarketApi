package com.csdj.chainsupermarket.service.imp.advertising;

import com.csdj.chainsupermarket.dao.advertising.AdVerTiListVoMapper;
import com.csdj.chainsupermarket.entity.advertising.AdVerTiListVO;
import com.csdj.chainsupermarket.entity.advertising.AdvertisingTypeVO;
import com.csdj.chainsupermarket.service.advertising.AdVerTiListVoService;
import com.csdj.chainsupermarket.util.marketing.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 丁丽群
 * @date 2019-12-05 23:49
 * @Description 广告业务实现类
 * @Version V1.0
 */
@Service
public class AdVerTiListVoServiceImpl implements AdVerTiListVoService {

    @Resource
    private AdVerTiListVoMapper adVerMapper;
    
    
    @Override
    public PageUtil<AdVerTiListVO> findAdVerTiListVOList(int index, int pageSize, String adVerTiName, String advertisingTypeId) {
        PageUtil<AdVerTiListVO> pageUtil = new PageUtil<>();
    
        // 把控制器传递的分页参数进行封装
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("off", (index - 1) * pageSize);
        map.put("size", pageSize);
        if (adVerTiName != null) {
            map.put("adVerTiName", adVerTiName);
        }else {
            map.put("adVerTiName", null);
        }
        if (advertisingTypeId != null) {
            map.put("advertisingTypeId", advertisingTypeId);
        }else {
            map.put("advertisingTypeId", null);
        }
    
        // 取出分页的当前页数据
        pageUtil.setList(adVerMapper.findAdVerTiListVOList(map));
        // 当前页码
        pageUtil.setPageIndex(index);
        // 每页大小
        pageUtil.setPageSize(pageSize);
        // 总记录数
        int count = getCount(adVerTiName, advertisingTypeId);
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
    public int getCount(String adVerTiName, String advertisingTypeId) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (adVerTiName != null) {
            map.put("adVerTiName", adVerTiName);
        }else {
            map.put("adVerTiName", null);
        }
        if (advertisingTypeId != null) {
            map.put("advertisingTypeId", advertisingTypeId);
        }else {
            map.put("advertisingTypeId", null);
        }
        int res = adVerMapper.getCount(map);
        return res;
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
    public int delAdVerTiListVoService(String adVerTiListId) {
        return adVerMapper.delAdVerTiListVO(adVerTiListId);
    }

    /**
     * 根据ID查询一条数据
     * @param adVerTiListId 广告信息编号
     * @return 一条广告信息
     */
    @Override
    public AdVerTiListVO getByIdAdVerTiListVoService(String adVerTiListId) {
        return adVerMapper.getByIdAdVerTiListVO(adVerTiListId);
    }

    @Override
    public List<AdVerTiListVO> getAdVerTiListVoService() {
        return adVerMapper.getAdVerTiListVo();
    }
    
    @Override
    public boolean selectByActivityName(String adVerTiName) {
        boolean flag = false;
        if (adVerMapper.selectByActivityName(adVerTiName) == null) {
            flag = true;
        }
        return flag;
    }
}
