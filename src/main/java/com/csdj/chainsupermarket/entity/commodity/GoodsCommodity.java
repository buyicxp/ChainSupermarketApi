package com.csdj.chainsupermarket.entity.commodity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 商品信息
 * @author 温朝明
 * @date 2019/12/10
 */
public class GoodsCommodity{
    /**
     *主键ID
     */
    private int id;

    /**
     *颜色ID
     */
    private int colorId;

    /**
     *尺码ID
     */
    private int sizeId;

    /**
     *商品详情
     */
    private String details;

    /**
     *对应活动
     */
    private int activityId;

    /**
     *产品名称
     */
    private String goodsName;

    /**
     *卖点标题
     */
    private  String goodsTitle;

    /**
     *产品分类ID，外键，引用商品分类表
     */
    private int ccategoryId;

    /**
     *商品码，唯一不重复
     */
    private String goodsCode;

    /**
     *产品图片路径
     */
    private String picturepath;

    /**
     *产品大图路径
     */
    private String bigpicturepath;

    /**
     *录入时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd-hh-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd-hh-mm-ss")
    private Date createdate;

    /**
     * 活动价
     */
    private double activityprice;

    /**
     *价格/单位
     */
    private double price;

    /**
     *产品重量
     */
    private double weight;

    /**
     *是否参加活动(0未参加,1已参加) 默认0
     */
    private int condition;

    /**
     *类型名称
     */
    private String typeName;

    /**
     *上下架状态
     */
    private int upperDown;

    /**
     *限时活动
     */
    private int bounds;

    /**
     *预售活动
     */
    private int presell;

    /**
     *删除状态
     */
    private int del;

    public int getBounds() {
        return bounds;
    }

    public void setBounds(int bounds) {
        this.bounds = bounds;
    }

    public int getPresell() {
        return presell;
    }

    public void setPresell(int presell) {
        this.presell = presell;
    }

    public int getUpperDown() {
        return upperDown;
    }

    public void setUpperDown(int upperDown) {
        this.upperDown = upperDown;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetailsId(String details) {
        this.details = details;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public int getCcategoryId() {
        return ccategoryId;
    }

    public void setCcategoryId(int ccategoryId) {
        this.ccategoryId = ccategoryId;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getPicturepath() {
        return picturepath;
    }

    public void setPicturepath(String picturepath) {
        this.picturepath = picturepath;
    }

    public String getBigpicturepath() {
        return bigpicturepath;
    }

    public void setBigpicturepath(String bigpicturepath) {
        this.bigpicturepath = bigpicturepath;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public double getActivityprice() {
        return activityprice;
    }

    public void setActivityprice(double activityprice) {
        this.activityprice = activityprice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }
}
