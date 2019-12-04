package com.csdj.chainsupermarket.entity.shop.staff;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName StaffEmployee
 * @Description: 员工实体类
 * @Author 邹捷
 * @Date 2019/11/29
 * @Version V1.0
 **/
public class StaffEmployee implements Serializable {
    /**
     * 员工编号
     */
    private Integer sfEmployeeId;
    /**
     * 店铺id
     */
    private Integer sfStoreId;
    /**
     * 帐号状态
     */
    private Integer sfAccountId;
    /**
     * 电话
     */
    private String sfEmloyeePhone;
    /**
     * 员工姓名
     */
    private String sfEmployName;
    /**
     * 创建时间
     */
    private Date sfCreateTime;
    /**
     * 登录密码
     */
    private String sfPassword;
    /**
     * 保留字段
     */
    private String null1;
    /**
     * 保留字段
     */
    private String null2;
    /**
     * 保留字段
     */
    private String null3;

    public Integer getSfEmployeeId() {
        return sfEmployeeId;
    }

    public void setSfEmployeeId(Integer sfEmployeeId) {
        this.sfEmployeeId = sfEmployeeId;
    }

    public Integer getSfStoreId() {
        return sfStoreId;
    }

    public void setSfStoreId(Integer sfStoreId) {
        this.sfStoreId = sfStoreId;
    }

    public Integer getSfAccountId() {
        return sfAccountId;
    }

    public void setSfAccountId(Integer sfAccountId) {
        this.sfAccountId = sfAccountId;
    }

    public String getSfEmployName() {
        return sfEmployName;
    }

    public void setSfEmployName(String sfEmployName) {
        this.sfEmployName = sfEmployName;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getSfCreateTime() {
        return sfCreateTime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public void setSfCreateTime(Date sfCreateTime) {
        this.sfCreateTime = sfCreateTime;
    }

    public String getSfPassword() {
        return sfPassword;
    }

    public void setSfPassword(String sfPassword) {
        this.sfPassword = sfPassword;
    }

    public String getNull1() {
        return null1;
    }

    public void setNull1(String null1) {
        this.null1 = null1;
    }

    public String getNull2() {
        return null2;
    }

    public void setNull2(String null2) {
        this.null2 = null2;
    }

    public String getNull3() {
        return null3;
    }

    public void setNull3(String null3) {
        this.null3 = null3;
    }

    public StaffEmployee(Integer sfEmployeeId, Integer sfStoreId, Integer sfAccountId, String sfEmloyeePhone, String sfEmployName, Date sfCreateTime, String sfPassword, String null1, String null2, String null3) {
        this.sfEmployeeId = sfEmployeeId;
        this.sfStoreId = sfStoreId;
        this.sfAccountId = sfAccountId;
        this.sfEmloyeePhone = sfEmloyeePhone;
        this.sfEmployName = sfEmployName;
        this.sfCreateTime = sfCreateTime;
        this.sfPassword = sfPassword;
        this.null1 = null1;
        this.null2 = null2;
        this.null3 = null3;
    }

    public String getSfEmloyeePhone() {
        return sfEmloyeePhone;
    }

    public void setSfEmloyeePhone(String sfEmloyeePhone) {
        this.sfEmloyeePhone = sfEmloyeePhone;
    }

    public StaffEmployee() {
    }
}
