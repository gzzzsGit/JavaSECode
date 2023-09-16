package com.atguigu06.polymorphism.exer1;

/**
 * className: MyRectangle
 * Package : com.atguigu06.polymorphism.exer1
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/16 20:53
 * @Version 1.0
 */
public class MyRectangle extends GeometricObject {

    double width;
    double height;

    public MyRectangle(double width, double height, String color, double weight) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findArea(){
        return width*height/2;
    }
}
