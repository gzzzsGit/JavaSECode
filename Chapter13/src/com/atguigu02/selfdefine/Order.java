package com.atguigu02.selfdefine;

import java.util.ArrayList;

/**
 * className: Order
 * Package : com.atguigu02.selfdefine
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/6 18:58
 * @Version 1.0
 */
public class Order <T>{
    T t;
    int orderId;

    public Order() {
    }

    public Order(T t, int orderId) {
        this.t = t;
        this.orderId = orderId;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    //泛型方法
    public static <T> T genericMethod() {
        return null;
    }
    public <E> ArrayList<E> copyFromArrayToList(E[] arr) {
        ArrayList<E> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
