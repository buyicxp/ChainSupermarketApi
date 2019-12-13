package com.csdj.chainsupermarket.entity.marketing;
/**
 * @version 版本号        1.0
 * @author： 作者名称     张晟
 * @date 创建时间        2019/12/4/0004 16:04
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */

public class ActivityTypeVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 8238862088942569538L;

    /** 主键 */
    private Long typeid;

    /** 满减/满赠 */
    private String typeName;


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

    @Override
    public String toString() {
        return "ActivityTypeVO{" +
                "typeid=" + typeid +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}