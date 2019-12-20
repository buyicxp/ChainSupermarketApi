package com.csdj.chainsupermarket.service.imp.marketing;

import com.csdj.chainsupermarket.dao.marketing.FullActivityDao;
import com.csdj.chainsupermarket.entity.commodity.GoodsCommodity;
import com.csdj.chainsupermarket.entity.marketing.FullActivityVO;
import com.csdj.chainsupermarket.service.marketing.FullActivityService;
import com.csdj.chainsupermarket.util.shiro.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version 版本号        1.0
 * @author： 作者名称     张晟
 * @date 创建时间        2019/12/5/0005 10:24
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@Service
public class FullActivityServiceImpl implements FullActivityService {
    @Resource
    FullActivityDao fullActivityDao;
    
    /**
     * 修改活动执行状态
     * @return
     */
    @Override
    public int updateState() {
        Map map=new HashMap();
        map.put("endtime",new Date());
        return  fullActivityDao.updateState(map);
    }
    
    /**
     * 根据活动开始时间修改
     * @return
     */
    @Override
    public int updateTime() {
        Map map=new HashMap();
        map.put("activityTime",new Date());
        return  fullActivityDao.updateTime(map);
    }
    
    
    @Override
    public PageUtil<FullActivityVO> findPage(int index, int pageSize, String activityName){
        PageUtil<FullActivityVO>pageUtil=new PageUtil<>();
        // 把控制器传递的分页参数进行封装
        Map<String, Object> map=new HashMap<>();
        map.put("off", (index-1)*pageSize);
        map.put("size", pageSize);
        if (activityName!=null) {
            map.put("activityName", "%" + activityName + "%");
        }
        // 取出分页的当前页数据
        pageUtil.setList(fullActivityDao.findPage(map));
        // 当前页码
        pageUtil.setPageIndex(index);
        // 每页大小
        pageUtil.setPageSize(pageSize);
        // 总记录数
        int count=fullActivityDao.getCount();
        pageUtil.setRowCount(count);
        // 计算总页数
        if (count%pageSize==0) {
            pageUtil.setPageNumber(count/pageSize);
        }
        else {
            pageUtil.setPageNumber(count/pageSize+1);
        }
        return pageUtil;

    }
    @Override
    public FullActivityVO findById(int activityid){
        return fullActivityDao.findById(activityid);
    }
    /**
     * 查询数据总数
     * @return
     */
    @Override
    public int getCount(){
        return fullActivityDao.getCount();
    }
    @Override
    public int delete(int activityid){
        return fullActivityDao.delete(activityid);
    }
    @Override
    public int update(int activityid,String activityState){
        Map map = new HashMap();
        map.put("activityid",activityid);
        map.put("activityState",activityState);
        return fullActivityDao.update(map);
    }

    @Override
    public int add(String activityName,int typeid,String activityTime,int rangeid,String activityState,
                   String executingState,String activityDetail,int deleteState,int goodsCommodityId,int goodsTypeId,
                   int money ) {
        Map map = new HashMap();
        map.put("activityName",activityName);
        map.put("typeid",typeid);
        map.put("activityTime",activityTime);
        map.put("rangeid",rangeid);
        map.put("activityState",activityState);
        map.put("executingState",executingState);
        map.put("activityDetail",activityDetail);
        map.put("deleteState",deleteState);
        map.put("goodsCommodityId",goodsCommodityId);
        map.put("goodsTypeId",goodsTypeId);
        map.put("money",money);
        return fullActivityDao.add(map);
    }




}
