package com.atguigu04.example.exer1;

/**
 * className: Person
 * Package : com.atguigu04.example.exer1
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/8 23:06
 * @Version 1.0
 */
public class Person {
    String name;
    int age;
    char gender;


    public void study(){
        System.out.println("studying");
    }

    public int showAge(){
        return age;
    }

    public void addAge(int age) {
        this.age += age;
    }
}
