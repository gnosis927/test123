package com.example.service.impl;

import com.example.common.ResponseCode;
import com.example.entity.User;
import com.example.dao.UserDao;
import com.example.service.UserService;
import com.example.utils.ServerResponse;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2020-04-09 23:11:16
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pId 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer pId) {
        return this.userDao.queryById(pId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return this.userDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getPId());
    }

    /**
     * 通过主键删除数据
     *
     * @param pId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pId) {
        return this.userDao.deleteById(pId) > 0;
    }

    /**
     * 登录
     */
    public ServerResponse login(String tel,String pwd){
        Integer count=this.userDao.isFindUser(tel);
        if(count==0) {
            return ServerResponse.createSRByFail(ResponseCode.USER_NULL.getCode(), ResponseCode.USER_NULL.getMsg());
        }
        else{
            User user=this.userDao.findUserTaP(tel,pwd);
            if(null==user){
                return  ServerResponse.createSRByFail(ResponseCode.USER_ERROR.getCode(), ResponseCode.USER_ERROR.getMsg());
            }

            return ServerResponse.createSRBySuccess(user);
        }

    }
    /**
     * 注册
     */
    public ServerResponse regist(User user){
        Integer judge=this.userDao.insert(user);

        if(judge==0) {
            return ServerResponse.createSRByFail(ResponseCode.REGIST_ERROR.getCode(), ResponseCode.REGIST_ERROR.getMsg());
        }
        else{

            return ServerResponse.createSRBySuccess(user);
        }

    }
    /**
     * 注册
     */
    public ServerResponse signIn(User user){
        int count=this.userDao.insert(user);
        if(count==0){
            return ServerResponse.createSRByFail(ResponseCode.SIGN_ERROR.getCode(), ResponseCode.SIGN_ERROR.getMsg());
        }
        return ServerResponse.createSRBySuccess(1000000);
    }
}