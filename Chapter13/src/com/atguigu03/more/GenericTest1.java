package com.atguigu03.more;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * className: GenericTest1
 * Package : com.atguigu03.more
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/7 0:04
 * @Version 1.0
 */
public class GenericTest1 {
    @Test
    public void test1(){
        List<?> list = null;
        List<Object> list1 = null;
        List<String> list2 = null;

        list = list1;
        list = list2;

        method(list1);
        method(list2);
    }

    public void method(List<?> list) {

    }
    
    @Test
    public void test2(){
        //以集合为例说明
        List<?> list = null;
        List<String> list1 = new ArrayList<>();
        list1.add("AA");

        list  = list1;
        System.out.println(list.size());//1

        //可以读数据，只能使用Object类对象接收
//        String str = list.get(0);//java: 不兼容的类型: capture#1, 共 ?无法转换为java.lang.String
        Object o = list.get(0);

        //写数据不行,除了null
//        list.add("aa");//java: 不兼容的类型: java.lang.String无法转换为capture#1, 共 ?
//        list.add(new Object());//java: 不兼容的类型: java.lang.Object无法转换为capture#1, 共 ?
        list.add(null);
        System.out.println(list.size());//2
    }
    
    @Test
    public void test3(){
        List<? extends Father> list = null;
        List<Object> list1 = null;
        List<Father> list2 = null;
        List<Son> list3 = null;

//        list = list1;//? extends Father相当于<=Father
        list = list2;
        list = list3;
    }

    @Test
    public void test3_1(){
        List<? extends Father> list = null;
        List<Father> list1 = new ArrayList<>();

        list1.add(new Father());
        list = list1;

        //读取数据
        Father father = list.get(0);

        //写数据
//        list.add(new Father());
    }
    @Test
    public void test4(){
        List<? super Father> list = null;
        List<Object> list1 = null;
        List<Father> list2 = null;
        List<Son> list3 = null;

        list = list1;
        list = list2;
//        list = list3;//? super Father相当于>=Father
    }

    @Test
    public void test4_1(){
        List<? super Father> list = null;
        List<Father> list2 = new ArrayList<>();
        list2.add(new Father());

        list = list2;
        //读取数据，只能以Object类型读取
        Object o = list.get(0);

        //写数据，可以将Father及其子类的对象添加
        list.add(new Father());
//        list.add(new Object());
        list.add(new Son());
    }
}
