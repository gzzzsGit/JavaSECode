package com.atguigu08._interface.exer3;

/**
 * className: Bicycle
 * Package : com.atguigu08._interface.exer3
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/21 21:47
 * @Version 1.0
 */
public class Bicycle extends Vehicle{
    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("单车可以跑");
    }

}
