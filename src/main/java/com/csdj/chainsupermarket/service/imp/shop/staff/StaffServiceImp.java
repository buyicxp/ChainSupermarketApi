package com.csdj.chainsupermarket.service.imp.shop.staff;

import com.csdj.chainsupermarket.dao.shop.staff.StaffMapper;
import com.csdj.chainsupermarket.entity.shiro.Role;
import com.csdj.chainsupermarket.entity.shop.minuteshop.ShopMessage;
import com.csdj.chainsupermarket.entity.shop.staff.StaffEmployee;
import com.csdj.chainsupermarket.entity.shop.staff.StaffList;
import com.csdj.chainsupermarket.service.shop.staff.StaffService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName StaffServiceImp
 * @Description: 员工Service实现接口
 * @Author 邹捷
 * @Date 2019/12/10
 * @Version V1.0
 **/
@Service("staffService")
@Transactional(rollbackFor = Exception.class)
public class StaffServiceImp implements StaffService {
    @Resource
    private StaffMapper staffMapper;

    @Override
    public Integer addStaff(StaffEmployee staffEmployee,Integer rid) {
        staffMapper.addStaff(staffEmployee);
        staffMapper.addUserRole(staffEmployee.getSfEmployeeId(),rid);
        return staffEmployee.getSfEmployeeId();
    }


    @Override
    public Boolean updateStaff(StaffEmployee staffEmployee,Integer agoRid,Integer rid) {
        if(staffMapper.updateStaff(staffEmployee)>0){
            staffMapper.updateUserRole(staffEmployee.getSfEmployeeId(),agoRid,rid);
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateStaffPassword(Integer sfEmployeeId, String sfPassword) {
        if (staffMapper.updateStaffPassword(sfEmployeeId,sfPassword)>0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean stopStaff(Integer sfEmployeeId) {
        if(staffMapper.stopStaff(sfEmployeeId)>0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteStaff(Integer sfEmployeeId) {
        if(staffMapper.deleteStaff(sfEmployeeId)>0){
            staffMapper.deleteUserRole(sfEmployeeId);
            return true;
        }
        return false;
    }

    @Override
    public List<Role> getRole() {
        return staffMapper.getRole();
    }

    @Override
    public List<ShopMessage> getMessage() {
        return staffMapper.getMessage();
    }

    @Override
    public List<StaffList> getStaffList(Integer sfStoreId, Integer rId, Integer sfAccountId, String sfEmployName, Integer currentPage, Integer pageSize) {
        return staffMapper.getStaffList(sfStoreId,rId,sfAccountId,sfEmployName,currentPage,pageSize);
    }
    @Override
    public Integer countStaff(Integer sfStoreId, Integer rId, Integer sfAccountId, String sfEmployName) {
        return staffMapper.countStaff(sfStoreId,rId,sfAccountId,sfEmployName);
    }
}
