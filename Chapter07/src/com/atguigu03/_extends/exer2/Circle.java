package com.atguigu03._extends.exer2;

/**
 * className: Circle
 * Package : com.atguigu03._extends.exer2
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/14 22:51
 * @Version 1.0
 */
public class Circle {
    private double radius;

    public Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double findArea(){
        return radius*radius*Math.PI;
    }
}
