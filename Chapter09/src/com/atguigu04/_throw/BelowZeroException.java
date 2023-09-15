package com.atguigu04._throw;

/**
 * className: BelowZeroException
 * Package : com.atguigu04._throw
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/1 20:11
 * @Version 1.0
 */
public class BelowZeroException extends Exception{
    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }

    public BelowZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public BelowZeroException(Throwable cause) {
        super(cause);
    }

}
