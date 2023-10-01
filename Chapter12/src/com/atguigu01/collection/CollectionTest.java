package com.atguigu01.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * className: CollectionTest
 * Package : com.atguigu01.collection
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/1 16:27
 * @Version 1.0
 */
public class CollectionTest {
@Test
public void test1(){
    Collection coll = new ArrayList();

    //add(object obj)
    coll.add("aa");
    coll.add(213);//自动装箱
    coll.add("西巴");
    coll.add(new Object());
    coll.add(new Person("Lily", 20));
    System.out.println(coll);

    //addAll(Collection other)
    Collection other = new ArrayList();
    other.add("BB");
    other.add(5423);
    coll.addAll(other);
    System.out.println(coll);//[aa, 213, 西巴, java.lang.Object@1c53fd30, Person{name='Lily', age=20}, BB, 5423]

    //coll.add(other);
    //System.out.println(coll);[aa, 213, 西巴, java.lang.Object@326de728, Person{name='Lily', age=20}, [BB, 5423]]
//    System.out.println(coll.size());//6

    //size()
    System.out.println(coll.size());
}

@Test
public void test2(){
    Collection coll = new ArrayList();

    //add(object obj)
    coll.add("aa");
    coll.add(213);//自动装箱
    coll.add("西巴");
    coll.add(new String("hello"));
    coll.add(new Person("Lily", 20));//重写了equals方法

    System.out.println(coll.isEmpty());//false

    //contains内部调用的是equals方法
    System.out.println(coll.contains("aa"));//true
    System.out.println(coll.contains(213));//true
    System.out.println(coll.contains(new String("hello")));//true
    System.out.println(coll.contains(new Person("Lily",20)));//true

    //containsAll（Collection coll） 判断coll中的元素是否在当前集合中都存在
    Collection coll1 = new ArrayList();
    coll1.add("aa");
    coll1.add(213);
    System.out.println(coll.containsAll(coll1));//true
}

@Test
public void test3() {
    Collection coll = new ArrayList();
    coll.add("aa");

    Person p = new Person("Tom", 12);
    coll.add(p);
    coll.add(128);
    coll.add("hello");

    coll.remove("hello");
    coll.remove(new Person("Tom", 12));
    System.out.println(coll);//[aa, 128]
    System.out.println(coll.size());//2

    coll.clear();
    System.out.println(coll);//[]
    System.out.println(coll.size());//0

    coll.add(134);
    coll.add(134);
    coll.add(134);
    coll.add("hello");
    coll.add("xiba");
    coll.remove(134);
    System.out.println(coll);//[134, 134, hello, xiba]

    //removeAll(Collection coll）从当前集合删除所有与coll集合相同的元素
    Collection coll1 = new ArrayList();
    coll1.add(134);
    coll.removeAll(coll1);
    System.out.println(coll);//[hello, xiba]

    //retainAll(Collection coll) 取两个集合的交集
    Collection coll2 = new ArrayList();
    coll2.add("hello");
    System.out.println(coll.retainAll(coll2));//true
}

@Test
public void test4(){
    Collection coll = new ArrayList();
    coll.add("aa");

    Person p = new Person("Tom", 12);
    coll.add(p);
    coll.add(128);//自动装箱
    coll.add("hello");

    Object[] arr = coll.toArray();
    System.out.println(Arrays.toString(arr));//[aa, Person{name='Tom', age=12}, 128, hello]
}

@Test
public void test5(){
    String[] arr = new String[]{"AA", "BB", "CC"};
    Collection list = Arrays.asList(arr);
    System.out.println(list);

    List list1 = Arrays.asList("AA", "BB", "CC");
    System.out.println(list1);
}

@Test
public void test6(){
    Integer[] arr = new Integer[]{1, 2, 3};
    List list = Arrays.asList(arr);//3
    System.out.println(list.size());
    System.out.println(list);//[1, 2, 3]

    int[] arr1 = new int[]{1, 2, 3};
    List list1 = Arrays.asList(arr1);
    System.out.println(list1.size());//1,因为只能放对象，即int数组
    System.out.println(list1);//[[I@77f03bb1]
    
}

}
