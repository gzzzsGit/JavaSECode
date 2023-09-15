package com.atguigu06.project.team.service;

/**
 * className: TeamException
 * Package : com.atguigu06.project.team.service
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/4 3:58
 * @Version 1.0
 */
public class TeamException extends RuntimeException{
    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }

    public TeamException(String message, Throwable cause) {
        super(message, cause);
    }

    public TeamException(Throwable cause) {
        super(cause);
    }
}
