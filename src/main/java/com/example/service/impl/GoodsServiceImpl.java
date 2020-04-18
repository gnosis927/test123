package com.example.service.impl;

import com.example.common.ResponseCode;
import com.example.entity.Goods;
import com.example.dao.GoodsDao;
import com.example.service.GoodsService;
import com.example.utils.ServerResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Goods)表服务实现类
 *
 * @author makejava
 * @since 2020-04-11 10:33:53
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsDao goodsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param gId 主键
     * @return 实例对象
     */
    @Override
    public Goods queryById(Integer gId) {
        return this.goodsDao.queryById(gId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Goods> queryAllByLimit(int offset, int limit) {
        return this.goodsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param goods 实例对象
     * @return 实例对象
     */
    @Override
    public Goods insert(Goods goods) {
        this.goodsDao.insert(goods);
        return goods;
    }

    /**
     * 修改数据
     *
     * @param goods 实例对象
     * @return 实例对象
     */
    @Override
    public Goods update(Goods goods) {
        this.goodsDao.update(goods);
        return this.queryById(goods.getGId());
    }

    /**
     * 通过主键删除数据
     *
     * @param gId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer gId) {
        return this.goodsDao.deleteById(gId) > 0;
    }

    /**
     * 搜索
     */
    public ServerResponse Search(String goods_name, String goods_kind){
        List<Goods> goods=this.goodsDao.FindGoods(goods_name,goods_kind);
        if(null==goods) {
            return ServerResponse.createSRByFail(ResponseCode.SEARCH_NULL.getCode(), ResponseCode.SEARCH_NULL.getMsg());
        }
        else{

            return ServerResponse.createSRBySuccess(goods);
        }

    }
    /**
     * 添加商品
     */
    public ServerResponse Addgoods(Goods goods)
    {
        Integer judge=this.goodsDao.insert(goods);

        if(judge==0) {
            return ServerResponse.createSRByFail(ResponseCode.ADDGOODS_ERROR.getCode(), ResponseCode.ADDGOODS_ERROR.getMsg());
        }
        else{

            return ServerResponse.createSRBySuccess(goods);
        }
    }
}