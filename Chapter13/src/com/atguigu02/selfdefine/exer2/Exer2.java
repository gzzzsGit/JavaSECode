package com.atguigu02.selfdefine.exer2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * className: Exer2
 * Package : com.atguigu02.selfdefine.exer2
 * Description:
 *练习1: 泛型方法
 * 编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
 * public static <E> void method1( E[] e,int a,int b)
 *
 * 编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素
 * public static <E> void method2( E[] e)
 * @Author gzzz
 * @Create 2023/10/6 21:54
 * @Version 1.0
 */
public class Exer2 {
    public static <E> void method1(E[] e, int a, int b) {
        E temp = e[a];
        e[a] = e[b];
        e[b] =temp;
    }

    public static <E> void method2( E[] e) {
        ArrayList<E> arrayList = new ArrayList<>();
//        for (int i = 0; i < e.length; i++) {
//            arrayList.add(e[i]);
//        }
//        Collections.reverse(arrayList);
//        for (int i = 0; i < e.length; i++) {
//            e[i] = arrayList.get(i);
//        };
        for (int i = 0,j = e.length-1; i < j; i++,j--) {
            E temp = e[i];
            e[i] = e[j];
            e[j] =temp;
        }
    }
    
    @Test
    public void test1(){
        String[] arr = new String[]{"11", "bb", "vv"};
        method1(arr, 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2(){
        String[] arr = new String[]{"11", "bb", "vv","33", "gg", "jj"};
        method2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
