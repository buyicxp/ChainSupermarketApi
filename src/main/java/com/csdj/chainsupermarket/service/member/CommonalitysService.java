package com.csdj.chainsupermarket.service.member;

import com.csdj.chainsupermarket.entity.member.Commonalitys;
import com.github.pagehelper.PageInfo;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.service.member
 * @ClassName: CommonalitysService
 * @Author: 姜某某
 * @Date: 2019/12/10 15:47
 * 会员评论
 */
public interface CommonalitysService {
    /**
     * 数据查询
     * @param commonalitys 实体
     * @param currentPage 条数
     * @param pageSize 页数
     * @return 结果
     */
    PageInfo<Commonalitys> queryMement(Commonalitys commonalitys, Integer currentPage, Integer pageSize);

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
     * @param id Id
     * @return 结果
     */
    int updateCommonalitysId(Commonalitys commonalitys);
}
