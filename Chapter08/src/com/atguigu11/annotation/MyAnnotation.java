package com.atguigu11.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * className: MyAnnotation
 * Package : com.atguigu11.annotation
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/26 2:00
 * @Version 1.0
 */

 @Target({ElementType.TYPE,ElementType.CONSTRUCTOR})//声明注解可以修饰的解构
 @Retention(RetentionPolicy.SOURCE)
public @interface MyAnnotation {
    //堪称属性，带小括号
    String value() default "hello";
}
