package com.csdj.chainsupermarket.service.imp.article;

import com.csdj.chainsupermarket.dao.article.ArticleMapper;
import com.csdj.chainsupermarket.entity.article.Article;
import com.csdj.chainsupermarket.service.article.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.service.imp.article
 * @ClassName: ArticleServiceImp
 * @Author: 王一翰
 * @Date: 2019/12/6 9:33
 * 文章列表
 */
@Service
public class ArticleServiceImp implements ArticleService {
    @Resource
    private ArticleMapper am;

    /**
     *
     * 文章列表分页查询
     * @param currentPage  从第几条数据开始查
     * @param pageSize 每页显示多少数据
     * @artName 咨询名称(模糊查询)
     * @artId 文章分类Id(模糊查询)
     * @return 一个多个对象的Article类型的PageInfo集合
     */
    @Override
    public PageInfo<Article> pageInfoArticle(String artName, int artId, int currentPage, int pageSize){
        //使用PageInfo查询
        PageHelper.startPage(currentPage,pageSize);

        //传过来的参数存进map里面
        Map<String,Object> map  = new HashMap<>();
                map.put("artName",artName);
                map.put("artId",artId);

        //调用分页查询的方法用一个List变量接收然后返回 List在转换成pageInfo
        List<Article> listArticle = am.pageInfoArticle(map);
        PageInfo<Article> pageInfoArticle = new PageInfo<>(listArticle);
        return pageInfoArticle;
    }

    /**
     * 文章删除
     * @param artId  文章id
     * @return 成功返回1 失败返回0
     */
    @Override
    public Integer deleteArticle(int artId) {
        return am.deleteArticle(artId);
    }

    /**
     *添加文章
     * @param article 文章分类
     * @return 添加成功返回1
     */
    @Override
    public Integer insertArticle(Article article) {
        return am.insertArticle(article);
    }

    /**
     * 查询推荐文章的所有文章 返回给小程序前台
     * @return 返回Article类型的List集合
     */
    @Override
    public List<Article> listArticleApplet(){ return am.listArticleApplet(); }

    /**
     * 按小程序传过来的id查询文章 返回给小程序
     * @param artId 文章列表的id
     * @return 返回的是文章列表的一个单个对象
     */
    @Override
    public Article getArticleApplet(int artId){ return am.getArticleApplet(artId); }

}
