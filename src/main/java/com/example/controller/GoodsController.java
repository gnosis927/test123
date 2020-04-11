package com.example.controller;

import com.example.entity.Goods;
import com.example.service.GoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Goods)表控制层
 *
 * @author makejava
 * @since 2020-04-11 10:33:53
 */
@RestController
@RequestMapping("goods")
public class GoodsController {
    /**
     * 服务对象
     */
    @Resource
    private GoodsService goodsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Goods selectOne(Integer id) {
        return this.goodsService.queryById(id);
    }

}