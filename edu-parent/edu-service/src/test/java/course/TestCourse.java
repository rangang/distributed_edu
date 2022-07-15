package course;

import com.edu.entity.Course;
import com.edu.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @BelongsProject: distributed_edu
 * @Author: RG
 * @CreateTime: 2022/7/13 5:55 下午
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/spring-*.xml" })
public class TestCourse {

    @Autowired
    private CourseService courseService;

    @Test
    public void getAllCourse() {

        List<Course> list = courseService.getAllCourse();
        System.out.println(list);

    }

    @Test
    public void getCourseByUserId() {

        List<Course> list = courseService.getCourseByUserId("100030018");
        System.out.println(list);

    }

    @Test
    public void getCourseById() {

        Course course = courseService.getCourseById(7);
        System.out.println(course);

    }


}
