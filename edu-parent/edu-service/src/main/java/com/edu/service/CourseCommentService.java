package com.edu.service;

import com.edu.entity.CourseComment;

import java.util.List;

/**
 * @BelongsProject: distributed_edu
 * @Author: RG
 * @CreateTime: 2022/7/16 4:18 下午
 * @Description:
 */
public interface CourseCommentService {

    /**
     * 保存留言
     * @param courseComment 留言内容对象
     * @return
     */
    Integer saveCourseComment(CourseComment courseComment);

    /**
     * 某个课程的全部留言（分页）
     * @param courseId  课程编号
     * @param offset    数据偏移
     * @param pageSize  每页条目数
     * @return
     */
    List<CourseComment> getCourseCommentByCourseId(Integer courseId, Integer offset, Integer pageSize);


}
