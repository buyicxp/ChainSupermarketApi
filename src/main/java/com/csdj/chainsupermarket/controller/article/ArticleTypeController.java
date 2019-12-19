package com.csdj.chainsupermarket.controller.article;

import com.csdj.chainsupermarket.entity.article.ArticleType;
import com.csdj.chainsupermarket.service.imp.article.ArticleTypeServiceImp;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ProjectName: chainsupermarket
 * @Package: com.csdj.chainsupermarket.controller
 * @ClassName: ArticleTypeController
 * @Author: 王一翰
 * @Date: 2019/12/3 14:12
 * 文章分类
 */

@RestController
@CrossOrigin
public class ArticleTypeController {

    @Resource
    private ArticleTypeServiceImp atsi;

    /**
     *
     * 文章分类分页查询
     * @param currentPage  从第几条数据开始查
     * @param pageSiz 每页显示多少数据
     * @return 一个多个对象的ArticleType类型的PageInfo集合
     */
    @RequestMapping(value = "/pageInfoArticleType.do")
    @ResponseBody
    public Object pageInfoArticleType(Integer currentPage,Integer pageSize){

        PageInfo<ArticleType> pageInfoArticleType =  atsi.pageInfoArticleType(currentPage,pageSize);

        return pageInfoArticleType;
    }

    /**
     *添加文章分类
     * @param articletype 文章分类对象
     * @return 添加成功返回1
     */
    @RequestMapping(value = "/insertArticleType.do")
    @ResponseBody
    public  Object insertArticleType(ArticleType articletype){

        return atsi.insertArticleType(articletype);
    }
    /**
     * 查询文章分类
     * @return 返回一个ArticleType类型List
     */
    @RequestMapping(value = "/listAtricleType.do")
    @ResponseBody
    public Object listArticleType(){
        System.out.println("1");
        return atsi.listArticleType();
    }
}
