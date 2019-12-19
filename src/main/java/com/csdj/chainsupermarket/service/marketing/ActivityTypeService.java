package com.csdj.chainsupermarket.service.marketing;

import com.csdj.chainsupermarket.entity.marketing.ActivityTypeVO;

import java.util.List;

/**
 * @version 版本号        1.0
 * @author： 作者名称     张晟
 * @date 创建时间        2019/12/9/0009 13:57
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
public interface ActivityTypeService {
    /**
     * 查询所有满减满赠分类（满减/满赠）
     * @return
     */
    public List<ActivityTypeVO> findAllType();

    /**
     * 根据id查询分类
     * @param typeid
     * @return
     */
    public ActivityTypeVO findById(int typeid);
}

