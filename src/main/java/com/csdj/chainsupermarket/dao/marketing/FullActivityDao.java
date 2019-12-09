package com.csdj.chainsupermarket.dao.marketing;

import com.csdj.chainsupermarket.entity.marketing.FullActivityVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @version 版本号        1.0
 * @author： 作者名称     张晟
 * @date 创建时间        2019/12/4/0004 16:04
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@Mapper
public interface FullActivityDao {
    /**
     * 分页查询，
     * @param 当前页码
     * @param 每页的数据大小
     * @return
     */
     List<FullActivityVO> findPage(Map map);
    /**
     * 查询数据总数
     * @return
     */
     int getCount();
    /**
     * 根据ID主键查询单个对象
     * @param activityid
     * @return
     */
     FullActivityVO findById(int activityid);

     int update(FullActivityVO fullActivityVO);

     int delete(int activityid);

     int add(FullActivityVO fullActivityVO);
}