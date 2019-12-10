package com.csdj.chainsupermarket.service.imp.orderform;

import com.csdj.chainsupermarket.dao.orderform.BillConcludeDao;
import com.csdj.chainsupermarket.entity.orderform.MerchandiseOrderPO;
import com.csdj.chainsupermarket.service.orderform.BillConcludeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author向仕懿
 * @date 2019 /12/5
 * 下单的实现
 */
@Service
public class BillConcludeServiceImp implements BillConcludeService {
    @Autowired
     BillConcludeDao dao;


    @Override
    public int insert(MerchandiseOrderPO mop) {
        return dao.insert(mop);
    }




    @Override
    public int update(int id) {
        return dao.update(id);
    }

    @Override
    public int amend(int id) {
        return dao.update(id);
    }


}
