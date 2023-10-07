package com.atguigu02.selfdefine;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * className: Generic
 * Package : com.atguigu02.selfdefine
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/6 19:01
 * @Version 1.0
 */
public class GenericTest {
    @Test
    public void test1(){
        //实例化时，可以不指明类的泛型参数的类型，因为jdk5.0之前就是没有泛型的，这是向下兼容
        Order order1 = new Order();
        Object obj = order1.getT();

        //如果指明泛型参数的类型，不可以使用基本数据类型看，但是可以使用包装类
        Order<Integer> order2 = new Order<>();
        order2.setT(2);
        Integer t = order2.getT();

        //一旦指明了泛型的类型，则在泛型类对象中凡是使用泛型t参数的位置，都替换为指定的类型。
        Order<String> order3 = new Order<>();
        order3.setT("AA");

        System.out.println(order2.getT().getClass());//Integer
        System.out.println(order3.getT().getClass());//String
        
    }

    @Test
    public void test2(){

//      SubOrder1<Integer> subOrder2 = new SubOrder1();//不是泛型类，所以报错
        SubOrder1 subOrder = new SubOrder1();

        //还是继承了T，只是默认是Object类型，也可以赋值
        subOrder.setT("ss");
        System.out.println(subOrder.getT().getClass());//String
    }

    @Test
    public void test3(){

//        SubOrder2<Integer> subOrder2 = new SubOrder2();//仍然不是泛型类，所以依然报错
        SubOrder2 subOrder2 = new SubOrder2();
        Integer t= subOrder2.getT();//SubOrder2类继承的时候已经确定了父类泛型参数是Integer，所以可以直接得到
    }
    
    @Test
    public void test4(){
        //子类是泛型的情况
        SubOrder3<String> subOrder3 = new SubOrder3<>();
        String t1 = subOrder3.getT();
        subOrder3.show("AA");

        SubOrder4<String> subOrder4 = new SubOrder4<>();
        Integer t2 = subOrder4.getT();
        String e1 = subOrder4.getE();

        SubOrder5<Integer,String> subOrder5 = new SubOrder5<>();
        Integer e2 = subOrder5.getE();
        String t3 = subOrder5.getT();
    }
    
    @Test
    public void test5(){
        Order order = new Order<>();
        ArrayList<String> list = order.copyFromArrayToList(new String[]{"agg", "ajf", "geou"});
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
