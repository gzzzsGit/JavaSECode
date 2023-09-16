package com.atguigu08._interface.exer3;

/**
 * className: Developer
 * Package : com.atguigu08._interface.exer3
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/21 21:04
 * @Version 1.0
 */
public class Developer {
    private String name;
    private int age;

    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void takingVehicle(Vehicle vehicle){
        vehicle.run();
    }
}
