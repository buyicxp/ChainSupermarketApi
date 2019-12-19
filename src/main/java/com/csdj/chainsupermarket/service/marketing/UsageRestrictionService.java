package com.csdj.chainsupermarket.service.marketing;

import com.csdj.chainsupermarket.entity.marketing.UsageRestriction;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * @ Description   :  使用限制持久层接口
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 15:13
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 15:13
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public interface UsageRestrictionService {
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
     * @date         : 2019/12/12 18:51
     */
    int addUsageRestriction(String restrictionName,String restrictionBeginTime,String stoptime);

    /**
     * @Description  ：添加使用限制根据优惠券Id
     * @author       : JY
     * @param        : [map]
     * @return       : int
     * @exception    :
     * @date         : 2019/12/12 18:51
     */
    int addInfo(int couponId,String restrictionName,String restrictionBeginTime,String stoptime);

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
     * @param        : [couponId, restrictionName, restrictionBeginTime, stoptime] 优惠券ID,使用限制名称，开始时间，结束时间
     * @return       : int
     * @exception    :
     * @date         : 2019/12/16 18:01
     */
    int updateUsageRestriction(int couponId,String restrictionName,String restrictionBeginTime,String stoptime);
}
