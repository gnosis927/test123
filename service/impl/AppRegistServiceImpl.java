package .service.impl;

import .entity.AppRegist;
import .dao.AppRegistDao;
import .service.AppRegistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AppRegist)表服务实现类
 *
 * @author makejava
 * @since 2020-03-23 19:33:58
 */
@Service("appRegistService")
public class AppRegistServiceImpl implements AppRegistService {
    @Resource
    private AppRegistDao appRegistDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pId 主键
     * @return 实例对象
     */
    @Override
    public AppRegist queryById(Integer pId) {
        return this.appRegistDao.queryById(pId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AppRegist> queryAllByLimit(int offset, int limit) {
        return this.appRegistDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param appRegist 实例对象
     * @return 实例对象
     */
    @Override
    public AppRegist insert(AppRegist appRegist) {
        this.appRegistDao.insert(appRegist);
        return appRegist;
    }

    /**
     * 修改数据
     *
     * @param appRegist 实例对象
     * @return 实例对象
     */
    @Override
    public AppRegist update(AppRegist appRegist) {
        this.appRegistDao.update(appRegist);
        return this.queryById(appRegist.getPId());
    }

    /**
     * 通过主键删除数据
     *
     * @param pId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pId) {
        return this.appRegistDao.deleteById(pId) > 0;
    }
}