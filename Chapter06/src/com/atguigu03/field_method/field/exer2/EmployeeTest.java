package com.atguigu03.field_method.field.exer2;


/**
 * className: EmployeeTest
 * Package : com.atguigu03.field_method.field.exer2
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/1 18:46
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.age = 12;
        e1.id = 0;
        e1.name = "jiezou";
        e1.salary = 10000;
        e1.birthday= new MyDate();
        e1.birthday.day= 19;
        e1.birthday.month = 12;
        e1.birthday.year=2001;

        //打印
//        System.out.println("id: "+e1.id+" name: "+ e1.name+" age: "+e1.age+" salary: "+ e1.salary+
//                " birthday:["+e1.birthday.year+"."+ e1.birthday.month+"."+e1.birthday.day+"]");
        e1.show();
    }
}
