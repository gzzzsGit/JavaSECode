package com.atguigu04.example.exer5_objarr1;

/**
 * className: StudentUtil
 * Package : com.atguigu04.example.exer5_objarr1
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/9 19:43
 * @Version 1.0
 */
public class StudentUtil {
    /**
     *   打印指定年级的学生信息
     */
    public void printStudentsWithState(Student[] students, int state){
        for (int i = 0; i < 20; i++) {
            if (students[i].state  == state){
                System.out.println(students[i].show());
            }
        }
    }

    public void printStudents(Student[] students){
        for (int i = 0; i < 20; i++) {
            System.out.println(students[i].show());
        }
    }

    public void bablesort(Student[] students){
        for (int i = 0 ;i < students.length-1; i++) {
            for (int j = 0; j <students.length-1-i ; j++) {
                if (students[j].score>students[j+1].score)
                    students[i].swap(students,j,j+1);
            }
        }
    }

}

