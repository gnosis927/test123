package com.example.service;

import com.example.entity.User;
import com.example.utils.ServerResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2020-04-09 23:11:16
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param pId 主键
     * @return 实例对象
     */
    User queryById(Integer pId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<User> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User update(User user);

    /**
     * 通过主键删除数据
     *
     * @param pId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pId);

    /**
     * 登录
     */
    public ServerResponse login(String tel,String pwd);
    /**
     * 注册
     *
     */
    public ServerResponse regist(User user);

    /**
     * 模糊搜索某商品返回所有一个货物list,货物list包含limit个货物信息
     */

}