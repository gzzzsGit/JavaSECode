package com.atguigu02.iterator;

import com.atguigu01.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * className: IteratorTest
 * Package : com.atguigu02.iterator
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/1 22:49
 * @Version 1.0
 */
public class IteratorTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add("aa");

        Person p = new Person("Tom", 12);
        coll.add(p);
        coll.add(128);//自动装箱
        coll.add("hello");
        Iterator iterator = coll.iterator();
        System.out.println(iterator.getClass());//class java.util.ArrayList$Itr
//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
