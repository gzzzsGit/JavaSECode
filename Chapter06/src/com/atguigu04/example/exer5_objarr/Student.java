package com.atguigu04.example.exer5_objarr;

/**
 * className: Student
 * Package : com.atguigu04.example.exer5_objarr
 * Description:
 *  1）定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 * @Author gzzz
 * @Create 2023/8/9 17:30
 * @Version 1.0
 */
public class Student {
    int number;
    int state;
    int score;


    public void swap(Student[] arr,int i, int j){
        Student temp = new Student();
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public String show(){
        return "student "+number+", the state is "+state+" ,the score is "+score;
    }
}
