package com.edu.mapper;

import com.edu.entity.UserCourseOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @BelongsProject: distributed_edu
 * @Author: RG
 * @CreateTime: 2022/7/15 3:15 下午
 * @Description:
 */
public interface OrderDao {

    /**
     * 生成订单
     * @param orderNo   订单编号
     * @param userId    用户编号
     * @param courseId  课程编号
     * @param activityCourseId  活动课程编号
     * @param sourceType    订单来源类型
     */
    void saveOrder(@Param("orderNo") String orderNo, @Param("userId") String userId, @Param("courseId") String courseId, @Param("activityCourseId") String activityCourseId, @Param("sourceType") String sourceType);

    /**
     * 修改订单状态
     * @param orderNo   订单编号
     * @param status    订单状态 0已创建 10已支付 20已完成 30已取消 40已过期
     */
    Integer updateOrder(@Param("orderNo") String orderNo,@Param("status") Integer status);

    /**
     * 删除订单
     * @param orderNo   订单编号
     * @return
     */
    Integer deleteOrder(String orderNo);

    /**
     * 查询登录用户的全部订单
     * @param userId    用户编号
     * @return
     */
    List<UserCourseOrder> getOrderByUserId(String userId);

}
