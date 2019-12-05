package com.csdj.chainsupermarket.entity.orderform;

import com.csdj.chainsupermarket.entity.member.member;

/**
 * @author 向仕懿
 * @date 2019/12/4
 * 订单实体类
 */
public class billConclude {

    /**
     * id
     */
    private int id;

    /**
     * 订单编号
     */
    private int conConclude;

    /**
     * 商品名称
     */
    private String tradeName;

    /**
     *商品数量
     */
    private String conNumber;

    /**
     * 实付金额
     */
    private double conMoney;

    /**
     * 会员表主键
     */
    private member userId;

    /**
     *订单状态
     */
    private int conStatus;

    /**
     * 支付状态
     */
    private int conDefray;

    /**
     * 配送ID，外键，引用配送表
     */
    private int disId;

    /**
     * 下单时间
     */
    private String conTime;

    /**
     * 删除状态
     */
    private int del;

    public billConclude() {
    }

    public billConclude(int id, int conConclude, String tradeName, String conNumber, double conMoney, member userId, int conStatus, int conDefray, int disId, String conTime, int del) {
        this.id = id;
        this.conConclude = conConclude;
        this.tradeName = tradeName;
        this.conNumber = conNumber;
        this.conMoney = conMoney;
        this.userId = userId;
        this.conStatus = conStatus;
        this.conDefray = conDefray;
        this.disId = disId;
        this.conTime = conTime;
        this.del = del;
    }

    public int getId() {
        return id;
    }

    public int getConConclude() {
        return conConclude;
    }

    public String getTradeName() {
        return tradeName;
    }

    public String getConNumber() {
        return conNumber;
    }

    public double getConMoney() {
        return conMoney;
    }

    public member getUserId() {
        return userId;
    }

    public int getConStatus() {
        return conStatus;
    }

    public int getConDefray() {
        return conDefray;
    }

    public int getDisId() {
        return disId;
    }

    public String getConTime() {
        return conTime;
    }

    public int getDel() {
        return del;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setConConclude(int conConclude) {
        this.conConclude = conConclude;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public void setConNumber(String conNumber) {
        this.conNumber = conNumber;
    }

    public void setConMoney(double conMoney) {
        this.conMoney = conMoney;
    }

    public void setUserId(member userId) {
        this.userId = userId;
    }

    public void setConStatus(int conStatus) {
        this.conStatus = conStatus;
    }

    public void setConDefray(int conDefray) {
        this.conDefray = conDefray;
    }

    public void setDisId(int disId) {
        this.disId = disId;
    }

    public void setConTime(String conTime) {
        this.conTime = conTime;
    }

    public void setDel(int del) {
        this.del = del;
    }
}
