package com.edu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(User)实体类
 *
 * @author RG
 * @since 2022-06-30 11:38:07
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 654883286218136307L;
    /**
     * 用户id
     */
    private Integer id;
    /**
     * 用户昵称
     */
    private String name;
    /**
     * 用户头像地址
     */
    private String portrait;
    /**
     * 注册手机
     */
    private String phone;
    /**
     * 用户密码（可以为空，支持只用验证码注册、登录）
     */
    private String password;
    /**
     * 注册ip
     */
    private String regIp;
    /**
     * 是否有效用户
     */
    private String accountNonExpired;
    /**
     * 账号是否未过期
     */
    private String credentialsNonExpired;
    /**
     * 是否未锁定
     */
    private String accountNonLocked;
    /**
     * 用户状态：ENABLE能登录，DISABLE不能登录
     */
    private String status;
    /**
     * 是否删除
     */
    private String isDel;
    /**
     * 注册时间
     */
    private Date createTime;
    /**
     * 记录更新时间
     */
    private Date updateTime;

}

