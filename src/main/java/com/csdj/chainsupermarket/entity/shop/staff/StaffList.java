package com.csdj.chainsupermarket.entity.shop.staff;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ClassName StaffList
 * @Description: 员工查询列表
 * @Author 邹捷
 * @Date 2019/12/10
 * @Version V1.0
 **/
public class StaffList {
    private Integer sfEmployeeId;
    private Integer id;
    private Integer spId;
    private String sfEmployName;
    private String sfEmloyeePhone;
    private String spName;
    private String name;
    private Integer sfAccountId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date sfCreateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public Integer getSfEmployeeId() {
        return sfEmployeeId;
    }

    public void setSfEmployeeId(Integer sfEmployeeId) {
        this.sfEmployeeId = sfEmployeeId;
    }

    public String getSfEmployName() {
        return sfEmployName;
    }

    public void setSfEmployName(String sfEmployName) {
        this.sfEmployName = sfEmployName;
    }

    public String getSfEmloyeePhone() {
        return sfEmloyeePhone;
    }

    public void setSfEmloyeePhone(String sfEmloyeePhone) {
        this.sfEmloyeePhone = sfEmloyeePhone;
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSfAccountId() {
        return sfAccountId;
    }

    public void setSfAccountId(Integer sfAccountId) {
        this.sfAccountId = sfAccountId;
    }

    public Date getSfCreateTime() {
        return sfCreateTime;
    }

    public void setSfCreateTime(Date sfCreateTime) {
        this.sfCreateTime = sfCreateTime;
    }

    public StaffList() {
    }

    public StaffList(Integer sfEmployeeId, Integer id, Integer spId, String sfEmployName, String sfEmloyeePhone, String spName, String name, Integer sfAccountId, Date sfCreateTime) {
        this.sfEmployeeId = sfEmployeeId;
        this.id = id;
        this.spId = spId;
        this.sfEmployName = sfEmployName;
        this.sfEmloyeePhone = sfEmloyeePhone;
        this.spName = spName;
        this.name = name;
        this.sfAccountId = sfAccountId;
        this.sfCreateTime = sfCreateTime;
    }
}
