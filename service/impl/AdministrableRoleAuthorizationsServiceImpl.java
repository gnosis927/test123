package .service.impl;

import .entity.AdministrableRoleAuthorizations;
import .dao.AdministrableRoleAuthorizationsDao;
import .service.AdministrableRoleAuthorizationsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AdministrableRoleAuthorizations)表服务实现类
 *
 * @author makejava
 * @since 2020-03-23 01:36:31
 */
@Service("administrableRoleAuthorizationsService")
public class AdministrableRoleAuthorizationsServiceImpl implements AdministrableRoleAuthorizationsService {
    @Resource
    private AdministrableRoleAuthorizationsDao administrableRoleAuthorizationsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    @Override
    public AdministrableRoleAuthorizations queryById( ) {
        return this.administrableRoleAuthorizationsDao.queryById();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AdministrableRoleAuthorizations> queryAllByLimit(int offset, int limit) {
        return this.administrableRoleAuthorizationsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param administrableRoleAuthorizations 实例对象
     * @return 实例对象
     */
    @Override
    public AdministrableRoleAuthorizations insert(AdministrableRoleAuthorizations administrableRoleAuthorizations) {
        this.administrableRoleAuthorizationsDao.insert(administrableRoleAuthorizations);
        return administrableRoleAuthorizations;
    }

    /**
     * 修改数据
     *
     * @param administrableRoleAuthorizations 实例对象
     * @return 实例对象
     */
    @Override
    public AdministrableRoleAuthorizations update(AdministrableRoleAuthorizations administrableRoleAuthorizations) {
        this.administrableRoleAuthorizationsDao.update(administrableRoleAuthorizations);
        return this.queryById(administrableRoleAuthorizations.get());
    }

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById( ) {
        return this.administrableRoleAuthorizationsDao.deleteById() > 0;
    }
}