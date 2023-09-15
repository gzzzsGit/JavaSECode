package com.atguigu05.exer.exer3;

/**
 * className: Exer3
 * Package : com.atguigu05.exer.exer3
 * Description:
 *
 * @Author gzzz
 * @Create 2023/9/2 19:28
 * @Version 1.0
 */
public class Exer3 {
    public static void main(String[] args) {

//        try {
//            Person p1= new Person("Peter",-1);
//        } catch (NoLifeValueException e) {
//            e.printStackTrace();
//        }
        try {
            Person p2 = new Person();
            p2.setLiveValue(20);
            p2.setLiveValue(-11);
        } catch (NoLifeValueException e) {
            System.out.println(e.getMessage());
        }
    }

}
