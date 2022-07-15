package com.edu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.edu.entity.UserCourseOrder;
import com.edu.service.OrderService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @BelongsProject: edu-web
 * @Author: RG
 * @CreateTime: 2022/7/15 3:52 下午
 * @Description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Reference
    private OrderService orderService;

    @RequestMapping("/saveOrder")
    public String saveOrder(String orderNo, String userId, String courseId, String activityCourseId, String sourceType) {
        orderService.saveOrder(orderNo,userId,courseId,activityCourseId,sourceType);
        return orderNo;
    }

    @RequestMapping("/updateOrder/{orderNo}/{status}")
    public Integer updateOrder(@PathVariable("orderNo") String orderNo,@PathVariable("status") Integer status) {
        return orderService.updateOrder(orderNo,status);
    }

    @RequestMapping("/deleteOrder/{orderNo}")
    public Integer deleteOrder(@PathVariable("orderNo") String orderNo) {
        return orderService.deleteOrder(orderNo);
    }

    @RequestMapping("/getOrderByUserId/{userId}")
    public List<UserCourseOrder> getOrderByUserId(@PathVariable("userId") String userId) {
        return orderService.getOrderByUserId(userId);
    }

}
