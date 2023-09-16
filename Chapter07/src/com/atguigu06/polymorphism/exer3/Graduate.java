package com.atguigu06.polymorphism.exer3;

/**
 * className: Graduate
 * Package : com.atguigu06.polymorphism.exer3
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/16 22:24
 * @Version 1.0
 */
class Graduate extends Student{
    public String major="IT";
    @Override
    public String getInfo()
    {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}