package com.atguigu01.example;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * className: ReflectionTest
 * Package : com.atguigu01.example
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/12 23:39
 * @Version 1.0
 */
public class ReflectionTest {

    @Test
    public void test1(){
        //创建实例
        //public Person()
        Person p1 = new Person();

        //调用属性
        //public int age
        p1.age = 10;
        System.out.println(p1.age);

        //调用方法
        //public void show()
        p1.show();
    }
    
    @Test
    public void test2() throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException, NoSuchMethodException {
        //创建实例
        //public Person()
        Class<Person> clazz  = Person.class;
        Person p1= clazz.newInstance();

        //调用属性
        //public int age
        Field ageField = clazz.getField("age");
        ageField.set(p1,10);
        System.out.println(ageField.get(p1));

        //调用方法
        //public void show()
        Method showMethod = clazz.getMethod("show");
        showMethod.invoke(p1);
    }

    /*
    出了Person类之后，就不能直接调用Person类中声明的private权限修饰的结构但是，
    我们可以通过反射的方式，调用Person类中私有的结构
     */
    @Test
    public void test3() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //调用私有构造器
        //private Person(String name, int age)
        Class<Person> clazz = Person.class;
        Constructor cons = clazz.getDeclaredConstructor(String.class, int.class);

        cons.setAccessible(true);//设置可以访问私有属性
        Person p1  = (Person) cons.newInstance("Tom",10);
        System.out.println(p1);//Person{name='Tom', age=10}

        //调用私有的属性
        //private String name;
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(p1, "Carry");//Person{name='Carry', age=10}
        System.out.println(p1);

        //调用私有方法
        //private String showNation(String nation)
        Method showNationMethod = clazz.getDeclaredMethod("showNation", String.class);
        showNationMethod.setAccessible(true);
        String res = (String) showNationMethod.invoke(p1, "China");
        System.out.println(res);//我的国籍是：China
    }
}
