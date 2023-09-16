package com.atguigu08._interface.jdk8;

/**
 * className: CompareA
 * Package : com.atguigu08._interface.jdk8
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/22 16:11
 * @Version 1.0
 */
public interface CompareA {

    //jdk8中可以声明静态方法
    public static void method1(){
        System.out.println("CompareA:北京");
    }

    public default void method2(){
        System.out.println("CompareA:上海");
    }

    public default void method3(){
        System.out.println("CompareA:广州");
    }

    default void method4(){
        System.out.println("CompareA：深圳");
    }

    private void method6(){
        System.out.println("jdk9中可以定义私有方法");
    }
}
