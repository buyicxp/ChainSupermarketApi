package com.csdj.chainsupermarket.service.imp.marketing;


import com.csdj.chainsupermarket.dao.marketing.ComputingTimeMapper;
import com.csdj.chainsupermarket.entity.marketing.ComputingTime;
import com.csdj.chainsupermarket.service.marketing.ComputingTimeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * @ Description   :  计算时间服务层实现层
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 10:22
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 10:22
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Service
public class ComputingTimeServiceImpl implements ComputingTimeService {
    @Resource
    ComputingTimeMapper dao;
    @Override
    public ComputingTime findComputingTimeById(int computingId) {
        return dao.findComputingTimeById(computingId);
    }

    @Override
    public List<ComputingTime> findByAll() {
        return dao.findByAll();
    }
}
