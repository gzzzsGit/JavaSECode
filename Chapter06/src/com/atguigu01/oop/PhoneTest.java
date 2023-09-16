package com.atguigu01.oop;

/**
 * @author 尚硅谷-宋红康
 * @create 16:29
 */
public class PhoneTest {//是Phone类的测试类
    public static void main(String[] args) {
        //创建对象
        Phone p1 = new Phone();

        //调用其属性
        p1.name = "HUAWEI mate 50";
        p1.price = 5000;

        System.out.println("name = "+p1.name+", price = "+p1.price);


        //调用方法
        p1.call();
        p1.sendMessage("有内鬼，终止交易");
        p1.playGames();
    }
}
