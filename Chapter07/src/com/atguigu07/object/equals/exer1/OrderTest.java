package com.atguigu07.object.equals.exer1;

/**
 * className: OrderTest
 * Package : com.atguigu07.object.equals.exer1
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/17 0:12
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(1,"123");
        Order o2 = new Order(2,"xiba");
        Order o3 = new Order(1,"123");
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
    }
}
