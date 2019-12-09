package com.csdj.chainsupermarket.service.marketing;

import com.csdj.chainsupermarket.entity.marketing.GroupActivities;
import com.csdj.chainsupermarket.util.marketing.PageUtil;

/**
 * @author :阿浩i
 * @Description : 拼团活动Service
 * @CreateDate :  2019/12/3 16:21
 * @Version : 1.0
 */
public interface GroupActivitiesService {
    /**
     * 添加拼团活动
     * @author    阿浩i
     * @param     group
     * @return    int
     * @date      2019/12/4 9:01
     */
    int addGroup(GroupActivities group);
    
    /**
     * 查询活动名称是否冲突
     * @author    阿浩i
     * @param     activityName
     * @return    boolean
     * @date      2019/12/4 9:11
     */
    boolean selectByActivityName(String activityName);
    
    /**
     * 分页查询所有活动
     * @author    阿浩i
     * @param     index
     * @param     pageSize
     * @param     activityName
     * @return    com.csdj.chainsupermarket.util.PageUtil<com.csdj.chainsupermarket.entity.marketing.GroupActivities>
     * @date      2019/12/4 15:54
     */
    PageUtil<GroupActivities> findGroupActivities(int index, int pageSize, String activityName);
    
    /**
     * 查询所有活动数量
     * @author    阿浩i
     * @param     activityName
     * @return    int
     * @date      2019/12/4 15:55
     */
    int getCount(String activityName);
    
    /**
     * 修改数据
     * @author    阿浩i
     * @param     group
     * @return    int
     * @date      2019/12/5 14:01
     */
    int updateGroupActivities(GroupActivities group);
    
    /**
     * 根据主键批量删除数据
     * @author    阿浩i
     * @param     activitiesId
     * @return    int
     * @date      2019/12/5 14:02
     */
    int deleteGroupActivitiesByIds(String activitiesId);
    
    /**
     * 根据活动结束时间修改活动状态
     * @author    阿浩i
     * @param     endTime
     * @return    java.util.List<com.csdj.chainsupermarket.entity.marketing.GroupActivities>
     * @date      2019/12/6 14:14
     */
    int selectByEndTime(String endTime);
}
