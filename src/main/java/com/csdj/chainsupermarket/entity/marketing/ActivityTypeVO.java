package com.csdj.chainsupermarket.entity.marketing;/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:5.8.8
 */

/**
 * ACTIVITY_TYPE
 * 
 * @author bianj
 * @version 1.0.0 2019-12-04
 */

public class ActivityTypeVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 8238862088942569538L;

    /** 主键 */
    private Long typeid;

    /** 满减/满赠 */
    private String typeName;

    /** 满足多少金额可参加活动 */
    private Integer money;

    /**
     * 获取主键
     * 
     * @return 主键
     */
    public Long getTypeid() {
        return this.typeid;
    }

    /**
     * 设置主键
     * 
     * @param typeid
     *          主键
     */
    public void setTypeid(Long typeid) {
        this.typeid = typeid;
    }

    /**
     * 获取满减/满赠
     * 
     * @return 满减/满赠
     */
    public String getTypeName() {
        return this.typeName;
    }

    /**
     * 设置满减/满赠
     * 
     * @param typeName
     *          满减/满赠
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * 获取满足多少金额可参加活动
     * 
     * @return 满足多少金额可参加活动
     */
    public Integer getMoney() {
        return this.money;
    }

    /**
     * 设置满足多少金额可参加活动
     * 
     * @param money
     *          满足多少金额可参加活动
     */
    public void setMoney(Integer money) {
        this.money = money;
    }
}