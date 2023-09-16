package com.atguigu03.field_method.field.exer2;

/**
 * className: Employee
 * Package : com.atguigu03.field_method.field.exer2
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/1 18:43
 * @Version 1.0
 */
public class Employee {
    int id;  // 编号
    String name;
    int age;
    double salary;
    MyDate birthday;

    public void show(){
        System.out.println("id: "+id+" name: "+ name+" age: "+age+" salary: "+ salary+
                " birthday:["+birthday.year+"."+ birthday.month+"."+birthday.day+"]");
    }
}
