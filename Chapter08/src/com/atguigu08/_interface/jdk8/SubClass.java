package com.atguigu08._interface.jdk8;

/**
 * className: SubClass
 * Package : com.atguigu08._interface.jdk8
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/22 16:12
 * @Version 1.0
 */
public class SubClass extends SuperClass implements CompareA,CompareB {
    @Override
    public void method2() {
        System.out.println("Subclass:上海");
    }

    @Override
    public void method3() {
        System.out.println("SubClass:广州");
    }

    //知识点5:如何在子类（或实现类）中调用接口中被重写的方法,使用接口.super.方法
    public void method5(){
        CompareA.super.method3();
        CompareB.super.method3();
    }
}
