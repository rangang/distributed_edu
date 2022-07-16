package com.edu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.edu.entity.CourseComment;
import com.edu.service.CourseCommentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @BelongsProject: edu-web
 * @Author: RG
 * @CreateTime: 2022/7/16 4:27 下午
 * @Description:
 */
@RestController
@RequestMapping("/courseComment")
public class CourseCommentController {

    @Reference
    private CourseCommentService courseCommentService;

    @RequestMapping("/saveCourseComment")
    public Integer saveCourseComment(Integer courseId,Integer userId,String userName,String comment) throws UnsupportedEncodingException {

        userName = new String(userName.getBytes("ISO-8859-1"),"UTF-8");
        comment = new String(comment.getBytes("ISO-8859-1"),"UTF-8");

        CourseComment courseComment = new CourseComment();
        courseComment.setCourseId(courseId); // 课程编号
        courseComment.setSectionId(0); // 章节编号
        courseComment.setLessonId(0);// 小节编号
        courseComment.setUserId(userId); // 用户编号
        courseComment.setUserName(userName); // 用户昵称
        courseComment.setParentId(0); //没有父id
        courseComment.setComment(comment);// 留言内容
        courseComment.setType(0); // 0用户留言
        courseComment.setLastOperator(userId); //最后操作的用户编号
        Integer i = courseCommentService.saveCourseComment(courseComment);
        return i;
    }

    @RequestMapping("/getCourseCommentByCourseId/{courseId}/{pageIndex}/{pageSize}")
    public List<CourseComment> getCourseCommentByCourseId(@PathVariable("courseId") Integer courseId,@PathVariable("pageIndex") Integer pageIndex,@PathVariable("pageSize") Integer pageSize) {

        Integer offset = (pageIndex - 1) * pageSize;
        List<CourseComment> list = courseCommentService.getCourseCommentByCourseId(courseId, offset, pageSize);
        return list;

    }


}
