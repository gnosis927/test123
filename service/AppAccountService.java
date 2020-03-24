package .service;

import .entity.AppAccount;
import java.util.List;

/**
 * (AppAccount)表服务接口
 *
 * @author makejava
 * @since 2020-03-23 19:34:12
 */
public interface AppAccountService {

    /**
     * 通过ID查询单条数据
     *
     * @param pId 主键
     * @return 实例对象
     */
    AppAccount queryById(Integer pId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AppAccount> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param appAccount 实例对象
     * @return 实例对象
     */
    AppAccount insert(AppAccount appAccount);

    /**
     * 修改数据
     *
     * @param appAccount 实例对象
     * @return 实例对象
     */
    AppAccount update(AppAccount appAccount);

    /**
     * 通过主键删除数据
     *
     * @param pId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pId);

}