package com.csdj.chainsupermarket.controller.article;

import com.csdj.chainsupermarket.entity.article.Article;
import com.csdj.chainsupermarket.service.imp.article.ArticleServiceImp;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.controller.article
 * @ClassName: ArticleController
 * @Author: 王一翰
 * @Date: 2019/12/6 9:34
 * 文章列表
 */
@RestController
@CrossOrigin
public class ArticleController {
    @Resource
    private ArticleServiceImp asi;

    /**
     *
     * 文章列表分页查询
     * @param currentPage  从第几条数据开始查
     * @param pageSize 每页显示多少数据
     * @artName 咨询名称(模糊查询)
     * @artId 文章分类Id(模糊查询)
     * @return 一个多个对象的Article类型的PageInfo集合
     */
    @RequestMapping(value = "/pageInfoArticle.do")
    @ResponseBody
    public Object pageInfoArticleType(@RequestParam(value = "artName", defaultValue = "") String artName,
                                      @RequestParam(value = "artId", defaultValue = "0") int artId,
                                      Integer currentPage, Integer pageSize){

        PageInfo<Article> pageInfoArticle =  asi.pageInfoArticle(artName,artId,currentPage,pageSize);

        return pageInfoArticle;
    }

    /**
     * 文章删除
     * @param artId  文章id
     * @return 成功返回1 失败返回0
     */
    @RequestMapping(value = "/deleteArticle.do")
    @ResponseBody
   public  Object  deleteArticle(int artId){

        return asi.deleteArticle(artId);
   }

    /**
     *添加文章
     * @param article 文章分类
     * @return 添加成功返回1
     */
    @RequestMapping(value = "/insertArticle.do")
    @ResponseBody
    public Object insertArticle(Article article){

        int i=asi.insertArticle(article);

        return i ;
    }
}
