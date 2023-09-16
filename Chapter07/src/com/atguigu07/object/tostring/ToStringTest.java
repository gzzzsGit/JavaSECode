package com.atguigu07.object.tostring;

import com.atguigu07.object.tostring.exer.Circle;

/**
 * @author 尚硅谷-宋红康
 * @create 1:04
 * 定义两个类，父类GeometricObject代表几何形状，子类Circle代表圆形。
 * 写一个测试类，创建两个Circle对象，判断其颜色是否相等；利用equals方法判断其半径是否相等；
 * 利用toString()方法输出其半径。
 */
public class ToStringTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2,"yellow",1.0);
        Circle c2 = new Circle(2);
        System.out.println("color:"+(c1.getColor().equals(c2.getColor())));
        System.out.println("radius equals: "+c1.equals(c2));
        System.out.println(c1);
    }
}
