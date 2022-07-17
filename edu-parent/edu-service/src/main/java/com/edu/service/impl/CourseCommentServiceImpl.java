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

    /**
     * 点赞：
     * 先查看当前用户对这条留言是否点过赞，
     * 如果点过：修改is_del状态即可，取消赞
     * 如果没点过：保存一条点赞的信息
     *
     * 最终，更新赞的数量
     * @param commentId 留言编号
     * @param userId    用户编号
     * @return
     */
    public Integer saveFavorite(Integer commentId, Integer userId) {
        Integer count = courseCommentDao.existsFavorite(commentId, userId);
        Integer i1 = 0;
        Integer i2 = 0;
        if (count == 0) {
            // 没点过赞
            i1 = courseCommentDao.saveCommentFavorite(commentId, userId);
        } else {
            i1 = courseCommentDao.updateFavoriteStatus(0, commentId, userId);
        }
        i2 = courseCommentDao.updateLikeCount(1,commentId);
        if (i1 == 0 || i2 == 0) {
            throw new RuntimeException("点赞失败");
        }
        return commentId;
    }

    /**
     * 删除点赞的信息（is_del = 1）
     * 更新留言赞的数量-1
     * @param commentId 留言编号
     * @param userId    用户编号
     * @return
     */
    public Integer cancelFavorite(Integer commentId, Integer userId) {
        Integer i1 = courseCommentDao.updateFavoriteStatus(1, commentId, userId);
        Integer i2 = courseCommentDao.updateLikeCount(-1, commentId);

        if (i1 == 0 || i2 == 0) {
            throw new RuntimeException("取消点赞");
        }

        return i2;
    }
}
