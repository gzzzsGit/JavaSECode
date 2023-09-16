package com.atguigu06.polymorphism.exer4;

/**
 * className: Man
 * Package : com.atguigu06.polymorphism.exer4
 * Description:
 *（2）在Man类中，包含
 * ①重写上面的方法
 * ②增加  public void smoke()：打印抽烟
 * @Author gzzz
 * @Create 2023/8/16 22:37
 * @Version 1.0
 */
public class Man extends Person {
    @Override
    public void eat() {
        System.out.println("man eat");
    }

    @Override
    public void toilet() {
        System.out.println("man wc");
    }
    public void smoke(){
        System.out.println("smoke");
    }
}
