package com.example.service;

import com.example.entity.Goods;
import com.example.entity.User;
import com.example.utils.ServerResponse;

import java.util.List;

/**
 * (Goods)表服务接口
 *
 * @author makejava
 * @since 2020-04-11 10:33:53
 */
public interface GoodsService {

    /**
     * 通过ID查询单条数据
     *
     * @param gId 主键
     * @return 实例对象
     */
    Goods queryById(Integer gId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Goods> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param goods 实例对象
     * @return 实例对象
     */
    Goods insert(Goods goods);

    /**
     * 修改数据
     *
     * @param goods 实例对象
     * @return 实例对象
     */
    Goods update(Goods goods);

    /**
     * 通过主键删除数据
     *
     * @param gId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer gId);
    public ServerResponse Search(String goods_name, String goods_kind);
    public ServerResponse Addgoods(Goods goods);
//    public ServerResponse Search(String goods_name);
}