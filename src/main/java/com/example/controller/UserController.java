package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import com.example.utils.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-04-09 23:11:17
 */
@RestController
@RequestMapping("user")
public class UserController {
    public final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("login")
    public ServerResponse login(@RequestParam("tel") String tel,@RequestParam("pwd")String pwd){
        return userService.login(tel,pwd);
    }
    @RequestMapping("regist")
    public ServerResponse regist(User user){
        return userService.regist(user);
    }
}