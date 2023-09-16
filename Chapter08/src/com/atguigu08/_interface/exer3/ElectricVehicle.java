package com.atguigu08._interface.exer3;

/**
 * className: ElectricVehicle
 * Package : com.atguigu08._interface.exer3
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/22 1:26
 * @Version 1.0
 */
public class ElectricVehicle extends Vehicle implements IPower {
    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("坐电动车走了");
    }

    @Override
    public void power() {
        System.out.println("电动车充电");
    }
}
