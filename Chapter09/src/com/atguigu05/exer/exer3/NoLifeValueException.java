package com.atguigu05.exer.exer3;

/**
 * className: NoLifeValueException
 * Package : com.atguigu05.exer.exer3
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/1 21:07
 * @Version 1.0
 */
public class NoLifeValueException extends RuntimeException{

    static final long serialVersionUID = -33875169246549948L;
    public NoLifeValueException() {
    }

    public NoLifeValueException(String message) {
        super(message);
    }

    public NoLifeValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoLifeValueException(Throwable cause) {
        super(cause);
    }
}
