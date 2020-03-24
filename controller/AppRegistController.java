package .controller;

import .entity.AppRegist;
import .service.AppRegistService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AppRegist)表控制层
 *
 * @author makejava
 * @since 2020-03-23 19:33:59
 */
@RestController
@RequestMapping("appRegist")
public class AppRegistController {
    /**
     * 服务对象
     */
    @Resource
    private AppRegistService appRegistService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AppRegist selectOne(Integer id) {
        return this.appRegistService.queryById(id);
    }

}