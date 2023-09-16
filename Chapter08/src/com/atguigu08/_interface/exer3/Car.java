package com.atguigu08._interface.exer3;

/**
 * className: Car
 * Package : com.atguigu08._interface.exer3
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/21 21:54
 * @Version 1.0
 */
public class Car extends Vehicle implements IPower{
    private String carNumber;

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public void run() {
        System.out.println("汽车"+carNumber+"可以跑");
    }

    @Override
    public void power() {
        System.out.println("汽车加油");
    }
}
