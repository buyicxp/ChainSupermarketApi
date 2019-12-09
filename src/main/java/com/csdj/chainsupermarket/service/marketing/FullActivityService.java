package com.csdj.chainsupermarket.service.marketing;

import com.csdj.chainsupermarket.dao.marketing.FullActivityDao;
import com.csdj.chainsupermarket.entity.marketing.FullActivityVO;
import com.csdj.chainsupermarket.util.shiro.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 版本号        1.0
 * @author： 作者名称     张晟
 * @date 创建时间        2019/12/5/0005 10:24
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@Service
public class FullActivityService {
    @Autowired
    FullActivityDao fullActivityDao;

    public PageUtil<FullActivityVO> findPage(int index,int pageSize,String activityName){
        PageUtil<FullActivityVO>pageUtil=new PageUtil<>();
        Map<String, Object> map=new HashMap<>();
        map.put("off", (index-1)*pageSize);
        map.put("size", pageSize);
        if (activityName!=null) {
            map.put("activityName", "%" + activityName + "%");
        }
        pageUtil.setList(fullActivityDao.findPage(map));
        pageUtil.setPageIndex(index);
        pageUtil.setPageSize(pageSize);
        int count=fullActivityDao.getCount();
        pageUtil.setRowCount(count);
        if (count%pageSize==0) {
            pageUtil.setPageNumber(count/pageSize);
        }
        else {
            pageUtil.setPageNumber(count/pageSize+1);
        }
        return pageUtil;

    }

    public FullActivityVO findById(int activityid){
        return fullActivityDao.findById(activityid);
    }
    /**
     * 查询数据总数
     * @return
     */
    public int getCount(){
        return fullActivityDao.getCount();
    }
    public int delete(int activityid){
        return fullActivityDao.delete(activityid);
    }
    public int update(FullActivityVO fullActivityVO){
        return fullActivityDao.update(fullActivityVO);
    }




}
