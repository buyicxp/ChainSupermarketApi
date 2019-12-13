package com.csdj.chainsupermarket.entity.article;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.entity
 * @ClassName: ArticleType
 * 文章类别表
 * @Author: 王一翰
 * @Date: 2019/12/3 10:14
 */
public class ArticleType {
    /**
     * ID,主键
     */
    private  int artId;
    /**
     * 类别名称
     */
    private String tcategoryName;
    /**
     * 上级分类
     */
    private String tsuperiorCategory;
    /**
     * 分类简述
     */
    private String tsketch;
    /**
     * 录入时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date tcreate;
    /**
     * 是否可见
     */
    private  int artJudge;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date gmtCreate;
    /**
     * 修改时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date gmtModifed;

    public int getArtId() {
        return artId;
    }

    public void setArtId(int artId) {
        this.artId = artId;
    }

    public String getTcategoryName() {
        return tcategoryName;
    }

    public void setTcategoryName(String tcategoryName) {
        this.tcategoryName = tcategoryName;
    }

    public String getTsuperiorCategory() {
        return tsuperiorCategory;
    }

    public void setTsuperiorCategory(String tsuperiorCategory) {
        this.tsuperiorCategory = tsuperiorCategory;
    }

    public String getTsketch() {
        return tsketch;
    }

    public void setTsketch(String tsketch) {
        this.tsketch = tsketch;
    }

    public Date getTcreate() {
        return tcreate;
    }

    public void setTcreate(Date tcreate) {
        this.tcreate = tcreate;
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

    public Date getGmtModifed() {
        return gmtModifed;
    }

    public void setGmtModifed(Date gmtModifed) {
        this.gmtModifed = gmtModifed;
    }

}
