package com.atguigu03._extends.exer2;

/**
 * className: CirlinderTest
 * Package : com.atguigu03._extends.exer2
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/14 22:52
 * @Version 1.0
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(2);
        c1.setLength(3);
        System.out.println(c1.findVolume());
        System.out.println(c1.findArea());
    }
}
