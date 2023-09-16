package com.atguigu07.encapsulation.exer1;

/**
 * className: PersonTest
 * Package : com.atguigu07.encapsulation.exer1
 * Description:
 *创建程序,在其中定义两个类：Person和PersonTest类。定义如下：
 * 用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
 * 在PersonTest类中实例化Person类的对象b，调用setAge()和getAge()方法，体会Java的封装性。
 * @Author gzzz
 * @Create 2023/8/11 20:49
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person b= new Person();
        b.setAge(120);
        System.out.println(b.getAge());
    }
}
