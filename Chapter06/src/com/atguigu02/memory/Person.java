package com.atguigu02.memory;

/**
 * @author 尚硅谷-宋红康
 * @create 14:31
 */

public class Person {
    String name;
    int age;
    char gender;


    //方法
    public void eat(){
        System.out.println("人吃饭");
    }

    public void sleep(int hour){
        System.out.println("每天睡"+hour+"小时的睡眠");
    }

    public void insterests(String hobby){
        System.out.println("我的爱好是："+hobby);
    }
}
