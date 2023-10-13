package com.atguigu02._class;

import org.junit.Test;

import java.lang.annotation.ElementType;

/**
 * className: ClassTest
 * Package : com.atguigu02._class
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/13 13:08
 * @Version 1.0
 */
public class ClassTest {
    @Test
    public void test1() throws ClassNotFoundException {
        //获取Class类的实例的几种方式
        //1. 调用运行时类的静态属性:class
        Class clazz1 = User.class;
        System.out.println(clazz1);//class com.atguigu02._class.User

        //2.调用运行时类的对象的getClass()
        User u1 = new User();
        Class clazz2 = u1.getClass();
        System.out.println(clazz1==clazz2);//true

        //3.调用Class的静态方法forName()
        String className = "com.atguigu02._class.User";
        Class clazz3 = Class.forName(className);
        System.out.println(clazz1==clazz3);//true

        //使用类的加载器
        Class clazz4  = ClassLoader.getSystemClassLoader().loadClass(className);
        System.out.println(clazz1 == clazz4);//true
    }
    
    @Test
    public void test2(){
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = ElementType.class;
        System.out.println(c5);//class java.lang.annotation.ElementType
        Class c6 = Override.class;
        System.out.println(c6);//interface java.lang.Override
        Class c7 = int.class;
        System.out.println(c7);//int
        Class c8 = void.class;
        System.out.println(c8);//void
        Class c9 = Class.class;

        int[] a = new int[10];
        int[] b = new int[100];
        Class c10 = a.getClass();//true
        Class c11 = b.getClass();//true
        // 只要元素类型与维度一样，就是同一个Class
        System.out.println(c10 == c11);
    }
}
