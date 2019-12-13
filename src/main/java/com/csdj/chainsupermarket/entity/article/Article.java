package com.csdj.chainsupermarket.entity.article;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.entity.article
 * @ClassName: article
 * @Author: 王一翰
 * @Date: 2019/12/6 9:18
 * 文章列表
 */
public class Article {
    /**
     *用户ID
     */
    private int artId;
    /**
     *用户头像路径
     */
    private String artImages;
    /**
     *资讯名称
     */
    private String artName;
    /**
     *所属分类
     */
    private int artCategoryId;
    /**
     *排序
     */
    private int  artSort;
    /**
     *录入时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date artCreate;
    /**
     *创建时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date gmtModifed;
    /**
     *是否可见
     */
    private int artJudge;
    /**
     *修改时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date gmtCreate;
    /**
     *内容
     */
    private String artContent;


    /**
     * 一对一 文章类型对应文章分类
     * 类型 文章分类
     */
    private ArticleType articleType;

    public ArticleType getArticleType() {
        return articleType;
    }

    public void setArticleType(ArticleType articleType) {
        this.articleType = articleType;
    }
    public int getArtId() {
        return artId;
    }

    public void setArtId(int artId) {
        this.artId = artId;
    }

    public String getArtImages() {
        return artImages;
    }

    public void setArtImages(String artImages) {
        this.artImages = artImages;
    }

    public String getArtName() {
        return artName;
    }

    public void setArtName(String artName) {
        this.artName = artName;
    }

    public int getArtCategoryId() {
        return artCategoryId;
    }

    public void setArtCategoryId(int artCategoryId) {
        this.artCategoryId = artCategoryId;
    }

    public int getArtSort() {
        return artSort;
    }

    public void setArtSort(int artSort) {
        this.artSort = artSort;
    }

    public Date getArtCreate() {
        return artCreate;
    }

    public void setArtCreate(Date artCreate) {
        this.artCreate = artCreate;
    }

    public Date getGmtModifed() {
        return gmtModifed;
    }

    public void setGmtModifed(Date gmtModifed) {
        this.gmtModifed = gmtModifed;
    }

    public int getArtJudge() {
        return artJudge;
    }

    public void setArtJudge(int artJudge) {
        this.artJudge = artJudge;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getArtContent() {
        return artContent;
    }

    public void setArtContent(String artContent) {
        this.artContent = artContent;
    }
}
