package com.csdj.chainsupermarket.service.imp.marketing;

import com.csdj.chainsupermarket.dao.marketing.GroupActivitiesDao;
import com.csdj.chainsupermarket.entity.marketing.GroupActivities;
import com.csdj.chainsupermarket.service.marketing.GroupActivitiesService;
import com.csdj.chainsupermarket.util.marketing.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author :阿浩i
 * @Description : 拼团活动serviceImpl
 * @CreateDate :  2019/12/3 16:21
 * @Version : 1.0
 */
@Service
public class GroupActivitiesServiceImpl implements GroupActivitiesService {
    @Resource
    GroupActivitiesDao dao;
    
    @Override
    public int addGroup(GroupActivities group) {
        return dao.addGroup(group);
    }
    
    @Override
    public boolean selectByActivityName(String activityName) {
        boolean flag = false;
        if (dao.selectByActivityName(activityName) == null) {
            flag = true;
        }
        return flag;
    }
    
    @Override
    public PageUtil<GroupActivities> findGroupActivities(int index, int pageSize, String activityName) {
        PageUtil<GroupActivities> pageUtil = new PageUtil<>();
    
        // 把控制器传递的分页参数进行封装
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("off", (index - 1) * pageSize);
        map.put("size", pageSize);
        if (activityName != null) {
            map.put("activityName", activityName);
        }else {
            map.put("activityName", null);
        }
    
        // 取出分页的当前页数据
        pageUtil.setList(dao.findGroupActivities(map));
        // 当前页码
        pageUtil.setPageIndex(index);
        // 每页大小
        pageUtil.setPageSize(pageSize);
        // 总记录数
        int count = getCount(activityName);
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
    public int getCount(String activityName) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (activityName != null) {
            map.put("activityName", activityName);
        }
        return dao.getCount(map);
    }
    
    @Override
    public int updateGroupActivities(GroupActivities group) {
        return dao.updateGroupActivities(group);
    }
    
    @Override
    public int deleteGroupActivitiesByIds(String activitiesId) {
        return dao.deleteGroupActivitiesByIds(activitiesId);
    }
    
    @Override
    public int selectByEndTime(Date endTime) {
        return dao.selectByEndTime(endTime);
    }
    
    @Override
    public List<GroupActivities> findAllGroupActivities() {
        return dao.findAllGroupActivities();
    }
    
    
}
