package com.csdj.chainsupermarket.dao.marketing;

import com.csdj.chainsupermarket.entity.marketing.ActivityTypeVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 版本号        1.0
 * @author： 作者名称     张晟
 * @date 创建时间        2019/12/4/0004 16:05
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@Mapper
public interface ActivityTypeDao {
    /**
     * 查询所有活动分类
     * @return
     */
    List<ActivityTypeVO> findAllType();

    /**
     * 根据id查询所有活动分类
     * @param typeid
     * @return
     */
    ActivityTypeVO findById(int typeid);
}
