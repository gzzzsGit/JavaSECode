package com.atguigu05.method_more._03valuetransfer.exer1;

/**
 * className: Circle
 * Package : com.atguigu05.method_more._03valuetransfer.exer1
 * Description:
 *1. 定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
 * @Author gzzz
 * @Create 2023/8/11 1:00
 * @Version 1.0
 */
public class Circle {
    double radius;

    public double findArea(double radius){
        return Math.PI*radius*radius;
    }
}
