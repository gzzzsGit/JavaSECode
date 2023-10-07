package com.atguigu03.more;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * className: GenericTest
 * Package : com.atguigu03.more
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/6 22:12
 * @Version 1.0
 */
public class GenericTest {

    //测试泛型在继承类上的体现
    public <T> void method1(ArrayList<Object> objects) {

    }

    public <T> void method2(List<String> str) {

    }
    
    @Test
    public void test1(){
        Object obj = new Object();
        String str = "AA";
        obj = str;//基于继承性的多态使用
        
        System.out.println(obj.getClass());
    }
    
    @Test
    public void test2(){
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
//        list1 = list2;//java: 不兼容的类型: java.util.ArrayList<java.lang.String>无法转换为java.util.ArrayList<java.lang.Object>

        method1(list1);
//        method(list2);//java: 不兼容的类型: java.util.ArrayList<java.lang.String>无法转换为java.util.ArrayList<java.lang.Object>
    }
    
    @Test
    public void test3(){
        List<String> list1 = null;
        ArrayList<String> list2 = new ArrayList<>();

        list1 = list2;
        list1.add("aa");
        method2(list1);
        method2(list2);
    }
}
