package .service.impl;

import .entity.AppAccount;
import .dao.AppAccountDao;
import .service.AppAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AppAccount)表服务实现类
 *
 * @author makejava
 * @since 2020-03-23 19:34:12
 */
@Service("appAccountService")
public class AppAccountServiceImpl implements AppAccountService {
    @Resource
    private AppAccountDao appAccountDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pId 主键
     * @return 实例对象
     */
    @Override
    public AppAccount queryById(Integer pId) {
        return this.appAccountDao.queryById(pId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AppAccount> queryAllByLimit(int offset, int limit) {
        return this.appAccountDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param appAccount 实例对象
     * @return 实例对象
     */
    @Override
    public AppAccount insert(AppAccount appAccount) {
        this.appAccountDao.insert(appAccount);
        return appAccount;
    }

    /**
     * 修改数据
     *
     * @param appAccount 实例对象
     * @return 实例对象
     */
    @Override
    public AppAccount update(AppAccount appAccount) {
        this.appAccountDao.update(appAccount);
        return this.queryById(appAccount.getPId());
    }

    /**
     * 通过主键删除数据
     *
     * @param pId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pId) {
        return this.appAccountDao.deleteById(pId) > 0;
    }
}