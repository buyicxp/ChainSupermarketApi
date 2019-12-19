package com.csdj.chainsupermarket.service.article;

import com.csdj.chainsupermarket.entity.article.ArticleType;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.service
 * @ClassName: ArticleTypeService
 * @Author: 王一翰
 * 文章类别
 * @Date: 2019/12/3 10:33
 */
public interface ArticleTypeService {
    /**
     *
     * 文章分类分页查询
     * @param currentPage  从第几条数据开始查
     * @param pageSiz 每页显示多少数据
     * @return 一个多个对象的ArticleType类型的PageInfo集合
     */
    PageInfo<ArticleType> pageInfoArticleType(int currentPage, int pageSize);


    /**
     *添加文章分类
     * @param articletype 文章分类对象
     * @return 添加成功返回1
     */
    Integer insertArticleType(ArticleType articletype);

    /**
     * 查询文章分类
     * @return 返回一个ArticleType类型List
     */
    List<ArticleType>   listArticleType();
}
