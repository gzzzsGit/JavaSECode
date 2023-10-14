package com.atguigu04.other.interview;

/**
 * className: Order
 * Package : com.atguigu04.other.interview
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/14 22:45
 * @Version 1.0
 */
public class Order {
    static int orderDesc = 1;

    static {
        orderDesc=2;
        System.out.println("Order static block...");
    }
}
