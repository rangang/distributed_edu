package com.edu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.edu.entity.User;
import com.edu.entity.UserDTO;
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
    public UserDTO login(String phone,String password, String nickname, String portrait) {

        UserDTO userDTO = new UserDTO();
        User user = null;

        // 检测手机号是否注册
        Integer i = userService.checkPhone(phone);
        if (i == 0) {
            // 未注册，自动注册并登录
            userService.register(phone,password,nickname,portrait);
            userDTO.setMessage("手机号未注册，系统已帮您自动注册，请牢记密码！");
            user = userService.login(phone,password);
        } else {
            user = userService.login(phone, password);
            if (user != null) {
                userDTO.setState(200);
                userDTO.setMessage("登录成功");

            } else {
                userDTO.setState(300);
                userDTO.setMessage("账号密码不匹配，登录失败！");
            }
        }

        userDTO.setContent(user);
        return userDTO;
    }

}
