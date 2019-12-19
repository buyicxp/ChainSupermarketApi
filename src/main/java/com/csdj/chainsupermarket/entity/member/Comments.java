package com.csdj.chainsupermarket.entity.member;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.entity.member
 * @ClassName: Comments
 * @Author: 姜某某
 * @Date: 2019/12/5 10:24
 */
public class Comments {

    /** 时间转换 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")

    /**
     * id */
    private Long id;
    /**
     * 会员ID */
    private Long memberId;
    /**
     * 类型ID */
    private Long typeId;
    /**
     *  联系人 */
    private String linkman;
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
     *  评论图片 */
    private String images;
    /**
     *  创建时间 */
    private Date gmtCreate;
    /**
     *  结束时间 */
    private Date gmtModifed;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
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
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreate() {
        return create;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setCreate(Date create) {
        this.create = create;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getGmtCreate() {
        return gmtCreate;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getGmtModifed() {
        return gmtModifed;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setGmtModifed(Date gmtModifed) {
        this.gmtModifed = gmtModifed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", typeId=").append(typeId);
        sb.append(", linkman=").append(linkman);
        sb.append(", starred=").append(starred);
        sb.append(", commentContent=").append(commentContent);
        sb.append(", replyContent=").append(replyContent);
        sb.append(", create=").append(create);
        sb.append(", images=").append(images);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModifed=").append(gmtModifed);
        sb.append(", state=").append(state);
        sb.append("]");
        return sb.toString();
    }
}
