package com.csdj.chainsupermarket.dao.marketing;

import com.csdj.chainsupermarket.entity.marketing.UserInfo;
import org.springframework.stereotype.Repository;
/**
 * @ Description   :  用户信息持久层接口
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/18 19:47
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/18 19:47
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Repository
public interface UserInfoMapper {
    /**
     * @Description  ： 查询单个用户信息
     * @author       : JY
     * @param        : [userId]
     * @return       : com.csdj.chainsupermarket.entity.marketing.UserInfo
     * @exception    :
     * @date         : 2019/12/18 19:48
     */
    UserInfo findById(int userId);
}
