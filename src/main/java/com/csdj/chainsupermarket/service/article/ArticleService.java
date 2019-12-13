package com.csdj.chainsupermarket.service.article;

import com.csdj.chainsupermarket.entity.article.Article;
import com.github.pagehelper.PageInfo;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.service.article
 * @ClassName: ArticleService
 * @Author: 王一翰
 * @Date: 2019/12/6 9:33
 * 文章列表
 */
public interface ArticleService {

    /**
     * 文章列表分页查询
     * @param currentPage  从第几条数据开始查
     * @param pageSiz 每页显示多少数据
     * @artName 咨询名称(模糊查询)
     * @artId 文章分类Id(模糊查询)
     * @return 一个多个对象的Article类型的PageInfo集合
     */
    PageInfo<Article> pageInfoArticle(String artName, int artId, int currentPage, int pageSize);

    /**
     * 文章删除
     * @param artId  文章id
     * @return 成功返回1 失败返回0
     */
    Integer  deleteArticle(int artId);

    /**
     *添加文章
     * @param article 文章分类
     * @return 添加成功返回1
     */
    Integer insertArticle(Article article);
}
