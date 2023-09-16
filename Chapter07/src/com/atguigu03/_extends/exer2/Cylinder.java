package com.atguigu03._extends.exer2;

/**
 * className: Cylinder
 * Package : com.atguigu03._extends.exer2
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/14 22:51
 * @Version 1.0
 */
public class Cylinder extends Circle{
    private double length;

    public Cylinder() {
        super();
        this.length = 1;
    }

    public Cylinder(double radius) {
        super(radius);
        this.length = 1;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return super.findArea()*length;
    }

    @Override
    public double findArea() {
        return super.findArea()*2+ Math.PI*2*getRadius()*length;
    }
}
