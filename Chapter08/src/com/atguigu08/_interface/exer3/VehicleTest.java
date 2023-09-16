package com.atguigu08._interface.exer3;

/**
 * className: VehicleTest
 * Package : com.atguigu08._interface.exer3
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/22 1:30
 * @Version 1.0
 */
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("dazhong","yellow","D1235");
        vehicles[1] = new Bicycle("hudie","blue");
        vehicles[2] = new ElectricVehicle("yadi","white");
        Developer developer = new Developer("xiba",22);
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] instanceof IPower){
                ((IPower) vehicles[i]).power();
            }
            developer.takingVehicle(vehicles[i]);
        }

    }
}
