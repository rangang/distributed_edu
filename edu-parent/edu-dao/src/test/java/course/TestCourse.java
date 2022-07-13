package course;

import com.edu.entity.Course;
import com.edu.mapper.CourseDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @BelongsProject: distributed_edu
 * @Author: RG
 * @CreateTime: 2022/7/13 5:27 下午
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-dao.xml" })
public class TestCourse {

    @Autowired
    private CourseDao courseDao;

    @Test
    public void getAllCourse() {

        List<Course> list = courseDao.getAllCourse();
        System.out.println(list);

    }

}
