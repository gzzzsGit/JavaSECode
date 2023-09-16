package com.atguigu08._interface.exer1;

/**
 * className: EatableTest
 * Package : com.atguigu08._interface.exer1
 * Description:
 *
 * @Author gzzz
 * @Create 2023/8/21 17:51
 * @Version 1.0
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] people = new Eatable[3];
        people[0] = new Chinese();
        people[1] = new American();
        people[2] = new Indian();
        for (int i = 0; i < people.length; i++) {
            people[i].eat();
        }
    }
}
