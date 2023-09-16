package com.atguigu03._extends;

/**
 * className: Student
 * Package : com.atguigu03._extends
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/15 19:01
 * @Version 1.0
 */
public class Student extends Person{
    int id = 2;

//    public Student() {
//        System.out.println("Student...");;
//    }

    public void show(){
        System.out.println("default id:"+id);
        System.out.println("super id："+getId());
    }

}
