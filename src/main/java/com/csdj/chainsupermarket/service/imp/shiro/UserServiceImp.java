package com.csdj.chainsupermarket.service.imp.shiro;

import com.csdj.chainsupermarket.dao.shiro.UserMapper;
import com.csdj.chainsupermarket.entity.shiro.LoginInfo;
import com.csdj.chainsupermarket.entity.shiro.Permission;
import com.csdj.chainsupermarket.entity.shiro.Role;
import com.csdj.chainsupermarket.entity.shop.staff.StaffEmployee;
import com.csdj.chainsupermarket.service.shiro.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName UserServiceImp
 * @Description:
 * @Author 邹捷
 * @Date 2019/11/29
 * @Version V1.0
 **/
@Service("userService")
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public StaffEmployee judgeLog(String nickname) {
        return userMapper.judgeLog(nickname);
    }

    @Override
    public List<Permission> getMenusByHrId(Integer id) {
        return userMapper.getMenusByHrId(id);
    }

    @Override
    public List<Role> findRolesByUserName(Integer id) {
        return userMapper.findRolesByUserName(id);
    }

    @Override
    public LoginInfo getLoginInfo(Integer id) {
        List<Role> roles = userMapper.findRolesByUserName(id);
        List<Permission> permissions  = userMapper.getMenusByHrId(id);
        Set<String> roleList = new HashSet<>();
        Set<String> permissionList = new HashSet<>();
        for (Role role : roles) {
            //角色存储
            roleList.add(role.getName());
        }
        for (Permission perm : permissions) {
            //权限存储
            permissionList.add(perm.getUrl());
        }
        return new LoginInfo(roleList,permissionList);
    }
}
