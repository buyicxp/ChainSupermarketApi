package com.csdj.chainsupermarket.service.imp.marketing;

import com.csdj.chainsupermarket.dao.marketing.UnavailableTypeMapper;
import com.csdj.chainsupermarket.entity.marketing.UnavailableType;
import com.csdj.chainsupermarket.service.marketing.UnavailableTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ Description   :  优惠券的不可用类型业务层实现层
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 14:39
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 14:39
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Service
public class UnavailableTypeServiceImpl implements UnavailableTypeService {

    @Resource
    UnavailableTypeMapper dao;
    @Override
    public UnavailableType findById(int couponId) {
        return dao.findById(couponId);
    }

    @Override
    public int addUnavailableType(int goodsTypeId,String restrictionName) {
        Map map = new HashMap();
        map.put("goodsTypeId",goodsTypeId);
        map.put("now",new Date());
        if (restrictionName != null && restrictionName!="" ){
            map.put("restrictionName", restrictionName);
        }
        return dao.addUnavailableType(map);
    }

    @Override
    public int addInfo(int couponId, int goodsTypeId) {
        Map map = new HashMap();
        map.put("goodsTypeId",goodsTypeId);
        map.put("now",new Date());
        map.put("couponId",couponId);
        return dao.addInfo(map);
    }

    @Override
    public int delUnavailableType(int couponId) {
        return dao.delUnavailableType(couponId);
    }

    @Override
    public int updateUnacailableType(int couponId, int goodsTypeId) {
        Map map = new HashMap();
        map.put("couponId", couponId);
        map.put("goodsTypeId", goodsTypeId);
        map.put("now", new Date());
        return dao.updateUnacailableType(map);
    }
}
