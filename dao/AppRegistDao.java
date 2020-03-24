package .dao;

import .entity.AppRegist;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (AppRegist)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-23 19:33:52
 */
public interface AppRegistDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pId 主键
     * @return 实例对象
     */
    AppRegist queryById(Integer pId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AppRegist> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param appRegist 实例对象
     * @return 对象列表
     */
    List<AppRegist> queryAll(AppRegist appRegist);

    /**
     * 新增数据
     *
     * @param appRegist 实例对象
     * @return 影响行数
     */
    int insert(AppRegist appRegist);

    /**
     * 修改数据
     *
     * @param appRegist 实例对象
     * @return 影响行数
     */
    int update(AppRegist appRegist);

    /**
     * 通过主键删除数据
     *
     * @param pId 主键
     * @return 影响行数
     */
    int deleteById(Integer pId);

}