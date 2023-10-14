package com.atguigu04.other.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * className: Table
 * Package : com.atguigu04.other.annotation
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/14 16:02
 * @Version 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    String value() default "abc";
}
