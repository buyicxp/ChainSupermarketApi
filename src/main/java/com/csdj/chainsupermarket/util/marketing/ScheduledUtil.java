package com.csdj.chainsupermarket.util.marketing;

import com.csdj.chainsupermarket.entity.marketing.FullActivityVO;
import com.csdj.chainsupermarket.entity.marketing.GroupActivities;
import com.csdj.chainsupermarket.service.marketing.DiscountCouponService;
import com.csdj.chainsupermarket.service.marketing.GroupActivitiesService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author :阿浩i
 * @Description :定时任务类
 * @CreateDate :  2019/12/6 13:50
 * @Version : 1.0
 */
@Component
public class ScheduledUtil {
    @Resource
    private GroupActivitiesService service;

    @Resource
    private DiscountCouponService discountCouponService;
    /**
     * 定时任务方法
     * @Scheduled:设置定时任务
     * cron 属性：cron 表达式。定时任务触发是时间的一个字符串表达形式
     * (cron="0 0 0 * * *")每天凌晨 0 点执行一次
     * (cron="0 0 0/1 * * ?")每个整点执行一次
     */
    @Scheduled(cron="0 0 0/1 * * ?")
    public void scheduledMethod(){
        GroupActivities groupActivities = new GroupActivities();
        groupActivities.setEndTime(new Date());

        //定时更新优惠券状态
        discountCouponService.updateTime();

        int res = service.selectByEndTime(groupActivities.getEndTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (res >= 0){
            System.out.println("定时任务已触发,活动状态已修改,修改时间为:"+sdf.format(new Date()));
        }
    }
}
