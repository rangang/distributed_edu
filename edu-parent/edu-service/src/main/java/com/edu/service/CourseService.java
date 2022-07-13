package com.edu.service;

import com.edu.entity.Course;

import java.util.List;

/**
 * @BelongsProject: distributed_edu
 * @Author: RG
 * @CreateTime: 2022/7/13 5:46 下午
 * @Description:
 */
public interface CourseService {

    /**
     * 查询全部课程信息
     * @return
     */
    List<Course> getAllCourse();

}
