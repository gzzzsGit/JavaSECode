package com.atguigu06.polymorphism.exer4;

/**
 * className: Woman
 * Package : com.atguigu06.polymorphism.exer4
 * Description:
 *（3）在Woman类中，包含
 * ①重写上面的方法
 * ②增加 public void makeup()：打印化妆
 * @Author gzzz
 * @Create 2023/8/16 22:37
 * @Version 1.0
 */
public class Woman extends Person{
    @Override
    public void eat() {
        System.out.println("woman eat");
    }

    @Override
    public void toilet() {
        System.out.println("woman wc");
    }

    public void makeup(){
        System.out.println("make up");
    }
}
