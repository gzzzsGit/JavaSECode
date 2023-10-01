package com.atguigu02.iterator;

import com.atguigu01.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * className: EnhancedForTestr
 * Package : com.atguigu02.iterator
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/1 23:02
 * @Version 1.0
 */
public class EnhancedForTest
{
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add("aa");

        Person p = new Person("Tom", 12);
        coll.add(p);
        coll.add(128);//自动装箱
        coll.add("hello");
        for (Object obj : coll) {
            System.out.println(obj);
        }
    }
    @Test
    public void test2(){
        int arr[] = new int[]{1, 2, 3, 4};
        for (int i :
                arr) {
            System.out.println(i);
        }
    }
}
