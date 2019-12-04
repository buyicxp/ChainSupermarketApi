package com.csdj.chainsupermarket.shiro.realm;


import com.csdj.chainsupermarket.entity.shiro.Permission;
import com.csdj.chainsupermarket.entity.shiro.Role;
import com.csdj.chainsupermarket.entity.shop.staff.StaffEmployee;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserRealm
 * @Description: TODO
 * @Author 邹捷
 * @Date 2019/11/5
 * @Version V1.0
 **/

public class UserRealm extends AuthorizingRealm {

    @Autowired
    private com.csdj.chainsupermarket.service.shiro.UserService UserService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //添加资源的授权字符串
        //  info.addStringPermission("menu:add");
        //到数据库查询当前登录用户的授权字符串  获取当前登录用户
        Subject subject = SecurityUtils.getSubject();
        StaffEmployee user = (StaffEmployee) subject.getPrincipal();
        List<Permission> permission = UserService.getMenusByHrId(user.getSfEmployeeId());
        List<Role> roleList = UserService.findRolesByUserName(user.getSfEmployeeId());
        List<String> listRole = new ArrayList<>();
        List<String> listPermission = new ArrayList<>();
        if (roleList.size() != 0) {
            for (Role role : roleList) {
                if (!listRole.contains(role.getName())) {
                    listRole.add(role.getName());
                }
            }
        }
        if (permission.size() != 0) {
            for (Permission menu : permission) {
                if (!listPermission.contains(menu.getUrl())) {
                    listPermission.add(menu.getUrl());
                }
            }

        }
        info.addRoles(listRole);
        info.addStringPermissions(listPermission);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行认证逻辑");
        //编写shiro判读逻辑，判断用户名和密码
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        StaffEmployee user = UserService.judgeLog(token.getUsername());
        if (user == null) {
            return null;
        }
        if (user != null && user.getSfAccountId() == 0) {
            throw new LockedAccountException("该账户已被锁定！");
        }
        /*
         *若存在，将此用户存放到登录认证info中，无需自己做密码对比Shiro会为我们进行密码对比校验
         *这里盐值可以自定义
         *格式为(用户，用户密码，盐，当前 Realm 的类名)
         */
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user, user.getSfPassword(),
                ByteSource.Util.bytes(user.getSfEmloyeePhone()),
                getName());
        return authenticationInfo;
    }


}
