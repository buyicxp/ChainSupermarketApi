package com.csdj.chainsupermarket.service.imp.member;

import com.csdj.chainsupermarket.dao.member.CommonalitysMapper;
import com.csdj.chainsupermarket.entity.member.Commonalitys;
import com.csdj.chainsupermarket.service.member.CommonalitysService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.service.imp.member
 * @ClassName: CommonalitysServiceImpl
 * @Author: 姜某某
 * @Date: 2019/12/10 15:49
 * 会员评论实现
 */
@Service
public class CommonalitysServiceImpl implements CommonalitysService {

    @Resource
    private CommonalitysMapper commonalitysMapper;

    @Override
    public PageInfo<Commonalitys> queryMement(Commonalitys commonalitys, Integer currentPage, Integer pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<Commonalitys> list = commonalitysMapper.queryCommonalitys(commonalitys);
        PageInfo<Commonalitys> pageInfo = new PageInfo<Commonalitys>(list);
        return pageInfo;
    }

    @Override
    public Commonalitys commonalitys(Long id) {
        Commonalitys commonalitys = commonalitysMapper.commonalitys(id);
        return commonalitys;
    }

    @Override
    public int deleteCommonalitysId(Long id) {
        return commonalitysMapper.deleteCommonalitysId(id);
    }

    @Override
    public int deleteCommonalitysIds(String[] ids) {
        return commonalitysMapper.deleteCommonalitysIds(ids);
    }

    @Override
    public int updateCommonalitysId(Commonalitys commonalitys) {
        return commonalitysMapper.updateCommonalitysId(commonalitys);
    }
}
