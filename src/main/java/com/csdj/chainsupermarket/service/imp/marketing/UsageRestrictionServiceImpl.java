package com.csdj.chainsupermarket.service.imp.marketing;

import com.csdj.chainsupermarket.dao.marketing.UsageRestrictionMapper;
import com.csdj.chainsupermarket.entity.marketing.UsageRestriction;
import com.csdj.chainsupermarket.service.marketing.UsageRestrictionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ Description   :  使用限制业务层实现层
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 15:13
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 15:13
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Service
public class UsageRestrictionServiceImpl implements UsageRestrictionService {
    @Resource
    UsageRestrictionMapper dao;
    @Override
    public UsageRestriction findById(int couponId) {
        return dao.findById(couponId);
    }

    @Override
    public int addUsageRestriction(String restrictionName,String restrictionBeginTime,String stoptime) {
        Map map = new HashMap();
        map.put("restrictionName", restrictionName);
        map.put("restrictionBeginTime", restrictionBeginTime);
        map.put("stoptime", stoptime);
        map.put("now", new Date());
        return dao.addUsageRestriction(map);
    }

    @Override
    public int addInfo(int couponId, String restrictionName, String restrictionBeginTime, String stoptime) {
        Map map = new HashMap();
        map.put("couponId", couponId);
        map.put("restrictionName", restrictionName);
        map.put("restrictionBeginTime", restrictionBeginTime);
        map.put("stoptime", stoptime);
        map.put("now", new Date());
        return dao.addInfo(map);
    }

    @Override
    public int delUsageRestriction(int couponId) {
        return dao.delUsageRestriction(couponId);
    }

    @Override
    public int updateUsageRestriction(int couponId, String restrictionName, String restrictionBeginTime, String stoptime) {
        Map map = new HashMap();
        map.put("couponId", couponId);
        map.put("restrictionName", restrictionName);
        map.put("restrictionBeginTime", restrictionBeginTime);
        map.put("stoptime", stoptime);
        map.put("now", new Date());
        return dao.addUsageRestriction(map);
    }
}
