package com.atguigu01.oop;

/**
 * @author 尚硅谷-宋红康
 * @create 16:26
 */
public class Phone {
    //属性
    String name;
    int price;


    //方法
    public void call(){
        System.out.println("手机能拨打电话");
    }


    public void sendMessage(String msg){
        System.out.println("发送信息："+msg);
    }


    public void playGames(){
        System.out.println("手机可以玩游戏");
    }
}
