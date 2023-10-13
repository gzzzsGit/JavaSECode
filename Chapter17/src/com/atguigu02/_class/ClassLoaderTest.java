package com.atguigu02._class;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * className: ClassLoaderTest
 * Package : com.atguigu02._class
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/13 20:05
 * @Version 1.0
 */
public class ClassLoaderTest {
    @Test
    public void test1(){
        //获取系统类加载器
        ClassLoader classLoader1 = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader1);//jdk.internal.loader.ClassLoaders$AppClassLoader@63947c6b

        //获取扩展类加载器
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);//jdk.internal.loader.ClassLoaders$PlatformClassLoader@77f03bb1

        //获取引导类加载器：失败 -->因为引导类加载器是c写的，不能获取java对象
        ClassLoader classLoader3 = classLoader2.getParent();
        System.out.println(classLoader3);//null
    }

    @Test
    public void test2() throws ClassNotFoundException {
        //用户自定义的类是用系统类（应用类）加载器加载的
        Class clazz1 = User.class;
        ClassLoader classLoader1 = clazz1.getClassLoader();
        System.out.println(classLoader1);//jdk.internal.loader.ClassLoaders$AppClassLoader@63947c6b

        //对于java的核心api使用引导类加载器加载
        Class clazz2 = Class.forName("java.lang.String");
        ClassLoader classLoader2 = clazz2.getClassLoader();
        System.out.println(classLoader2);//null
    }

    //ClassLoad加载指定的配置文件
    @Test
    public void test3() throws IOException {
        Properties pros = new Properties();

        //通过类的加载器读取的文件的默认的路径为：当前module下的src。不能写绝对路径
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("info1.properties");

        pros.load(is);
        String name = pros.getProperty("name");
        String age = pros.getProperty("age");
        System.out.println("name:"+name+", age:"+age);//name:Jerry, age:34
    }

    //处理属性文件：Properties
    @Test
    public void test4() throws IOException {
        Properties pros = new Properties();
        //读取的文件的默认路径为当前module
        FileInputStream fis = new FileInputStream(new File("info.properties"));

        pros.load(fis);
        String name = pros.getProperty("name");
        String password = pros.getProperty("password");
        System.out.println("name:"+name+", password:"+password);//name:gzzz, password:132465

    }
}
