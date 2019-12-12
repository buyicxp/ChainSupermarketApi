package com.csdj.chainsupermarket.entity.commodity;

/**
 * @author 尹嘉丽
 * @date 2019-12-10
 * 产品表
 */
public class GoodsProduct {
    /**
     * 产品表编号
     */
    private int id;
    /**
     * 颜色表编号
     */
    private int colorId;
    /**
     * 尺码表编号
     */
    private int sizeId;
    /**
     * 产品详情表编号
     */
    private String details;
    /**
     * 产品名称
     */
    private String goodsName;
    /**
     * 产品卖点标题
     */
    private String goodsTitle;
    /**
     * 产品分类表编号
     */
    private int categoryId;
    /**
     * 商品码
     */
    private String goodsCode;
    /**
     * 产品图片路径
     */
    private String picturePath;
    /**
     * 产品大图路径
     */
    private String bigPicturePath;
    /**
     * 产品录入时间
     */
    private String createDate;
    /**
     * 产品价格
     */
    private double price;
    /**
     * 产品活动价格
     */
    private double activityPrice;
    /**
     * 产品重量
     */
    private double weigth;
    /**
     * 锁定库存
     */
    private int locking;
    /**
     * 已购库存
     */
    private int already;
    /**
     * 配送id
     */
    private int disId;
    /**
     * 拼团活动编号
     */
    private int activityId;
    /**
     * 限时活动编号
     */
    private int bounds;
    /**
     * 预售活动编号
     */
    private int presell;
    /**
     * 产品上下架 上0下1
     */
    private int upperDowm;
    /**
     * 删除状态 未删0 已删除1
     */
    private int del;

    /**
     * 无参构造
     */
    public GoodsProduct() {
    }

    public GoodsProduct(int id, int colorId, int sizeId, String details, String goodsName, String goodsTitle, int categoryId, String goodsCode, String picturePath, String bigPicturePath, String createDate, double price, double activityPrice, double weigth, int locking, int already, int disId, int activityId, int bounds, int presell, int upperDowm, int del) {
        this.id = id;
        this.colorId = colorId;
        this.sizeId = sizeId;
        this.details = details;
        this.goodsName = goodsName;
        this.goodsTitle = goodsTitle;
        this.categoryId = categoryId;
        this.goodsCode = goodsCode;
        this.picturePath = picturePath;
        this.bigPicturePath = bigPicturePath;
        this.createDate = createDate;
        this.price = price;
        this.activityPrice = activityPrice;
        this.weigth = weigth;
        this.locking = locking;
        this.already = already;
        this.disId = disId;
        this.activityId = activityId;
        this.bounds = bounds;
        this.presell = presell;
        this.upperDowm = upperDowm;
        this.del = del;
    }

    @Override
    public String toString() {
        return "GoodsProduct{" +
                "id=" + id +
                ", colorId=" + colorId +
                ", sizeId=" + sizeId +
                ", details='" + details + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsTitle='" + goodsTitle + '\'' +
                ", categoryId=" + categoryId +
                ", goodsCode='" + goodsCode + '\'' +
                ", picturePath='" + picturePath + '\'' +
                ", bigPicturePath='" + bigPicturePath + '\'' +
                ", createDate='" + createDate + '\'' +
                ", price=" + price +
                ", activityPrice=" + activityPrice +
                ", weigth=" + weigth +
                ", locking=" + locking +
                ", already=" + already +
                ", disId=" + disId +
                ", activityId=" + activityId +
                ", bounds=" + bounds +
                ", presell=" + presell +
                ", upperDowm=" + upperDowm +
                ", del=" + del +
                '}';
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

    public void setDetails(String details) {
        this.details = details;
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

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getBigPicturePath() {
        return bigPicturePath;
    }

    public void setBigPicturePath(String bigPicturePath) {
        this.bigPicturePath = bigPicturePath;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(double activityPrice) {
        this.activityPrice = activityPrice;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public int getLocking() {
        return locking;
    }

    public void setLocking(int locking) {
        this.locking = locking;
    }

    public int getAlready() {
        return already;
    }

    public void setAlready(int already) {
        this.already = already;
    }

    public int getDisId() {
        return disId;
    }

    public void setDisId(int disId) {
        this.disId = disId;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

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

    public int getUpperDowm() {
        return upperDowm;
    }

    public void setUpperDowm(int upperDowm) {
        this.upperDowm = upperDowm;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }
}
