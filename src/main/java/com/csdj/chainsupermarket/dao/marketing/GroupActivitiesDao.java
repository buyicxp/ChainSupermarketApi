package com.csdj.chainsupermarket.dao.marketing;

import com.csdj.chainsupermarket.entity.marketing.GroupActivities;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author :阿浩i
 * @Description : 拼团活动Dao接口
 * @CreateDate :  2019/12/3 16:20
 * @Version : 1.0
 */
@Repository
public interface GroupActivitiesDao {
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
     * @return    GroupActivities
     * @date      2019/12/4 9:03
     */
    GroupActivities selectByActivityName(String activityName);
    
    /**
     * 查询所有活动
     * @author    阿浩i
     * @param     map
     * @return    java.util.List<com.csdj.chainsupermarket.entity.marketing.GroupActivities>
     * @date      2019/12/4 15:52
     */
    List<GroupActivities> findGroupActivities(Map map);
    
    /**
     * 查询所有活动数量
     * @author    阿浩i
     * @param     map
     * @return    int
     * @date      2019/12/4 15:53
     */
    int getCount(Map map);
    
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
     * @return    java.util.List<com.csdj.chainsupermarket.entity.marketing.GroupActivities>
     * @param     endTime
     * @date      2019/12/6 14:10
     */
    int selectByEndTime(Date endTime);
    
    /**
     * 查询所有数据，设置活动接口
     * @author    阿浩i
     * @param
     * @return    java.util.List<com.csdj.chainsupermarket.entity.marketing.GroupActivities>
     * @date      2019/12/11 11:19
     */
    List<GroupActivities> findAllGroupActivities();
}
