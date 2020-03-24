package .dao;

import .entity.AppAccount;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (AppAccount)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-23 19:34:12
 */
public interface AppAccountDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pId 主键
     * @return 实例对象
     */
    AppAccount queryById(Integer pId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AppAccount> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param appAccount 实例对象
     * @return 对象列表
     */
    List<AppAccount> queryAll(AppAccount appAccount);

    /**
     * 新增数据
     *
     * @param appAccount 实例对象
     * @return 影响行数
     */
    int insert(AppAccount appAccount);

    /**
     * 修改数据
     *
     * @param appAccount 实例对象
     * @return 影响行数
     */
    int update(AppAccount appAccount);

    /**
     * 通过主键删除数据
     *
     * @param pId 主键
     * @return 影响行数
     */
    int deleteById(Integer pId);

}