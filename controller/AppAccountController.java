package .controller;

import .entity.AppAccount;
import .service.AppAccountService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AppAccount)表控制层
 *
 * @author makejava
 * @since 2020-03-23 19:34:12
 */
@RestController
@RequestMapping("appAccount")
public class AppAccountController {
    /**
     * 服务对象
     */
    @Resource
    private AppAccountService appAccountService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AppAccount selectOne(Integer id) {
        return this.appAccountService.queryById(id);
    }

}