package com.atguigu07.object.equals.exer1;

import java.util.Objects;

/**
 * className: Order
 * Package : com.atguigu07.object.equals.exer1
 * Description:
 *编写Order类，有int型的orderId，String型的orderName，相应的getter()和setter()方法，两个参数的构造器，
 * 重写父类的equals()方法：public boolean equals(Object obj)，并判断测试类中创建的两个对象是否相等。
 * @Author gzzz
 * @Create 2023/8/17 0:07
 * @Version 1.0
 */
public class Order {
    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && Objects.equals(orderName, order.orderName);
    }


}
