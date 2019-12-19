package com.csdj.chainsupermarket.entity.marketing;

import lombok.Data;

import java.util.List;

/**
 * @version 版本号        1.0
 * @author： 作者名称     张晟
 * @date 创建时间        2019/12/17/0017 16:40
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
public class GoodsTypeChildren {

    private String value;

    private String label;

    private List<GoodsChildren> children;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<GoodsChildren> getChildren() {
        return children;
    }

    public void setChildren(List<GoodsChildren> children) {
        this.children = children;
    }
}
