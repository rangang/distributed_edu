package com.edu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.edu.entity.Course;
import com.edu.mapper.CourseDao;
import com.edu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @BelongsProject: distributed_edu
 * @Author: RG
 * @CreateTime: 2022/7/13 5:46 下午
 * @Description:
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    public List<Course> getAllCourse() {
        return courseDao.getAllCourse();
    }
}
