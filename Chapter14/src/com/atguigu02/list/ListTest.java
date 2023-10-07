package com.atguigu02.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * className: ListTest
 * Package : com.atguigu02.list
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/7 20:24
 * @Version 1.0
 */
public class ListTest {
    @Test
    public void test1(){
        ArrayList<String> list = new ArrayList<>();

        list.add( "AA"); //elementData[0] = "AA";
        list.add("BB"); //elementData[1] ="BB";
    }
    
    @Test
    public void test3(){
        LinkedList<String> list = new LinkedList<>();
        list.add( "AA"); //将"AA"封装到一个Node对象1中，list对象的属性first、last都指向此Node对象;
        list.add("BB"); //将"BB"封装到一个Node对象2中，对象1和对象2构成一个双向列表，list对象的属性last都指向此Node对象2;
    }
}
