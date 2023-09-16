package com.atguigu03._extends.exer1;

/**
 * className: KidsTest
 * Package : com.atguigu03._extends.exer1
 * Description:
 *(3)定义类KidsTest，在类的main方法中实例化Kids的对象someKid，用该对象访问其父类的成员变量及方法。
 * @Author gzzz
 * @Create 2023/8/14 22:35
 * @Version 1.0
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids(12,1,0);
        someKid.printAge();
        someKid.employeed();
        someKid.manOrWoman();
    }
}
