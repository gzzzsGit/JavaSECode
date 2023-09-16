package com.atguigu07.encapsulation.exer1;
import static java.lang.System.out;
/**
 * className: Person
 * Package : com.atguigu07.encapsulation.exer1
 * Description:
 *创建程序,在其中定义两个类：Person和PersonTest类。定义如下：
 * 用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
 * 在PersonTest类中实例化Person类的对象b，调用setAge()和getAge()方法，体会Java的封装性。
 * @Author gzzz
 * @Create 2023/8/11 20:46
 * @Version 1.0
 */

public class Person {
    private int age;

    public void setAge(int num){
        if (0<num && num<130)
            age = num;
        else
           out.println("年龄不合法！");
    }

    public int getAge(){
        return age;
    }
}
