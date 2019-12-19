package com.csdj.chainsupermarket.dao.member;

import com.csdj.chainsupermarket.entity.member.Commonalitys;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.dao.member
 * @ClassName: CommonalitysMapper
 * @Author: 姜某某
 * @Date: 2019/12/10 15:32
 */
@Mapper
public interface CommonalitysMapper {

    /**
     * 查询会员评论信息
     * @param commonalitys 实体
     * @return 结果
     */
    List<Commonalitys> queryCommonalitys(Commonalitys commonalitys);

    /**
     * 查询单条信息
     * @param id ID
     * @return 结果
     */
    Commonalitys commonalitys(Long id);

    /**
     * 删除信息
     * @param id ID
     * @return 结果
     */
    int deleteCommonalitysId(Long id);

    /**
     * 批量删除
     * @param ids ID集合
     * @return 结果
     */
    int deleteCommonalitysIds(String[] ids);

    /**
     * x修改
     * @param commonalitys 实体
     * @return 结果
     */
    int updateCommonalitysId(Commonalitys commonalitys);


}
