package com.csdj.chainsupermarket.dao.member;

import com.csdj.chainsupermarket.entity.member.Member;

import java.util.List;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.dao.member
 * @ClassName: MemberMapper
 * @Author: 姜某某
 * @Date: 2019/12/4 16:48
 */
public interface MemberMapper {
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
     * @return 结果
     */
    List<Member> queryMement(Member member);

    /**
     * 单条记录查询
     * @param id id
     * @return 结果
     */
    Member selectMemberId(Integer id);

}
