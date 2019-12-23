package com.csdj.chainsupermarket.service.imp.marketing;

import com.csdj.chainsupermarket.dao.marketing.MarketMapper;
import com.csdj.chainsupermarket.entity.marketing.SnapUpActivities;
import com.csdj.chainsupermarket.service.marketing.MarketService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 贺芳
 * 抢购的实现类
 */
@Service("marketService")
public class MarketServiceImpl implements MarketService {
    @Resource
    private MarketMapper markMapper;

    /**
     * 查询所有总数
     * @return
     */
    @Override
    public Integer markCount(Map map) {
        return markMapper.markCount(map);
    }

    /**
     * 查询所有及分页
     * @param map
     * @return
     */
    @Override
    public List<SnapUpActivities> getMarkList(Map map) {
        System.out.println(map.get("currentPage")+">");
        System.out.println(map.get("pageSize"));
        System.out.println(map.get("activityName")+">");
        return markMapper.getMarkList(map);
    }

    /**
     * 添加
     * @param snap_up_activities
     * @return
     */
    @Override
    public Integer insertMark(SnapUpActivities snap_up_activities) {
        return markMapper.insertMark(snap_up_activities);
    }

    /**
     * 删除一条数据/多条数据
     * @param ctivityId
     * @return
     */
    @Override
    public Integer deleteMark(Integer ctivityId) {
        return markMapper.deleteMark(ctivityId);
    }

    /**
     * 修改查询
     * @param ctivityId
     * @return
     */
    @Override
    public List<SnapUpActivities> updatelist(Integer ctivityId) {
        return markMapper.updatelist(ctivityId);
    }


    /**
     * 修改
     * @param snapUpActivities
     * @return
     */
    @Override
    public Integer updateMark(SnapUpActivities snapUpActivities) {
        return markMapper.updateMark(snapUpActivities);
    }

    /**
     * 提供抢购活动的接口
     * @param ctivityId
     * @param activityName
     * @return
     */
    @Override
    public SnapUpActivities qgMarket(Integer ctivityId, String activityName) {
        return markMapper.qgMarket(ctivityId,activityName);
    }



    @Override
    public List<SnapUpActivities> show_name() {
        return markMapper.show_name();
    }

    @Override
    public int count_SnapUpActivities() {
        return markMapper.count_SnapUpActivities();
    }
}
