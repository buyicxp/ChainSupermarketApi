package com.csdj.chainsupermarket.dao.article;

import com.csdj.chainsupermarket.entity.article.ArticleType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.dao
 * @ClassName: ArticleTypeMapper
 * @Author: 王一翰
 * 文章分类
 * @Date: 2019/12/3 10:22
 */
@Mapper
public interface ArticleTypeMapper {

    /**
     * 文章分类分页查询
     * @param map 存参数到时候实现分页
     * @return 一个多个对象的ArticleType类型的List集合
     */
    List<ArticleType> pageInfoArticleType(Map<String, Object> map);


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
