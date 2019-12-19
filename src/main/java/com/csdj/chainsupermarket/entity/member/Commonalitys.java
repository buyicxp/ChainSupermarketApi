package com.csdj.chainsupermarket.entity.member;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.entity.member
 * @ClassName: Commonalitys
 * @Author: 姜某某
 * @Date: 2019/12/10 15:09
 * 公共的实体类
 * 关于会员评论
 */
public class Commonalitys implements Serializable {

    /** 时间转换 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")

    /**
     * 用户ID */
    private Long vipId;
    /**
     * 会员评论id */
    private Long id;
    /**
     *  用户头像 */
    private String vipImages;
    /**
     *  昵称 */
    private String vipMname;
    /**
     * 会员ID */
    private Long memberId;
    /**
     * 类型ID */
    private Long typeId;
    /**
     *  星级 */
    private Integer starred;
    /**
     *  评论内容 */
    private String commentContent;
    /**
     *  回复内容 */
    private String replyContent;
    /**
     * 状态
     */
    private Integer state;
    /**
     *  录入时间 */
    private Date create;
    /**
     * 类型ID */
    private Long comId;
    /**
     *  类型 */
    private String comoType;

    /**
     * 传参2 */
    private Object alls;

    /**
     * 传参1 */
    private Object all;

    public Object getAll() {
        return all;
    }

    public void setAll(Object all) {
        this.all = all;
    }

    public Object getAlls() {
        return alls;
    }

    public void setAlls(Object alls) {
        this.alls = alls;
    }

    public Long getVipId() {
        return vipId;
    }

    public void setVipId(Long vipId) {
        this.vipId = vipId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVipImages() {
        return vipImages;
    }

    public void setVipImages(String vipImages) {
        this.vipImages = vipImages;
    }

    public String getVipMname() {
        return vipMname;
    }

    public void setVipMname(String vipMname) {
        this.vipMname = vipMname;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Integer getStarred() {
        return starred;
    }

    public void setStarred(Integer starred) {
        this.starred = starred;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreate() {
        return create;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setCreate(Date create) {
        this.create = create;
    }

    public Long getComId() {
        return comId;
    }

    public void setComId(Long comId) {
        this.comId = comId;
    }

    public String getComoType() {
        return comoType;
    }

    public void setComoType(String comoType) {
        this.comoType = comoType;
    }
}
