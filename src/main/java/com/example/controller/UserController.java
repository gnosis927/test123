package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import com.example.utils.ServerResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "login")
    public ServerResponse login(String username,String pwd){
        User user=userService.queryById(123);
        return ServerResponse.createSRBySuccess(user);

    }
}
