package com.edu.service;

import com.edu.entity.User;

/**
 * 用户表(User)表服务接口
 *
 * @author RG
 * @since 2022-06-30 13:46:52
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
