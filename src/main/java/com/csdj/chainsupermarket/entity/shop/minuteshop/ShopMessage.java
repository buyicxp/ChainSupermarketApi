package com.csdj.chainsupermarket.entity.shop.minuteshop;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ClassName ShopMessage
 * @Description: 门店实体类
 * @Author 刘时钟
 * @Date 2019/12/2
 * @Version V1.0
 **/
public class ShopMessage {
    /**
     *门店id
     */
    private Integer spId;
    /**
     *门店名称
     */
    private String spName;
    /**
     *城市地址
     */
    private String spCity;
    /**
     *店长
     */
    private String spShopmanager;
    /**
     *手机号
     */
    private String spPhone;
    /**
     *营业状态
     */
    private String spOperating;
    /**
     *创建时间
     */
    private Date spCreationtime;
    /**
     *初始密码
     */
    private String spInitialpass;
    /**
     *门店电话
     */
    private String spShopphone;
    /**
     *门店地址
     */
    private String spAddress;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public String getSpCity() {
        return spCity;
    }

    public void setSpCity(String spCity) {
        this.spCity = spCity;
    }

    public String getSpShopmanager() {
        return spShopmanager;
    }

    public void setSpShopmanager(String spShopmanager) {
        this.spShopmanager = spShopmanager;
    }

    public String getSpPhone() {
        return spPhone;
    }

    public void setSpPhone(String spPhone) {
        this.spPhone = spPhone;
    }

    public String getSpOperating() {
        return spOperating;
    }

    public void setSpOperating(String spOperating) {
        this.spOperating = spOperating;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getSpCreationtime() {
        return spCreationtime;
    }
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public void setSpCreationtime(Date spCreationtime) {
        this.spCreationtime = spCreationtime;
    }

    public String getSpInitialpass() {
        return spInitialpass;
    }

    public void setSpInitialpass(String spInitialpass) {
        this.spInitialpass = spInitialpass;
    }

    public String getSpShopphone() {
        return spShopphone;
    }

    public void setSpShopphone(String spShopphone) {
        this.spShopphone = spShopphone;
    }

    public String getSpAddress() {
        return spAddress;
    }

    public void setSpAddress(String spAddress) {
        this.spAddress = spAddress;
    }
}
