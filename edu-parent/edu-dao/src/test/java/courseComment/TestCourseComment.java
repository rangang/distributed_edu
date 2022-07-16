package courseComment;

import com.edu.entity.CourseComment;
import com.edu.mapper.CourseCommentDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @BelongsProject: distributed_edu
 * @Author: RG
 * @CreateTime: 2022/7/16 9:51 上午
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-dao.xml" })
public class TestCourseComment {

    @Autowired
    private CourseCommentDao courseCommentDao;

    @Test
    public void saveCourseComment() {

       CourseComment comment = new CourseComment();
       comment.setCourseId(7); // 课程编号
       comment.setSectionId(8); // 章节编号
       comment.setLessonId(10);// 小节编号
       comment.setUserId(100030011); // 用户编号
       comment.setUserName("Angier"); // 用户昵称
       comment.setParentId(0); //没有父id
       comment.setComment("very good!");// 留言内容
       comment.setType(0); // 0用户留言
       comment.setLastOperator(100030011); //最后操作的用户编号
       Integer i = courseCommentDao.saveCourseComment(comment);
       System.out.println(i);

    }

    @Test
    public void getCourseCommentByCourseId() {

        int pageSize = 20;
        int pageIndex = 3; //页码（第几页）

        List<CourseComment> list = courseCommentDao.getCourseCommentByCourseId(1, (pageIndex-1)*pageSize, pageSize);
        for(int i = 0;i<list.size();i++){
           CourseComment comment = list.get(i);
           System.out.println((i+1)+"、楼 【"+comment.getUserName()+"】 说：" + comment.getComment());
        }
    }




}
