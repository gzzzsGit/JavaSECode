package com.atguigu05.exer.exer4;

/**
 * className: BelowZeroException
 * Package : com.atguigu05.exer.exer4
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/2 20:09
 * @Version 1.0
 */
public class BelowZeroException extends RuntimeException{

    static final long serialVersionUID = -7034897190464766939L;
    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }

    public BelowZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
