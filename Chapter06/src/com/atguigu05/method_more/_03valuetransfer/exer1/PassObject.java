package com.atguigu05.method_more._03valuetransfer.exer1;

/**
 * className: PassObject
 * Package : com.atguigu05.method_more._03valuetransfer.exer1
 * Description:
 *定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
 *      public void printAreas(Circle c, int time)。
 *在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 *例如，time为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 * @Author gzzz
 * @Create 2023/8/11 1:01
 * @Version 1.0
 */
public class PassObject {
    public static void main(String[] args) {
        Circle circle = new Circle();
        PassObject test = new PassObject();
        test.printAreas(circle,5);
    }
    public void printAreas(Circle c, int time){
        for (int i = 1; i <= time; i++) {
            c.radius = (double)i;
            double area = c.findArea(c.radius);
            System.out.println("radius = "+c.radius+", and the area is "+area);
        }

    }
}
