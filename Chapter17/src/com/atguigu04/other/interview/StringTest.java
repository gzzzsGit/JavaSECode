package com.atguigu04.other.interview;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * className: StringTest
 * Package : com.atguigu04.other.interview
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/14 22:55
 * @Version 1.0
 */
public class StringTest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException {
        //使用反射创建String类实例
        Class clazz = Class.forName("java.lang.String");
        String obj = (String) clazz.newInstance();

        //获取value属性，按理来说是byte[]类型
        Field value = clazz.getDeclaredField("value");
        value.setAccessible(true);
        //java17新特性：对于核心源码的api，内部的私有的结构不可以通过反射暴力调用了
        value.get(obj);//java.lang.reflect.InaccessibleObjectException: Unable to make field private final byte[] java.lang.String.value accessible: module java.base does not "opens java.lang" to unnamed module @4459eb14
    }
}
