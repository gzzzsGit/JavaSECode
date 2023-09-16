package com.atguigu06.polymorphism;

/**
 * className: Man
 * Package : com.atguigu06.polymorphism
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/16 18:04
 * @Version 1.0
 */
public class Man extends Person {
    public static void main(String[] args) {
        Person m  = new Man();
        System.out.println(m.id);
        m.eat();

    }
    public int id=1002;

    @Override
    public void eat() {
        System.out.println("男人要多吃饭");;
    }

}
