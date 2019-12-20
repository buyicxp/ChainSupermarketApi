package com.csdj.chainsupermarket.entity.commodity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.util.Date;

/**
 * @ClassName CommodityPub
 * @Description: 索引库
 * @Author 唐浪
 * @Date 2019/12/5
 * @Version V1.0
 **/
@Document(indexName = "supermark10", type = "doc")
@Data
public class CommodityPub {
    /**
     * 主键ID
     */
    private int id;
    /**
     *产品ID
     */
    private int goods_id;
    /**
     *产品详情
     */
    private String details;
    /**
     *产品名称
     */
    private String goods_name;
    /**
     *卖点标题
     */
    private String goods_title;
    /**
     *产品图片路径
     */
    private String picture_path;
    /**
     *录入时间
     */
    private Date create_date;
    /**
     *活动价
     */
    private double activity_price;
    /**
     *价格/单位
     */
    private double price;
    /**
     *是否参加活动(0未参加,1已参加)
     */
    private int condition;
    /**
     *上下架状态（上0，下1）
     */
    private int upper_down;
    /**
     *删除状态（未删0，已删1）
     */
    private int drop;
    /**
     * 产品分类
     */
    private String category;
    /**
     * 时间戳
     */
    private Date timestamp;
    /**
     * 初始构造方法
     */
    public CommodityPub() {
    }
}
