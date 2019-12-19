package com.csdj.chainsupermarket.controller.shop.staff;

import com.csdj.chainsupermarket.entity.shiro.Role;
import com.csdj.chainsupermarket.entity.shop.minuteshop.ShopMessage;
import com.csdj.chainsupermarket.entity.shop.staff.StaffEmployee;
import com.csdj.chainsupermarket.entity.shop.staff.StaffList;
import com.csdj.chainsupermarket.service.shop.staff.StaffService;
import com.csdj.chainsupermarket.util.shiro.Ciphertext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName StaffController
 * @Description: 员工controller
 * @Author 邹捷
 * @Date 2019/12/10
 * @Version V1.0
 **/
@RequestMapping("/Staff")
@RestController
@CrossOrigin
public class StaffController {
    @Resource
    private StaffService staffService;

    @RequestMapping("/getRole")
    public List<Role> getRole() {
        return staffService.getRole();
    }

    @RequestMapping("/getMessage")
    public List<ShopMessage> getMessage() {
        return staffService.getMessage();
    }

    @RequestMapping("/addStaff")
    public Integer addStaff(StaffEmployee staffEmployee, Integer rid) {
        staffEmployee.setSfPassword(Ciphertext.getCiphertext(staffEmployee.getSfPassword(), staffEmployee.getSfEmloyeePhone()));
        return staffService.addStaff(staffEmployee, rid);
    }

    @RequestMapping("/updateStaff")
    public Boolean updateStaff(StaffEmployee staffEmployee, Integer agoRid, Integer rid) {
        return staffService.updateStaff(staffEmployee, agoRid, rid);
    }

    @RequestMapping("/updateStaffPassword")
    public Boolean updateStaffPassword(Integer sfEmployeeId, String sfPassword, String sfEmloyeePhone) {
        sfPassword = Ciphertext.getCiphertext(sfPassword, sfEmloyeePhone);
        return staffService.updateStaffPassword(sfEmployeeId, sfPassword);
    }

    @RequestMapping("/stopStaff")
    public Boolean stopStaff(Integer sfEmployeeId) {
        return staffService.stopStaff(sfEmployeeId);
    }

    @RequestMapping("/deleteStaff")
    public Boolean deleteStaff(Integer sfEmployeeId) {
        return staffService.deleteStaff(sfEmployeeId);
    }

    @RequestMapping("/countStaff")
    public Integer countStaff(Integer sfStoreId, Integer rId, Integer sfAccountId, String sfEmployName) {
        if (sfAccountId != null) {
            sfAccountId = sfAccountId == 2 ? null : sfAccountId;
        }
        return staffService.countStaff(sfStoreId, rId, sfAccountId, sfEmployName);
    }

    @RequestMapping("/getStaffList")
    public List<StaffList> getStaffList(Integer sfStoreId, Integer rId, Integer sfAccountId, String sfEmployName, Integer currentPage, Integer pageSize) {
        if (sfAccountId != null) {
            sfAccountId = sfAccountId == 2 ? null : sfAccountId;
        }
        return staffService.getStaffList(sfStoreId, rId, sfAccountId, sfEmployName, (currentPage - 1) * pageSize, pageSize);
    }

}
