package com.csdj.chainsupermarket.entity.commodity;

/**
 * @author: 陈熙鹏
 * @date: 2019/12/03
 */
public class GoodsColour {
    private long id;
    private String colourname;
    private String colourpath;
    private long del;
    private String nullone;
    public GoodsColour(){};

    public GoodsColour(String colourname, String colourpath, long del, String nullone) {
        this.colourname = colourname;
        this.colourpath = colourpath;
        this.del = del;
        this.nullone = nullone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getColourname() {
        return colourname;
    }

    public void setColourname(String colourname) {
        this.colourname = colourname;
    }


    public String getColourpath() {
        return colourpath;
    }

    public void setColourpath(String colourpath) {
        this.colourpath = colourpath;
    }


    public long getDel() {
        return del;
    }

    public void setDel(long del) {
        this.del = del;
    }


    public String getNullone() {
        return nullone;
    }

    public void setNullone(String nullone) {
        this.nullone = nullone;
    }
}
