package com.csdj.chainsupermarket.dao.marketing;

import com.csdj.chainsupermarket.entity.marketing.GoodsTypeChildren;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 版本号        1.0
 * @author： 作者名称     张晟
 * @date 创建时间        2019/12/18/0018 9:44
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@Mapper
public interface GoodsTypeChildrenMapper {

    List<GoodsTypeChildren> findAll();
}
