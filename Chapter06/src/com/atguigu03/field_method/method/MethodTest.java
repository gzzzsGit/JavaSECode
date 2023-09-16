

package com.atguigu03.field_method.method;

/**
 * @author 尚硅谷-宋红康
 * @create 19:01
 */
public class MethodTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age=18;
        p1.name = "ds";
        p1.gender= '男';
        p1.eat();
        int hour = p1.getAge();
        p1.interest("打电动");
        p1.sleep(hour);
    }
}

class Person {
    //属性
    String name;
    int age;
    char gender;

    public void eat(){
        System.out.println("人吃饭");
    }

    public  void  sleep(int hour){
        System.out.println("人睡觉"+hour+"h");
    }

    public String interest(String hobby){
        String info = "我的爱好是"+hobby;
        System.out.println(info);
        return info;
    }

    public int getAge(){
        return age;
    }
}



