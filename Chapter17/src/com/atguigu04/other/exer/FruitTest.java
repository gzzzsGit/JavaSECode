package com.atguigu04.other.exer;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * className: FruitTest
 * Package : com.atguigu04.other.exer
 * Description:
 *（1）读取配置文件，获取水果类名，并用反射创建水果对象，
 * （2）创建榨汁机对象，并调用run()方法
 * @Author gzzz
 * @Create 2023/10/14 17:18
 * @Version 1.0
 */
public class FruitTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //通过类加载器读取配置文件中的信息，获取全类名
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("config.properties");
        Properties properties = new Properties();
        properties.load(is);
        Class clazz = Class.forName(properties.getProperty("fruitName"));

        //通过反射，创建指定全类名对应的类的实例
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Fruit fruit = (Fruit) constructor.newInstance();

        //通过榨汁机的对象调用run()
        Juicer juicer = new Juicer();
        juicer.run(fruit);//榨了一杯香蕉汁...
    }
}
