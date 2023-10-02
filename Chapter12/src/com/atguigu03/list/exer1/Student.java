package com.atguigu03.list.exer1;

import java.util.Objects;

/**
 * className: Student
 * Package : com.atguigu03.list.exer1
 * Description:
 *(1) 定义学生类，属性为姓名、年龄，提供必要的getter、setter方法，构造器，toString()，equals()方法。
 * (2) 使用ArrayList集合，保存录入的多个学生对象。
 * (3) 循环录入的方式，1：继续录入，0：结束录入。
 * (4) 录入结束后，用foreach遍历集合。
 * @Author gzzz
 * @Create 2023/10/2 11:57
 * @Version 1.0
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

}
