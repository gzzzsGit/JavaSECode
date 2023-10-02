package com.atguigu04.set;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

/**
 * className: TreeSet
 * Package : com.atguigu04.set
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/2 16:35
 * @Version 1.0
 */
public class TreeSet {
    @Test
    public void test1(){
        Set set = new java.util.TreeSet();
        //自然排序，String实现的comparable接口
        set.add("DD");
        set.add("BB");
        set.add("GG");
        set.add("MM");
        set.add("AA");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");//AA BB DD GG MM
        }
    }
    
    @Test
    public void test2(){
        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry", 13);
        User u3 = new User("Curry", 43);
        User u4 = new User("Steven", 33);
        User u5 = new User("Lebron", 23);

        //自然排序
        Set set = new java.util.TreeSet();
        set.add(u1);
        set.add(u2);
        set.add(u3);
        set.add(u4);
        set.add(u5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");//User{name='Jerry', age=13} User{name='Lebron', age=23} User{name='Tom', age=23} User{name='Steven', age=33} User{name='Curry', age=43}
        }
    }
    
    @Test
    public void test3(){
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    int res = u1.getName().compareTo(u2.getName());
                    if (res != 0) {
                        return res;
                    }
                    return u1.getAge() - u2.getAge();
                } else {
                    throw new RuntimeException("类型不匹配");
                }
            }
        };
        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry", 13);
        User u3 = new User("Curry", 43);
        User u4 = new User("Steven", 33);
        User u5 = new User("Lebron", 23);

        //自定义排序
        Set set = new java.util.TreeSet(comparator);
        set.add(u1);
        set.add(u2);
        set.add(u3);
        set.add(u4);
        set.add(u5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");//User{name='Curry', age=43} User{name='Jerry', age=13} User{name='Lebron', age=23} User{name='Steven', age=33} User{name='Tom', age=23}
        }
    }
}
