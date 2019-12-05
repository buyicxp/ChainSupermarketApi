package src.main.java.com.csdj.chainsupermarket.entity.commodity;

/**
 * 产品实体类
 */
public class GoodsCommodity {
    /**
     * 主键ID
     */
    private int id;
    /**
     * 颜色ID
     */
    private int colorId;
    /**
     * 尺码ID
     */
    private int sizeId;
    /**
     * 产品详情ID
     */
    private int detailsId;
    /**
     * 对应活动
     */
    private int activityId;
    /**
     * 产品名称
     */
    private String goodsName;
    /**
     * 卖点标题
     */
    private  int goodsTitle;
    /**
     * 产品分类ID，外键，引用商品分类表
     */
    private int ccategoryId;
    /**
     * 商品码，唯一不重复
     */
    private String goodsCode;
    /**
     * 产品图片路径
     */
    private String picturepath;
    /**
     * 产品大图路径
     */
    private String bigpicturepath;
    /**
     * 录入时间
     */
    private String createdate;
    /**
     * 活动价
     */
    private double activityprice;
    /**
     * 价格/单位
     */
    private double price;
    /**
     * 产品重量
     */
    private double weight;
    /**
     * 是否参加活动(0未参加,1已参加) 默认0
     */
    private int condition;
}
