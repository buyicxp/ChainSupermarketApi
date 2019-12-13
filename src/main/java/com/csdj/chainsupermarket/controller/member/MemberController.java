package com.csdj.chainsupermarket.controller.member;

import com.csdj.chainsupermarket.entity.member.Member;
import com.csdj.chainsupermarket.service.member.MemberService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.controller.member
 * @ClassName: MemberController
 * @Author: 姜某某
 * @Date: 2019/12/4 16:54
 * 会员控制器
 */

@CrossOrigin
@RestController
public class MemberController {

    @Resource
    private MemberService memberService;

    /**
     * 总记录条数
     * @return 结果
     */
    @RequestMapping("count.do")
    public Object countMember(){
        return memberService.countMenber();
    }

    /**
     * 新数据的总记录条数
     * @return 结果
     */
    @RequestMapping("countNew.do")
    public Object countNewMember(){
        return memberService.countNewMenber();
    }

    /**
     * 数据查询
     * @param member 实体
     * @param currentPage 页数
     * @param pageSize 条数
     * @return 结果
     */
    @RequestMapping("listMember.do")
    public Object queryMember(Member member, Integer currentPage, Integer pageSize){
        PageInfo<Member> memberList = memberService.queryMement(member,currentPage,pageSize);
        return memberList;
    }

    /**
     * 查询单条数据
     * @param id ID
     * @return 结果
     */
    @RequestMapping("memberId.do")
    public Object selectMemberId(Integer id){
        Member member = memberService.selectMemberId(id);
        return member;
    }
}
