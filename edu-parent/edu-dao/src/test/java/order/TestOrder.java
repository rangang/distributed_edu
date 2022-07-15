package order;

import com.edu.entity.UserCourseOrder;
import com.edu.mapper.OrderDao;
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
 * @CreateTime: 2022/7/15 3:24 下午
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-dao.xml" })
public class TestOrder {

    @Autowired
    private OrderDao orderDao;

    @Test
    public void saveOrder() {
        String orderNo= UUID.randomUUID().toString();
        String userId = "100030011";
        String courseId = "7";
        String activityCourseId = "0"; // 0表示，本课程没有活动
        String sourceType = "1";
        orderDao.saveOrder(orderNo,userId,courseId,activityCourseId,sourceType);

    }

    @Test
    public void updateOrder() {

        orderDao.updateOrder("283db46e-6a4b-44ca-8e88-3160bce62b1b",20);

    }

    @Test
    public void deleteOrder() {
        Integer i = orderDao.deleteOrder("283db46e-6a4b-44ca-8e88-3160bce62b1b");
        System.out.println(i);
    }

    @Test
    public void getOrderByUserId() {
        List<UserCourseOrder> list = orderDao.getOrderByUserId("100030011");
        System.out.println(list);
    }

}
