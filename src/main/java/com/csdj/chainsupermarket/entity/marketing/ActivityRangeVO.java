package com.csdj.chainsupermarket.entity.marketing;
/**
 * @version 版本号        1.0
 * @author： 作者名称     张晟
 * @date 创建时间        2019/12/4/0004 16:04
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
public class ActivityRangeVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -1898224785872877672L;

    /** 范围id */
    private Long rangeid;

    /** 活动范围 */
    private String activityRange;

    /**
     * 获取范围id
     * 
     * @return 范围id
     */
    public Long getRangeid() {
        return this.rangeid;
    }

    /**
     * 设置范围id
     * 
     * @param rangeid
     *          范围id
     */
    public void setRangeid(Long rangeid) {
        this.rangeid = rangeid;
    }

    /**
     * 获取活动范围
     * 
     * @return 活动范围
     */
    public String getActivityRange() {
        return this.activityRange;
    }

    /**
     * 设置活动范围
     * 
     * @param activityRange
     *          活动范围
     */
    public void setActivityRange(String activityRange) {
        this.activityRange = activityRange;
    }

    /**
     * 获取商品id（外键）
     * 
     * @return 商品id（外键）
     */
    @Override
    public String toString() {
        return "ActivityRangeVO{" +
                "rangeid=" + rangeid +
                ", activityRange='" + activityRange + '\'' +
                '}';
    }
}