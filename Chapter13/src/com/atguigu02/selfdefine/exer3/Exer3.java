package com.atguigu02.selfdefine.exer3;

/**
 * className: Exer3
 * Package : com.atguigu02.selfdefine.exer3
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/6 22:06
 * @Version 1.0
 */
public class Exer3 {
    public static void main(String[] args) {
        Student<String> s1 = new Student<>();
        s1.setScore("良好");

        Student<Double> s2 = new Student<>();
        s2.setScore(70.0);

        Student<Character>s3 = new Student<>();
        s3.setScore('A');
    }
}
