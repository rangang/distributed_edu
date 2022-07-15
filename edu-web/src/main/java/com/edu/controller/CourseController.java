package com.edu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.edu.entity.Course;
import com.edu.service.CourseService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @BelongsProject: edu-web
 * @Author: RG
 * @CreateTime: 2022/7/15 9:39 上午
 * @Description:
 */
@RestController
@RequestMapping("/course")
public class CourseController {

    @Reference
    private CourseService courseService;

    @RequestMapping("/getAllCourse")
    public List<Course> getAllCourse() {

        List<Course> list = courseService.getAllCourse();
        return list;

    }

    @RequestMapping("/getCourseByUserId/{userId}")
    public List<Course> getCourseByUserId(@PathVariable("userId") String userId) {
        List<Course> list = courseService.getCourseByUserId(userId);
        return list;
    }

    @RequestMapping("/getCourseById/{courseId}")
    public Course getCourseById(@PathVariable("courseId") Integer courseId) {
        return courseService.getCourseById(courseId);
    }

}
