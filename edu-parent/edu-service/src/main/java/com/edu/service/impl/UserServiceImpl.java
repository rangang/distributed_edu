package com.edu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.edu.entity.User;
import com.edu.mapper.UserDao;
import com.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户表(User)表服务实现类
 *
 * @author RG
 * @since 2022-06-30 13:46:53
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(String phone, String password) {
        return userDao.login(phone,password);
    }
}
