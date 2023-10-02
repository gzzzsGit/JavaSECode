package com.atguigu03.list.exer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * className: Exer1
 * Package : com.atguigu03.list.exer1
 * Description:
 *(1) 定义学生类，属性为姓名、年龄，提供必要的getter、setter方法，构造器，toString()，equals()方法。
 *
 * (2) 使用ArrayList集合，保存录入的多个学生对象。
 *
 * (3) 循环录入的方式，1：继续录入，0：结束录入。
 *
 * (4) 录入结束后，用foreach遍历集合。
 * @Author gzzz
 * @Create 2023/10/2 11:57
 * @Version 1.0
 */
public class Exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList();
        while (true) {
            System.out.println("请录入学生信息  1：继续录入 0：结束录入");
            int endFlag = scanner.nextInt();
            if (endFlag==0){
                break;
            } else if (endFlag==1){
                System.out.print("请输入学生姓名：");
                String name = scanner.next();
                System.out.println("请输入学生年龄");
                int age = scanner.nextInt();
                Student s = new Student(name, age);
                list.add(s);
            } else{
                throw new RuntimeException("输入异常");
            }
        }
        scanner.close();
        for (Object s: list) {
            System.out.println(s);
        }

    }
}
