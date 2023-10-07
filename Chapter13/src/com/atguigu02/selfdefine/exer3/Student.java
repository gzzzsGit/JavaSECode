package com.atguigu02.selfdefine.exer3;

/**
 * className: Student
 * Package : com.atguigu02.selfdefine.exer3
 * Description:
 *我们要声明一个学生类，该类包含姓名、成绩。而此时学生的成绩类型不确定，为什么呢？
 * 因为，语文老师希望成绩是“优秀”、“良好”、“及格”、“不及格”，数学老师希望成绩是89.5, 65.0，
 * 英语老师希望成绩是'A','B','C','D','E'。那么我们在设计这个学生类时，就可以使用泛型。
 * @Author gzzz
 * @Create 2023/10/6 22:05
 * @Version 1.0
 */
public class Student<T> {
    private T score;

    public Student() {
    }

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }

    public Student(T score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                '}';
    }
}
