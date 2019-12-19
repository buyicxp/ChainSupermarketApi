package com.csdj.chainsupermarket.service.imp.marketing;

import com.csdj.chainsupermarket.dao.marketing.ActivityRangeDao;
import com.csdj.chainsupermarket.entity.marketing.ActivityRangeVO;
import com.csdj.chainsupermarket.service.marketing.ActivityRangeService;
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
public class ActivityRangeServiceImpl implements ActivityRangeService {
    @Resource
    ActivityRangeDao activityRangeDao;
    @Override
    public List<ActivityRangeVO> findAllRange(){
        return activityRangeDao.findAllRange();
    }
    @Override
    public ActivityRangeVO findById(int rangeid){
        return activityRangeDao.findById(rangeid);
    }
}
