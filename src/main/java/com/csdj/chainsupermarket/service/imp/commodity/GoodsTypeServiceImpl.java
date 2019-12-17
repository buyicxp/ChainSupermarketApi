package com.csdj.chainsupermarket.service.imp.commodity;

import com.csdj.chainsupermarket.dao.commodity.GoodsTypeMapper;
import com.csdj.chainsupermarket.entity.commodity.GoodsType;
import com.csdj.chainsupermarket.entity.commodity.GoodsTypeDTO;
import com.csdj.chainsupermarket.service.commodity.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author: 邹泓广
 * @date: 2019/12/5
 * 商品类型ServiceImpl层
 */
@Service("goodsTypeService")
@Transactional(rollbackFor = Exception.class)

public class GoodsTypeServiceImpl implements GoodsTypeService {
    /**
     * 将dao层作为成员变量
     */
    @Autowired
    private GoodsTypeMapper goodsTypeMapper;

    /**
     * 分页查询全部记录类型
     * @param parentid
     * @param currentPage
     * @param pageSize
     * @return
     */
    @Override
    public List<GoodsType> getGoodsTypeList(int parentid, int currentPage, int pageSize) {
        int start = (currentPage - 1) * pageSize;
        return goodsTypeMapper.getGoodsTypeList(parentid, start, pageSize);
    }

    /**
     * 分页查询全部记录类型
     * @param parentid
     * @return
     */
    @Override
    public List<GoodsType> getGoodsTypeList(int parentid) {
        return goodsTypeMapper.getGoodsTypeList(parentid, null, null);
    }

    /**
     * 查询总数
     *
     * @return
     */
    @Override
    public Integer getCount() {
        return goodsTypeMapper.getCount();
    }

    /**
     * 删除状态的修改
     *
     * @param id
     * @return
     */
    @Override
    public Integer getGoodsTypeDel(Integer id) {

        return goodsTypeMapper.getGoodsTypeDel(id);
    }

    /**
     * 1为停用状态，变停用
     *
     * @param id
     * @return
     */
    @Override
    public Integer getGoodsTypeOne(Integer id,Integer stop) {
        return goodsTypeMapper.getGoodsTypeOne(id,stop);
    }

    /**
     * 修改子类
     *
     * @param parentid
     * @return
     */
    @Override
    public Integer getParentId(Integer parentid,Integer stop) {

        return goodsTypeMapper.getParentId(parentid,stop);
    }

    /**
     * 父类查询
     *
     * @return
     */
    @Override
    public List<GoodsType> getTypeNameList() {

        return goodsTypeMapper.getTypeNameList();
    }

    /**
     * 修改类型
     *
     * @param goodsType
     * @return
     */
    @Override
    public Integer getGoodsTypeUpdate(GoodsTypeDTO goodsType) {
        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //String date = format.format();
        GoodsType go = new GoodsType();
        go.setId(goodsType.getId());
        go.setTypename(goodsType.getTypename());
        go.setTypecount(goodsType.getTypecount());

        go.setModifyby("李四");
        go.setModifybydate(new Date());
        return goodsTypeMapper.getGoodsTypeUpdate(go);
    }

    /**
     * 父类增加
     *
     * @param goodsType
     * @return
     */
    @Override
    public Integer getGoodsTypeAddfu(GoodsTypeDTO goodsType) {
        GoodsType go = new GoodsType();
        go.setTypename(goodsType.getTypename());
        go.setTypecount(goodsType.getTypecount());

        go.setCreatename("小三");
        go.setCreatadate(new Date());
        go.setModifyby("李四");
        go.setModifybydate(new Date());
        go.setParentId(0);
//        if(goodsType.getParentId() == 0){
//            go.setParentId(0);
//        }else{
//            goodsType.setParentId(goodsType.getId());
//        }
        return goodsTypeMapper.getGoodsTypeAddfu(go);
    }

    /**
     * 子类增加
     *
     * @param goodsType
     * @return
     */
    @Override
    public Integer getGoodsTypeAddzi(GoodsTypeDTO goodsType) {
        GoodsType god = new GoodsType();
        god.setTypename(goodsType.getTypename());
        god.setTypecount(goodsType.getTypecount());

        god.setCreatename("小三");
        god.setCreatadate(new Date());
        god.setModifyby("李四");
        god.setModifybydate(new Date());
        god.setParentId(goodsType.getId());
        return goodsTypeMapper.getGoodsTypeAddzi(god);
    }

    @Override
    public List<GoodsType> findByAll() {
        return goodsTypeMapper.findByAll();
    }

    @Override
    public GoodsType findById(int id) {
        return goodsTypeMapper.findById(id);
    }


}
