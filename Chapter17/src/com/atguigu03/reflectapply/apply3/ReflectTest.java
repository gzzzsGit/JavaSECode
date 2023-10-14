package com.atguigu03.reflectapply.apply3;

import com.atguigu03.reflectapply.data.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * className: ReflectTest
 * Package : com.atguigu03.reflectapply.apply3
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/14 10:28
 * @Version 1.0
 */
public class ReflectTest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class clazz = Person.class;

        //
        Person p = (Person) clazz.newInstance();//Person()...

        //1.获取运行时类指定名的属性
        Field ageField = clazz.getField("age");

        //2.获取或设置属性的值
        ageField.set(p, 20);
        System.out.println(ageField.get(p));//20
    }
    
    @Test
    public void test2() throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class clazz = Person.class;

        //
        Person p = (Person) clazz.newInstance();//Person()...

        //1.通过Class实例调用getDeclaredField获取运行时类指定名的属性
        Field ageField = clazz.getDeclaredField("name");
        //2.setAccessible(true)：确保此属性是可以访问的
        ageField.setAccessible(true);

        //3.通过Field类的实例调用get(Object obj)或set(Object obj,Object value)
        ageField.set(p, "Tom");
        System.out.println(ageField.get(p));//Tom
    }

    @Test
    public void test3() throws IllegalAccessException, NoSuchFieldException {
        Class clazz = Person.class;

        //1.通过Class实例调用getDeclaredField获取运行时类指定名的属性
        Field infoField = clazz.getDeclaredField("info");

        //2.通过Class实例调用getDeclaredField获取运行时类指定名的属性
        infoField.setAccessible(true);

        //3.通过Field类的实例调用get(Object obj)或set(Object obj,Object value)
        infoField.set(clazz, "hello");
        System.out.println(infoField.get(clazz));//hello

        //仅限于类变量可以使用null来指定
        infoField.set(null, "world");
        System.out.println(infoField.get(null));//world
    }

    @Test
    public void test4() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class clazz = Person.class;
        Person p = (Person) clazz.newInstance();

        //1. 通过Class的实例调用getDeclaredMethod(String methodName ,Class ... args)，获取指定的方法
        //不能写成Integer.class
        Method showNationMethod = clazz.getDeclaredMethod("showNation", String.class, int.class);

        //2. setAccessible(true):确保此方法是可用的
        showNationMethod.setAccessible(true);

        //3.通过Nethod实例调用invoke(0bject obj,0bject ... objs),即为对Nethod对应的方法的调用。
        // invoke()的返回值即为Method对应的方法的返回值
        // 特别的:如果Method对应的方法的返回值类型为void，则invoke()返回值为null
        String res = (String) showNationMethod.invoke(p, "China", 20);
        System.out.println(res);
    }

    @Test
    public void test5() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = Person.class;

        //1. 通过Class的实例调用getDeclaredMethod(String methodName ,Class ... args)，获取指定的方法
        //不能写成Integer.class
        Method showInfoMethod = clazz.getDeclaredMethod("showInfo");

        //2. setAccessible(true):确保此方法是可用的
        showInfoMethod.setAccessible(true);

        //3.通过Nethod实例调用invoke(0bject obj,0bject ... objs),即为对Nethod对应的方法的调用。
        // invoke()的返回值即为Method对应的方法的返回值
        // 特别的:如果Method对应的方法的返回值类型为void，则invoke()返回值为null
        Object object = (String) showInfoMethod.invoke(null);//我是一个人
        System.out.println(object);//null
    }
    
    @Test
    public void test6() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Person.class;

        //1.通过Class的实例调用getDeclaredConstructor(Class ... args)，获取指定参数类型的构造器
        Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);

        //2.setAccessible(true):确保此方法是可用的
        constructor.setAccessible(true);

        //3.通过Constructor实例调用newInstance(0bject ... objs),返回一个运行时类的实例。
        Person p = (Person) constructor.newInstance("Tom", 20);
        System.out.println(p);//Person{name='Tom', age=20}
    }

    @Test
    public void test7() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Person.class;

        //1.通过Class的实例调用getDeclaredConstructor(Class ... args)，获取指定参数类型的构造器
        Constructor constructor = clazz.getDeclaredConstructor();

        //2.setAccessible(true):确保此方法是可用的
        constructor.setAccessible(true);

        //3.通过Constructor实例调用newInstance(0bject ... objs),返回一个运行时类的实例。
        Person p = (Person) constructor.newInstance();//Person()...
        System.out.println(p);//Person{name='null', age=1}
    }
}
