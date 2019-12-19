package com.csdj.chainsupermarket.service.imp.impl;

import com.csdj.chainsupermarket.dao.freight.BillFreightMapper;
import com.csdj.chainsupermarket.entity.freight.BillFreight;
import com.csdj.chainsupermarket.service.freight.BillFreightService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName BillFreightServiceImpl
 * @Description 物流操作业务层实现类
 * @Author 孤街
 * @Date 2019/12/2 16:43
 * @Version 1.0
 **/
@Service("BillFreightService")
public class BillFreightServiceImpl implements BillFreightService {

    @Autowired
    BillFreightMapper billFreightMapper;

    @Override
    public PageInfo<BillFreight> listFreight(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<BillFreight> billFreights = billFreightMapper.listConditionFreight(null);
        PageInfo<BillFreight> pageInfo = new PageInfo<BillFreight>(billFreights);
        return pageInfo;
    }

    @Override
    public Integer saveFreight(BillFreight freight) {
        return billFreightMapper.saveFreight(freight);
    }

    @Override
    public BillFreight getFreightById(Integer formId) {
        return billFreightMapper.listConditionFreight(formId).get(0);
    }

    @Override
    public Integer updateFreight(BillFreight freight) {
        return billFreightMapper.updateFreight(freight);
    }
}
