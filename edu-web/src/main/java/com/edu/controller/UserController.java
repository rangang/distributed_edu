package com.edu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.edu.entity.User;
import com.edu.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: edu-web
 * @Author: RG
 * @CreateTime: 2022/7/7 2:40 下午
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/login")
    public User login(String phone,String password) {

        User user = userService.login(phone, password);
        return user;

    }

}
