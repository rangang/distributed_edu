package com.edu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.edu.entity.UserCourseOrder;
import com.edu.mapper.OrderDao;
import com.edu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @BelongsProject: distributed_edu
 * @Author: RG
 * @CreateTime: 2022/7/15 3:42 下午
 * @Description:
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public void saveOrder(String orderNo, String userId, String courseId, String activityCourseId, String sourceType) {
        orderDao.saveOrder(orderNo,userId,courseId,activityCourseId,sourceType);
    }

    @Override
    public Integer updateOrder(String orderNo, Integer status) {
        return orderDao.updateOrder(orderNo,status);
    }

    @Override
    public Integer deleteOrder(String orderNo) {
        return orderDao.deleteOrder(orderNo);
    }

    @Override
    public List<UserCourseOrder> getOrderByUserId(String userId) {
        return orderDao.getOrderByUserId(userId);
    }
}
