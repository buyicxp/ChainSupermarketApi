package com.csdj.chainsupermarket.service.imp.marketing;


import com.csdj.chainsupermarket.dao.marketing.PreferentialTypeMapper;
import com.csdj.chainsupermarket.entity.marketing.PreferentialType;
import com.csdj.chainsupermarket.service.marketing.PreferentialTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ Description   :  优惠类型业务层实现层
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 14:09
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 14:09
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Service
public class PreferentialTypeServiceImpl implements PreferentialTypeService {
    @Resource
    PreferentialTypeMapper dao;

    @Override
    public PreferentialType findPreferentialTypeById(Integer preferentialId) {
        return dao.findPreferentialTypeById(preferentialId);
    }

    @Override
    public List<PreferentialType> findByAll() {
        return dao.findByAll();
    }
}
