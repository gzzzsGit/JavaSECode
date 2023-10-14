package com.atguigu04.other.dynamic;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * className: ReflectTest
 * Package : com.atguigu04.other.dynamic
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/14 16:43
 * @Version 1.0
 */
public class ReflectTest {
    //静态性
    public Person getInstance() {
        return new Person();
    }

    //例子一
    //反射的动态性
    public <T> T getInstance(String className) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class clazz = Class.forName(className);
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        return (T) constructor.newInstance();
    }

    @Test
    public void test1() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Person p1= getInstance();
        System.out.println(p1);

        String className = new String("com.atguigu04.other.dynamic.Person");
        Person p2 = getInstance(className);
        System.out.println(p2);

        String DateClass = "java.util.Date";
        Date date1 = getInstance(DateClass);
        System.out.println(date1);//Sat Oct 14 16:53:02 CST 2023
    }

    //例子二
    //反射的动态性
    public Object invoke(String className,String methodName) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        //1.创建全类名对应的运行时类的对象
        Class clazz = Class.forName(className);

        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object o = constructor.newInstance();//Person()...

        //获取运行时类中的指定方法，并调用
        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        return method.invoke(o);//只能是空参的方法，不然还需要先获取参数类型并输入
    }
    
    @Test
    public void test2() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        String className = new String("com.atguigu04.other.dynamic.Person");
        String methodName = new String("show");

        Object returnValue = invoke(className, methodName);//你好，我是一个Person
        System.out.println(returnValue);//null
    }
}
