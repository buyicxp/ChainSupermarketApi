package com.csdj.chainsupermarket.controller.member;

import com.csdj.chainsupermarket.entity.member.Commonalitys;
import com.csdj.chainsupermarket.service.member.CommonalitysService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.controller.member
 * @ClassName: CommonalitysController
 * @Author: 姜某某
 * @Date: 2019/12/10 15:54
 * 会员评论控制器
 */
@RestController
@CrossOrigin
public class CommonalitysController {

    @Resource
    private CommonalitysService commonalitysService;

    /**
     * 查询会员评论信息
     * @param commonalitys 实体
     * @param currentPage 页数
     * @param pageSize 条数
     * @return 结果
     */
    @RequestMapping("selectCommonalitys.do")
    public  Object selectCommonalitys(Commonalitys commonalitys,Integer currentPage, Integer pageSize){
        PageInfo<Commonalitys> commonalitysPageInfo = commonalitysService.queryMement(commonalitys,currentPage,pageSize);
        return commonalitysPageInfo;
    }

    @RequestMapping("update.do")
    public Object updateCommonalitysId(Commonalitys commonalitys){
        int number = commonalitysService.updateCommonalitysId(commonalitys);
        if(number>0){
            return number;
        }
        return -1;
    }

    @RequestMapping("commonalitys.do")
    public Object CommonalitysId(Long id){
        Commonalitys commonalitys = commonalitysService.commonalitys(id);
        return commonalitys;
    }

    @RequestMapping("deleteId.do")
    public Object deleteCommonalitysId(Long id){
        return commonalitysService.deleteCommonalitysId(id);
    }

    @RequestMapping("deleteIds.do")
    public Object deleteCommonalitysIds(String ids){
        String idss = ids;
        String[] id = idss.split(",");
        int result = commonalitysService.deleteCommonalitysIds(id);
        if (result > 0) {
            return "删除成功";
        } else {
            return "删除失败";
        }

    }

}
