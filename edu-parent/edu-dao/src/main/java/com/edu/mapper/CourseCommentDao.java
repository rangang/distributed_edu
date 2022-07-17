package com.edu.mapper;

import com.edu.entity.CourseComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @BelongsProject: distributed_edu
 * @Author: RG
 * @CreateTime: 2022/7/16 9:47 上午
 * @Description:
 */
public interface CourseCommentDao {

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
    List<CourseComment> getCourseCommentByCourseId(@Param("courseId") Integer courseId,@Param("offset") Integer offset,@Param("pageSize") Integer pageSize);

    /**
     * 查看某个用户的某条留言是否点过赞
     * @param commentId 留言编号
     * @param userId    用户编号
     * @return
     */
    Integer existsFavorite(@Param("commentId") Integer commentId,@Param("userId") Integer userId);

    /**
     * 保存点赞信息
     * @param commentId 留言编号
     * @param userId    用户编号
     * @return
     */
    Integer saveCommentFavorite(@Param("commentId") Integer commentId,@Param("userId") Integer userId);

    /**
     * 更新点赞信息的状态（将is_del=0，表示已赞）
     * @param status    状态，0：已赞，1：取消赞
     * @param commentId 留言编号
     * @param userId    用户编号
     * @return
     */
    Integer updateFavoriteStatus(@Param("status") Integer status,@Param("commentId") Integer commentId,@Param("userId") Integer userId);

    /**
     * 更新点赞的数量
     * @param x +1的话，赞的数量增加，-1的话，赞的数量减少
     * @param commentId 某条留言的编号
     * @return
     */
    Integer updateLikeCount(@Param("x") Integer x, @Param("commentId") Integer commentId);

}
