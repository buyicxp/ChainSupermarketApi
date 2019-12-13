package com.csdj.chainsupermarket.service.member;

import com.csdj.chainsupermarket.entity.member.Member;
import com.github.pagehelper.PageInfo;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.service.member
 * @ClassName: MemberService
 * @Author: 姜某某
 * @Date: 2019/12/4 16:50
 */
public interface MemberService {
    /**
     * 会员总数
     * @return 结果
     */
    int countMenber();

    /**
     * 新增会员数
     * @return 结果
     */
    int countNewMenber();

    /**
     * 数据查询
     * @param member 实体
     * @param currentPage 条数
     * @param pageSize 页数
     * @return 结果
     */
    PageInfo<Member> queryMement(Member member, Integer currentPage, Integer pageSize);

    /**
     * 单条记录查询
     * @param id id
     * @return 结果
     */
    Member selectMemberId(Integer id);


}
