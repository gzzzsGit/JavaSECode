package com.atguigu04.example.exer5_objarr1;

/**
 * className: StudentTest
 * Package : com.atguigu04.example.exer5_objarr
 * Description:
 *3. 案例：
 * 1）定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 * 2）创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示：
 * 1) 生成随机数：Math.random()，返回值类型double;
 * 2) 四舍五入取整：Math.round(double d)，返回值类型long。
 * 年级[1,6] : (int)(Math.random() * 6 + 1)
 * 分数[0,100] : (int)(Math.random() * 101)
 * @Author gzzz
 * @Create 2023/8/9 17:30
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[20];

        for (int i = 0; i < 20; i++) {
            students[i] = new Student();
            students[i].number = i;
            students[i].score = (int)(101*Math.random());
            students[i].state = (int)(Math.random() * 6 + 1);
        }

        StudentUtil  util = new StudentUtil();
        util.printStudentsWithState(students,3);



        System.out.println("---------------------------");
        util.bablesort(students);
        util.printStudents(students);
    }

    }

