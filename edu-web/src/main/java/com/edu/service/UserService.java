package com.edu.service;

import com.edu.entity.User;

/**
 * @BelongsProject: edu-web
 * @Author: RG
 * @CreateTime: 2022/7/7 2:32 下午
 * @Description:
 */
public interface UserService {

    /**
     * 用户登录
     * @param phone
     * @param password
     * @return
     */
    User login(String phone, String password);

}
