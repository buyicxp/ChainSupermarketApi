package com.csdj.chainsupermarket.util.goodstype;

import java.util.List;
/**
 * @author: 邹泓广
 * @date: 2019/12/5
 *工具类
 */
public interface DataTree<T> {
    /**
     * 获取子ID
     * @return
     */
    public Integer getId();

    /**
     * 获取父ID
     * @return
     */
    public Integer getParentId();

    /**
     * 子集合
     * @param childList
     */
    public void setChildList(List<T> childList);

    /**
     * 取子集合
     * @return
     */
    public List<T> getChildList();
}
