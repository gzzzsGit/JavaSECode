package com.atguigu04.set;

import com.atguigu01.collection.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * className: setTest
 * Package : com.atguigu04.set
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/2 14:35
 * @Version 1.0
 */
public class setTest {
    @Test
    public void test1(){
        Set set = new HashSet();
        set.add("AA");
        set.add(123);
        set.add("BB");
        set.add(new Person("Tom", 12));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");//AA BB Person{name='Tom', age=12} 123  与元素添加顺序不一致
        }
    }
    
    @Test
    public void test2(){
        Set set = new LinkedHashSet();
        set.add("AA");
        set.add(123);
        set.add("BB");
        set.add(new Person("Tom", 12));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");//AA 123 BB Person{name='Tom', age=12}  与元素添加顺序一致
        }
    }

}
