package com.atguigu02.singleton;

/**
 * className: GirlFriend
 * Package : com.atguigu02.singleton
 * Description:
 *单例式：懒汉式
 * @Author gzzz
 * @Create 2023/8/18 23:45
 * @Version 1.0
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("hello:"+args[i]);
        }
    }
}

class GirlFriend{
    //生命类的实例
    private static GirlFriend instance= null;
    public GirlFriend(){

    }
    //3.通过get方法获取类的实例，如果未创建对象，则在方法内部创建
    public static GirlFriend getInstance() {
        if (instance == null){
            instance = new GirlFriend();
        }
        return instance;
    }
}
