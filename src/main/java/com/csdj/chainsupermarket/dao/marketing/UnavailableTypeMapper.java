package com.csdj.chainsupermarket.dao.marketing;

import com.csdj.chainsupermarket.entity.marketing.UnavailableType;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @ Description   :  优惠券的不可用类型持久层接口   商品外键没加
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 23:22
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 23:22
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Repository
public interface UnavailableTypeMapper {
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
    int addUnavailableType(Map map);
    /**
     * @Description  ：优惠券Id添加不可用类型
     * @author       : JY
     * @param        : [map]
     * @return       : int
     * @exception    :
     * @date         : 2019/12/16 18:25
     */
    int addInfo(Map map);

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
    int updateUnacailableType(Map map);
}