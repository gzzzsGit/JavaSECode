package com.atguigu06.polymorphism.exer3;

/**
 * className: InstanceTest
 * Package : com.atguigu06.polymorphism.exer3
 * Description:
 *建立InstanceTest 类，在类中定义方法method(Person e);
 * 在method中:
 * (1)根据e的类型调用相应类的getInfo()方法。
 * (2)根据e的类型执行：
 * 如果e为Person类的对象，输出：
 * “a person”;
 * 如果e为Student类的对象，输出：
 * “a student”
 * “a person ”
 * 如果e为Graduate类的对象，输出：
 * “a graduated student”
 * “a student”
 * “a person”
 * @Author gzzz
 * @Create 2023/8/16 22:23
 * @Version 1.0
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        test.method(new Graduate());
        test.method(new Student());
        test.method(new Person());
    }
    public void method(Person e){
        if (e instanceof Graduate){
            System.out.println(((Graduate)e).getInfo());
            System.out.println( "a graduated student \na student \na person");
        } else if (e instanceof Student) {
            System.out.println(((Student)e).getInfo());
            System.out.println("a student\n" + "a person ");
        }
        else{
            System.out.println(e.getInfo());
            System.out.println("a person");
        }

    }
}
