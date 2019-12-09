package com.csdj.chainsupermarket.entity.freight;

/**
 * @author 向仕懿
 * @date 2019/12/5 0005 上午 10:09
 * 物流实体类
 */
public class freight {
    /**
     * 物流编号
     */
    private int billId;
    /**
     *订单编号
     */
    private int billFormId;

    /**
     *订单价格
     */
    private int billFormPrice;

    /**
     *发货地址
     */
    private int billStartAddress;

    /**
     *到货地址
     */
    private int billEndAddress;

    /**
     *每公斤价格
     */
    private int BillPrice;

    /**
     *订单重量
     */
    private int Bill_weight;

    /**
     *0：未发货1：已发货
     */
    private int Bill_State;

    /**
     * 运费
     */
    private double BillFreightCharge;

    public freight() {
    }

    public freight(int billId, int billFormId, int billFormPrice, int billStartAddress, int billEndAddress, int billPrice, int bill_weight, int bill_State, double billFreightCharge) {
        this.billId = billId;
        this.billFormId = billFormId;
        this.billFormPrice = billFormPrice;
        this.billStartAddress = billStartAddress;
        this.billEndAddress = billEndAddress;
        BillPrice = billPrice;
        Bill_weight = bill_weight;
        Bill_State = bill_State;
        BillFreightCharge = billFreightCharge;
    }

    public int getBillId() {
        return billId;
    }

    public int getBillFormId() {
        return billFormId;
    }

    public int getBillFormPrice() {
        return billFormPrice;
    }

    public int getBillStartAddress() {
        return billStartAddress;
    }

    public int getBillEndAddress() {
        return billEndAddress;
    }

    public int getBillPrice() {
        return BillPrice;
    }

    public int getBill_weight() {
        return Bill_weight;
    }

    public int getBill_State() {
        return Bill_State;
    }

    public double getBillFreightCharge() {
        return BillFreightCharge;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public void setBillFormId(int billFormId) {
        this.billFormId = billFormId;
    }

    public void setBillFormPrice(int billFormPrice) {
        this.billFormPrice = billFormPrice;
    }

    public void setBillStartAddress(int billStartAddress) {
        this.billStartAddress = billStartAddress;
    }

    public void setBillEndAddress(int billEndAddress) {
        this.billEndAddress = billEndAddress;
    }

    public void setBillPrice(int billPrice) {
        BillPrice = billPrice;
    }

    public void setBill_weight(int bill_weight) {
        Bill_weight = bill_weight;
    }

    public void setBill_State(int bill_State) {
        Bill_State = bill_State;
    }

    public void setBillFreightCharge(double billFreightCharge) {
        BillFreightCharge = billFreightCharge;
    }
}
