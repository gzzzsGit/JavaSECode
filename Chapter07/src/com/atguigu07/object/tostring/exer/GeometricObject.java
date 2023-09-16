package com.atguigu07.object.tostring.exer;

/**
 * className: GeometricObject
 * Package : com.atguigu07.object.tostring.exer
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/17 2:04
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(){
        color = "white";
        weight = 1.0;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

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
}
