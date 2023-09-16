package com.atguigu09.inner.exer;

/**
 * className: Exer01
 * Package : com.atguigu09.inner.exer
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/23 2:21
 * @Version 1.0
 */
public class Exer01 {
    public static void main(String[] args) {
        //编写一个匿名内部类，它继承Object，并在匿名内部类中，声明一个方法public void test()打印尚硅谷。
        new Object(){
            public void test(){
                System.out.println("尚硅谷");
            }
        }.test();
    }
}
