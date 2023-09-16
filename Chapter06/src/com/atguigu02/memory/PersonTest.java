package com.atguigu02.memory;

/**
 * Perosn类对应的测试类
 *
 * @author 尚硅谷-宋红康
 * @create 14:38
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建一个对象
        Person p1 = new Person();

        //通过对象调用属性和方法
        p1.age = 18;
        p1.gender = '男';
        p1.name = "jackeylove";

        System.out.println("name: "+p1.name+" age: "+p1.age+" gender: "+p1.gender);

        p1.eat();;
        p1.sleep(8);
        p1.insterests("hiking");

        //再创建一个对象
        Person p2 = new Person();

        p2.age = 18;
        p2.gender = '女';
        p2.name = "rose";

        System.out.println("name: "+p2.name+" age: "+p2.age+" gender: "+p2.gender);
    }
}
