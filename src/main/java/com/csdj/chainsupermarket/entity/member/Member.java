package com.csdj.chainsupermarket.entity.member;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author 姜佳豪
 * @date 2019/12/5
 * 会员
 */
public class Member {
    /** 时间转换 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")

    /** 用户ID */
    private Long vipId;
    /** 用户头像 */
    private String vipImages;
    /** 昵称 */
    private String vipMname;
    /** 身份 */
    private String vipPosition;
    /** 性别（0为男，1为女） */
    private Integer vipSex;
    /** 手机号码 */
    private String vipPhone;
    /** 消费次数 */
    private Integer vipNumber;
    /** 起始时间 */
    private Date vipCreate;
    /** 结束时间 */
    private Date vipModified;
    /** 会员积分 */
    private Integer vipIntegral;
    /** 创建时间 */
    private Date gmtCreate;
    /** 末尾时间 */
    private Date gmtModifed;
    /** 会员卡号 */
    private String vipCard;
    /** 线下钱包 */
    private Double vipBalance;
    /** 家庭地址 */
    private String vipAddress;

    public Long getVipId() {
        return vipId;
    }

    public void setVipId(Long vipId) {
        this.vipId = vipId;
    }

    public String getVipImages() {
        return vipImages;
    }

    public void setVipImages(String vipImages) {
        this.vipImages = vipImages == null ? null : vipImages.trim();
    }

    public String getVipMname() {
        return vipMname;
    }

    public void setVipMname(String vipMname) {
        this.vipMname = vipMname == null ? null : vipMname.trim();
    }

    public String getVipPosition() {
        return vipPosition;
    }

    public void setVipPosition(String vipPosition) {
        this.vipPosition = vipPosition == null ? null : vipPosition.trim();
    }

    public Integer getVipSex() {
        return vipSex;
    }

    public void setVipSex(Integer vipSex) {
        this.vipSex = vipSex;
    }

    public String getVipPhone() {
        return vipPhone;
    }

    public void setVipPhone(String vipPhone) {
        this.vipPhone = vipPhone == null ? null : vipPhone.trim();
    }

    public Integer getVipNumber() {
        return vipNumber;
    }

    public void setVipNumber(Integer vipNumber) {
        this.vipNumber = vipNumber;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getVipCreate() {
        return vipCreate;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setVipCreate(Date vipCreate) {
        this.vipCreate = vipCreate;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getVipModified() {
        return vipModified;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setVipModified(Date vipModified) {
        this.vipModified = vipModified;
    }

    public Integer getVipIntegral() {
        return vipIntegral;
    }

    public void setVipIntegral(Integer vipIntegral) {
        this.vipIntegral = vipIntegral;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getGmtCreate() {
        return gmtCreate;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getGmtModifed() {
        return gmtModifed;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setGmtModifed(Date gmtModifed) {
        this.gmtModifed = gmtModifed;
    }

    public String getVipCard() {
        return vipCard;
    }

    public void setVipCard(String vipCard) {
        this.vipCard = vipCard == null ? null : vipCard.trim();
    }

    public Double getVipBalance() {
        return vipBalance;
    }

    public void setVipBalance(Double vipBalance) {
        this.vipBalance = vipBalance;
    }

    public String getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress == null ? null : vipAddress.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vipId=").append(vipId);
        sb.append(", vipImages=").append(vipImages);
        sb.append(", vipMname=").append(vipMname);
        sb.append(", vipPosition=").append(vipPosition);
        sb.append(", vipSex=").append(vipSex);
        sb.append(", vipPhone=").append(vipPhone);
        sb.append(", vipNumber=").append(vipNumber);
        sb.append(", vipCreate=").append(vipCreate);
        sb.append(", vipModified=").append(vipModified);
        sb.append(", vipIntegral=").append(vipIntegral);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModifed=").append(gmtModifed);
        sb.append(", vipCard=").append(vipCard);
        sb.append(", vipBalance=").append(vipBalance);
        sb.append(", vipAddress=").append(vipAddress);
        sb.append("]");
        return sb.toString();
    }
}
