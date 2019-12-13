package com.csdj.chainsupermarket.service.imp.member;

import com.csdj.chainsupermarket.dao.member.MemberMapper;
import com.csdj.chainsupermarket.entity.member.Member;
import com.csdj.chainsupermarket.service.member.MemberService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.service.imp.member
 * @ClassName: MemberServiceImpl
 * @Author: 姜某某
 * @Date: 2019/12/4 16:52
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    private MemberMapper memberMapper;

    @Override
    public int countMenber() {
        return memberMapper.countMenber();
    }

    @Override
    public int countNewMenber() {
        return memberMapper.countNewMenber();
    }

    @Override
    public PageInfo<Member> queryMement(Member member, Integer currentPage, Integer pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<Member> list = memberMapper.queryMement(member);
        PageInfo<Member> pageInfo = new PageInfo<Member>(list);
        return pageInfo;
    }

    @Override
    public Member selectMemberId(Integer id) {
        return memberMapper.selectMemberId(id);
    }

}
