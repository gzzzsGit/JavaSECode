package com.atguigu06.polymorphism.exer3;

/**
 * className: Person
 * Package : com.atguigu06.polymorphism.exer3
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/16 22:23
 * @Version 1.0
 */
class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}