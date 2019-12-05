package com.csdj.chainsupermarket.entity.member;

/**
 * @author 向仕懿
 * @date 2019/12/5
 * 会员实体类
 */
public class member {
    /**
     * 用户ID
     */
    private int vipId;
    /**
     * 用户头像
     */
    private String vipImages;
    /**
     * 昵称
     */
    private String vipMname;
    /**
     * 身份
     */
    private String vipPosition;
    /**
     * 性别（0为男，1为女）
     */
    private int vipSex;
    /**
     * 手机号码
     */
    private String vipPhone;
    /**
     * 消费次数
     */
    private int vipNumber;
    /**
     * 起始时间
     */
    private String vipCreate;
    /**
     * 结束时间
     */
    private String vipModified;
    /**
     * 会员积分
     */
    private int vipIntegral;
    /**
     * 创建时间
     */
    private String gmtCreate;
    /**
     * 修改时间
     */
    private String gmtModifed;
    /**
     * 会员卡号
     */
    private String vipCard;
    /**
     * 线下钱包
     */
    private double vipBalance;
    /**
     * 家庭地址
     */
    private String vipAddress;


    public member(int vipId, String vipImages, String vipMname, String vipPosition, int vipSex, String vipPhone, int vipNumber, String vipCreate, String vipModified, int vipIntegral, String gmtCreate, String gmtModifed, String vipCard, double vipBalance, String vipAddress) {
        this.vipId = vipId;
        this.vipImages = vipImages;
        this.vipMname = vipMname;
        this.vipPosition = vipPosition;
        this.vipSex = vipSex;
        this.vipPhone = vipPhone;
        this.vipNumber = vipNumber;
        this.vipCreate = vipCreate;
        this.vipModified = vipModified;
        this.vipIntegral = vipIntegral;
        this.gmtCreate = gmtCreate;
        this.gmtModifed = gmtModifed;
        this.vipCard = vipCard;
        this.vipBalance = vipBalance;
        this.vipAddress = vipAddress;
    }

    public member() {
    }

    public int getVipId() {
        return vipId;
    }

    public String getVipImages() {
        return vipImages;
    }

    public String getVipMname() {
        return vipMname;
    }

    public String getVipPosition() {
        return vipPosition;
    }

    public int getVipSex() {
        return vipSex;
    }

    public String getVipPhone() {
        return vipPhone;
    }

    public int getVipNumber() {
        return vipNumber;
    }

    public String getVipCreate() {
        return vipCreate;
    }

    public String getVipModified() {
        return vipModified;
    }

    public int getVipIntegral() {
        return vipIntegral;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public String getGmtModifed() {
        return gmtModifed;
    }

    public String getVipCard() {
        return vipCard;
    }

    public double getVipBalance() {
        return vipBalance;
    }

    public String getVipAddress() {
        return vipAddress;
    }

    public void setVipId(int vipId) {
        this.vipId = vipId;
    }

    public void setVipImages(String vipImages) {
        this.vipImages = vipImages;
    }

    public void setVipMname(String vipMname) {
        this.vipMname = vipMname;
    }

    public void setVipPosition(String vipPosition) {
        this.vipPosition = vipPosition;
    }

    public void setVipSex(int vipSex) {
        this.vipSex = vipSex;
    }

    public void setVipPhone(String vipPhone) {
        this.vipPhone = vipPhone;
    }

    public void setVipNumber(int vipNumber) {
        this.vipNumber = vipNumber;
    }

    public void setVipCreate(String vipCreate) {
        this.vipCreate = vipCreate;
    }

    public void setVipModified(String vipModified) {
        this.vipModified = vipModified;
    }

    public void setVipIntegral(int vipIntegral) {
        this.vipIntegral = vipIntegral;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setGmtModifed(String gmtModifed) {
        this.gmtModifed = gmtModifed;
    }

    public void setVipCard(String vipCard) {
        this.vipCard = vipCard;
    }

    public void setVipBalance(double vipBalance) {
        this.vipBalance = vipBalance;
    }

    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
    }
}
