package com.csdj.chainsupermarket.service.marketing;


import com.csdj.chainsupermarket.entity.marketing.PreferentialType;

import java.util.List;

/**
 * @ Description   :  优惠类型持久层接口
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 14:09
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 14:09
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public interface PreferentialTypeService {
    /**
     * @Description  ：  查询单个优惠类型
     * @author       : JY
     * @param        : [preferentialId] 优惠类型主键
     * @return       : com.csdj.chainsupermarket.entity.marketing.PreferentialType
     * @exception    :
     * @date         : 2019/12/7 13:54
     */
    PreferentialType findPreferentialTypeById(Integer preferentialId);
    /**
     * @Description  ：查询所有优惠类型
     * @author       : JY
     * @param        : []
     * @return       : java.util.List<com.csdj.chainsupermarket.entity.marketing.PreferentialType>
     * @exception    :
     * @date         : 2019/12/10 9:05
     */
    List<PreferentialType> findByAll();

}
