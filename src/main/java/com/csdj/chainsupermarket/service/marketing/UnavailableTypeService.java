package com.csdj.chainsupermarket.service.marketing;

import com.csdj.chainsupermarket.entity.marketing.UnavailableType;

import java.util.List;
import java.util.Map;

/**
 * @ Description   :  优惠券的不可用类型持久层接口
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 14:39
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 14:39
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public interface UnavailableTypeService {
    /**
     * @Description  ：查询优惠券的不可用类型
     * @author       : JY
     * @param        : [couponId]
     * @return       : com.csdj.chainsupermarket.entity.marketing.UnavailableType
     * @exception    :
     * @date         : 2019/12/9 21:41
     */
    UnavailableType findById(int couponId);

    /**
     * @Description  ：添加不可用类型
     * @author       : JY
     * @param        : [map]
     * @return       : int
     * @exception    :
     * @date         : 2019/12/12 19:11
     */
    int addUnavailableType(int goodsTypeId,String restrictionName);

    /**
     * @Description  ：根据优惠券ID添加不可用类型
     * @author       : JY
     * @param        : [couponId, goodsTypeId]
     * @return       : int
     * @exception    :
     * @date         : 2019/12/16 22:57
     */
    int addInfo(int couponId,int goodsTypeId);

    /**
     * @Description  ：删除的有优惠券的不可用类型
     * @author       : JY
     * @param        : [couponId] 优惠券主键
     * @return       : int
     * @exception    :
     * @date         : 2019/12/16 17:28
     */
    int delUnavailableType(int couponId);
    /**
     * @Description  ：修改优惠券的不可用类型
     * @author       : JY
     * @param        : [map]修改的不可用类型的信息
     * @return       : int
     * @exception    :
     * @date         : 2019/12/16 17:29
     */
    int updateUnacailableType(int couponId,int goodsTypeId);
}
