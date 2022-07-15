package com.edu.service;

import com.edu.entity.Course;

import java.util.List;

/**
 * @BelongsProject: edu-web
 * @Author: RG
 * @CreateTime: 2022/7/15 9:38 上午
 * @Description:
 */
public interface CourseService {

    /**
     * 查询全部课程信息
     * @return
     */
    List<Course> getAllCourse();

    /**
     * 查询已登录用户购买的全部课程信息
     * @param userId
     * @return
     */
    List<Course> getCourseByUserId(String userId);

    /**
     * 查询某门课程的详细信息
     * @param courseId
     * @return
     */
    Course getCourseById(Integer courseId);

}
