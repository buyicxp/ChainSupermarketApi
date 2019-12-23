package com.csdj.chainsupermarket.dao.marketing;

import com.csdj.chainsupermarket.entity.marketing.SnapUpActivities;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author 贺芳
 * 抢购
 */
@Repository
public interface MarketMapper {
    /**
     * 查询总数
     * @return
     */
    Integer markCount(Map map);

    /**
     * 查询所有及分页
     * @param map
     * @return
     */
    List<SnapUpActivities> getMarkList(Map map);

    /**
     * 添加
     * @param snap_up_activities
     * @return
     */
    Integer insertMark(SnapUpActivities snap_up_activities);

    /**
     * 删除记录
     * @param ctivityId
     * @return
     */
    Integer deleteMark(@Param("ctivityId") Integer ctivityId);

    /**
     * 修改查询
     * @param ctivityId
     * @return
     */

    List<SnapUpActivities> updatelist(@Param("ctivityId") Integer ctivityId);
    /**
     * 修改
     * @param snapUpActivities
     * @return
     */
    Integer updateMark(SnapUpActivities snapUpActivities);

    /**
     * 提供抢购活动的接口
     * @param ctivityId
     * @param activityName
     * @return
     */
    public SnapUpActivities qgMarket(Integer ctivityId, String activityName);


    /**
     * 预留接口抢购 查询 id、名称
     * @param
     * @return
     */
    List<SnapUpActivities> show_name();

    /**
     * 预留接口抢购 查询 id、名称 总条数
     * @param
     * @return
     */
    int count_SnapUpActivities();
}
