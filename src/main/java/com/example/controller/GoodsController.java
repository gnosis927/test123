package com.example.controller;

import com.example.entity.Goods;
import com.example.entity.User;
import com.example.service.GoodsService;
import com.example.service.UserService;
import com.example.utils.ServerResponse;
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
    public final GoodsService GoodsService;

    public GoodsController(GoodsService GoodsService) {
        this.GoodsService = GoodsService;
    }

    @RequestMapping("search")
    public ServerResponse Search(String good_name, String good_kind){
        return GoodsService.Search(good_name,good_kind);
    }

}