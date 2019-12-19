package com.csdj.chainsupermarket.entity.freight;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @ClassName BillFreight
 * @Description 物流表pojo
 * @Author 孤街
 * @Date 2019/12/2 15:34
 * @Version 1.0
 **/
public class BillFreight implements Serializable {
    /**
     * 物流编号
     */
    private Integer billId;

    /**
     * 订单编号
     */
    private Integer billFormId;

    /**
     * 订单价格
     */
    private Double billFormPrice;

    /**
     * 发货地址
     */
    private String billStartAddress;

    /**
     * 到货地址
     */
    private String billEndAddress;

    /**
     * 每公斤价格
     */
    private Double billPrice;

    /**
     * 订单重量
     */
    private Double billWeight;

    /**
     * 物流状态
     */
    private Integer billState;

    /**
     * 运费
     */
    private Double billFreightCharge;

    /**
     * 无参构造
     */
    public BillFreight() {}

    /**
     * 有参构造
     *
     * @param billId            物流编号
     * @param billFormId        订单编号
     * @param billFormPrice     订单价格
     * @param billStartAddress  发货地址
     * @param billEndAddress    到货地址
     * @param billPrice         每公斤价格
     * @param billWeight        订单重量
     * @param billState         物流状态
     * @param billFreightCharge 运费
     */
    public BillFreight(Integer billId, Integer billFormId, Double billFormPrice,
                       String billStartAddress, String billEndAddress, Double billPrice,
                       Double billWeight, Integer billState, Double billFreightCharge) {

        this.billId = billId;
        this.billFormId = billFormId;
        this.billFormPrice = billFormPrice;
        this.billStartAddress = billStartAddress;
        this.billEndAddress = billEndAddress;
        this.billPrice = billPrice;
        this.billWeight = billWeight;
        this.billState = billState;
        this.billFreightCharge = billFreightCharge;
    }

    /**
     * 重写toString()方法
     * @return 返回参数及对应的值
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Integer getBillFormId() {
        return billFormId;
    }

    public void setBillFormId(Integer billFormId) {
        this.billFormId = billFormId;
    }

    public Double getBillFormPrice() {
        return billFormPrice;
    }

    public void setBillFormPrice(Double billFormPrice) {
        this.billFormPrice = billFormPrice;
    }

    public String getBillStartAddress() {
        return billStartAddress;
    }

    public void setBillStartAddress(String billStartAddress) {
        this.billStartAddress = billStartAddress;
    }

    public String getBillEndAddress() {
        return billEndAddress;
    }

    public void setBillEndAddress(String billEndAddress) {
        this.billEndAddress = billEndAddress;
    }

    public Double getBillPrice() {
        return billPrice;
    }

    public void setBillPrice(Double billPrice) {
        this.billPrice = billPrice;
    }

    public Double getBillWeight() {
        return billWeight;
    }

    public void setBillWeight(Double billWeight) {
        this.billWeight = billWeight;
    }

    public Integer getBillState() {
        return billState;
    }

    public void setBillState(Integer billState) {
        this.billState = billState;
    }

    public Double getBillFreightCharge() {
        return billFreightCharge;
    }

    public void setBillFreightCharge(Double billFreightCharge) {
        this.billFreightCharge = billFreightCharge;
    }
}
