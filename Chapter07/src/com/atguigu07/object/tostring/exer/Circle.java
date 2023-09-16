package com.atguigu07.object.tostring.exer;

/**
 * className: Circle
 * Package : com.atguigu07.object.tostring.exer
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/17 2:04
 * @Version 1.0
 */
public class Circle extends GeometricObject{
    protected double radius;

    public Circle(){
        color = "white";
        radius = 1.0;
        weight = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
