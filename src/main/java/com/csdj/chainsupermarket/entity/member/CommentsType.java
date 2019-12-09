package com.csdj.chainsupermarket.entity.member;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.entity.member
 * @ClassName: CommentsType
 * @Author: 姜某某
 * @Date: 2019/12/5 10:26
 * 会员评论类型
 */
public class CommentsType {

    /** 时间转换 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")

    /** 类型ID */
    private Long comId;
    /** 类型 */
    private String comoType;
    /** 创建时间 */
    private Date gmtCreate;
    /** 结束时间 */
    private Date gmtModifed;

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
        this.comoType = comoType == null ? null : comoType.trim();
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
        sb.append(", comId=").append(comId);
        sb.append(", comoType=").append(comoType);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModifed=").append(gmtModifed);
        sb.append("]");
        return sb.toString();
    }
}
