package com.csdj.chainsupermarket.dao.marketing;

import com.csdj.chainsupermarket.entity.marketing.UsageRestriction;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @ Description   :  使用限制持久层接口
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 23:23
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 23:23
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Repository
public interface UsageRestrictionMapper {
    /**
     * @Description  ：查询使用限制
     * @author       : JY
     * @param        : [couponId] 优惠券ID
     * @return       : com.csdj.chainsupermarket.entity.marketing.UsageRestriction
     * @exception    :
     * @date         : 2019/12/9 20:49
     */
    UsageRestriction findById(int couponId);

    /**
     * @Description  ：添加使用限制
     * @author       : JY
     * @param        : [map]
     * @return       : int
     * @exception    :
     * @date         : 2019/12/12 18:47
     */
    int addUsageRestriction(Map map);
    /**
     * @Description  ：根据优惠券主键添加限制
     * @author       : JY
     * @param        : [map]添加使用限制信息
     * @return       : int
     * @exception    :
     * @date         : 2019/12/16 18:18
     */
    int addInfo(Map map);

    /**
     * @Description  ：删除优惠券的使用限制
     * @author       : JY
     * @param        : [couponId]
     * @return       : int
     * @exception    :
     * @date         : 2019/12/16 17:55
     */
    int delUsageRestriction(int couponId);

    /**
     * @Description  ：修改优惠券的使用限制
     * @author       : JY
     * @param        : [map] 修改使用限制的信息
     * @return       : int
     * @exception    :
     * @date         : 2019/12/16 17:55
     */
    int updateUsageRestriction(Map map);
}