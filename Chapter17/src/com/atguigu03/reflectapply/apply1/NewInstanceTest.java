package com.atguigu03.reflectapply.apply1;

import com.atguigu03.reflectapply.data.Person;
import org.junit.Test;

/**
 * className: NewInstanceTest
 * Package : com.atguigu03.reflectapply.apply1
 * Description:
 *创建运行时类的对象
 * @Author gzzz
 * @Create 2023/10/13 22:15
 * @Version 1.0
 */
public class NewInstanceTest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        Class clazz = Person.class;

        //创建Person类的实例
        Person p1 = (Person) clazz.newInstance();
        System.out.println(p1);//Person{name='null', age=1}


    }
}
