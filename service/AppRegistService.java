package .service;

import .entity.AppRegist;
import java.util.List;

/**
 * (AppRegist)表服务接口
 *
 * @author makejava
 * @since 2020-03-23 19:33:57
 */
public interface AppRegistService {

    /**
     * 通过ID查询单条数据
     *
     * @param pId 主键
     * @return 实例对象
     */
    AppRegist queryById(Integer pId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AppRegist> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param appRegist 实例对象
     * @return 实例对象
     */
    AppRegist insert(AppRegist appRegist);

    /**
     * 修改数据
     *
     * @param appRegist 实例对象
     * @return 实例对象
     */
    AppRegist update(AppRegist appRegist);

    /**
     * 通过主键删除数据
     *
     * @param pId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pId);

}