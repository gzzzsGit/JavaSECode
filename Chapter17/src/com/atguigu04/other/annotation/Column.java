package com.atguigu04.other.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * className: Column
 * Package : com.atguigu04.other.annotation
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/14 16:06
 * @Version 1.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    String columnName();
    String columnType();
}
