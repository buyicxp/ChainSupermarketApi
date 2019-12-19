package com.csdj.chainsupermarket.service.marketing;

import com.csdj.chainsupermarket.entity.marketing.ActivityRangeVO;

import java.util.List;

/**
 * @version 版本号        1.0
 * @author： 作者名称     张晟
 * @date 创建时间        2019/12/9/0009 13:59
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
public interface ActivityRangeService {
    /**
     * 查询满减满赠活动的所有范围
     * @return
     */
    public List<ActivityRangeVO> findAllRange();

    /**
     * 根据id查询活动范围
     * @param rangeid
     * @return
     */
    public ActivityRangeVO findById(int rangeid);

}
