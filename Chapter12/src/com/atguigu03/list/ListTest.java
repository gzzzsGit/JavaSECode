package com.atguigu03.list;

import com.atguigu01.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * className: ListTest
 * Package : com.atguigu03.list
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/2 0:24
 * @Version 1.0
 */
public class ListTest {
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add("aa");

        Person p = new Person("Tom", 12);
        list.add(p);
        list.add(128);//自动装箱
        list.add("hello");

        System.out.println(list);

        //add(int index,object element)
        list.add(2, "cc");
        System.out.println(list);

        //addAll(int index,Collection else)
        List list1 = Arrays.asList(1,2,3);
        list.addAll(1, list1);
        System.out.println(list);
    }
    
    @Test
    public void test2(){
        List list = new ArrayList();
        list.add("aa");
        list.add(2);
        Person p = new Person("Tom", 12);
        list.add(p);
        list.add(128);//自动装箱
        list.add("hello");

        //remove(int index)--优先是索引
        list.remove(2);
        System.out.println(list);

        //remove(object obj)
        list.remove(Integer.valueOf(2));
        System.out.println(list);
    }
    
    @Test
    public void test3(){
        List list = new ArrayList();
        list.add("aa");
        list.add(2);
        Person p = new Person("Tom", 12);
        list.add(p);
        list.add(128);//自动装箱
        list.add("hello");
        
        //迭代器遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //增强for
        for (Object obj :
                list) {
            System.out.println(obj);
        }

        //get(int index)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
