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
     * @param phone     手机号
     * @param password  密码
     * @return  用户信息
     */
    User login(String phone, String password);

    /**
     * 检查手机号是否注册过
     * @param phone 手机号
     * @return  0：未注册   1：已注册
     */
    Integer checkPhone(String phone);

    /**
     * 用户注册
     *
     * @param phone    手机号
     * @param password 密码
     * @param nickname 昵称
     * @param portrait 头像
     * @return 受影响的行数
     */
    Integer register(String phone, String password, String nickname, String portrait);


}

