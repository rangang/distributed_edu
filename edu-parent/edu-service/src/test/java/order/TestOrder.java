package order;

import com.edu.entity.UserCourseOrder;
import com.edu.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.UUID;

/**
 * @BelongsProject: distributed_edu
 * @Author: RG
 * @CreateTime: 2022/7/15 3:44 下午
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/spring-*.xml" })
public class TestOrder {

    @Autowired
    private OrderService orderService;

    @Test
    public void saveOrder() {

        String orderNo= UUID.randomUUID().toString();
        String userId = "100030011";
        String courseId = "8";
        String activityCourseId = "0"; // 0表示，本课程没有活动
        String sourceType = "1";
        orderService.saveOrder(orderNo,userId,courseId,activityCourseId,sourceType);

    }

    @Test
    public void updateOrder() {

        Integer i = orderService.updateOrder("283db46e-6a4b-44ca-8e88-3160bce62b1b",0);
        System.out.println(i);
    }

    @Test
    public void deleteOrder() {
        Integer i = orderService.deleteOrder("283db46e-6a4b-44ca-8e88-3160bce62b1c");
        System.out.println(i);
    }

    @Test
    public void getOrderByUserId() {
        List<UserCourseOrder> list = orderService.getOrderByUserId("100030011");
        System.out.println(list);
    }

}
