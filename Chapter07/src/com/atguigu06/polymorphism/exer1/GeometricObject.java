package com.atguigu06.polymorphism.exer1;

/**
 * className: eometricObject
 * Package : com.atguigu06.polymorphism.exer1
 * Description:

 * @Author gzzz
 * @Create 2023/8/16 20:53
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    protected GeometricObject(String color, double weight){
        this.color = color;
        this.weight = weight;
    }

    public double findArea(){
        return weight;
    }
}
