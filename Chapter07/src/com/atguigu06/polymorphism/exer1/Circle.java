package com.atguigu06.polymorphism.exer1;

/**
 * className: Circle
 * Package : com.atguigu06.polymorphism.exer1
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/16 20:53
 * @Version 1.0
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle(double radius,String color, double weight) {
        super(color,weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return radius*radius* Math.PI;
    }
}
