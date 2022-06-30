package com.edu.mapper;

import com.edu.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户表(User)表数据库访问层
 *
 * @author RG
 * @since 2022-06-30 11:41:14
 */
public interface UserDao {

    /**
     * 用户登录
     * @param phone     手机号
     * @param password  密码
     * @return  用户信息
     */
    User login(@Param("phone") String phone, @Param("password") String password);

}

