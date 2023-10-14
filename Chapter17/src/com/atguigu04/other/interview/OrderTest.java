package com.atguigu04.other.interview;

import org.junit.Test;

/**
 * className: OrderTest
 * Package : com.atguigu04.other.interview
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/14 22:45
 * @Version 1.0
 */
public class OrderTest {
    @Test
    public void test1() throws ClassNotFoundException {
        String className = "com.atguigu04.other.interview.Order";
        //执行了类的装载、链接、初始化(clinit方法)
        Class.forName(className);//Order static block...
    }

    @Test
    public void test2() throws ClassNotFoundException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        //调用类的加载器加载没有进入初始化阶段，只是执行了类的装载过程
        classLoader.loadClass("com.atguigu04.other.interview.Order");//

    }
}
