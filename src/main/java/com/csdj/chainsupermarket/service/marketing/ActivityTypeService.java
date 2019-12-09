package com.csdj.chainsupermarket.service.marketing;

import com.csdj.chainsupermarket.dao.marketing.ActivityTypeDao;
import com.csdj.chainsupermarket.entity.marketing.ActivityTypeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 版本号        1.0
 * @author： 作者名称     张晟
 * @date 创建时间        2019/12/5/0005 11:25
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@Service
public class ActivityTypeService {
    @Autowired
    ActivityTypeDao activityTypeDao;

    public List<ActivityTypeVO> findAllType(){
        return activityTypeDao.findAllType();
    }

    public ActivityTypeVO findById(int typeid){
        return activityTypeDao.findById(typeid);
    }
}
