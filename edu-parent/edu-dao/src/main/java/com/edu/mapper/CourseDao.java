package com.edu.mapper;

import com.edu.entity.Course;

import java.util.List;

/**
 * @BelongsProject: distributed_edu
 * @Author: RG
 * @CreateTime: 2022/7/11 3:02 下午
 * @Description:
 */
public interface CourseDao {

    /**
     * 查询全部课程信息
     * @return
     */
    List<Course> getAllCourse();

}
