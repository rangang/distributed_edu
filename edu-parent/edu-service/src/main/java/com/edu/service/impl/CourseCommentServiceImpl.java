package com.edu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.edu.entity.CourseComment;
import com.edu.mapper.CourseCommentDao;
import com.edu.service.CourseCommentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @BelongsProject: distributed_edu
 * @Author: RG
 * @CreateTime: 2022/7/16 4:18 下午
 * @Description:
 */
@Service
public class CourseCommentServiceImpl implements CourseCommentService {

    @Autowired
    private CourseCommentDao courseCommentDao;

    public Integer saveCourseComment(CourseComment courseComment) {
        return courseCommentDao.saveCourseComment(courseComment);
    }

    public List<CourseComment> getCourseCommentByCourseId(Integer courseId, Integer offset, Integer pageSize) {
        return courseCommentDao.getCourseCommentByCourseId(courseId,offset,pageSize);
    }
}
