package com.atguigu07.encapsulation.exer3;

/**
 * className: EmployeeTest
 * Package : com.atguigu07.encapsulation.exer3
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/12 1:27
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {

        Employee[] employees = new Employee[2];
        employees[0] = new Employee();
        employees[0].setName("汤姆");
        employees[0].setGender('男');
        employees[0].setAge(30);
        employees[0].setPhoneNum("010-54654132");
        employees[1] = new Employee();
        employees[1].setName("杰瑞");
        employees[1].setGender('女');
        employees[1].setAge(25);
        employees[1].setPhoneNum("010-54621354");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getInfo());
        }
    }
}
