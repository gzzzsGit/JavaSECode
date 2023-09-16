package com.atguigu06.polymorphism.exer3;

/**
 * className: Student
 * Package : com.atguigu06.polymorphism.exer3
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/16 22:24
 * @Version 1.0
 */
class Student extends Person {
    protected String school="pku";
    @Override
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}
