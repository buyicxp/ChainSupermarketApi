package com.csdj.chainsupermarket.dao.marketing;

import com.csdj.chainsupermarket.entity.marketing.PreferentialType;
import org.springframework.stereotype.Repository;

/**
 * @ Description   :  优惠类型持久层接口
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/6 23:22
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/6 23:22
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Repository
public interface PreferentialTypeMapper {
    /**
     * @Description  ：  查询单个优惠类型
     * @author       : JY
     * @param        : [preferentialId] 优惠类型主键
     * @return       : com.csdj.chainsupermarket.entity.marketing.PreferentialType
     * @exception    :
     * @date         : 2019/12/7 13:54
     */
    PreferentialType findPreferentialTypeById(Integer preferentialId);
}