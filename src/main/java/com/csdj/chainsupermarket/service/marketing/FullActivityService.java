package com.csdj.chainsupermarket.service.marketing;

import com.csdj.chainsupermarket.entity.commodity.GoodsCommodity;
import com.csdj.chainsupermarket.entity.marketing.FullActivityVO;
import com.csdj.chainsupermarket.util.shiro.PageUtil;

import java.util.List;

/**
 * @version 版本号        1.0
 * @author： 作者名称     张晟
 * @date 创建时间        2019/12/9/0009 13:50
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
public interface FullActivityService {
    /**
     * 分页查询数据
     *
     * @param index        当前页码
     * @param pageSize     每页数据大小
     * @param activityName 活动名称
     * @return
     */
    PageUtil<FullActivityVO> findPage(int index, int pageSize, String activityName);

    /**
     * 根据id查询活动信息
     *
     * @param activityid 活动id
     * @return
     */
    FullActivityVO findById(int activityid);

    /**
     * 查询总数
     *
     * @return
     */
    int getCount();

    /**
     * 根据id删除活动（改变活动状态）
     *
     * @param activityid 活动id
     * @return
     */
    int delete(int activityid);

    /**
     * 修改活动状态
     *
     * @param activityid    活动id
     * @param activityState 活动状态
     * @return
     */
    int update(int activityid, String activityState);

    /**
     * 添加方法
     * @param activityName
     * @param typeid
     * @param activityTime
     * @param rangeid
     * @param activityState
     * @param executingState
     * @param activityDetail
     * @param deleteState
     * @param goodsCommodityId
     * @param goodsTypeId
     * @param money
     * @return
     */
    int add(String activityName,int typeid,String activityTime,int rangeid,String activityState,String executingState,
            String activityDetail,int deleteState,int goodsCommodityId,int goodsTypeId,int money );
    
    /**
     * 修改执行状态
     * @return
     */
    int updateState();
    
    /**
     * 修改执行状态
     * @return
     */
    int updateTime();
}
