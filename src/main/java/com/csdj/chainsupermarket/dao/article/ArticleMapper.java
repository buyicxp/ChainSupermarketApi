package com.csdj.chainsupermarket.dao.article;

import com.csdj.chainsupermarket.entity.article.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.dao.article
 * @ClassName: ArticleMapper
 * @Author: 王一翰
 * @Date: 2019/12/6 9:29
 * 文章列表
 */
@Mapper
public interface ArticleMapper {

    /**
     * 文章列表分页查询
     * @param map 存参数到时候实现分页和模糊查询
     * @return 一个多个对象的Article类型的List集合
     */
    List<Article> pageInfoArticle(Map<String, Object> map);

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
