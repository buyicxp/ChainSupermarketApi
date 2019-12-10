package com.csdj.chainsupermarket.entity.commodity;

import com.csdj.chainsupermarket.util.goodstype.DataTree;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * @author: 邹泓广
 * @date: 2019/12/5
 * 商品类型表
 */
public class GoodsType implements DataTree<GoodsType> {
    /**
     * 商品类型序号
     */
    private Integer id;
    /**
     * 类型名称
     */
    private String typename;
    /**
     * 类型商品数量
     */
    private int typecount;
    /**
     * 类型创建的时间
     */
    private Date creatadate;
    /**
     * 类型创建人
     */
    private String createname;
    /**
     * 类型修改人
     */
    private String modifyby;
    /**
     * 类型修改时间
     */
    private Date modifybydate;
    /**
     * 删除状态（未删0，已删1）
     */
    private int del;
    /**
     * 是否停用（未停0，已停1）
     */
    private int stop;
    /**
     * 父子ID（父0，子1）
     */
    private Integer parentId;
    /**
     * 子集
     */
    private List<GoodsType> childList;

    public GoodsType() {
    }

    public GoodsType(String typename, int typecount, Date creatadate, String createname, String modifyby, Date modifybydate, int del, int stop, int parentId) {
        this.typename = typename;
        this.typecount = typecount;
        this.creatadate = creatadate;
        this.createname = createname;
        this.modifyby = modifyby;
        this.modifybydate = modifybydate;
        this.del = del;
        this.stop = stop;
        this.parentId = parentId;
    }

    public GoodsType(int id, String typename, int typecount, Date creatadate, String createname, String modifyby, Date modifybydate, int del, int stop, int parentId) {
        this.id = id;
        this.typename = typename;
        this.typecount = typecount;
        this.creatadate = creatadate;
        this.createname = createname;
        this.modifyby = modifyby;
        this.modifybydate = modifybydate;
        this.del = del;
        this.stop = stop;
        this.parentId = parentId;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public Integer getParentId() {
        return parentId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public int getTypecount() {
        return typecount;
    }

    public void setTypecount(int typecount) {
        this.typecount = typecount;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    public Date getCreatadate() {
        return creatadate;
    }
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    public void setCreatadate(Date creatadate) {
        this.creatadate = creatadate;
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname;
    }

    public String getModifyby() {
        return modifyby;
    }

    public void setModifyby(String modifyby) {
        this.modifyby = modifyby;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getModifybydate() {
        return modifybydate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public void setModifybydate(Date modifybydate) {
        this.modifybydate = modifybydate;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    @Override
    public void setChildList(List<GoodsType> childList) {
        this.childList = childList;
    }

    @Override
    public List<GoodsType> getChildList() {
        return childList;
    }
}
