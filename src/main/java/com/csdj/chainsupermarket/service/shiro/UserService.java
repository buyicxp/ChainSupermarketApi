package com.csdj.chainsupermarket.service.shiro;

import com.csdj.chainsupermarket.entity.shiro.LoginInfo;
import com.csdj.chainsupermarket.entity.shiro.Permission;
import com.csdj.chainsupermarket.entity.shiro.Role;
import com.csdj.chainsupermarket.entity.shop.staff.StaffEmployee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName UserService
 * @Description: 权限控制Service接口
 * @Author 邹捷
 * @Date 2019/11/29
 * @Version V1.0
 **/
public interface UserService {
    /**
     *  登录验证
     * @param nickname  用户名
     * @return      user实体类
     */
    StaffEmployee judgeLog(@Param("nickname")String nickname);

    /**
     * 获取权限集合
     * @param id    用户id
     * @return    权限集合
     */
    List<Permission> getMenusByHrId(@Param("id")Integer id);

    /**
     * 获取角色集合
     * @param id    用户id
     * @return      角色集合
     */
    List<Role> findRolesByUserName(@Param("id")Integer id);

    /**
     * 获取角色和权限的集合
     * @param id    用户id
     * @return      权限实体类
     */
    LoginInfo getLoginInfo(Integer id);
}
