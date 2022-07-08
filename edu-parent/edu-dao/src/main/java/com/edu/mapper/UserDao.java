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
    Integer register(@Param("phone") String phone, @Param("password") String password, @Param("nickname") String nickname, @Param("portrait") String portrait);

}

