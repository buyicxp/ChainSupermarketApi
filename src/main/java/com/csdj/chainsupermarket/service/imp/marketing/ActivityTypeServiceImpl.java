package com.csdj.chainsupermarket.service.imp.marketing;

import com.csdj.chainsupermarket.dao.marketing.ActivityTypeDao;
import com.csdj.chainsupermarket.entity.marketing.ActivityTypeVO;
import com.csdj.chainsupermarket.service.marketing.ActivityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 版本号        1.0
 * @author： 作者名称     张晟
 * @date 创建时间        2019/12/5/0005 11:25
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@Service
public class ActivityTypeServiceImpl implements ActivityTypeService {
    @Resource
    ActivityTypeDao activityTypeDao;
    @Override
    public List<ActivityTypeVO> findAllType(){
        return activityTypeDao.findAllType();
    }
    @Override
    public ActivityTypeVO findById(int typeid){
        return activityTypeDao.findById(typeid);
    }
}
