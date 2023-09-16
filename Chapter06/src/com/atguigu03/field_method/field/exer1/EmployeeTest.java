package com.atguigu03.field_method.field.exer1;

/**
 * className: EmployeeTest
 * Package : com.atguigu03.field_method.field.exer1
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/1 18:32
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "krystal";
        e1.id = 1;
        e1.salary = 500000000;
        e1.age = 30;
        System.out.println(e1);
        System.out.println("id: "+e1.id+" name: "+ e1.name);

        Employee e2 = new Employee();
        e2.id = 2;
        System.out.println("id: "+e2.id+" name: "+ e2.name);
    }
}
