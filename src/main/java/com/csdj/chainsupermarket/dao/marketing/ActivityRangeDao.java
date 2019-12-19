package com.csdj.chainsupermarket.dao.marketing;

import com.csdj.chainsupermarket.entity.marketing.ActivityRangeVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 版本号        1.0
 * @author： 作者名称     张晟
 * @date 创建时间        2019/12/4/0004 16:06
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@Mapper
public interface ActivityRangeDao {
    /**
     * 查询所有活动范围
     * @return
     */
    List<ActivityRangeVO> findAllRange();

    /**
     * 根据id查询活动范围
     * @param rangeid
     * @return
     */
    ActivityRangeVO findById(int rangeid);

}
