package com.csdj.chainsupermarket.service.imp.article;

import com.csdj.chainsupermarket.dao.article.ArticleTypeMapper;
import com.csdj.chainsupermarket.entity.article.ArticleType;
import com.csdj.chainsupermarket.service.article.ArticleTypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.service.imp
 * @ClassName: ArticleTypeServiceImp
 * @Author: 王一翰
 * 文章类别
 * @Date: 2019/12/3 10:36
 */
@Service
public class ArticleTypeServiceImp implements ArticleTypeService {
    @Resource
    private ArticleTypeMapper atm;

    /**
     *
     * 文章分类分页查询
     * @param currentPage  从第几条数据开始查
     * @param pageSiz 每页显示多少数据
     * @return 一个多个对象的ArticleType类型的PageInfo集合
     */
    @Override
    public PageInfo<ArticleType> pageInfoArticleType(int currentPage, int pageSize) {
        //使用PageInfo查询
        PageHelper.startPage(currentPage,pageSize);

        //传过来的参数存进map里面
        Map<String,Object> map  = new HashMap<>();

        //调用分页查询的方法用一个List变量接收然后返回 List在转换成pageInfo
        List<ArticleType> listArticleType = atm.pageInfoArticleType(map);
        PageInfo<ArticleType> pageInfoArticleType = new PageInfo<>(listArticleType);
        return pageInfoArticleType;
    }

    /**
     *添加文章分类
     * @param articletype 文章分类对象
     * @return 添加成功返回1
     */
    @Override
    public Integer insertArticleType(ArticleType articletype) {

        return atm.insertArticleType(articletype);
    }
    /**
     * 查询文章分类
     * @return 返回一个ArticleType类型List
     */
    @Override
    public List<ArticleType> listArticleType() {

        return atm.listArticleType();
    }
}
