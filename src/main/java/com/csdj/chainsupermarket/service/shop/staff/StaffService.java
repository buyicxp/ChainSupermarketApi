package com.csdj.chainsupermarket.service.shop.staff;

import com.csdj.chainsupermarket.entity.shiro.Role;
import com.csdj.chainsupermarket.entity.shop.minuteshop.ShopMessage;
import com.csdj.chainsupermarket.entity.shop.staff.StaffEmployee;
import com.csdj.chainsupermarket.entity.shop.staff.StaffList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName StaffService
 * @Description: 员工Serivec接口
 * @Author 邹捷
 * @Date 2019/12/10
 * @Version V1.0
 **/
public interface StaffService {
    /**
     * 员工添加
     * @param staffEmployee 员工实体类
     * @param rid           角色id
     * @return  添加的主键
     */
    Integer addStaff(StaffEmployee staffEmployee, @Param("rId") Integer rid);


    /**
     * 员工修改
     * @param staffEmployee 员工实体类
     * @param agoRid        原来的角色id
     * @param rid           新的角色id
     *@return  boolean类型 是否成功
     */
    Boolean updateStaff(StaffEmployee staffEmployee, @Param("agoRid") Integer agoRid, @Param("rId") Integer rid);

    /**
     * 修改员工登录密码
     * @param sfEmployeeId  员工id
     * @param sfPassword    新密码
     * @return  boolean类型 是否成功
     */
    Boolean updateStaffPassword(@Param("sfEmployeeId") Integer sfEmployeeId, @Param("sfPassword") String sfPassword);


    /**
     * 锁定员工账号
     * @param sfEmployeeId  员工id
     * @return  boolean类型 是否成功
     */
    Boolean stopStaff(@Param("sfEmployeeId") Integer sfEmployeeId);

    /**
     * 删除员工
     * @param sfEmployeeId  员工id
     * @return  boolean类型 是否成功
     */
    Boolean deleteStaff(@Param("sfEmployeeId") Integer sfEmployeeId);

    /**
     * 获取角色列表
     * @return 角色集合
     */
    List<Role> getRole();

    /**
     * 获取店铺门店
     * @return 门店集合
     */
    List<ShopMessage> getMessage();


    /**
     * 查询员工账号列表
     * @param sfStoreId  店铺id
     * @param rId        角色id
     * @param sfAccountId   账号状态
     * @param sfEmployName  员工姓名
     * @param currentPage   起始页
     * @param pageSize      页大小
     * @return  员工集合
     */
    List<StaffList> getStaffList(@Param("sfStoreId") Integer sfStoreId,
                                 @Param("rId") Integer rId,
                                 @Param("sfAccountId") Integer sfAccountId,
                                 @Param("sfEmployName") String sfEmployName,
                                 @Param("currentPage") Integer currentPage,
                                 @Param("pageSize") Integer pageSize);

    /**
     * 查询集合条数
     * @param sfStoreId  店铺id
     * @param rId        角色id
     * @param sfAccountId   账号状态
     * @param sfEmployName  员工姓名
     * @return  查询条数
     */
    Integer countStaff(@Param("sfStoreId") Integer sfStoreId,
                       @Param("rId") Integer rId,
                       @Param("sfAccountId") Integer sfAccountId,
                       @Param("sfEmployName") String sfEmployName);
}
