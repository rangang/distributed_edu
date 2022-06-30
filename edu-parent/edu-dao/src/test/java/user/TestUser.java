package user;

import com.edu.entity.User;
import com.edu.mapper.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @BelongsProject: distributed_edu
 * @Author: RG
 * @CreateTime: 2022/6/30 11:49 上午
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-dao.xml" })
public class TestUser {

    @Autowired
    private UserDao userDao;

    @Test
    public void login() {

        User user = userDao.login("110", "123");
        System.out.println("user = " + user);

    }

}
