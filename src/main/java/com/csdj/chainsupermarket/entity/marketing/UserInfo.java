package com.csdj.chainsupermarket.entity.marketing;

import lombok.Data;

import java.util.Date;

/**
 * @ Description   :  用户信息实体类
 * @ Author        :  JY
 * @ CreateDate    :  2019/12/18 19:02
 * @ UpdateUser    :  JY
 * @ UpdateDate    :  2019/12/18 19:02
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
@Data
public class UserInfo {
    /** 用户Id */
    private Long userId;
    /** 用户名称 */
    private String userName;
}
