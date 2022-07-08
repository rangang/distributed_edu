package com.edu.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @BelongsProject: distributed_edu
 * @Author: RG
 * @CreateTime: 2022/7/8 1:14 下午
 * @Description:
 */
@Data
public class UserDTO<User> implements Serializable {

    private static final long serialVersionUID = 1L;
    private int state;  // 操作状态
    private String message;  // 状态描述
    private User content;  // 响应内容
}
